import java.io.EOFException;
import net.runelite.api.annotations.Export;
import net.runelite.api.annotations.ObfuscatedGetter;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("uw")
public class uw implements Runnable {
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int av_fld;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Ljava/lang/Object;"
	)
	static Object ag_fld = new Object();
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int az_fld;
	@ObfuscatedName("bo")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int bo_fld;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lna;"
	)
	static na ae_fld = new na();
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = -11286113
	)
	static int ah_fld = 0;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lna;"
	)
	static na ak_fld = new na();
	@ObfuscatedName("bd")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public static int bd_fld;

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(ILun;Luv;)V"
	)
	static void aa(int var0, un var1, uv var2) throws EOFException {
		try {
			byte[] var3 = null;
			synchronized (ak_fld) {
				for (ur var5 = (ur)ak_fld.aw(); null != var5; var5 = (ur)na.iy(ak_fld)) {
					if (var5.hc_long == var0 && var1 == var5.az_fld && 0 == var5.ak_fld) {
						var3 = var5.ag_fld;
						break;
					}
				}
			}

			if (null != var3) {
				var2.ay(var1, var0, var3, true);
			} else {
				byte[] var10 = un.mz(var1, var0, (byte)-63);
				var2.ay(var1, var0, var10, true);
			}
		} catch (Throwable var9) {
			throw new RuntimeException(var9);
		}
	}

	@ObfuscatedName("hw")
	@ObfuscatedSignature(
		descriptor = "(Ltl;Lts;I)V"
	)
	public static void hw(tl var0, ts var1, int var2) {
		var0.az_fld[var2] = var1;
	}

	@ObfuscatedName("run")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	@Export("run")
	@Override
	public void run() {
		try {
			while (true) {
				ur var1;
				synchronized (ak_fld) {
					var1 = (ur)ak_fld.aw();
				}

				if (null != var1) {
					if (0 == var1.ak_fld) {
						var1.az_fld.ag((int)var1.hc_long, var1.ag_fld, var1.ag_fld.length);
						synchronized (ak_fld) {
							var1.gy();
						}
					} else if (var1.ak_fld == 1) {
						var1.ag_fld = un.mz(var1.az_fld, (int)var1.hc_long, (byte)-86);
						synchronized (ak_fld) {
							ae_fld.az(var1);
						}
					}

					synchronized (ag_fld) {
						if (ah_fld <= 1) {
							ah_fld = 0;
							ag_fld.notifyAll();
							return;
						}

						ah_fld = 1826819752;
					}
				} else {
					dg.ak(100L);
					synchronized (ag_fld) {
						if (ah_fld <= 1) {
							ah_fld = 0;
							ag_fld.notifyAll();
							return;
						}

						ah_fld--;
					}
				}
			}
		} catch (Exception var13) {
			gl.ak(null, var13);
		}
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public static void ad() {
		synchronized (ag_fld) {
			if (0 != ah_fld) {
				ah_fld = 811930207;

				try {
					ag_fld.wait();
				} catch (InterruptedException var5) {
				}
			}
		}

		synchronized (ak_fld) {
			na.mh(ak_fld);
			na.mh(ae_fld);
		}
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public void ak() {
		try {
			while (true) {
				ur var1;
				synchronized (ak_fld) {
					var1 = (ur)ak_fld.aw();
				}

				if (null != var1) {
					if (0 == var1.ak_fld) {
						var1.az_fld.ag((int)var1.hc_long, var1.ag_fld, var1.ag_fld.length);
						synchronized (ak_fld) {
							var1.gy();
						}
					} else if (var1.ak_fld == 1) {
						var1.ag_fld = un.mz(var1.az_fld, (int)var1.hc_long, (byte)-18);
						synchronized (ak_fld) {
							ae_fld.az(var1);
						}
					}

					synchronized (ag_fld) {
						if (ah_fld <= 1) {
							ah_fld = 0;
							ag_fld.notifyAll();
							return;
						}

						ah_fld = 1826819752;
					}
				} else {
					dg.ak(100L);
					synchronized (ag_fld) {
						if (ah_fld <= 1) {
							ah_fld = 0;
							ag_fld.notifyAll();
							return;
						}

						ah_fld -= 282014949;
					}
				}
			}
		} catch (Exception var13) {
			gl.ak(null, var13);
		}
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public void az() {
		try {
			while (true) {
				ur var1;
				synchronized (ak_fld) {
					var1 = (ur)ak_fld.aw();
				}

				if (null != var1) {
					if (0 == var1.ak_fld) {
						var1.az_fld.ag((int)var1.hc_long, var1.ag_fld, var1.ag_fld.length);
						synchronized (ak_fld) {
							var1.gy();
						}
					} else if (var1.ak_fld == 1) {
						var1.ag_fld = un.mz(var1.az_fld, (int)var1.hc_long, (byte)-40);
						synchronized (ak_fld) {
							ae_fld.az(var1);
						}
					}

					synchronized (ag_fld) {
						if (ah_fld <= 1) {
							ah_fld = 0;
							ag_fld.notifyAll();
							return;
						}

						ah_fld = 660140247;
					}
				} else {
					dg.ak(100L);
					synchronized (ag_fld) {
						if (ah_fld <= 1) {
							ah_fld = 0;
							ag_fld.notifyAll();
							return;
						}

						ah_fld--;
					}
				}
			}
		} catch (Exception var13) {
			gl.ak(null, var13);
		}
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public void av() {
		try {
			while (true) {
				ur var1;
				synchronized (ak_fld) {
					var1 = (ur)ak_fld.aw();
				}

				if (null != var1) {
					if (0 == var1.ak_fld) {
						var1.az_fld.ag((int)var1.hc_long, var1.ag_fld, var1.ag_fld.length);
						synchronized (ak_fld) {
							var1.gy();
						}
					} else if (var1.ak_fld == 1) {
						var1.ag_fld = un.mz(var1.az_fld, (int)var1.hc_long, (byte)-85);
						synchronized (ak_fld) {
							ae_fld.az(var1);
						}
					}

					synchronized (ag_fld) {
						if (ah_fld <= 1) {
							ah_fld = 0;
							ag_fld.notifyAll();
							return;
						}

						ah_fld = 1826819752;
					}
				} else {
					dg.ak(100L);
					synchronized (ag_fld) {
						if (ah_fld <= 1) {
							ah_fld = 0;
							ag_fld.notifyAll();
							return;
						}

						ah_fld -= -2025125316;
					}
				}
			}
		} catch (Exception var13) {
			gl.ak(null, var13);
		}
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public static void ai() {
		while (true) {
			ur var0;
			synchronized (ak_fld) {
				var0 = (ur)zi.ex(ae_fld);
			}

			if (var0 == null) {
				return;
			}

			var0.av_fld.ay(var0.az_fld, (int)var0.hc_long, var0.ag_fld, false);
		}
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(I[BLun;)V"
	)
	static void af(int var0, byte[] var1, un var2) {
		ur var3 = new ur();
		var3.ak_fld = 0;
		var3.hc_long = var0;
		var3.ag_fld = var1;
		var3.az_fld = var2;
		synchronized (ak_fld) {
			ak_fld.az(var3);
		}

		ku.ay_void(-2139632073);
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(I[BLun;)V"
	)
	static void al(int var0, byte[] var1, un var2) {
		ur var3 = new ur();
		var3.ak_fld = 0;
		var3.hc_long = var0;
		var3.ag_fld = var1;
		var3.az_fld = var2;
		synchronized (ak_fld) {
			ak_fld.az(var3);
		}

		ku.ay_void(-1845730748);
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(I[BLun;)V"
	)
	static void au(int var0, byte[] var1, un var2) {
		ur var3 = new ur();
		var3.ak_fld = 0;
		var3.hc_long = var0;
		var3.ag_fld = var1;
		var3.az_fld = var2;
		synchronized (ak_fld) {
			ak_fld.az(var3);
		}

		ku.ay_void(-260680665);
	}

	uw() {
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(ILun;Luv;)V"
	)
	static void an(int var0, un var1, uv var2) throws EOFException {
		try {
			byte[] var3 = null;
			synchronized (ak_fld) {
				for (ur var5 = (ur)ak_fld.aw(); null != var5; var5 = (ur)na.iy(ak_fld)) {
					if (var5.hc_long == var0 && var1 == var5.az_fld && 0 == var5.ak_fld) {
						var3 = var5.ag_fld;
						break;
					}
				}
			}

			if (null != var3) {
				var2.ay(var1, var0, var3, true);
			} else {
				byte[] var10 = un.mz(var1, var0, (byte)-125);
				var2.ay(var1, var0, var10, true);
			}
		} catch (Throwable var9) {
			throw new RuntimeException(var9);
		}
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	static void am() {
		synchronized (ag_fld) {
			if (0 == ah_fld) {
				ky.aw_fld = new Thread(new uw());
				ky.aw_fld.setDaemon(true);
				ky.aw_fld.start();
				ky.aw_fld.setPriority(5);
			}

			ah_fld = 1826819752;
		}
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	static void aq() {
		synchronized (ag_fld) {
			if (0 == ah_fld) {
				ky.aw_fld = new Thread(new uw());
				ky.aw_fld.setDaemon(true);
				ky.aw_fld.start();
				ky.aw_fld.setPriority(5);
			}

			ah_fld = 1826819752;
		}
	}

	@ObfuscatedName("na")
	@ObfuscatedSignature(
		descriptor = "(Luw;)V"
	)
	public static void na(uw var0) {
		if (var0 == null) {
			var0.getClass();
		} else {
			try {
				while (true) {
					ur var1;
					synchronized (ak_fld) {
						var1 = (ur)ak_fld.aw();
					}

					if (null != var1) {
						if (0 == var1.ak_fld) {
							var1.az_fld.ag((int)var1.hc_long, var1.ag_fld, var1.ag_fld.length);
							synchronized (ak_fld) {
								var1.gy();
							}
						} else if (var1.ak_fld == 1) {
							var1.ag_fld = un.mz(var1.az_fld, (int)var1.hc_long, (byte)-53);
							synchronized (ak_fld) {
								ae_fld.az(var1);
							}
						}

						synchronized (ag_fld) {
							if (ah_fld <= 1) {
								ah_fld = 0;
								ag_fld.notifyAll();
								return;
							}

							ah_fld = 1826819752;
						}
					} else {
						dg.ak(100L);
						synchronized (ag_fld) {
							if (ah_fld <= 1) {
								ah_fld = 0;
								ag_fld.notifyAll();
								return;
							}

							ah_fld -= -2113882812;
						}
					}
				}
			} catch (Exception var13) {
				gl.ak(null, var13);
			}
		}
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(I[BLun;)V"
	)
	static void ax(int var0, byte[] var1, un var2) {
		ur var3 = new ur();
		var3.ak_fld = 0;
		var3.hc_long = var0;
		var3.ag_fld = var1;
		var3.az_fld = var2;
		synchronized (ak_fld) {
			ak_fld.az(var3);
		}

		ku.ay_void(-25769540);
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(I[BLun;)V"
	)
	static void ar(int var0, byte[] var1, un var2) {
		ur var3 = new ur();
		var3.ak_fld = 0;
		var3.hc_long = var0;
		var3.ag_fld = var1;
		var3.az_fld = var2;
		synchronized (ak_fld) {
			ak_fld.az(var3);
		}

		ku.ay_void(592055370);
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public static void ao() {
		synchronized (ag_fld) {
			if (0 != ah_fld) {
				ah_fld = 811930207;

				try {
					ag_fld.wait();
				} catch (InterruptedException var5) {
				}
			}
		}

		synchronized (ak_fld) {
			na.mh(ak_fld);
			na.mh(ae_fld);
		}
	}
}
