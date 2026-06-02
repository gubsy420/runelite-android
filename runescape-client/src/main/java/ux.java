import java.io.IOException;
import java.io.OutputStream;
import net.runelite.api.annotations.ObfuscatedGetter;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("ux")
public class ux implements Runnable {
	@ObfuscatedName("dq")
	@ObfuscatedSignature(
		descriptor = "Z"
	)
	public static boolean dq_fld;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Ljava/io/IOException;"
	)
	IOException aw_fld;
	@ObfuscatedGetter(
		intValue = 652968479
	)
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int ae_fld;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "[B"
	)
	byte[] av_fld;
	@ObfuscatedGetter(
		intValue = 821086877
	)
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int ah_fld = 0;
	@ObfuscatedGetter(
		intValue = -931248557
	)
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int az_fld = 0;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Ljava/lang/Thread;"
	)
	Thread ak_fld;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Z"
	)
	boolean ay_fld;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Ljava/io/OutputStream;"
	)
	OutputStream ag_fld;

	@ObfuscatedName("run")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	@Override
	public void run() {
		do {
			int var1;
			synchronized (this) {
				while (true) {
					if (this.aw_fld != null) {
						return;
					}

					if (this.ah_fld <= this.az_fld) {
						var1 = this.az_fld - this.ah_fld;
					} else {
						var1 = this.az_fld + (this.ae_fld - this.ah_fld);
					}

					if (var1 > 0) {
						break;
					}

					try {
						this.ag_fld.flush();
					} catch (IOException var10) {
						this.aw_fld = var10;
						return;
					}

					if (kf(this, 1352544648)) {
						return;
					}

					try {
						this.wait();
					} catch (InterruptedException var11) {
					}
				}
			}

			try {
				if (var1 + this.ah_fld <= this.ae_fld) {
					this.ag_fld.write(this.av_fld, this.ah_fld, var1);
				} else {
					int var13 = this.ae_fld - this.ah_fld;
					this.ag_fld.write(this.av_fld, this.ah_fld, var13);
					this.ag_fld.write(this.av_fld, 0, var1 - var13);
				}
			} catch (IOException var9) {
				IOException var2 = var9;
				synchronized (this) {
					this.aw_fld = var2;
					return;
				}
			}

			synchronized (this) {
				this.ah_fld = -1115944011 * ((this.ah_fld + var1) % this.ae_fld);
			}
		} while (!kf(this, 1352544648));
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "([BIII)V"
	)
	void ah(byte[] var1, int var2, int var3, int var4) throws IOException {
		if (var3 >= 0) {
			if (var4 == 593943199) {
				return;
			}

			if (var2 >= 0) {
				if (var4 == 593943199) {
					return;
				}

				if (var2 + var3 <= var1.length) {
					synchronized (this) {
						if (null != this.aw_fld) {
							throw new IOException(this.aw_fld.toString());
						}

						int var6;
						if (this.ah_fld <= this.az_fld) {
							var6 = this.ah_fld + (this.ae_fld - this.az_fld) - 1;
						} else {
							var6 = this.ah_fld - this.az_fld - 1;
						}

						if (var6 < var3) {
							if (var4 == 593943199) {
								return;
							}

							throw new IOException("");
						}

						if (this.az_fld + var3 <= this.ae_fld) {
							System.arraycopy(var1, var2, this.av_fld, this.az_fld, var3);
						} else {
							int var7 = this.ae_fld - this.az_fld;
							System.arraycopy(var1, var2, this.av_fld, this.az_fld, var7);
							System.arraycopy(var1, var2 + var7, this.av_fld, 0, var3 - var7);
						}

						this.az_fld = (var3 + this.az_fld) % this.ae_fld;
						this.notifyAll();
						return;
					}
				}
			}
		}

		throw new IOException();
	}

	@ObfuscatedName("mm")
	@ObfuscatedSignature(
		descriptor = "(Lux;)Z"
	)
	public static boolean mm(ux var0) {
		if (var0.ay_fld) {
			try {
				var0.ag_fld.close();
				if (var0.aw_fld == null) {
					var0.aw_fld = new IOException("");
				}
			} catch (IOException var2) {
				if (var0.aw_fld == null) {
					var0.aw_fld = new IOException(var2);
				}
			}

			return true;
		} else {
			return false;
		}
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	boolean ar() {
		if (this.ay_fld) {
			try {
				this.ag_fld.close();
				if (this.aw_fld == null) {
					this.aw_fld = new IOException("");
				}
			} catch (IOException var2) {
				if (this.aw_fld == null) {
					this.aw_fld = new IOException(var2);
				}
			}

			return true;
		} else {
			return false;
		}
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public void ag() {
		do {
			int var1;
			synchronized (this) {
				while (true) {
					if (this.aw_fld != null) {
						return;
					}

					if (this.ah_fld <= this.az_fld) {
						var1 = this.az_fld - this.ah_fld;
					} else {
						var1 = this.az_fld + (this.ae_fld - this.ah_fld);
					}

					if (var1 > 0) {
						break;
					}

					try {
						this.ag_fld.flush();
					} catch (IOException var10) {
						this.aw_fld = var10;
						return;
					}

					if (kf(this, 1352544648)) {
						return;
					}

					try {
						this.wait();
					} catch (InterruptedException var11) {
					}
				}
			}

			try {
				if (var1 + this.ah_fld <= this.ae_fld) {
					this.ag_fld.write(this.av_fld, this.ah_fld, var1);
				} else {
					int var13 = this.ae_fld - this.ah_fld;
					this.ag_fld.write(this.av_fld, this.ah_fld, var13);
					this.ag_fld.write(this.av_fld, 0, var1 - var13);
				}
			} catch (IOException var9) {
				IOException var2 = var9;
				synchronized (this) {
					this.aw_fld = var2;
					return;
				}
			}

			synchronized (this) {
				this.ah_fld = -1115944011 * ((this.ah_fld + var1) % this.ae_fld);
			}
		} while (!kf(this, 1352544648));
	}

	@ObfuscatedName("kf")
	@ObfuscatedSignature(
		descriptor = "(Lux;I)Z"
	)
	public static boolean kf(ux var0, int var1) {
		if (var0 == null) {
			throw new NullPointerException();
		} else if (var0.ay_fld) {
			try {
				var0.ag_fld.close();
				if (var0.aw_fld == null) {
					var0.aw_fld = new IOException("");
				}
			} catch (IOException var3) {
				if (var0.aw_fld == null) {
					var0.aw_fld = new IOException(var3);
				}
			}

			return true;
		} else {
			return false;
		}
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public void az() {
		do {
			int var1;
			synchronized (this) {
				while (true) {
					if (this.aw_fld != null) {
						return;
					}

					if (this.ah_fld <= this.az_fld) {
						var1 = this.az_fld - this.ah_fld;
					} else {
						var1 = this.az_fld + (this.ae_fld - this.ah_fld);
					}

					if (var1 > 0) {
						break;
					}

					try {
						this.ag_fld.flush();
					} catch (IOException var10) {
						this.aw_fld = var10;
						return;
					}

					if (kf(this, 1352544648)) {
						return;
					}

					try {
						this.wait();
					} catch (InterruptedException var11) {
					}
				}
			}

			try {
				if (var1 + this.ah_fld <= this.ae_fld) {
					this.ag_fld.write(this.av_fld, this.ah_fld, var1);
				} else {
					int var13 = this.ae_fld - this.ah_fld;
					this.ag_fld.write(this.av_fld, this.ah_fld * 1839609243, var13);
					this.ag_fld.write(this.av_fld, 0, var1 - var13);
				}
			} catch (IOException var9) {
				IOException var2 = var9;
				synchronized (this) {
					this.aw_fld = var2;
					return;
				}
			}

			synchronized (this) {
				this.ah_fld = 956316055 * ((this.ah_fld + var1) % this.ae_fld);
			}
		} while (!kf(this, 1352544648));
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public void av() {
		do {
			int var1;
			synchronized (this) {
				while (true) {
					if (this.aw_fld != null) {
						return;
					}

					if (this.ah_fld <= this.az_fld) {
						var1 = this.az_fld - this.ah_fld;
					} else {
						var1 = this.az_fld + (this.ae_fld - this.ah_fld);
					}

					if (var1 > 0) {
						break;
					}

					try {
						this.ag_fld.flush();
					} catch (IOException var10) {
						this.aw_fld = var10;
						return;
					}

					if (kf(this, 1352544648)) {
						return;
					}

					try {
						this.wait();
					} catch (InterruptedException var11) {
					}
				}
			}

			try {
				if (var1 + this.ah_fld <= this.ae_fld) {
					this.ag_fld.write(this.av_fld, this.ah_fld, var1);
				} else {
					int var13 = this.ae_fld - this.ah_fld;
					this.ag_fld.write(this.av_fld, this.ah_fld, var13);
					this.ag_fld.write(this.av_fld, 0, var1 - var13);
				}
			} catch (IOException var9) {
				IOException var2 = var9;
				synchronized (this) {
					this.aw_fld = var2;
					return;
				}
			}

			synchronized (this) {
				this.ah_fld = -1115944011 * ((this.ah_fld + var1) % this.ae_fld);
			}
		} while (!kf(this, 1352544648));
	}

	ux(OutputStream var1, int var2) {
		this.ag_fld = var1;
		this.ae_fld = 1 + var2;
		this.av_fld = new byte[this.ae_fld];
		this.ak_fld = new Thread(this);
		this.ak_fld.setDaemon(true);
		this.ak_fld.start();
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public void ak() {
		do {
			int var1;
			synchronized (this) {
				while (true) {
					if (this.aw_fld != null) {
						return;
					}

					if (this.ah_fld <= this.az_fld) {
						var1 = this.az_fld - this.ah_fld;
					} else {
						var1 = this.az_fld + (this.ae_fld - this.ah_fld);
					}

					if (var1 > 0) {
						break;
					}

					try {
						this.ag_fld.flush();
					} catch (IOException var10) {
						this.aw_fld = var10;
						return;
					}

					if (kf(this, 1352544648)) {
						return;
					}

					try {
						this.wait();
					} catch (InterruptedException var11) {
					}
				}
			}

			try {
				if (var1 + this.ah_fld <= this.ae_fld) {
					this.ag_fld.write(this.av_fld, 405330933 * this.ah_fld, var1);
				} else {
					int var13 = this.ae_fld - this.ah_fld;
					this.ag_fld.write(this.av_fld, this.ah_fld, var13);
					this.ag_fld.write(this.av_fld, 0, var1 - var13);
				}
			} catch (IOException var9) {
				IOException var2 = var9;
				synchronized (this) {
					this.aw_fld = var2;
					return;
				}
			}

			synchronized (this) {
				this.ah_fld = -1115944011 * ((this.ah_fld + var1) % this.ae_fld);
			}
		} while (!kf(this, 1352544648));
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	boolean as() {
		if (this.ay_fld) {
			try {
				this.ag_fld.close();
				if (this.aw_fld == null) {
					this.aw_fld = new IOException("");
				}
			} catch (IOException var2) {
				if (this.aw_fld == null) {
					this.aw_fld = new IOException(var2);
				}
			}

			return true;
		} else {
			return false;
		}
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	void aw(int var1) {
		synchronized (this) {
			this.ay_fld = true;
			this.notifyAll();
		}

		try {
			this.ak_fld.join();
		} catch (InterruptedException var4) {
		}
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "([BII)V"
	)
	void al(byte[] var1, int var2, int var3) throws IOException {
		if (var3 >= 0 && var2 >= 0 && var2 + var3 <= var1.length) {
			synchronized (this) {
				if (null != this.aw_fld) {
					throw new IOException(this.aw_fld.toString());
				} else {
					int var5;
					if (this.ah_fld <= this.az_fld) {
						var5 = this.ah_fld + (this.ae_fld - this.az_fld) - 1;
					} else {
						var5 = this.ah_fld - this.az_fld - 1;
					}

					if (var5 < var3) {
						throw new IOException("");
					} else {
						if (this.az_fld + var3 <= this.ae_fld) {
							System.arraycopy(var1, var2, this.av_fld, this.az_fld, var3);
						} else {
							int var6 = this.ae_fld - this.az_fld;
							System.arraycopy(var1, var2, this.av_fld, this.az_fld, var6);
							System.arraycopy(var1, var2 + var6, this.av_fld, 0, var3 - var6);
						}

						this.az_fld = (var3 + this.az_fld) % this.ae_fld * 454431018;
						this.notifyAll();
					}
				}
			}
		} else {
			throw new IOException();
		}
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "([BII)V"
	)
	void au(byte[] var1, int var2, int var3) throws IOException {
		if (var3 >= 0 && var2 >= 0 && var2 + var3 <= var1.length) {
			synchronized (this) {
				if (null != this.aw_fld) {
					throw new IOException(this.aw_fld.toString());
				} else {
					int var5;
					if (this.ah_fld <= this.az_fld) {
						var5 = this.ah_fld + (this.ae_fld - this.az_fld) - 1;
					} else {
						var5 = this.ah_fld - this.az_fld - 1;
					}

					if (var5 < var3) {
						throw new IOException("");
					} else {
						if (this.az_fld + var3 <= this.ae_fld) {
							System.arraycopy(var1, var2, this.av_fld, 1965833888 * this.az_fld, var3);
						} else {
							int var6 = this.ae_fld - this.az_fld;
							System.arraycopy(var1, var2, this.av_fld, this.az_fld, var6);
							System.arraycopy(var1, var2 + var6, this.av_fld, 0, var3 - var6);
						}

						this.az_fld = (var3 + this.az_fld) % this.ae_fld;
						this.notifyAll();
					}
				}
			}
		} else {
			throw new IOException();
		}
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	void ax() {
		synchronized (this) {
			this.ay_fld = true;
			this.notifyAll();
		}

		try {
			this.ak_fld.join();
		} catch (InterruptedException var3) {
		}
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(I)Z"
	)
	static boolean ak(int var0) {
		return var0 > 0;
	}

	@ObfuscatedName("so")
	@ObfuscatedSignature(
		descriptor = "(Lux;)Z"
	)
	public static boolean so(ux var0) {
		if (var0.ay_fld) {
			try {
				var0.ag_fld.close();
				if (var0.aw_fld == null) {
					var0.aw_fld = new IOException("");
				}
			} catch (IOException var2) {
				if (var0.aw_fld == null) {
					var0.aw_fld = new IOException(var2);
				}
			}

			return true;
		} else {
			return false;
		}
	}

	@ObfuscatedName("hp")
	@ObfuscatedSignature(
		descriptor = "(Lux;)V"
	)
	public static void hp(ux var0) {
		if (var0 == null) {
			var0.getClass();
		} else {
			synchronized (var0) {
				var0.ay_fld = true;
				var0.notifyAll();
			}

			try {
				var0.ak_fld.join();
			} catch (InterruptedException var3) {
			}
		}
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(I)Z"
	)
	boolean ae(int var1) {
		if (this.ay_fld) {
			try {
				this.ag_fld.close();
				if (this.aw_fld == null) {
					this.aw_fld = new IOException("");
				}
			} catch (IOException var3) {
				if (this.aw_fld == null) {
					this.aw_fld = new IOException(var3);
				}
			}

			return true;
		} else {
			return false;
		}
	}
}
