import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.Hashtable;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;
import org.bouncycastle.crypto.tls.DefaultTlsClient;
import org.bouncycastle.crypto.tls.TlsAuthentication;

@ObfuscatedName("qi")
class qi extends DefaultTlsClient {
	// $VF: synthetic field
	@ObfuscatedName("this$1")
	@ObfuscatedSignature(
		descriptor = "Lqf;"
	)
	qf this$1;

	@ObfuscatedName("getAuthentication")
	@ObfuscatedSignature(
		descriptor = "()Lorg/bouncycastle/crypto/tls/TlsAuthentication;"
	)
	public TlsAuthentication getAuthentication() throws IOException {
		return new qq(this);
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "()Ljava/util/Hashtable;"
	)
	public Hashtable ag() throws IOException {
		Hashtable var1 = super.getClientExtensions();
		if (null == var1) {
			var1 = new Hashtable();
		}

		byte[] var2 = this.this$1.val$host.getBytes();
		ByteArrayOutputStream var3 = new ByteArrayOutputStream();
		DataOutputStream var4 = new DataOutputStream(var3);
		var4.writeShort(var2.length + 3);
		var4.writeByte(0);
		var4.writeShort(var2.length);
		var4.write(var2);
		var4.close();
		var1.put(0, var3.toByteArray());
		return var1;
	}

	qi(qf var1) throws Exception {
		this.this$1 = var1;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "()Ljava/util/Hashtable;"
	)
	public Hashtable ak() throws IOException {
		Hashtable var1 = super.getClientExtensions();
		if (null == var1) {
			var1 = new Hashtable();
		}

		byte[] var2 = this.this$1.val$host.getBytes();
		ByteArrayOutputStream var3 = new ByteArrayOutputStream();
		DataOutputStream var4 = new DataOutputStream(var3);
		var4.writeShort(var2.length + 3);
		var4.writeByte(0);
		var4.writeShort(var2.length);
		var4.write(var2);
		var4.close();
		var1.put(0, var3.toByteArray());
		return var1;
	}

	@ObfuscatedName("getClientExtensions")
	@ObfuscatedSignature(
		descriptor = "()Ljava/util/Hashtable;"
	)
	@Override
	public Hashtable getClientExtensions() throws IOException {
		Hashtable var1 = super.getClientExtensions();
		if (null == var1) {
			var1 = new Hashtable();
		}

		byte[] var2 = this.this$1.val$host.getBytes();
		ByteArrayOutputStream var3 = new ByteArrayOutputStream();
		DataOutputStream var4 = new DataOutputStream(var3);
		var4.writeShort(var2.length + 3);
		var4.writeByte(0);
		var4.writeShort(var2.length);
		var4.write(var2);
		var4.close();
		var1.put(0, var3.toByteArray());
		return var1;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "()Ljava/util/Hashtable;"
	)
	public Hashtable az() throws IOException {
		Hashtable var1 = super.getClientExtensions();
		if (null == var1) {
			var1 = new Hashtable();
		}

		byte[] var2 = this.this$1.val$host.getBytes();
		ByteArrayOutputStream var3 = new ByteArrayOutputStream();
		DataOutputStream var4 = new DataOutputStream(var3);
		var4.writeShort(var2.length + 3);
		var4.writeByte(0);
		var4.writeShort(var2.length);
		var4.write(var2);
		var4.close();
		var1.put(0, var3.toByteArray());
		return var1;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "()Lorg/bouncycastle/crypto/tls/TlsAuthentication;"
	)
	public TlsAuthentication av() throws IOException {
		return new qq(this);
	}
}
