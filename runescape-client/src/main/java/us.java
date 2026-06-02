import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.InaccessibleObjectException;
import java.lang.reflect.Method;
import java.net.Socket;
import java.net.SocketImpl;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("us")
public class us extends ua {
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Lux;"
	)
	ux az_fld;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lup;"
	)
	up ag_fld;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Ljava/net/Socket;"
	)
	Socket ak_fld;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int aw_fld;
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "[[[B"
	)
	static byte[][][] ax_fld;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int av_fld;
	@ObfuscatedName("ev")
	@ObfuscatedSignature(
		descriptor = "Lwd;"
	)
	static wd ev_fld;

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "([BII)V"
	)
	@Override
	public void aq(byte[] var1, int var2, int var3) throws IOException {
		this.az_fld.ah(var1, var2, var3, 1023744048);
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(II)Z"
	)
	@Override
	public boolean ak(int var1, int var2) throws IOException {
		return this.ag_fld.ae(var1, -1050475096);
	}

	@ObfuscatedName("finalize")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	@Override
	protected void finalize() {
		this.ah((byte)115);
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	@Override
	public int az(int var1) throws IOException {
		return this.ag_fld.aw(-392586608);
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "([BIII)I"
	)
	@Override
	public int av(byte[] var1, int var2, int var3, int var4) throws IOException {
		return this.ag_fld.ay(var1, var2, var3, 995408637);
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "([BIIB)V"
	)
	@Override
	public void ae(byte[] var1, int var2, int var3, byte var4) throws IOException {
		this.az_fld.ah(var1, var2, var3, -1015262460);
	}

	@ObfuscatedName("acl")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	protected void acl() {
		this.ah((byte)87);
	}

	@ObfuscatedName("acx")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	protected void acx() {
		this.ah((byte)127);
	}

	@ObfuscatedName("acc")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	protected void acc() {
		this.ah((byte)123);
	}

	@ObfuscatedName("acu")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	protected void acu() {
		this.ah((byte)101);
	}

	@ObfuscatedName("cg")
	@ObfuscatedSignature(
		descriptor = "()Ljava/io/FileDescriptor;"
	)
	public FileDescriptor cg() {
		if (this.ag_fld.ag_fld instanceof FileInputStream) {
			FileInputStream var6 = (FileInputStream)this.ag_fld.ag_fld;

			try {
				return var6.getFD();
			} catch (IOException var4) {
				return null;
			}
		} else {
			try {
				Field var1 = Socket.class.getDeclaredField("impl");
				var1.setAccessible(true);
				SocketImpl var2 = (SocketImpl)(SocketImpl)var1.get(this.ak_fld);
				Method var3 = SocketImpl.class.getDeclaredMethod("getFileDescriptor");
				var3.setAccessible(true);
				return (FileDescriptor)(FileDescriptor)var3.invoke(var2, (Object[])(new Object[0]));
			} catch (InaccessibleObjectException | ReflectiveOperationException var5) {
				return null;
			}
		}
	}

	@ObfuscatedName("acb")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	protected void acb() {
		this.ah((byte)85);
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(I)Z"
	)
	@Override
	public boolean ay(int var1) throws IOException {
		return this.ag_fld.ae(var1, 848332809);
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(I)Z"
	)
	@Override
	public boolean as(int var1) throws IOException {
		return this.ag_fld.ae(var1, -1620251545);
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Override
	public int au() throws IOException {
		return up.ae(this.ag_fld, 2106938245);
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Override
	public int af() throws IOException {
		return this.ag_fld.aw(-1162038614);
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)Z"
	)
	@Override
	public boolean aw(int var1) throws IOException {
		return this.ag_fld.ae(var1, -612313293);
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(B)I"
	)
	@Override
	public int ag(byte var1) throws IOException {
		return up.ae(this.ag_fld, 716328797);
	}

	@ObfuscatedName("sq")
	@ObfuscatedSignature(
		descriptor = "(Lus;)V"
	)
	public static void sq(us var0) throws IOException {
		if (var0 == null) {
			var0.getClass();
		}

		var0.ah((byte)54);
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Override
	public int ar() throws IOException {
		return up.ae(this.ag_fld, 2048673420);
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(B)V"
	)
	@Override
	public void ah(byte var1) {
		this.az_fld.aw(-1587216147);

		try {
			this.ak_fld.close();
		} catch (IOException var3) {
		}

		this.ag_fld.as(1704002799);
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	@Override
	public void ad() {
		this.az_fld.aw(-1674507372);

		try {
			this.ak_fld.close();
		} catch (IOException var2) {
		}

		this.ag_fld.as(1774435445);
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "([BII)I"
	)
	@Override
	public int ax(byte[] var1, int var2, int var3) throws IOException {
		return this.ag_fld.ay(var1, var2, var3, 307545898);
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "([BII)I"
	)
	@Override
	public int an(byte[] var1, int var2, int var3) throws IOException {
		return this.ag_fld.ay(var1, var2, var3, -1266836073);
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "([BII)I"
	)
	@Override
	public int aa(byte[] var1, int var2, int var3) throws IOException {
		return this.ag_fld.ay(var1, var2, var3, -1621997275);
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "([BII)V"
	)
	@Override
	public void ai(byte[] var1, int var2, int var3) throws IOException {
		this.az_fld.ah(var1, var2, var3, -1244732966);
	}

	public us(Socket var1, int var2, int var3) throws IOException {
		this.ak_fld = var1;
		this.ak_fld.setSoTimeout(30000);
		this.ak_fld.setTcpNoDelay(true);
		this.ak_fld.setReceiveBufferSize(65536);
		this.ak_fld.setSendBufferSize(65536);
		this.ag_fld = new up(this.ak_fld.getInputStream(), var2);
		this.az_fld = new ux(this.ak_fld.getOutputStream(), var3);
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	@Override
	public void am() {
		this.az_fld.aw(1892996442);

		try {
			this.ak_fld.close();
		} catch (IOException var2) {
		}

		this.ag_fld.as(1346297877);
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Override
	public int al() throws IOException {
		return up.ae(this.ag_fld, 1662814417);
	}
}
