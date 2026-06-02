import java.io.DataInputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.URL;
import java.util.Iterator;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("la")
public class la implements Runnable {
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int ag_fld;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Llv;"
	)
	lv ah_fld = null;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Ljava/lang/String;"
	)
	public static String av_fld;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Ljava/lang/String;"
	)
	public static String ae_fld;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Z"
	)
	boolean as_fld;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Llv;"
	)
	lv aw_fld = null;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int ak_fld;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Ljava/lang/Thread;"
	)
	Thread ay_fld;
	@ObfuscatedName("fq")
	@ObfuscatedSignature(
		descriptor = "Lbo;"
	)
	public static bo fq_fld;

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	public final void ae(int var1) {
		synchronized (this) {
			this.as_fld = true;
			this.notifyAll();
		}

		try {
			this.ay_fld.join();
		} catch (InterruptedException var4) {
		}
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(IIILjava/lang/Object;)Llv;"
	)
	final lv al(int var1, int var2, int var3, Object var4) {
		lv var5 = new lv();
		var5.aw_fld = 1477615677 * var1;
		var5.av_fld = var2;
		var5.ay_fld = var4;
		synchronized (this) {
			if (this.aw_fld != null) {
				this.aw_fld.ah_fld = var5;
				this.aw_fld = var5;
			} else {
				this.aw_fld = this.ah_fld = var5;
			}

			this.notify();
			return var5;
		}
	}

	@ObfuscatedName("gb")
	@ObfuscatedSignature(
		descriptor = "(Lla;)V"
	)
	public static void gb(la var0) {
		if (var0 == null) {
			var0.getClass();
		} else {
			while (true) {
				lv var1;
				synchronized (var0) {
					while (true) {
						if (var0.as_fld) {
							return;
						}

						if (null != var0.ah_fld) {
							var1 = var0.ah_fld;
							var0.ah_fld = var0.ah_fld.ah_fld;
							if (var0.ah_fld == null) {
								var0.aw_fld = null;
							}
							break;
						}

						try {
							var0.wait();
						} catch (InterruptedException var5) {
						}
					}
				}

				try {
					int var2 = var1.aw_fld;
					if (1 == var2) {
						var1.ae_fld = new Socket(InetAddress.getByName((String)var1.ay_fld), var1.av_fld);
					} else if (2 == var2) {
						Thread var3 = new Thread((Runnable)var1.ay_fld);
						var3.setDaemon(true);
						var3.start();
						var3.setPriority(var1.av_fld);
						var1.ae_fld = var3;
					} else if (var2 == 4) {
						var1.ae_fld = new DataInputStream(((URL)var1.ay_fld).openStream());
					}

					var1.az_fld = 1;
				} catch (ThreadDeath var6) {
					throw var6;
				} catch (Throwable var7) {
					var1.az_fld = 2;
				}
			}
		}
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public final void ak() {
		while (true) {
			lv var1;
			synchronized (this) {
				while (true) {
					if (this.as_fld) {
						return;
					}

					if (null != this.ah_fld) {
						var1 = this.ah_fld;
						this.ah_fld = this.ah_fld.ah_fld;
						if (this.ah_fld == null) {
							this.aw_fld = null;
						}
						break;
					}

					try {
						this.wait();
					} catch (InterruptedException var7) {
					}
				}
			}

			try {
				int var2 = var1.aw_fld;
				if (1 == var2) {
					var1.ae_fld = new Socket(InetAddress.getByName((String)var1.ay_fld), var1.av_fld);
				} else if (2 == var2) {
					Thread var3 = new Thread((Runnable)var1.ay_fld);
					var3.setDaemon(true);
					var3.start();
					var3.setPriority(var1.av_fld);
					var1.ae_fld = var3;
				} else if (var2 == 4) {
					var1.ae_fld = new DataInputStream(((URL)var1.ay_fld).openStream());
				}

				var1.az_fld = 1;
			} catch (ThreadDeath var5) {
				throw var5;
			} catch (Throwable var6) {
				var1.az_fld = 2;
			}
		}
	}

	@ObfuscatedName("ug")
	@ObfuscatedSignature(
		descriptor = "(Lla;Ljava/lang/String;I)Llv;"
	)
	public static lv ug(la var0, String var1, int var2) {
		if (var0 == null) {
			var0.getClass();
		}

		return se(var0, 1, var2, 0, var1);
	}

	@ObfuscatedName("kg")
	@ObfuscatedSignature(
		descriptor = "(Lla;Ljava/lang/Runnable;IB)Llv;"
	)
	public static lv kg(la var0, Runnable var1, int var2, byte var3) {
		if (var0 == null) {
			throw new NullPointerException();
		} else {
			return se(var0, 2, var2, 0, var1);
		}
	}

	public la() {
		this.as_fld = false;
		av_fld = "Unknown";
		ae_fld = "1.6";

		try {
			av_fld = System.getProperty("java.vendor");
			ae_fld = System.getProperty("java.version");
		} catch (Exception var2) {
		}

		this.as_fld = false;
		this.ay_fld = new Thread(this);
		this.ay_fld.setPriority(10);
		this.ay_fld.setDaemon(true);
		this.ay_fld.start();
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public final void az() {
		while (true) {
			lv var1;
			synchronized (this) {
				while (true) {
					if (this.as_fld) {
						return;
					}

					if (null != this.ah_fld) {
						var1 = this.ah_fld;
						this.ah_fld = this.ah_fld.ah_fld;
						if (this.ah_fld == null) {
							this.aw_fld = null;
						}
						break;
					}

					try {
						this.wait();
					} catch (InterruptedException var7) {
					}
				}
			}

			try {
				int var2 = var1.aw_fld;
				if (1 == var2) {
					var1.ae_fld = new Socket(InetAddress.getByName((String)var1.ay_fld), var1.av_fld);
				} else if (2 == var2) {
					Thread var3 = new Thread((Runnable)var1.ay_fld);
					var3.setDaemon(true);
					var3.start();
					var3.setPriority(var1.av_fld);
					var1.ae_fld = var3;
				} else if (var2 == 4) {
					var1.ae_fld = new DataInputStream(((URL)var1.ay_fld).openStream());
				}

				var1.az_fld = 1;
			} catch (ThreadDeath var5) {
				throw var5;
			} catch (Throwable var6) {
				var1.az_fld = 2;
			}
		}
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public final void av() {
		while (true) {
			lv var1;
			synchronized (this) {
				while (true) {
					if (this.as_fld) {
						return;
					}

					if (null != this.ah_fld) {
						var1 = this.ah_fld;
						this.ah_fld = this.ah_fld.ah_fld;
						if (this.ah_fld == null) {
							this.aw_fld = null;
						}
						break;
					}

					try {
						this.wait();
					} catch (InterruptedException var7) {
					}
				}
			}

			try {
				int var2 = var1.aw_fld;
				if (1 == var2) {
					var1.ae_fld = new Socket(InetAddress.getByName((String)var1.ay_fld), var1.av_fld);
				} else if (2 == var2) {
					Thread var3 = new Thread((Runnable)var1.ay_fld);
					var3.setDaemon(true);
					var3.start();
					var3.setPriority(var1.av_fld);
					var1.ae_fld = var3;
				} else if (var2 == 4) {
					var1.ae_fld = new DataInputStream(((URL)var1.ay_fld).openStream());
				}

				var1.az_fld = 1;
			} catch (ThreadDeath var5) {
				throw var5;
			} catch (Throwable var6) {
				var1.az_fld = 2;
			}
		}
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public final void as() {
		synchronized (this) {
			this.as_fld = true;
			this.notifyAll();
		}

		try {
			this.ay_fld.join();
		} catch (InterruptedException var3) {
		}
	}

	@ObfuscatedName("se")
	@ObfuscatedSignature(
		descriptor = "(Lla;IIILjava/lang/Object;)Llv;"
	)
	public static lv se(la var0, int var1, int var2, int var3, Object var4) {
		if (var0 == null) {
			var0.getClass();
		}

		lv var6 = new lv();
		var6.aw_fld = var1;
		var6.av_fld = var2;
		var6.ay_fld = var4;
		synchronized (var0) {
			if (var0.aw_fld != null) {
				var0.aw_fld.ah_fld = var6;
				var0.aw_fld = var6;
			} else {
				var0.aw_fld = var0.ah_fld = var6;
			}

			var0.notify();
			return var6;
		}
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public final void ar() {
		synchronized (this) {
			this.as_fld = true;
			this.notifyAll();
		}

		try {
			this.ay_fld.join();
		} catch (InterruptedException var3) {
		}
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(IIILjava/lang/Object;)Llv;"
	)
	final lv au(int var1, int var2, int var3, Object var4) {
		lv var5 = new lv();
		var5.aw_fld = var1;
		var5.av_fld = var2;
		var5.ay_fld = var4;
		synchronized (this) {
			if (this.aw_fld != null) {
				this.aw_fld.ah_fld = var5;
				this.aw_fld = var5;
			} else {
				this.aw_fld = this.ah_fld = var5;
			}

			this.notify();
			return var5;
		}
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(IIILjava/lang/Object;)Llv;"
	)
	final lv af(int var1, int var2, int var3, Object var4) {
		lv var5 = new lv();
		var5.aw_fld = -2098081252 * var1;
		var5.av_fld = var2;
		var5.ay_fld = var4;
		synchronized (this) {
			if (this.aw_fld != null) {
				this.aw_fld.ah_fld = var5;
				this.aw_fld = var5;
			} else {
				this.aw_fld = this.ah_fld = var5;
			}

			this.notify();
			return var5;
		}
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	static void ay() {
		Iterator var1 = cz.ag_fld.iterator();

		while (var1.hasNext()) {
			co var2 = (co)(co)var1.next();
			var2.ae(-506688532);
		}
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)Llv;"
	)
	public final lv an(String var1, int var2) {
		return se(this, 1, var2, 0, var1);
	}

	@ObfuscatedName("eu")
	@ObfuscatedSignature(
		descriptor = "(Leg;)V"
	)
	public static void eu(eg var0) {
		if (var0 == null) {
			var0.getClass();
		}

		var0.be_fld = null;
		var0.bo_fld = null;
		var0.br_fld = null;
		var0.bp_fld = false;
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)Llv;"
	)
	public final lv aa(String var1, int var2) {
		return se(this, 1, var2, 0, var1);
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)Llv;"
	)
	public final lv ai(String var1, int var2) {
		return se(this, 1, var2, 0, var1);
	}

	@ObfuscatedName("run")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	@Override
	public final void run() {
		while (true) {
			lv var1;
			synchronized (this) {
				while (true) {
					if (this.as_fld) {
						return;
					}

					if (null != this.ah_fld) {
						var1 = this.ah_fld;
						this.ah_fld = this.ah_fld.ah_fld;
						if (this.ah_fld == null) {
							this.aw_fld = null;
						}
						break;
					}

					try {
						this.wait();
					} catch (InterruptedException var7) {
					}
				}
			}

			try {
				int var2 = var1.aw_fld;
				if (1 == var2) {
					var1.ae_fld = new Socket(InetAddress.getByName((String)var1.ay_fld), var1.av_fld);
				} else if (2 == var2) {
					Thread var3 = new Thread((Runnable)var1.ay_fld);
					var3.setDaemon(true);
					var3.start();
					var3.setPriority(var1.av_fld);
					var1.ae_fld = var3;
				} else if (var2 == 4) {
					var1.ae_fld = new DataInputStream(((URL)var1.ay_fld).openStream());
				}

				var1.az_fld = 1;
			} catch (ThreadDeath var5) {
				throw var5;
			} catch (Throwable var6) {
				var1.az_fld = 2;
			}
		}
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	public static void ak(int var0) {
		ow.ak_fld.vh();
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(IIILjava/lang/Object;I)Llv;"
	)
	final lv ah(int var1, int var2, int var3, Object var4, int var5) {
		lv var6 = new lv();
		var6.aw_fld = var1;
		var6.av_fld = var2;
		var6.ay_fld = var4;
		synchronized (this) {
			if (this.aw_fld != null) {
				this.ah_fld.ah_fld = var6;
				this.aw_fld = var6;
			} else {
				this.aw_fld = this.ah_fld = var6;
			}

			this.notify();
			return var6;
		}
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;II)Llv;"
	)
	public final lv aw(String var1, int var2, int var3) {
		return se(this, 1, var2, 0, var1);
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Runnable;IB)Llv;"
	)
	public final lv ay(Runnable var1, int var2, byte var3) {
		return se(this, 2, var2, 0, var1);
	}
}
