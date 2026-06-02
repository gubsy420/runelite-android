import java.io.DataInputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.LinkedList;
import java.util.Queue;
import net.runelite.api.annotations.ObfuscatedGetter;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("de")
public abstract class de implements Runnable {
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Ljava/lang/Thread;"
	)
	Thread ak_fld;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Ljava/util/Queue;"
	)
	Queue az_fld = new LinkedList();
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Z"
	)
	volatile boolean ag_fld;
	@ObfuscatedGetter(
		intValue = -780344679
	)
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int av_fld;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Lub;"
	)
	public static ub as_fld;
	@ObfuscatedName("be")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int be_fld;

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Ljava/net/URL;)Ldj;"
	)
	public dj ap(URL var1) {
		dj var2 = new dj(var1);
		synchronized (this) {
			this.az_fld.add(var2);
			this.notify();
			return var2;
		}
	}

	@ObfuscatedName("zu")
	@ObfuscatedSignature(
		descriptor = "(Llu;)Lma;"
	)
	public static ma zu(lu var0) {
		return var0.hi_fld;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public void ak() {
		while (!this.ag_fld) {
			try {
				dj var1;
				synchronized (this) {
					var1 = (dj)(dj)this.az_fld.poll();
					if (var1 == null) {
						try {
							this.wait();
						} catch (InterruptedException var5) {
						}
						continue;
					}
				}

				this.ae(var1, (byte)-96);
			} catch (Exception var7) {
				gl.ak(null, var7);
			}
		}
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Ljava/net/URLConnection;B)I"
	)
	int ah(URLConnection var1, byte var2) {
		int var3 = -47020521 * dj.ag_fld;
		if (null != var1) {
			try {
				if (var1 instanceof HttpURLConnection) {
					var3 = ((HttpURLConnection)var1).getResponseCode();
				}
			} catch (IOException var5) {
			}
		}

		return var3;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Ljava/net/URLConnection;I)V"
	)
	void aw(URLConnection var1, int var2) {
		var1.setConnectTimeout(5000);
		var1.setReadTimeout(5000);
		var1.setUseCaches(false);
		var1.setRequestProperty("Connection", "close");
		var1.setRequestProperty("User-Agent", "OldSchoolRuneScape/" + this.av_fld);
	}

	// $VF: Could not verify finally blocks. A semaphore variable has been added to preserve control flow.
	// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Ljava/net/URLConnection;Ldj;S)V"
	)
	void ay(URLConnection var1, dj var2, short var3) {
		DataInputStream var4 = null;
		boolean var14 = false /* VF: Semaphore variable */;

		label80: {
			label79: {
				try {
					var14 = true;
					int var6 = var1.getContentLength();
					var4 = new DataInputStream(var1.getInputStream());
					byte[] var5;
					if (var6 >= 0) {
						var5 = new byte[var6];
						var4.readFully(var5);
					} else {
						var5 = new byte[0];
						byte[] var7 = dv.ag(5000, 1987896383);

						for (int var8 = var4.read(var7); var8 > -1; var8 = var4.read(var7)) {
							byte[] var9 = new byte[var8 + var5.length];
							System.arraycopy(var5, 0, var9, 0, var5.length);
							System.arraycopy(var7, 0, var9, var5.length, var8);
							var5 = var9;
						}

						kl.az(var7, (short)-7195);
					}

					var2.ae_fld = var5;
					var14 = false;
					break label79;
				} catch (IOException var16) {
					var2.ae_fld = null;
					var14 = false;
				} finally {
					if (var14) {
						var2.av_fld = this.ah(var1, (byte)89);
					}
				}

				var2.av_fld = this.ah(var1, (byte)105);
				break label80;
			}

			var2.av_fld = this.ah(var1, (byte)107);
		}

		if (null != var4) {
			try {
				var4.close();
			} catch (IOException var15) {
			}
		}
	}

	@ObfuscatedName("vy")
	@ObfuscatedSignature(
		descriptor = "(Lde;Ljava/net/URLConnection;)V"
	)
	public static void vy(de var0, URLConnection var1) {
		if (var0 == null) {
			var0.getClass();
		}

		var1.setConnectTimeout(5000);
		var1.setReadTimeout(5000);
		var1.setUseCaches(false);
		var1.setRequestProperty("Connection", "close");
		var1.setRequestProperty("User-Agent", "OldSchoolRuneScape/" + var0.av_fld);
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(Ljava/net/URL;B)Ldj;"
	)
	public dj as(URL var1, byte var2) {
		dj var3 = new dj(var1);
		synchronized (this) {
			this.az_fld.add(var3);
			this.notify();
			return var3;
		}
	}

	// $VF: Could not verify finally blocks. A semaphore variable has been added to preserve control flow.
	// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
	@ObfuscatedName("jx")
	@ObfuscatedSignature(
		descriptor = "(Lde;Ljava/net/URLConnection;Ldj;)V"
	)
	public static void jx(de var0, URLConnection var1, dj var2) {
		if (var0 == null) {
			var0.getClass();
		}

		DataInputStream var3 = null;
		boolean var13 = false /* VF: Semaphore variable */;

		label77: {
			label76: {
				try {
					var13 = true;
					int var5 = var1.getContentLength();
					var3 = new DataInputStream(var1.getInputStream());
					byte[] var4;
					if (var5 >= 0) {
						var4 = new byte[var5];
						var3.readFully(var4);
					} else {
						var4 = new byte[0];
						byte[] var6 = dv.ag(5000, 1987896383);

						for (int var7 = var3.read(var6); var7 > -1; var7 = var3.read(var6)) {
							byte[] var8 = new byte[var7 + var4.length];
							System.arraycopy(var4, 0, var8, 0, var4.length);
							System.arraycopy(var6, 0, var8, var4.length, var7);
							var4 = var8;
						}

						kl.az(var6, (short)-31754);
					}

					var2.ae_fld = var4;
					var13 = false;
					break label76;
				} catch (IOException var15) {
					var2.ae_fld = null;
					var13 = false;
				} finally {
					if (var13) {
						var2.av_fld = var0.ah(var1, (byte)62);
					}
				}

				var2.av_fld = var0.ah(var1, (byte)84);
				break label77;
			}

			var2.av_fld = var0.ah(var1, (byte)43);
		}

		if (null != var3) {
			try {
				var3.close();
			} catch (IOException var14) {
			}
		}
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(B)V"
	)
	public void ar(byte var1) {
		this.ag_fld = true;

		try {
			synchronized (this) {
				this.notify();
			}

			this.ak_fld.join();
		} catch (InterruptedException var5) {
		}
	}

	// $VF: Could not verify finally blocks. A semaphore variable has been added to preserve control flow.
	// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(Ljava/net/URLConnection;Ldj;)V"
	)
	void am(URLConnection var1, dj var2) {
		DataInputStream var3 = null;
		boolean var13 = false /* VF: Semaphore variable */;

		label73: {
			label72: {
				try {
					var13 = true;
					int var5 = var1.getContentLength();
					var3 = new DataInputStream(var1.getInputStream());
					byte[] var4;
					if (var5 >= 0) {
						var4 = new byte[var5];
						var3.readFully(var4);
					} else {
						var4 = new byte[0];
						byte[] var6 = dv.ag(1116660694, 1987896383);

						for (int var7 = var3.read(var6); var7 > -1; var7 = var3.read(var6)) {
							byte[] var8 = new byte[var7 + var4.length];
							System.arraycopy(var4, 0, var8, 0, var4.length);
							System.arraycopy(var6, 0, var8, var4.length, var7);
							var4 = var8;
						}

						kl.az(var6, (short)-28814);
					}

					var2.ae_fld = var4;
					var13 = false;
					break label72;
				} catch (IOException var15) {
					var2.ae_fld = null;
					var13 = false;
				} finally {
					if (var13) {
						var2.av_fld = this.ah(var1, (byte)119);
					}
				}

				var2.av_fld = this.ah(var1, (byte)104);
				break label73;
			}

			var2.av_fld = this.ah(var1, (byte)64) * 1539142578;
		}

		if (null != var3) {
			try {
				var3.close();
			} catch (IOException var14) {
			}
		}
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public void az() {
		while (!this.ag_fld) {
			try {
				dj var1;
				synchronized (this) {
					var1 = (dj)(dj)this.az_fld.poll();
					if (var1 == null) {
						try {
							this.wait();
						} catch (InterruptedException var5) {
						}
						continue;
					}
				}

				this.ae(var1, (byte)-117);
			} catch (Exception var7) {
				gl.ak(null, var7);
			}
		}
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public void av() {
		while (!this.ag_fld) {
			try {
				dj var1;
				synchronized (this) {
					var1 = (dj)(dj)this.az_fld.poll();
					if (var1 == null) {
						try {
							this.wait();
						} catch (InterruptedException var5) {
						}
						continue;
					}
				}

				this.ae(var1, (byte)-40);
			} catch (Exception var7) {
				gl.ak(null, var7);
			}
		}
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public void ac() {
		while (!this.ag_fld) {
			try {
				dj var1;
				synchronized (this) {
					var1 = (dj)(dj)this.az_fld.poll();
					if (var1 == null) {
						try {
							this.wait();
						} catch (InterruptedException var5) {
						}
						continue;
					}
				}

				this.ae(var1, (byte)-122);
			} catch (Exception var7) {
				gl.ak(null, var7);
			}
		}
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Ldj;)V"
	)
	abstract void af(dj var1) throws IOException;

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Ldj;)V"
	)
	abstract void al(dj var1) throws IOException;

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(Ldj;)V"
	)
	abstract void au(dj var1) throws IOException;

	de(int var1) {
		this.ak_fld = new Thread(this);
		this.ak_fld.setPriority(1);
		this.ak_fld.start();
		this.av_fld = var1;
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(Ljava/net/URLConnection;)I"
	)
	int aa(URLConnection var1) {
		int var2 = -47020521 * dj.ag_fld;
		if (null != var1) {
			try {
				if (var1 instanceof HttpURLConnection) {
					var2 = ((HttpURLConnection)var1).getResponseCode();
				}
			} catch (IOException var4) {
			}
		}

		return var2;
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(Ljava/net/URLConnection;)I"
	)
	int ax(URLConnection var1) {
		int var2 = -47020521 * dj.ag_fld;
		if (null != var1) {
			try {
				if (var1 instanceof HttpURLConnection) {
					var2 = ((HttpURLConnection)var1).getResponseCode();
				}
			} catch (IOException var4) {
			}
		}

		return var2;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Ldj;B)V"
	)
	abstract void ae(dj var1, byte var2) throws IOException;

	@ObfuscatedName("run")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	@Override
	public void run() {
		while (!this.ag_fld) {
			try {
				dj var1;
				synchronized (this) {
					var1 = (dj)(dj)this.az_fld.poll();
					if (var1 == null) {
						try {
							this.wait();
						} catch (InterruptedException var5) {
						}
						continue;
					}
				}

				this.ae(var1, (byte)-128);
			} catch (Exception var7) {
				gl.ak(null, var7);
			}
		}
	}

	// $VF: Could not verify finally blocks. A semaphore variable has been added to preserve control flow.
	// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(Ljava/net/URLConnection;Ldj;)V"
	)
	void ad(URLConnection var1, dj var2) {
		DataInputStream var3 = null;
		boolean var13 = false /* VF: Semaphore variable */;

		label73: {
			label72: {
				try {
					var13 = true;
					int var5 = var1.getContentLength();
					var3 = new DataInputStream(var1.getInputStream());
					byte[] var4;
					if (var5 >= 0) {
						var4 = new byte[var5];
						var3.readFully(var4);
					} else {
						var4 = new byte[0];
						byte[] var6 = dv.ag(617150454, 1987896383);

						for (int var7 = var3.read(var6); var7 > -1; var7 = var3.read(var6)) {
							byte[] var8 = new byte[var7 + var4.length];
							System.arraycopy(var4, 0, var8, 0, var4.length);
							System.arraycopy(var6, 0, var8, var4.length, var7);
							var4 = var8;
						}

						kl.az(var6, (short)-14278);
					}

					var2.ae_fld = var4;
					var13 = false;
					break label72;
				} catch (IOException var15) {
					var2.ae_fld = null;
					var13 = false;
				} finally {
					if (var13) {
						var2.av_fld = this.ah(var1, (byte)127);
					}
				}

				var2.av_fld = this.ah(var1, (byte)94);
				break label73;
			}

			var2.av_fld = this.ah(var1, (byte)78) * 2686926;
		}

		if (null != var3) {
			try {
				var3.close();
			} catch (IOException var14) {
			}
		}
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Ljava/net/URLConnection;)I"
	)
	int an(URLConnection var1) {
		int var2 = 934958064 * dj.ag_fld;
		if (null != var1) {
			try {
				if (var1 instanceof HttpURLConnection) {
					var2 = ((HttpURLConnection)var1).getResponseCode();
				}
			} catch (IOException var4) {
			}
		}

		return var2;
	}

	@ObfuscatedName("ye")
	@ObfuscatedSignature(
		descriptor = "(Lde;)V"
	)
	public static void ye(de var0) {
		if (var0 == null) {
			var0.getClass();
		} else {
			var0.ag_fld = true;

			try {
				synchronized (var0) {
					var0.notify();
				}

				var0.ak_fld.join();
			} catch (InterruptedException var4) {
			}
		}
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Ljava/net/URL;)Ldj;"
	)
	public dj ab(URL var1) {
		dj var2 = new dj(var1);
		synchronized (this) {
			this.az_fld.add(var2);
			this.notify();
			return var2;
		}
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public void ag() {
		this.ag_fld = true;

		try {
			synchronized (this) {
				this.notify();
			}

			this.ak_fld.join();
		} catch (InterruptedException var4) {
		}
	}

	@ObfuscatedName("dr")
	@ObfuscatedSignature(
		descriptor = "(Lde;Ljava/net/URLConnection;)V"
	)
	public static void dr(de var0, URLConnection var1) {
		if (var0 == null) {
			var0.getClass();
		} else {
			var1.setConnectTimeout(5000);
			var1.setReadTimeout(5000);
			var1.setUseCaches(false);
			var1.setRequestProperty("Connection", "close");
			var1.setRequestProperty("User-Agent", "OldSchoolRuneScape/" + var0.av_fld);
		}
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "([[[IIIII)V"
	)
	static final void ah(int[][][] var0, int var1, int var2, int var3, int var4) {
		for (int var5 = 0; var5 < 8; var5++) {
			for (int var6 = 0; var6 < 8; var6++) {
				if (var4 != 1690863576) {
					return;
				}

				var0[var1][var5 + var2][var6 + var3] = 0;
			}
		}

		if (var2 > 0) {
			if (var4 != 1690863576) {
				return;
			}

			for (int var7 = 1; var7 < 8; var7++) {
				if (var4 != 1690863576) {
					return;
				}

				var0[var1][var2][var3 + var7] = var0[var1][var2 - 1][var3 + var7];
			}
		}

		if (var3 > 0) {
			for (int var8 = 1; var8 < 8; var8++) {
				var0[var1][var2 + var8][var3] = var0[var1][var8 + var2][var3 - 1];
			}
		}

		if (var2 > 0 && 0 != var0[var1][var2 - 1][var3]) {
			var0[var1][var2][var3] = var0[var1][var2 - 1][var3];
		} else if (var3 > 0 && 0 != var0[var1][var2][var3 - 1]) {
			var0[var1][var2][var3] = var0[var1][var2][var3 - 1];
		} else if (var2 > 0 && var3 > 0 && var0[var1][var2 - 1][var3 - 1] != 0) {
			var0[var1][var2][var3] = var0[var1][var2 - 1][var3 - 1];
		}
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public void aj() {
		this.ag_fld = true;

		try {
			synchronized (this) {
				this.notify();
			}

			this.ak_fld.join();
		} catch (InterruptedException var4) {
		}
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public void at() {
		while (!this.ag_fld) {
			try {
				dj var1;
				synchronized (this) {
					var1 = (dj)(dj)this.az_fld.poll();
					if (var1 == null) {
						try {
							this.wait();
						} catch (InterruptedException var5) {
						}
						continue;
					}
				}

				this.ae(var1, (byte)-128);
			} catch (Exception var7) {
				gl.ak(null, var7);
			}
		}
	}
}
