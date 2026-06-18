import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;
import sun.misc.Unsafe;

@ObfuscatedName("zx")
public class zx extends zs {
	@ObfuscatedName("sn")
	@ObfuscatedSignature(
		descriptor = "Lsun/misc/Unsafe;"
	)
	public static Unsafe sn_fld = eo();
	@ObfuscatedName("pu")
	@ObfuscatedSignature(
		descriptor = "J"
	)
	public long pu_fld;
	@ObfuscatedName("nn")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public int nn_fld;
	// $VF: synthetic field
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Z"
	)
	public static boolean aj_fld = !zx.class.desiredAssertionStatus();
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

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(I)[B"
	)
	@Override
	byte[] ag(int var1) {
		if (sn_fld != null) {
			byte[] var3 = new byte[this.nn_fld];
			sn_fld.copyMemory(null, this.pu_fld, var3, Unsafe.ARRAY_BYTE_BASE_OFFSET, this.nn_fld);
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
		if (sn_fld != null) {
			if (!aj_fld && this.pu_fld != 0L) {
				throw new AssertionError();
			}

			long var3 = sn_fld.allocateMemory(var1.length);
			sn_fld.copyMemory(var1, Unsafe.ARRAY_BYTE_BASE_OFFSET, null, var3, var1.length);
			this.pu_fld = var3;
			this.nn_fld = var1.length;
		} else {
			this.ak_fld = ByteBuffer.allocateDirect(var1.length);
			this.ak_fld.position(0);
			this.ak_fld.put(var1);
		}
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

	@ObfuscatedName("eo")
	@ObfuscatedSignature(
		descriptor = "()Lsun/misc/Unsafe;"
	)
	public static Unsafe eo() {
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

	@ObfuscatedName("lx")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public void lx() {
		if (sn_fld != null) {
			sn_fld.freeMemory(this.pu_fld);
			this.pu_fld = 0L;
			this.nn_fld = 0;
		}
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

	@ObfuscatedName("cj")
	@ObfuscatedSignature(
		descriptor = "([B)V"
	)
	public void cj(byte[] var1) {
		this.az(var1, (byte)-79);
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
		if (sn_fld == null) {
			client.logger.info("unable to find Unsafe, using direct buffer");
		}
	}
}
