import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;
import sun.misc.Unsafe;

@ObfuscatedName("zx")
public class zx extends zs {
	@ObfuscatedName("wp")
	@ObfuscatedSignature(
		descriptor = "Lsun/misc/Unsafe;"
	)
	public static Unsafe wp_fld = zi();
	@ObfuscatedName("cc")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public int cc_fld;
	@ObfuscatedName("km")
	@ObfuscatedSignature(
		descriptor = "J"
	)
	public long km_fld;
	// $VF: synthetic field
	@ObfuscatedName("bk")
	@ObfuscatedSignature(
		descriptor = "Z"
	)
	public static boolean bk_fld = !zx.class.desiredAssertionStatus();
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Ljava/nio/ByteBuffer;"
	)
	ByteBuffer ak_fld;

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "()[B"
	)
	@Override
	byte[] ay() {
		byte[] var1 = new byte[this.ak_fld.capacity()];
		((Buffer)this.ak_fld).position(0);
		this.ak_fld.get(var1);
		return var1;
	}

	@ObfuscatedName("zi")
	@ObfuscatedSignature(
		descriptor = "()Lsun/misc/Unsafe;"
	)
	public static Unsafe zi() {
		try {
			Field var0 = Unsafe.class.getDeclaredField("theUnsafe");
			if (!var0.getType().equals(Unsafe.class)) {
				return null;
			} else {
				int var1 = var0.getModifiers();
				if (Modifier.isStatic(var1) && Modifier.isFinal(var1)) {
					var0.setAccessible(true);
					return (Unsafe)(Unsafe)var0.get(null);
				} else {
					return null;
				}
			}
		} catch (Exception var2) {
			return null;
		}
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(I)[B"
	)
	@Override
	byte[] ag(int var1) {
		if (wp_fld != null) {
			byte[] var3 = new byte[this.cc_fld];
			wp_fld.copyMemory(null, this.km_fld, var3, Unsafe.ARRAY_BYTE_BASE_OFFSET, this.cc_fld);
			return var3;
		} else {
			byte[] var2 = new byte[this.ak_fld.capacity()];
			this.ak_fld.position(0);
			this.ak_fld.get(var2);
			return var2;
		}
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "([BB)V"
	)
	@Override
	public void az(byte[] var1, byte var2) {
		if (wp_fld != null) {
			if (!bk_fld && this.km_fld != 0L) {
				throw new AssertionError();
			}

			long var3 = wp_fld.allocateMemory(var1.length);
			wp_fld.copyMemory(var1, Unsafe.ARRAY_BYTE_BASE_OFFSET, null, var3, var1.length);
			this.km_fld = var3;
			this.cc_fld = var1.length;
		} else {
			this.ak_fld = ByteBuffer.allocateDirect(var1.length);
			this.ak_fld.position(0);
			this.ak_fld.put(var1);
		}
	}

	@ObfuscatedName("bd")
	@ObfuscatedSignature(
		descriptor = "(Loy;)I"
	)
	public static int bd(oy var0) {
		return var0.by_fld;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "()[B"
	)
	@Override
	byte[] aw() {
		byte[] var1 = new byte[this.ak_fld.capacity()];
		((Buffer)this.ak_fld).position(0);
		this.ak_fld.get(var1);
		return var1;
	}

	public zx() {
	}

	@ObfuscatedName("yi")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public void yi() {
		if (wp_fld != null) {
			wp_fld.freeMemory(this.km_fld);
			this.km_fld = 0L;
			this.cc_fld = 0;
		}
	}

	@ObfuscatedName("qs")
	@ObfuscatedSignature(
		descriptor = "([B)V"
	)
	public void qs(byte[] var1) {
		this.az(var1, (byte)-79);
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "()[B"
	)
	@Override
	byte[] as() {
		byte[] var1 = new byte[this.ak_fld.capacity()];
		((Buffer)this.ak_fld).position(0);
		this.ak_fld.get(var1);
		return var1;
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "()[B"
	)
	@Override
	byte[] ar() {
		byte[] var1 = new byte[this.ak_fld.capacity()];
		((Buffer)this.ak_fld).position(0);
		this.ak_fld.get(var1);
		return var1;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "([B)V"
	)
	@Override
	public void af(byte[] var1) {
		this.ak_fld = ByteBuffer.allocateDirect(var1.length);
		((Buffer)this.ak_fld).position(0);
		this.ak_fld.put(var1);
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "([B)V"
	)
	@Override
	public void an(byte[] var1) {
		this.ak_fld = ByteBuffer.allocateDirect(var1.length);
		((Buffer)this.ak_fld).position(0);
		this.ak_fld.put(var1);
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "([B)V"
	)
	@Override
	public void au(byte[] var1) {
		this.ak_fld = ByteBuffer.allocateDirect(var1.length);
		((Buffer)this.ak_fld).position(0);
		this.ak_fld.put(var1);
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "([B)V"
	)
	@Override
	public void al(byte[] var1) {
		this.ak_fld = ByteBuffer.allocateDirect(var1.length);
		((Buffer)this.ak_fld).position(0);
		this.ak_fld.put(var1);
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "([B)V"
	)
	@Override
	public void ax(byte[] var1) {
		this.ak_fld = ByteBuffer.allocateDirect(var1.length);
		((Buffer)this.ak_fld).position(0);
		this.ak_fld.put(var1);
	}

	static {
		if (wp_fld == null) {
			client.ii_fld.info("unable to find Unsafe, using direct buffer");
		}
	}
}
