package net.runelite.mp.ui.bridge

import android.content.Context
import android.os.Build
import android.text.InputType
import android.util.AttributeSet
import android.view.View
import android.view.inputmethod.BaseInputConnection
import android.view.inputmethod.EditorInfo
import android.view.inputmethod.InputConnection
import android.view.inputmethod.InputMethodManager
import androidx.compose.runtime.mutableStateOf
import java.lang.ref.WeakReference

object SoftKeyboardController {
    val isKeyboardVisible = mutableStateOf(false)
    private var attachedViewRef: WeakReference<KeyboardInputView>? = null

    fun registerView(view: KeyboardInputView) {
        attachedViewRef = WeakReference(view)
    }

    fun unregisterView(view: KeyboardInputView) {
        if (attachedViewRef?.get() === view) {
            attachedViewRef = null
        }
    }

    fun show() {
        val view = attachedViewRef?.get() ?: return
        view.post {
            view.isFocusable = true
            view.isFocusableInTouchMode = true
            view.requestFocus()
            val imm = view.context.getSystemService(Context.INPUT_METHOD_SERVICE) as? InputMethodManager
            imm?.showSoftInput(view, InputMethodManager.SHOW_FORCED)
            try {
                val activity = net.runelite.mp.MainActivity.instance
                androidx.core.view.WindowCompat.getInsetsController(activity.window, activity.window.decorView)
                    .show(androidx.core.view.WindowInsetsCompat.Type.ime())
            } catch (t: Throwable) {
                // ignore
            }
            isKeyboardVisible.value = true
        }
    }

    fun hide() {
        val view = attachedViewRef?.get() ?: return
        view.post {
            val imm = view.context.getSystemService(Context.INPUT_METHOD_SERVICE) as? InputMethodManager
            imm?.hideSoftInputFromWindow(view.windowToken, 0)
            try {
                val activity = net.runelite.mp.MainActivity.instance
                androidx.core.view.WindowCompat.getInsetsController(activity.window, activity.window.decorView)
                    .hide(androidx.core.view.WindowInsetsCompat.Type.ime())
            } catch (t: Throwable) {
                // ignore
            }
            isKeyboardVisible.value = false
        }
    }

    fun toggle() {
        if (isKeyboardVisible.value) {
            hide()
        } else {
            show()
        }
    }
}

class KeyboardInputView @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = 0,
) : View(context, attrs, defStyleAttr) {

    init {
        isFocusable = true
        isFocusableInTouchMode = true
    }

    override fun onAttachedToWindow() {
        super.onAttachedToWindow()
        SoftKeyboardController.registerView(this)
    }

    override fun onDetachedFromWindow() {
        super.onDetachedFromWindow()
        SoftKeyboardController.unregisterView(this)
    }

    override fun onCheckIsTextEditor(): Boolean = true

    override fun onCreateInputConnection(outAttrs: EditorInfo): InputConnection {
        outAttrs.inputType = InputType.TYPE_CLASS_TEXT or
                InputType.TYPE_TEXT_VARIATION_VISIBLE_PASSWORD or
                InputType.TYPE_TEXT_FLAG_NO_SUGGESTIONS
        outAttrs.imeOptions = EditorInfo.IME_ACTION_DONE or
                EditorInfo.IME_FLAG_NO_EXTRACT_UI or
                EditorInfo.IME_FLAG_NO_FULLSCREEN

        return object : BaseInputConnection(this, true) {
            override fun commitText(text: CharSequence?, newCursorPosition: Int): Boolean {
                if (!text.isNullOrEmpty()) {
                    KeyDispatch.sendString(text.toString())
                    if (text.contains('\n') || text.contains('\r')) {
                        SoftKeyboardController.hide()
                    }
                }
                return true
            }

            override fun deleteSurroundingText(beforeLength: Int, afterLength: Int): Boolean {
                for (i in 0 until beforeLength) {
                    KeyDispatch.sendBackspace()
                }
                return true
            }

            override fun sendKeyEvent(event: android.view.KeyEvent): Boolean {
                val res = KeyDispatch.sendAndroidKeyEvent(event)
                if (event.keyCode == android.view.KeyEvent.KEYCODE_ENTER && event.action == android.view.KeyEvent.ACTION_UP) {
                    SoftKeyboardController.hide()
                }
                return res
            }

            override fun performEditorAction(actionCode: Int): Boolean {
                when (actionCode) {
                    EditorInfo.IME_ACTION_DONE,
                    EditorInfo.IME_ACTION_SEND,
                    EditorInfo.IME_ACTION_GO,
                    EditorInfo.IME_ACTION_SEARCH,
                    EditorInfo.IME_ACTION_NEXT,
                    EditorInfo.IME_ACTION_UNSPECIFIED -> {
                        KeyDispatch.sendEnter()
                        SoftKeyboardController.hide()
                        return true
                    }
                }
                return super.performEditorAction(actionCode)
            }
        }
    }
}
