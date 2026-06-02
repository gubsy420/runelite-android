import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import net.runelite.api.annotations.ObfuscatedGetter;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("up")
public class up implements Runnable {
	@ObfuscatedGetter(
		intValue = 717534331
	)
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int az_fld;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Ljava/io/InputStream;"
	)
	InputStream ag_fld;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Ljava/lang/Thread;"
	)
	Thread ak_fld;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "[B"
	)
	byte[] av_fld;
	@ObfuscatedGetter(
		intValue = -1442469949
	)
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int ae_fld = 0;
	@ObfuscatedGetter(
		intValue = -1677819503
	)
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int ah_fld = 0;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Ljava/io/IOException;"
	)
	IOException aw_fld;

	@ObfuscatedName("run")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	@Override
	public void run() {
		try {
			while (true) {
				int var1;
				synchronized (this) {
					while (true) {
						if (this.aw_fld != null) {
							return;
						}

						if (this.ae_fld == 0) {
							var1 = this.az_fld - this.ah_fld - 1;
						} else if (this.ae_fld <= this.ah_fld) {
							var1 = this.az_fld - this.ah_fld;
						} else {
							var1 = this.ae_fld - this.ah_fld - 1;
						}

						if (var1 > 0) {
							break;
						}

						try {
							this.wait();
						} catch (InterruptedException var9) {
						}
					}
				}

				int var2;
				try {
					var2 = this.ag_fld.read(this.av_fld, this.ah_fld, var1);
					if (var2 == -1) {
						throw new EOFException();
					}
				} catch (IOException var10) {
					IOException var3 = var10;
					synchronized (this) {
						this.aw_fld = var3;
						return;
					}
				}

				synchronized (this) {
					this.ah_fld = -1084989583 * ((this.ah_fld + var2) % this.az_fld);
				}
			}
		} catch (Throwable var12) {
			throw new RuntimeException(var12);
		}
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "([BII)I"
	)
	int ab(byte[] var1, int var2, int var3) throws IOException {
		if (var3 >= 0 && var2 >= 0 && var2 + var3 <= var1.length) {
			synchronized (this) {
				int var5;
				if (this.ae_fld <= this.ah_fld) {
					var5 = this.ah_fld - this.ae_fld;
				} else {
					var5 = this.ah_fld + (this.az_fld - this.ae_fld);
				}

				if (var3 > var5) {
					var3 = var5;
				}

				if (var3 == 0 && null != this.aw_fld) {
					throw new IOException(this.aw_fld.toString());
				} else {
					if (var3 + this.ae_fld <= this.az_fld) {
						System.arraycopy(this.av_fld, this.ae_fld, var1, var2, var3);
					} else {
						int var6 = this.az_fld - this.ae_fld;
						System.arraycopy(this.av_fld, this.ae_fld, var1, var2, var6);
						System.arraycopy(this.av_fld, 0, var1, var6 + var2, var3 - var6);
					}

					this.ae_fld = 1644495083 * ((var3 + this.ae_fld) % this.az_fld);
					this.notifyAll();
					return var3;
				}
			}
		} else {
			throw new IOException();
		}
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(II)Z"
	)
	boolean ae(int var1, int var2) throws IOException {
		if (0 == var1) {
			return true;
		} else if (var1 > 0 && var1 < this.az_fld) {
			synchronized (this) {
				int var4;
				if (this.ae_fld <= this.ah_fld) {
					var4 = this.ah_fld - this.ae_fld;
				} else {
					var4 = this.az_fld - this.ae_fld + this.ah_fld;
				}

				if (var4 >= var1) {
					return true;
				} else if (this.aw_fld != null) {
					throw new IOException(this.aw_fld.toString());
				} else {
					this.notifyAll();
					return false;
				}
			}
		} else {
			throw new IOException();
		}
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "([BIII)I"
	)
	int ay(byte[] var1, int var2, int var3, int var4) throws IOException {
		if (var3 >= 0 && var2 >= 0 && var2 + var3 <= var1.length) {
			synchronized (this) {
				int var6;
				if (this.ae_fld <= this.ah_fld) {
					var6 = this.ah_fld - this.ae_fld;
				} else {
					var6 = this.ah_fld + (this.az_fld - this.ae_fld);
				}

				if (var3 > var6) {
					var3 = var6;
				}

				if (var3 == 0 && null != this.aw_fld) {
					throw new IOException(this.aw_fld.toString());
				} else {
					if (var3 + this.ae_fld <= this.az_fld) {
						System.arraycopy(this.av_fld, this.ae_fld, var1, var2, var3);
					} else {
						int var7 = this.az_fld - this.ae_fld;
						System.arraycopy(this.av_fld, this.ae_fld, var1, var2, var7);
						System.arraycopy(this.av_fld, 0, var1, var7 + var2, var3 - var7);
					}

					this.ae_fld = 1644495083 * ((var3 + this.ae_fld) % this.az_fld);
					this.notifyAll();
					return var3;
				}
			}
		} else {
			throw new IOException();
		}
	}

	@ObfuscatedName("lb")
	@ObfuscatedSignature(
		descriptor = "(Lup;[BII)I"
	)
	public static int lb(up var0, byte[] var1, int var2, int var3) throws IOException {
		if (var0 == null) {
			var0.getClass();
		}

		if (var3 >= 0 && var2 >= 0 && var2 + var3 <= var1.length) {
			synchronized (var0) {
				int var5;
				if (var0.ae_fld <= var0.ah_fld) {
					var5 = var0.ah_fld - var0.ae_fld;
				} else {
					var5 = var0.ah_fld + (var0.az_fld - var0.ae_fld);
				}

				if (var3 > var5) {
					var3 = var5;
				}

				if (var3 == 0 && null != var0.aw_fld) {
					throw new IOException(var0.aw_fld.toString());
				} else {
					if (var3 + var0.ae_fld <= var0.az_fld) {
						System.arraycopy(var0.av_fld, var0.ae_fld, var1, var2, var3);
					} else {
						int var6 = var0.az_fld - var0.ae_fld;
						System.arraycopy(var0.av_fld, var0.ae_fld, var1, var2, var6);
						System.arraycopy(var0.av_fld, 0, var1, var6 + var2, var3 - var6);
					}

					var0.ae_fld = 1644495083 * ((var3 + var0.ae_fld) % var0.az_fld);
					var0.notifyAll();
					return var3;
				}
			}
		} else {
			throw new IOException();
		}
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Lup;I)I"
	)
	public static int ae(up var0, int var1) throws IOException {
		if (var0 == null) {
			var0.getClass();
		}

		synchronized (var0) {
			int var3;
			if (var0.ae_fld <= var0.ah_fld) {
				var3 = var0.ah_fld - var0.ae_fld;
			} else {
				var3 = var0.az_fld - var0.ae_fld + var0.ah_fld;
			}

			if (var3 <= 0 && null != var0.aw_fld) {
				throw new IOException(var0.aw_fld.toString());
			} else {
				var0.notifyAll();
				return var3;
			}
		}
	}

	@ObfuscatedName("rw")
	@ObfuscatedSignature(
		descriptor = "(Lup;[BII)I"
	)
	public static int rw(up var0, byte[] var1, int var2, int var3) throws IOException, EOFException {
		try {
			if (var0 == null) {
				var0.getClass();
			}

			if (var3 >= 0 && var2 >= 0 && var2 + var3 <= var1.length) {
				synchronized (var0) {
					int var5;
					if (var0.ae_fld <= var0.ah_fld) {
						var5 = var0.ah_fld - var0.ae_fld;
					} else {
						var5 = var0.ah_fld + (var0.az_fld - var0.ae_fld);
					}

					if (var3 > var5) {
						var3 = var5;
					}

					if (var3 == 0 && null != var0.aw_fld) {
						throw new IOException(var0.aw_fld.toString());
					} else {
						if (var3 + var0.ae_fld <= var0.az_fld) {
							System.arraycopy(var0.av_fld, var0.ae_fld, var1, var2, var3);
						} else {
							int var6 = var0.az_fld - var0.ae_fld;
							System.arraycopy(var0.av_fld, var0.ae_fld, var1, var2, var6);
							System.arraycopy(var0.av_fld, 0, var1, var6 + var2, var3 - var6);
						}

						var0.ae_fld = 1644495083 * ((var3 + var0.ae_fld) % var0.az_fld);
						var0.notifyAll();
						return var3;
					}
				}
			} else {
				throw new IOException();
			}
		} catch (Throwable var10) {
			throw new RuntimeException(var10);
		}
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public void ag() {
		try {
			while (true) {
				int var1;
				synchronized (this) {
					while (true) {
						if (this.aw_fld != null) {
							return;
						}

						if (this.ae_fld == 0) {
							var1 = this.az_fld - this.ah_fld - 1;
						} else if (this.ae_fld <= this.ah_fld) {
							var1 = this.az_fld - this.ah_fld;
						} else {
							var1 = this.ae_fld - this.ah_fld - 1;
						}

						if (var1 > 0) {
							break;
						}

						try {
							this.wait();
						} catch (InterruptedException var10) {
						}
					}
				}

				int var2;
				try {
					var2 = this.ag_fld.read(this.av_fld, this.ah_fld, var1);
					if (var2 == -1) {
						throw new EOFException();
					}
				} catch (IOException var11) {
					IOException var3 = var11;
					synchronized (this) {
						this.aw_fld = var3;
						return;
					}
				}

				synchronized (this) {
					this.ah_fld = 1000268522 * ((this.ah_fld + var2) % this.az_fld);
				}
			}
		} catch (Throwable var13) {
			throw new RuntimeException(var13);
		}
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public void az() {
		try {
			while (true) {
				int var1;
				synchronized (this) {
					while (true) {
						if (this.aw_fld != null) {
							return;
						}

						if (this.ae_fld == 0) {
							var1 = this.az_fld - this.ah_fld - 1;
						} else if (this.ae_fld <= this.ah_fld) {
							var1 = this.az_fld - this.ah_fld;
						} else {
							var1 = this.ae_fld - this.ah_fld - 1;
						}

						if (var1 > 0) {
							break;
						}

						try {
							this.wait();
						} catch (InterruptedException var10) {
						}
					}
				}

				int var2;
				try {
					var2 = this.ag_fld.read(this.av_fld, this.ah_fld, var1);
					if (var2 == -1) {
						throw new EOFException();
					}
				} catch (IOException var11) {
					IOException var3 = var11;
					synchronized (this) {
						this.aw_fld = var3;
						return;
					}
				}

				synchronized (this) {
					this.ah_fld = -1072389564 * ((this.ah_fld + var2) % this.az_fld);
				}
			}
		} catch (Throwable var13) {
			throw new RuntimeException(var13);
		}
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public void av() {
		try {
			while (true) {
				int var1;
				synchronized (this) {
					while (true) {
						if (this.aw_fld != null) {
							return;
						}

						if (1860751345 * this.ae_fld == 0) {
							var1 = this.az_fld - this.ah_fld - 1;
						} else if (this.ae_fld <= this.ah_fld) {
							var1 = this.az_fld - this.ah_fld;
						} else {
							var1 = this.ae_fld - this.ah_fld - 1;
						}

						if (var1 > 0) {
							break;
						}

						try {
							this.wait();
						} catch (InterruptedException var10) {
						}
					}
				}

				int var2;
				try {
					var2 = this.ag_fld.read(this.av_fld, this.ah_fld, var1);
					if (var2 == -1) {
						throw new EOFException();
					}
				} catch (IOException var11) {
					IOException var3 = var11;
					synchronized (this) {
						this.aw_fld = var3;
						return;
					}
				}

				synchronized (this) {
					this.ah_fld = -1084989583 * ((this.ah_fld + var2) % this.az_fld);
				}
			}
		} catch (Throwable var13) {
			throw new RuntimeException(var13);
		}
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(I)Z"
	)
	boolean ar(int var1) throws IOException {
		if (0 == var1) {
			return true;
		} else if (var1 > 0 && var1 < this.az_fld) {
			synchronized (this) {
				int var3;
				if (this.ae_fld <= this.ah_fld) {
					var3 = this.ah_fld - this.ae_fld;
				} else {
					var3 = this.az_fld - this.ae_fld + this.ah_fld;
				}

				if (var3 >= var1) {
					return true;
				} else if (this.aw_fld != null) {
					throw new IOException(this.aw_fld.toString());
				} else {
					this.notifyAll();
					return false;
				}
			}
		} else {
			throw new IOException();
		}
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(I)Z"
	)
	boolean af(int var1) throws IOException {
		if (0 == var1) {
			return true;
		} else if (var1 > 0 && var1 < this.az_fld) {
			synchronized (this) {
				int var3;
				if (this.ae_fld <= this.ah_fld) {
					var3 = this.ah_fld - this.ae_fld;
				} else {
					var3 = this.az_fld - this.ae_fld + this.ah_fld;
				}

				if (var3 >= var1) {
					return true;
				} else if (this.aw_fld != null) {
					throw new IOException(this.aw_fld.toString());
				} else {
					this.notifyAll();
					return false;
				}
			}
		} else {
			throw new IOException();
		}
	}

	@ObfuscatedName("pd")
	@ObfuscatedSignature(
		descriptor = "(Lup;[BII)I"
	)
	public static int pd(up var0, byte[] var1, int var2, int var3) throws IOException {
		if (var0 == null) {
			var0.getClass();
		}

		if (var3 >= 0 && var2 >= 0 && var2 + var3 <= var1.length) {
			synchronized (var0) {
				int var5;
				if (var0.ae_fld <= var0.ah_fld) {
					var5 = var0.ah_fld - var0.ae_fld;
				} else {
					var5 = var0.ah_fld + (var0.az_fld - var0.ae_fld);
				}

				if (var3 > var5) {
					var3 = var5;
				}

				if (var3 == 0 && null != var0.aw_fld) {
					throw new IOException(var0.aw_fld.toString());
				} else {
					if (var3 + var0.ae_fld <= var0.az_fld) {
						System.arraycopy(var0.av_fld, -1053240358 * var0.ae_fld, var1, var2, var3);
					} else {
						int var6 = var0.az_fld - var0.ae_fld;
						System.arraycopy(var0.av_fld, var0.ae_fld, var1, var2, var6);
						System.arraycopy(var0.av_fld, 0, var1, var6 + var2, var3 - var6);
					}

					var0.ae_fld = 1644495083 * ((var3 + var0.ae_fld) % var0.az_fld);
					var0.notifyAll();
					return var3;
				}
			}
		} else {
			throw new IOException();
		}
	}

	@ObfuscatedName("ca")
	@ObfuscatedSignature(
		descriptor = "(Lup;)I"
	)
	public static int ca(up var0) throws IOException {
		if (var0 == null) {
			var0.getClass();
		}

		synchronized (var0) {
			if (var0.ae_fld == var0.ah_fld) {
				if (var0.aw_fld != null) {
					throw new IOException(var0.aw_fld.toString());
				} else {
					return -1;
				}
			} else {
				int var2 = var0.av_fld[var0.ae_fld] & -2052321973;
				var0.ae_fld = (var0.ae_fld + 1) % var0.az_fld * 1589441517;
				var0.notifyAll();
				return var2;
			}
		}
	}

	@ObfuscatedName("jp")
	@ObfuscatedSignature(
		descriptor = "(Lup;I)Z"
	)
	public static boolean jp(up var0, int var1) throws IOException {
		if (var0 == null) {
			var0.getClass();
		}

		if (0 == var1) {
			return true;
		} else if (var1 > 0 && var1 < var0.az_fld) {
			synchronized (var0) {
				int var3;
				if (var0.ae_fld <= var0.ah_fld) {
					var3 = var0.ah_fld - var0.ae_fld;
				} else {
					var3 = var0.az_fld - var0.ae_fld + var0.ah_fld;
				}

				if (var3 >= var1) {
					return true;
				} else if (var0.aw_fld != null) {
					throw new IOException(var0.aw_fld.toString());
				} else {
					var0.notifyAll();
					return false;
				}
			}
		} else {
			throw new IOException();
		}
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(I)Z"
	)
	boolean au(int var1) throws IOException {
		if (0 == var1) {
			return true;
		} else if (var1 > 0 && var1 < this.az_fld) {
			synchronized (this) {
				int var3;
				if (this.ae_fld <= this.ah_fld) {
					var3 = this.ah_fld - this.ae_fld;
				} else {
					var3 = this.az_fld - this.ae_fld + this.ah_fld;
				}

				if (var3 >= var1) {
					return true;
				} else if (this.aw_fld != null) {
					throw new IOException(this.aw_fld.toString());
				} else {
					this.notifyAll();
					return false;
				}
			}
		} else {
			throw new IOException();
		}
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	int an() throws IOException {
		synchronized (this) {
			int var2;
			if (this.ae_fld <= this.ah_fld) {
				var2 = this.ah_fld - this.ae_fld;
			} else {
				var2 = this.az_fld - this.ae_fld + this.ah_fld;
			}

			if (var2 <= 0 && null != this.aw_fld) {
				throw new IOException(this.aw_fld.toString());
			} else {
				this.notifyAll();
				return var2;
			}
		}
	}

	@ObfuscatedName("eh")
	@ObfuscatedSignature(
		descriptor = "(Lup;)I"
	)
	public static int eh(up var0) throws IOException, EOFException {
		try {
			if (var0 == null) {
				var0.getClass();
			}

			synchronized (var0) {
				int var2;
				if (var0.ae_fld <= var0.ah_fld) {
					var2 = var0.ah_fld - var0.ae_fld;
				} else {
					var2 = var0.az_fld - var0.ae_fld + var0.ah_fld;
				}

				if (var2 <= 0 && null != var0.aw_fld) {
					throw new IOException(var0.aw_fld.toString());
				} else {
					var0.notifyAll();
					return var2;
				}
			}
		} catch (Throwable var6) {
			throw new RuntimeException(var6);
		}
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	int ai() throws IOException {
		synchronized (this) {
			int var2;
			if (this.ae_fld <= this.ah_fld) {
				var2 = this.ah_fld - this.ae_fld;
			} else {
				var2 = this.az_fld - this.ae_fld + this.ah_fld;
			}

			if (var2 <= 0 && null != this.aw_fld) {
				throw new IOException(this.aw_fld.toString());
			} else {
				this.notifyAll();
				return var2;
			}
		}
	}

	@ObfuscatedName("iq")
	@ObfuscatedSignature(
		descriptor = "(Lup;)V"
	)
	public static void iq(up var0) throws EOFException {
		try {
			if (var0 == null) {
				var0.getClass();
			} else {
				synchronized (var0) {
					if (var0.aw_fld == null) {
						var0.aw_fld = new IOException("");
					}

					var0.notifyAll();
				}

				try {
					var0.ak_fld.join();
				} catch (InterruptedException var4) {
				}
			}
		} catch (Throwable var6) {
			throw new RuntimeException(var6);
		}
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	int ax() throws IOException {
		synchronized (this) {
			if (this.ae_fld == this.ah_fld) {
				if (this.aw_fld != null) {
					throw new IOException(this.aw_fld.toString());
				} else {
					return -1;
				}
			} else {
				int var2 = this.av_fld[705846765 * this.ae_fld] & 811752235;
				this.ae_fld = (this.ae_fld + 1) % this.az_fld;
				this.notifyAll();
				return var2;
			}
		}
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	void aj() {
		synchronized (this) {
			if (this.aw_fld == null) {
				this.aw_fld = new IOException("");
			}

			this.notifyAll();
		}

		try {
			this.ak_fld.join();
		} catch (InterruptedException var3) {
		}
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	void ac() {
		synchronized (this) {
			if (this.aw_fld == null) {
				this.aw_fld = new IOException("");
			}

			this.notifyAll();
		}

		try {
			this.ak_fld.join();
		} catch (InterruptedException var3) {
		}
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	void as(int var1) {
		synchronized (this) {
			if (this.aw_fld == null) {
				this.aw_fld = new IOException("");
			}

			this.notifyAll();
		}

		try {
			this.ak_fld.join();
		} catch (InterruptedException var4) {
		}
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	int aw(int var1) throws IOException {
		synchronized (this) {
			if (this.ae_fld == this.ah_fld) {
				if (this.aw_fld != null) {
					throw new IOException(this.aw_fld.toString());
				} else {
					return -1;
				}
			} else {
				int var3 = this.av_fld[this.ae_fld] & 255;
				this.ae_fld = (this.ae_fld + 1) % this.az_fld;
				this.notifyAll();
				return var3;
			}
		}
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "([BII)I"
	)
	int ao(byte[] var1, int var2, int var3) throws IOException {
		if (var3 >= 0 && var2 >= 0 && var2 + var3 <= var1.length) {
			synchronized (this) {
				int var5;
				if (this.ae_fld <= this.ah_fld) {
					var5 = this.ah_fld - this.ae_fld;
				} else {
					var5 = this.ah_fld + (this.az_fld - this.ae_fld);
				}

				if (var3 > var5) {
					var3 = var5;
				}

				if (var3 == 0 && null != this.aw_fld) {
					throw new IOException(this.aw_fld.toString());
				} else {
					if (var3 + this.ae_fld <= this.az_fld) {
						System.arraycopy(this.av_fld, this.ae_fld, var1, var2, var3);
					} else {
						int var6 = this.az_fld - this.ae_fld;
						System.arraycopy(this.av_fld, this.ae_fld, var1, var2, var6);
						System.arraycopy(this.av_fld, 0, var1, var6 + var2, var3 - var6);
					}

					this.ae_fld = 1644495083 * ((var3 + this.ae_fld) % this.az_fld);
					this.notifyAll();
					return var3;
				}
			}
		} else {
			throw new IOException();
		}
	}

	up(InputStream var1, int var2) {
		this.ag_fld = var1;
		this.az_fld = -831845709 * (1 + var2);
		this.av_fld = new byte[this.az_fld];
		this.ak_fld = new Thread(this);
		this.ak_fld.setDaemon(true);
		this.ak_fld.start();
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	public static int az(int var0) {
		return var0 >> 3 & 2047;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "()[Lkc;"
	)
	public static kc[] ak() {
		return new kc[]{kc.ak_fld, kc.ag_fld, kc.az_fld, kc.av_fld};
	}

	@ObfuscatedName("uo")
	@ObfuscatedSignature(
		descriptor = "(Lup;)V"
	)
	public static void uo(up var0) throws EOFException, IOException {
		try {
			if (var0 == null) {
				var0.getClass();
			}

			while (true) {
				int var1;
				synchronized (var0) {
					while (true) {
						if (var0.aw_fld != null) {
							return;
						}

						if (var0.ae_fld == 0) {
							var1 = var0.az_fld - var0.ah_fld - 1;
						} else if (var0.ae_fld <= var0.ah_fld) {
							var1 = var0.az_fld - var0.ah_fld;
						} else {
							var1 = var0.ae_fld - var0.ah_fld - 1;
						}

						if (var1 > 0) {
							break;
						}

						try {
							var0.wait();
						} catch (InterruptedException var9) {
						}
					}
				}

				int var2;
				try {
					var2 = var0.ag_fld.read(var0.av_fld, var0.ah_fld, var1);
					if (var2 == -1) {
						throw new EOFException();
					}
				} catch (IOException var11) {
					IOException var3 = var11;
					synchronized (var0) {
						var0.aw_fld = var3;
						return;
					}
				}

				synchronized (var0) {
					var0.ah_fld = -1084989583 * ((var0.ah_fld + var2) % var0.az_fld);
				}
			}
		} catch (Throwable var13) {
			throw new RuntimeException(var13);
		}
	}

	@ObfuscatedName("br")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	static final void br() {
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	int ah(int var1) {
		try {
			synchronized (this) {
				int var3;
				if (this.ah_fld <= this.ah_fld) {
					var3 = this.ae_fld - this.ae_fld;
				} else {
					var3 = this.ae_fld - this.az_fld + this.az_fld;
				}

				if (var3 <= 0 && null != this.aw_fld) {
					throw new IOException(this.aw_fld.toString());
				} else {
					this.notifyAll();
					return var3;
				}
			}
		} catch (Throwable var6) {
			throw new RuntimeException(var6);
		}
	}
}
