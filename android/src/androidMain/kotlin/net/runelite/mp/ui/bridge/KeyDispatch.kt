package net.runelite.mp.ui.bridge

import android.view.KeyEvent as AndroidKeyEvent
import java.awt.Component
import java.awt.Container
import java.awt.KeyboardFocusManager
import java.awt.Window
import java.awt.Canvas
import java.awt.event.InputEvent
import java.awt.event.KeyEvent

/**
 * Dispatches key events from hardware keyboards, soft keyboards (IME), and quick-action
 * UI buttons into the AWT component hierarchy and RuneLite's input pipeline.
 */
object KeyDispatch {
    private const val TAG = "KeyDispatch"

    private val callbacksClass: Class<*>? by lazy {
        try {
            Class.forName("net.runelite.api.hooks.Callbacks")
        } catch (t: Throwable) {
            null
        }
    }

    /**
     * Send a single character typed by the user (from soft keyboard, IME commit, or hardware key).
     */
    fun sendChar(c: Char, extraModifiers: Int = 0) {
        val vk = KeyEvent.getExtendedKeyCodeForChar(c.code)
        val mods = ModifierState.modifierMask() or extraModifiers or
                (if (Character.isUpperCase(c)) InputEvent.SHIFT_DOWN_MASK else 0)

        // 1. KEY_PRESSED
        dispatchAwtEvent(KeyEvent(
            dummyComponent(),
            KeyEvent.KEY_PRESSED,
            System.currentTimeMillis(),
            mods,
            if (vk != KeyEvent.VK_UNDEFINED) vk else c.code,
            c
        ))

        // 2. KEY_TYPED
        dispatchAwtEvent(KeyEvent(
            dummyComponent(),
            KeyEvent.KEY_TYPED,
            System.currentTimeMillis(),
            mods,
            KeyEvent.VK_UNDEFINED,
            c
        ))

        // 3. KEY_RELEASED
        dispatchAwtEvent(KeyEvent(
            dummyComponent(),
            KeyEvent.KEY_RELEASED,
            System.currentTimeMillis(),
            mods,
            if (vk != KeyEvent.VK_UNDEFINED) vk else c.code,
            c
        ))
    }

    /**
     * Send a full string of characters sequentially.
     */
    fun sendString(text: String) {
        for (c in text) {
            sendChar(c)
        }
    }

    /**
     * Send a specific AWT key by VK code (with optional keyChar).
     */
    fun sendKey(vkCode: Int, keyChar: Char = KeyEvent.CHAR_UNDEFINED, modifiers: Int = 0) {
        val mods = ModifierState.modifierMask() or modifiers
        dispatchAwtEvent(KeyEvent(
            dummyComponent(),
            KeyEvent.KEY_PRESSED,
            System.currentTimeMillis(),
            mods,
            vkCode,
            keyChar
        ))

        if (keyChar != KeyEvent.CHAR_UNDEFINED) {
            dispatchAwtEvent(KeyEvent(
                dummyComponent(),
                KeyEvent.KEY_TYPED,
                System.currentTimeMillis(),
                mods,
                KeyEvent.VK_UNDEFINED,
                keyChar
            ))
        }

        dispatchAwtEvent(KeyEvent(
            dummyComponent(),
            KeyEvent.KEY_RELEASED,
            System.currentTimeMillis(),
            mods,
            vkCode,
            keyChar
        ))
    }

    fun sendBackspace() {
        sendKey(KeyEvent.VK_BACK_SPACE, '\b')
    }

    fun sendEnter() {
        sendKey(KeyEvent.VK_ENTER, '\n')
    }

    fun sendEscape() {
        sendKey(KeyEvent.VK_ESCAPE, KeyEvent.CHAR_UNDEFINED)
    }

    fun sendTab() {
        sendKey(KeyEvent.VK_TAB, '\t')
    }

    fun sendSpace() {
        sendKey(KeyEvent.VK_SPACE, ' ')
    }

    /**
     * Keys that belong to the platform, never to the game. The activity funnels *every*
     * key through [sendAndroidKeyEvent]; without this list a press of volume-up would be
     * reported as handled and never reach AudioManager, so the hardware rocker stopped
     * changing the media stream while RuneLite was in the foreground.
     *
     * BACK is in here too: [net.runelite.mp.AppAndroid] installs a Compose `BackHandler`
     * that closes the open sidebar/config panel and otherwise swallows the press, and
     * that handler only runs if we let the event continue to `super.dispatchKeyEvent`.
     */
    private val SYSTEM_KEYS = intArrayOf(
        AndroidKeyEvent.KEYCODE_VOLUME_UP,
        AndroidKeyEvent.KEYCODE_VOLUME_DOWN,
        AndroidKeyEvent.KEYCODE_VOLUME_MUTE,
        AndroidKeyEvent.KEYCODE_MUTE,
        AndroidKeyEvent.KEYCODE_POWER,
        AndroidKeyEvent.KEYCODE_SLEEP,
        AndroidKeyEvent.KEYCODE_WAKEUP,
        AndroidKeyEvent.KEYCODE_SOFT_SLEEP,
        AndroidKeyEvent.KEYCODE_BACK,
        AndroidKeyEvent.KEYCODE_HOME,
        AndroidKeyEvent.KEYCODE_APP_SWITCH,
        AndroidKeyEvent.KEYCODE_MENU,
        AndroidKeyEvent.KEYCODE_SEARCH,
        AndroidKeyEvent.KEYCODE_ASSIST,
        AndroidKeyEvent.KEYCODE_VOICE_ASSIST,
        AndroidKeyEvent.KEYCODE_SETTINGS,
        AndroidKeyEvent.KEYCODE_NOTIFICATION,
        AndroidKeyEvent.KEYCODE_BRIGHTNESS_UP,
        AndroidKeyEvent.KEYCODE_BRIGHTNESS_DOWN,
        AndroidKeyEvent.KEYCODE_CAMERA,
        AndroidKeyEvent.KEYCODE_FOCUS,
        AndroidKeyEvent.KEYCODE_HEADSETHOOK,
        AndroidKeyEvent.KEYCODE_MEDIA_PLAY,
        AndroidKeyEvent.KEYCODE_MEDIA_PAUSE,
        AndroidKeyEvent.KEYCODE_MEDIA_PLAY_PAUSE,
        AndroidKeyEvent.KEYCODE_MEDIA_STOP,
        AndroidKeyEvent.KEYCODE_MEDIA_NEXT,
        AndroidKeyEvent.KEYCODE_MEDIA_PREVIOUS,
        AndroidKeyEvent.KEYCODE_MEDIA_REWIND,
        AndroidKeyEvent.KEYCODE_MEDIA_FAST_FORWARD,
        AndroidKeyEvent.KEYCODE_MEDIA_AUDIO_TRACK,
    )

    private fun isSystemKey(keyCode: Int): Boolean {
        for (k in SYSTEM_KEYS) {
            if (k == keyCode) return true
        }
        return false
    }

    /**
     * Translates an Android KeyEvent (from hardware keyboard or IME sendKeyEvent)
     * and dispatches it into the AWT pipeline.
     *
     * Returns true only when the event was actually consumed by the game. Anything we
     * have no AWT mapping for — and every key in [SYSTEM_KEYS] — is left alone so the
     * platform's own handling (volume rocker, back gesture, media buttons) still runs.
     */
    fun sendAndroidKeyEvent(event: AndroidKeyEvent): Boolean {
        if (isSystemKey(event.keyCode)) {
            return false
        }
        val vk = androidKeyCodeToAwt(event.keyCode)
        val mods = androidMetaToAwtModifiers(event.metaState) or ModifierState.modifierMask()
        val unicodeChar = event.getUnicodeChar(event.metaState)
        val keyChar = if (unicodeChar != 0) unicodeChar.toChar() else KeyEvent.CHAR_UNDEFINED

        // Nothing the game can do with a key we can't name and that types no character
        // (KEYCODE_TV_INPUT, gamepad buttons, vendor hotkeys, …). Decline it so whatever
        // the platform or an OEM overlay wanted to do with it still happens.
        if (vk == KeyEvent.VK_UNDEFINED && unicodeChar == 0 && event.action != AndroidKeyEvent.ACTION_MULTIPLE) {
            return false
        }

        val source = dummyComponent()
        val whenMs = event.eventTime

        when (event.action) {
            AndroidKeyEvent.ACTION_DOWN -> {
                val pressedEv = KeyEvent(source, KeyEvent.KEY_PRESSED, whenMs, mods, vk, keyChar)
                dispatchAwtEvent(pressedEv)

                if (unicodeChar != 0 && !Character.isISOControl(unicodeChar)) {
                    val typedEv = KeyEvent(source, KeyEvent.KEY_TYPED, whenMs, mods, KeyEvent.VK_UNDEFINED, keyChar)
                    dispatchAwtEvent(typedEv)
                } else if (event.keyCode == AndroidKeyEvent.KEYCODE_ENTER || event.keyCode == AndroidKeyEvent.KEYCODE_NUMPAD_ENTER) {
                    val typedEv = KeyEvent(source, KeyEvent.KEY_TYPED, whenMs, mods, KeyEvent.VK_UNDEFINED, '\n')
                    dispatchAwtEvent(typedEv)
                } else if (event.keyCode == AndroidKeyEvent.KEYCODE_DEL) {
                    val typedEv = KeyEvent(source, KeyEvent.KEY_TYPED, whenMs, mods, KeyEvent.VK_UNDEFINED, '\b')
                    dispatchAwtEvent(typedEv)
                } else if (event.keyCode == AndroidKeyEvent.KEYCODE_TAB) {
                    val typedEv = KeyEvent(source, KeyEvent.KEY_TYPED, whenMs, mods, KeyEvent.VK_UNDEFINED, '\t')
                    dispatchAwtEvent(typedEv)
                }
                return true
            }
            AndroidKeyEvent.ACTION_UP -> {
                val releasedEv = KeyEvent(source, KeyEvent.KEY_RELEASED, whenMs, mods, vk, keyChar)
                dispatchAwtEvent(releasedEv)
                return true
            }
            AndroidKeyEvent.ACTION_MULTIPLE -> {
                if (event.characters != null) {
                    sendString(event.characters)
                    return true
                }
            }
        }
        return false
    }

    private fun dummyComponent(): Component {
        return Canvas.latest() ?: Window.primaryFrame() ?: object : Component() {}
    }

    /**
     * Dispatch an AWT KeyEvent to KeyboardFocusManager and all component trees.
     */
    fun dispatchAwtEvent(ev: KeyEvent) {
        // 1. KeyboardFocusManager dispatchers (e.g. ClientUI hotkeys)
        try {
            KeyboardFocusManager.getCurrentKeyboardFocusManager().dispatchKeyEvent(ev)
        } catch (t: Throwable) {
            android.util.Log.w(TAG, "KeyboardFocusManager dispatch failed", t)
        }

        // 2. Deliver to components with KeyListeners
        val roots = run {
            val all = Window.getAllWindows().toMutableList<Component>()
            Canvas.latest()?.let { all += it }
            if (all.isEmpty()) Window.primaryFrame()?.let { all += it }
            all
        }

        for (root in roots) {
            deliverToHierarchy(root, ev)
        }
    }

    private fun deliverToHierarchy(c: Component, ev: KeyEvent) {
        for (listener in c.keyListeners) {
            if (callbacksClass != null && callbacksClass!!.isInstance(listener)) {
                // Skip direct Callbacks listener since OSRS client's KeyListener calls Callbacks
                continue
            }
            try {
                when (ev.id) {
                    KeyEvent.KEY_PRESSED -> listener.keyPressed(ev)
                    KeyEvent.KEY_RELEASED -> listener.keyReleased(ev)
                    KeyEvent.KEY_TYPED -> listener.keyTyped(ev)
                }
            } catch (t: Throwable) {
                android.util.Log.w(TAG, "listener threw on key dispatch", t)
            }
        }
        if (c is Container) {
            for (child in c.components) {
                if (child != null) {
                    deliverToHierarchy(child, ev)
                }
            }
        }
    }

    private fun androidMetaToAwtModifiers(meta: Int): Int {
        var mods = 0
        if ((meta and AndroidKeyEvent.META_SHIFT_ON) != 0) mods = mods or InputEvent.SHIFT_DOWN_MASK
        if ((meta and AndroidKeyEvent.META_ALT_ON) != 0) mods = mods or InputEvent.ALT_DOWN_MASK
        if ((meta and AndroidKeyEvent.META_CTRL_ON) != 0) mods = mods or InputEvent.CTRL_DOWN_MASK
        if ((meta and AndroidKeyEvent.META_META_ON) != 0) mods = mods or InputEvent.META_DOWN_MASK
        return mods
    }

    private fun androidKeyCodeToAwt(keyCode: Int): Int {
        return when (keyCode) {
            AndroidKeyEvent.KEYCODE_A -> KeyEvent.VK_A
            AndroidKeyEvent.KEYCODE_B -> KeyEvent.VK_B
            AndroidKeyEvent.KEYCODE_C -> KeyEvent.VK_C
            AndroidKeyEvent.KEYCODE_D -> KeyEvent.VK_D
            AndroidKeyEvent.KEYCODE_E -> KeyEvent.VK_E
            AndroidKeyEvent.KEYCODE_F -> KeyEvent.VK_F
            AndroidKeyEvent.KEYCODE_G -> KeyEvent.VK_G
            AndroidKeyEvent.KEYCODE_H -> KeyEvent.VK_H
            AndroidKeyEvent.KEYCODE_I -> KeyEvent.VK_I
            AndroidKeyEvent.KEYCODE_J -> KeyEvent.VK_J
            AndroidKeyEvent.KEYCODE_K -> KeyEvent.VK_K
            AndroidKeyEvent.KEYCODE_L -> KeyEvent.VK_L
            AndroidKeyEvent.KEYCODE_M -> KeyEvent.VK_M
            AndroidKeyEvent.KEYCODE_N -> KeyEvent.VK_N
            AndroidKeyEvent.KEYCODE_O -> KeyEvent.VK_O
            AndroidKeyEvent.KEYCODE_P -> KeyEvent.VK_P
            AndroidKeyEvent.KEYCODE_Q -> KeyEvent.VK_Q
            AndroidKeyEvent.KEYCODE_R -> KeyEvent.VK_R
            AndroidKeyEvent.KEYCODE_S -> KeyEvent.VK_S
            AndroidKeyEvent.KEYCODE_T -> KeyEvent.VK_T
            AndroidKeyEvent.KEYCODE_U -> KeyEvent.VK_U
            AndroidKeyEvent.KEYCODE_V -> KeyEvent.VK_V
            AndroidKeyEvent.KEYCODE_W -> KeyEvent.VK_W
            AndroidKeyEvent.KEYCODE_X -> KeyEvent.VK_X
            AndroidKeyEvent.KEYCODE_Y -> KeyEvent.VK_Y
            AndroidKeyEvent.KEYCODE_Z -> KeyEvent.VK_Z

            AndroidKeyEvent.KEYCODE_0 -> KeyEvent.VK_0
            AndroidKeyEvent.KEYCODE_1 -> KeyEvent.VK_1
            AndroidKeyEvent.KEYCODE_2 -> KeyEvent.VK_2
            AndroidKeyEvent.KEYCODE_3 -> KeyEvent.VK_3
            AndroidKeyEvent.KEYCODE_4 -> KeyEvent.VK_4
            AndroidKeyEvent.KEYCODE_5 -> KeyEvent.VK_5
            AndroidKeyEvent.KEYCODE_6 -> KeyEvent.VK_6
            AndroidKeyEvent.KEYCODE_7 -> KeyEvent.VK_7
            AndroidKeyEvent.KEYCODE_8 -> KeyEvent.VK_8
            AndroidKeyEvent.KEYCODE_9 -> KeyEvent.VK_9

            AndroidKeyEvent.KEYCODE_ENTER, AndroidKeyEvent.KEYCODE_NUMPAD_ENTER -> KeyEvent.VK_ENTER
            AndroidKeyEvent.KEYCODE_DEL -> KeyEvent.VK_BACK_SPACE
            AndroidKeyEvent.KEYCODE_FORWARD_DEL -> KeyEvent.VK_DELETE
            AndroidKeyEvent.KEYCODE_TAB -> KeyEvent.VK_TAB
            AndroidKeyEvent.KEYCODE_SPACE -> KeyEvent.VK_SPACE
            AndroidKeyEvent.KEYCODE_ESCAPE -> KeyEvent.VK_ESCAPE

            AndroidKeyEvent.KEYCODE_DPAD_UP -> KeyEvent.VK_UP
            AndroidKeyEvent.KEYCODE_DPAD_DOWN -> KeyEvent.VK_DOWN
            AndroidKeyEvent.KEYCODE_DPAD_LEFT -> KeyEvent.VK_LEFT
            AndroidKeyEvent.KEYCODE_DPAD_RIGHT -> KeyEvent.VK_RIGHT

            AndroidKeyEvent.KEYCODE_PAGE_UP -> KeyEvent.VK_PAGE_UP
            AndroidKeyEvent.KEYCODE_PAGE_DOWN -> KeyEvent.VK_PAGE_DOWN
            AndroidKeyEvent.KEYCODE_MOVE_HOME -> KeyEvent.VK_HOME
            AndroidKeyEvent.KEYCODE_MOVE_END -> KeyEvent.VK_END

            AndroidKeyEvent.KEYCODE_SHIFT_LEFT, AndroidKeyEvent.KEYCODE_SHIFT_RIGHT -> KeyEvent.VK_SHIFT
            AndroidKeyEvent.KEYCODE_CTRL_LEFT, AndroidKeyEvent.KEYCODE_CTRL_RIGHT -> KeyEvent.VK_CONTROL
            AndroidKeyEvent.KEYCODE_ALT_LEFT, AndroidKeyEvent.KEYCODE_ALT_RIGHT -> KeyEvent.VK_ALT

            AndroidKeyEvent.KEYCODE_F1 -> KeyEvent.VK_F1
            AndroidKeyEvent.KEYCODE_F2 -> KeyEvent.VK_F2
            AndroidKeyEvent.KEYCODE_F3 -> KeyEvent.VK_F3
            AndroidKeyEvent.KEYCODE_F4 -> KeyEvent.VK_F4
            AndroidKeyEvent.KEYCODE_F5 -> KeyEvent.VK_F5
            AndroidKeyEvent.KEYCODE_F6 -> KeyEvent.VK_F6
            AndroidKeyEvent.KEYCODE_F7 -> KeyEvent.VK_F7
            AndroidKeyEvent.KEYCODE_F8 -> KeyEvent.VK_F8
            AndroidKeyEvent.KEYCODE_F9 -> KeyEvent.VK_F9
            AndroidKeyEvent.KEYCODE_F10 -> KeyEvent.VK_F10
            AndroidKeyEvent.KEYCODE_F11 -> KeyEvent.VK_F11
            AndroidKeyEvent.KEYCODE_F12 -> KeyEvent.VK_F12

            AndroidKeyEvent.KEYCODE_MINUS -> KeyEvent.VK_MINUS
            AndroidKeyEvent.KEYCODE_EQUALS -> KeyEvent.VK_EQUALS
            AndroidKeyEvent.KEYCODE_LEFT_BRACKET -> KeyEvent.VK_OPEN_BRACKET
            AndroidKeyEvent.KEYCODE_RIGHT_BRACKET -> KeyEvent.VK_CLOSE_BRACKET
            AndroidKeyEvent.KEYCODE_BACKSLASH -> KeyEvent.VK_BACK_SLASH
            AndroidKeyEvent.KEYCODE_SEMICOLON -> KeyEvent.VK_SEMICOLON
            AndroidKeyEvent.KEYCODE_APOSTROPHE -> KeyEvent.VK_QUOTE
            AndroidKeyEvent.KEYCODE_GRAVE -> KeyEvent.VK_BACK_QUOTE
            AndroidKeyEvent.KEYCODE_COMMA -> KeyEvent.VK_COMMA
            AndroidKeyEvent.KEYCODE_PERIOD -> KeyEvent.VK_PERIOD
            AndroidKeyEvent.KEYCODE_SLASH -> KeyEvent.VK_SLASH

            AndroidKeyEvent.KEYCODE_NUMPAD_0 -> KeyEvent.VK_NUMPAD0
            AndroidKeyEvent.KEYCODE_NUMPAD_1 -> KeyEvent.VK_NUMPAD1
            AndroidKeyEvent.KEYCODE_NUMPAD_2 -> KeyEvent.VK_NUMPAD2
            AndroidKeyEvent.KEYCODE_NUMPAD_3 -> KeyEvent.VK_NUMPAD3
            AndroidKeyEvent.KEYCODE_NUMPAD_4 -> KeyEvent.VK_NUMPAD4
            AndroidKeyEvent.KEYCODE_NUMPAD_5 -> KeyEvent.VK_NUMPAD5
            AndroidKeyEvent.KEYCODE_NUMPAD_6 -> KeyEvent.VK_NUMPAD6
            AndroidKeyEvent.KEYCODE_NUMPAD_7 -> KeyEvent.VK_NUMPAD7
            AndroidKeyEvent.KEYCODE_NUMPAD_8 -> KeyEvent.VK_NUMPAD8
            AndroidKeyEvent.KEYCODE_NUMPAD_9 -> KeyEvent.VK_NUMPAD9
            AndroidKeyEvent.KEYCODE_NUMPAD_ADD -> KeyEvent.VK_ADD
            AndroidKeyEvent.KEYCODE_NUMPAD_SUBTRACT -> KeyEvent.VK_SUBTRACT
            AndroidKeyEvent.KEYCODE_NUMPAD_MULTIPLY -> KeyEvent.VK_MULTIPLY
            AndroidKeyEvent.KEYCODE_NUMPAD_DIVIDE -> KeyEvent.VK_DIVIDE
            AndroidKeyEvent.KEYCODE_NUMPAD_DOT -> KeyEvent.VK_DECIMAL

            else -> KeyEvent.VK_UNDEFINED
        }
    }
}
