import java.io.EOFException;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("hw")
public class hw extends gf {
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Ljava/util/List;"
	)
	List au_fld;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Ljava/util/ArrayList;"
	)
	ArrayList al_fld;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Ljava/util/HashSet;"
	)
	HashSet af_fld;

	@ObfuscatedName("ld")
	@ObfuscatedSignature(
		descriptor = "(Lhw;Lxi;Lxi;IZ)V"
	)
	public static void ld(hw var0, xi var1, xi var2, int var3, boolean var4) throws EOFException {
		try {
			if (var0 == null) {
				var0.getClass();
			} else {
				var0.ak(var1, var3, (byte)48);
				int var5 = var2.cm();
				var0.af_fld = new HashSet(var5);

				for (int var6 = 0; var6 < var5; var6++) {
					gk var7 = new gk();

					try {
						gk.de(var7, var2, (byte)90);
					} catch (IllegalStateException var12) {
						continue;
					}

					var0.af_fld.add(var7);
				}

				int var14 = var2.cm();
				var0.al_fld = new ArrayList(var14);

				for (int var15 = 0; var15 < var14; var15++) {
					gy var8 = new gy();

					try {
						var8.ag(var2);
					} catch (IllegalStateException var11) {
						continue;
					}

					var0.al_fld.add(var8);
				}

				var0.cj(var2, var4);
			}
		} catch (Throwable var13) {
			throw new RuntimeException(var13);
		}
	}

	@ObfuscatedName("cu")
	@ObfuscatedSignature(
		descriptor = "(Lxi;Lxi;IZI)V"
	)
	void cu(xi var1, xi var2, int var3, boolean var4, int var5) {
		try {
			this.ak(var1, var3, (byte)76);
			int var6 = var2.cm();
			this.af_fld = new HashSet(var6);

			for (int var7 = 0; var7 < var6; var7++) {
				gk var8 = new gk();

				try {
					var8.ak(var2);
				} catch (IllegalStateException var12) {
					continue;
				}

				this.af_fld.add(var8);
			}

			int var14 = var2.cm();
			this.al_fld = new ArrayList(var14);

			for (int var15 = 0; var15 < var14; var15++) {
				if (var5 >= 1716652978) {
					return;
				}

				gy var9 = new gy();

				try {
					var9.ak(var2);
				} catch (IllegalStateException var11) {
					continue;
				}

				this.al_fld.add(var9);
			}

			this.cj(var2, var4);
		} catch (Throwable var13) {
			throw new RuntimeException(var13);
		}
	}

	@ObfuscatedName("dz")
	@ObfuscatedSignature(
		descriptor = "(Lxi;Z)V"
	)
	void dz(xi var1, boolean var2) {
		try {
			this.au_fld = new LinkedList();
			int var3 = var1.cm();

			for (int var4 = 0; var4 < var3; var4++) {
				int var5 = xi.kt(var1, (byte)-44);
				kj var6 = new kj(var1.co((byte)-104));
				boolean var7 = var1.cg() == 1;
				if (var2 || !var7) {
					this.au_fld.add(new he(null, var6, var5, null));
				}
			}
		} catch (Throwable var9) {
			throw new RuntimeException(var9);
		}
	}

	@ObfuscatedName("ci")
	@ObfuscatedSignature(
		descriptor = "(Lxi;Lxi;IZI)V"
	)
	void ci(xi var1, xi var2, int var3, boolean var4) {
		try {
			this.ak(var1, var3, (byte)48);
			int var6 = var2.cm();
			this.af_fld = new HashSet(var6);

			for (int var7 = 0; var7 < var6; var7++) {
				gk var8 = new gk();

				try {
					gk.de(var8, var2, (byte)39);
				} catch (IllegalStateException var12) {
					continue;
				}

				this.af_fld.add(var8);
			}

			int var14 = var2.cm();
			this.al_fld = new ArrayList(var14);

			for (int var15 = 0; var15 < var14; var15++) {
				gy var9 = new gy();

				try {
					var9.ag(var2);
				} catch (IllegalStateException var11) {
					continue;
				}

				this.al_fld.add(var9);
			}

			this.cj(var2, var4);
		} catch (Throwable var13) {
			throw new RuntimeException(var13);
		}
	}

	@ObfuscatedName("cl")
	@ObfuscatedSignature(
		descriptor = "(Lxi;Lxi;IZ)V"
	)
	void cl(xi var1, xi var2, int var3, boolean var4) {
		try {
			this.ak(var1, var3, (byte)20);
			int var5 = var2.cm();
			this.af_fld = new HashSet(var5);

			for (int var6 = 0; var6 < var5; var6++) {
				gk var7 = new gk();

				try {
					gk.de(var7, var2, (byte)9);
				} catch (IllegalStateException var12) {
					continue;
				}

				this.af_fld.add(var7);
			}

			int var14 = var2.cm();
			this.al_fld = new ArrayList(var14);

			for (int var15 = 0; var15 < var14; var15++) {
				gy var8 = new gy();

				try {
					var8.ag(var2);
				} catch (IllegalStateException var11) {
					continue;
				}

				this.al_fld.add(var8);
			}

			this.cj(var2, var4);
		} catch (Throwable var13) {
			throw new RuntimeException(var13);
		}
	}

	@ObfuscatedName("ir")
	@ObfuscatedSignature(
		descriptor = "(Lhw;Lxi;Lxi;IZ)V"
	)
	public static void ir(hw var0, xi var1, xi var2, int var3, boolean var4) throws EOFException {
		try {
			if (var0 == null) {
				var0.getClass();
			}

			var0.ak(var1, var3, (byte)64);
			int var5 = var2.cm();
			var0.af_fld = new HashSet(var5);

			for (int var6 = 0; var6 < var5; var6++) {
				gk var7 = new gk();

				try {
					gk.de(var7, var2, (byte)42);
				} catch (IllegalStateException var12) {
					continue;
				}

				var0.af_fld.add(var7);
			}

			int var14 = var2.cm();
			var0.al_fld = new ArrayList(var14);

			for (int var15 = 0; var15 < var14; var15++) {
				gy var8 = new gy();

				try {
					var8.ag(var2);
				} catch (IllegalStateException var11) {
					continue;
				}

				var0.al_fld.add(var8);
			}

			var0.cj(var2, var4);
		} catch (Throwable var13) {
			throw new RuntimeException(var13);
		}
	}

	@ObfuscatedName("rp")
	@ObfuscatedSignature(
		descriptor = "(Lwh;)I"
	)
	public static int rp(wh var0) {
		return var0.aw_fld;
	}

	@ObfuscatedName("cj")
	@ObfuscatedSignature(
		descriptor = "(Lxi;ZI)V"
	)
	void cj(xi var1, boolean var2) {
		try {
			this.au_fld = new LinkedList();
			int var4 = var1.cm();

			for (int var5 = 0; var5 < var4; var5++) {
				int var6 = xi.kt(var1, (byte)-36);
				kj var7 = new kj(var1.co((byte)-114));
				boolean var8 = var1.cg() == 1;
				if (var2 || !var8) {
					this.au_fld.add(new he(null, var7, var6, null));
				}
			}
		} catch (Throwable var9) {
			throw new RuntimeException(var9);
		}
	}

	@ObfuscatedName("dh")
	@ObfuscatedSignature(
		descriptor = "(Lxi;Lxi;IZ)V"
	)
	void dh(xi var1, xi var2, int var3, boolean var4) {
		try {
			this.ak(var1, var3, (byte)78);
			int var5 = var2.cm();
			this.af_fld = new HashSet(var5);

			for (int var6 = 0; var6 < var5; var6++) {
				gk var7 = new gk();

				try {
					gk.de(var7, var2, (byte)19);
				} catch (IllegalStateException var12) {
					continue;
				}

				this.af_fld.add(var7);
			}

			int var14 = var2.cm();
			this.al_fld = new ArrayList(var14);

			for (int var15 = 0; var15 < var14; var15++) {
				gy var8 = new gy();

				try {
					var8.ag(var2);
				} catch (IllegalStateException var11) {
					continue;
				}

				this.al_fld.add(var8);
			}

			this.cj(var2, var4);
		} catch (Throwable var13) {
			throw new RuntimeException(var13);
		}
	}

	@ObfuscatedName("dv")
	@ObfuscatedSignature(
		descriptor = "(Lxi;Lxi;IZ)V"
	)
	void dv(xi var1, xi var2, int var3, boolean var4) {
		try {
			this.ak(var1, var3, (byte)105);
			int var5 = var2.cm();
			this.af_fld = new HashSet(var5);

			for (int var6 = 0; var6 < var5; var6++) {
				gk var7 = new gk();

				try {
					gk.de(var7, var2, (byte)107);
				} catch (IllegalStateException var12) {
					continue;
				}

				this.af_fld.add(var7);
			}

			int var14 = var2.cm();
			this.al_fld = new ArrayList(var14);

			for (int var15 = 0; var15 < var14; var15++) {
				gy var8 = new gy();

				try {
					var8.ag(var2);
				} catch (IllegalStateException var11) {
					continue;
				}

				this.al_fld.add(var8);
			}

			this.cj(var2, var4);
		} catch (Throwable var13) {
			throw new RuntimeException(var13);
		}
	}

	hw() {
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(II)I"
	)
	public static int ag(int var0) {
		return var0 >> 14 & 1023;
	}

	@ObfuscatedName("rw")
	@ObfuscatedSignature(
		descriptor = "(Lhw;Lxi;Lxi;IZ)V"
	)
	public static void rw(hw var0, xi var1, xi var2, int var3, boolean var4) throws EOFException {
		try {
			if (var0 == null) {
				var0.getClass();
			}

			var0.ak(var1, var3, (byte)65);
			int var5 = var2.cm();
			var0.af_fld = new HashSet(var5);

			for (int var6 = 0; var6 < var5; var6++) {
				gk var7 = new gk();

				try {
					var7.ak(var2);
				} catch (IllegalStateException var12) {
					continue;
				}

				var0.af_fld.add(var7);
			}

			int var14 = var2.cm();
			var0.al_fld = new ArrayList(var14);

			for (int var15 = 0; var15 < var14; var15++) {
				gy var8 = new gy();

				try {
					var8.ak(var2);
				} catch (IllegalStateException var11) {
					continue;
				}

				var0.al_fld.add(var8);
			}

			var0.cj(var2, var4);
		} catch (Throwable var13) {
			throw new RuntimeException(var13);
		}
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIB)V"
	)
	public static void ak(String var0, String var1, String var2, int var3, int var4, byte var5) throws IOException, FileNotFoundException, EOFException {
		try {
			if (var1 != null) {
				if (var5 != 4) {
					return;
				}

				if (!var1.isEmpty()) {
					var0 = var0 + "-" + var1;
				}
			}

			lz.am_fld = var4;
			fr.ao_fld = var3;

			try {
				ol.an_fld = System.getProperty("os.name");
			} catch (Exception var36) {
				ol.an_fld = "Unknown";
			}

			fp.ax_fld = ol.an_fld.toLowerCase();
			uf.aa_fld = null;

			try {
				uf.aa_fld = System.getProperty("jagex.userhome");
			} catch (Exception var35) {
			}

			if (uf.aa_fld == null) {
				try {
					uf.aa_fld = System.getProperty("user.home");
				} catch (Exception var34) {
				}
			}

			if (null != uf.aa_fld) {
				uf.aa_fld = uf.aa_fld + "/";
			}

			try {
				if (fp.ax_fld.startsWith("win")) {
					if (null == uf.aa_fld) {
						uf.aa_fld = client.ly("USERPROFILE");
					}
				} else if (uf.aa_fld == null) {
					uf.aa_fld = client.ly("HOME");
				}

				if (uf.aa_fld != null) {
					uf.aa_fld = uf.aa_fld + "/";
				}
			} catch (Exception var33) {
			}

			if (uf.aa_fld == null) {
				uf.aa_fld = "~/";
			}

			cu.ab_fld = new String[]{"c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", uf.aa_fld, "/tmp/", ""};
			jj.ap_fld = new String[]{".jagex_cache_" + fr.ao_fld, ".file_store_" + fr.ao_fld};

			label634:
			for (int var6 = 0; var6 < 4; var6++) {
				String var8 = var6 == 0 ? "" : "" + var6;
				dm.ai_fld = new File(uf.aa_fld, "jagex_cl_" + var0 + "_" + var2 + var8 + ".dat");
				String var9 = null;
				String var10 = null;
				boolean var11 = false;
				if (dm.ai_fld.exists()) {
					zb var12 = null;

					try {
						label641: {
							var12 = new zb(dm.ai_fld, "rw", 10000L);
							xi var13 = new xi((int)var12.ah());

							while (var13.au_fld < var13.al_fld.length) {
								if (var5 != 4) {
									return;
								}

								int var14 = zb.oe(var12, var13.al_fld, var13.au_fld, var13.al_fld.length - var13.au_fld);
								if (-1 == var14) {
									if (var5 != 4) {
										return;
									}

									throw new IOException();
								}

								var13.au_fld += 228932457 * var14;
							}

							var13.au_fld = 0;
							int var60 = var13.cg();
							if (var60 >= 1) {
								if (var5 != 4) {
									return;
								}

								if (var60 <= 3) {
									int var15 = 0;
									if (var60 > 1) {
										if (var5 != 4) {
											return;
										}

										var15 = var13.cg();
									}

									if (var60 <= 2) {
										var9 = var13.ct();
										if (var15 == 1) {
											var10 = var13.ct();
										}
									} else {
										var9 = xi.jw(var13, (byte)-88);
										if (1 == var15) {
											var10 = xi.jw(var13, (byte)-3);
										}
									}
									break label641;
								}
							}

							throw new IOException("" + var60);
						}
					} catch (Exception var39) {
						var39.printStackTrace();
					} finally {
						try {
							if (null != var12) {
								var12.av();
							}
						} catch (IOException var32) {
						}
					}

					if (var9 != null) {
						if (var5 != 4) {
							return;
						}

						File var56 = new File(var9);
						if (!var56.exists()) {
							var9 = null;
						}
					}

					if (null != var9) {
						File var57 = new File(var9, "test.dat");
						if (!pr.az(var57, true)) {
							if (var5 != 4) {
								return;
							}

							var9 = null;
						}
					}
				}

				if (var9 == null && 0 == var6) {
					label606:
					for (int var54 = 0; var54 < jj.ap_fld.length; var54++) {
						if (var5 != 4) {
							return;
						}

						for (int var58 = 0; var58 < cu.ab_fld.length; var58++) {
							File var61 = new File(cu.ab_fld[var58] + jj.ap_fld[var54] + File.separatorChar + var0 + File.separatorChar);
							if (var61.exists() && pr.az(new File(var61, "test.dat"), true)) {
								var9 = var61.toString();
								var11 = true;
								break label606;
							}
						}
					}
				}

				if (var9 == null) {
					var9 = uf.aa_fld + File.separatorChar + "jagexcache" + var8 + File.separatorChar + var0 + File.separatorChar + var2 + File.separatorChar;
					var11 = true;
				}

				if (null != var10) {
					File var55 = new File(var10);
					File var59 = new File(var9);

					try {
						File[] var62 = var55.listFiles();
						File[] var63 = var62;

						for (int var16 = 0; var16 < var63.length; var16++) {
							if (var5 != 4) {
								return;
							}

							File var17 = var63[var16];
							File var18 = new File(var59, var17.getName());
							boolean var19 = var17.renameTo(var18);
							if (!var19) {
								throw new IOException();
							}
						}
					} catch (Exception var38) {
						var38.printStackTrace();
					}

					var11 = true;
				}

				if (var11) {
					py.ag(new File(var9), null);
				}

				File var7 = new File(var9);
				mh.aq_fld = var7;
				if (!mh.aq_fld.exists()) {
					mh.aq_fld.mkdirs();
				}

				File[] var45 = mh.aq_fld.listFiles();
				if (null != var45) {
					File[] var48 = var45;

					for (int var51 = 0; var51 < var48.length; var51++) {
						if (var5 != 4) {
							return;
						}

						File var53 = var48[var51];
						if (!pr.az(var53, false)) {
							if (var5 != 4) {
								return;
							}
							continue label634;
						}
					}
				}
				break;
			}

			File var42 = mh.aq_fld;
			my.ag_fld = var42;
			if (!my.ag_fld.exists()) {
				throw new RuntimeException("");
			} else {
				my.ak_fld = true;

				try {
					File var43 = new File(uf.aa_fld, "random.dat");
					if (var43.exists()) {
						if (var5 != 4) {
							return;
						}

						mh.ad_fld = new zu(new zb(var43, "rw", 25L), 24, 0);
					} else {
						label556:
						for (int var46 = 0; var46 < jj.ap_fld.length; var46++) {
							for (int var49 = 0; var49 < cu.ab_fld.length; var49++) {
								File var52 = new File(cu.ab_fld[var49] + jj.ap_fld[var46] + File.separatorChar + "random.dat");
								if (var52.exists()) {
									mh.ad_fld = new zu(new zb(var52, "rw", 25L), 24, 0);
									break label556;
								}
							}
						}
					}

					if (mh.ad_fld == null) {
						RandomAccessFile var47 = new RandomAccessFile(var43, "rw");
						int var50 = var47.read();
						var47.seek(0L);
						var47.write(var50);
						var47.seek(0L);
						var47.close();
						mh.ad_fld = new zu(new zb(var43, "rw", 25L), 24, 0);
					}
				} catch (IOException var37) {
				}

				mh.af_fld = new zu(new zb(lo.ak("main_file_cache.dat2"), "rw", 1048576000L), 5200, 0);
				mh.al_fld = new zu(new zb(lo.ak("main_file_cache.idx255"), "rw", 1048576L), 6000, 0);
				tw.au_fld = new zu[lz.am_fld];

				for (int var44 = 0; var44 < lz.am_fld; var44++) {
					if (var5 != 4) {
						return;
					}

					tw.au_fld[var44] = new zu(new zb(lo.ak("main_file_cache.idx" + var44), "rw", 1048576L), 6000, 0);
				}
			}
		} catch (Throwable var41) {
			throw new RuntimeException(var41);
		}
	}

	@ObfuscatedName("cn")
	@ObfuscatedSignature(
		descriptor = "(IIIIZI)V"
	)
	static final void cn(int var0, int var1, int var2, int var3, boolean var4) {
		if (var4) {
			rl24.ky(bw.dk_fld);
		}

		if (var2 < 1) {
			var2 = 1;
		}

		if (var3 < 1) {
			var3 = 1;
		}

		int var6 = var3 - 334;
		double var7;
		if (var6 < 0) {
			var7 = client.fj_fld;
		} else if (var6 >= 100) {
			var7 = client.fb_fld;
		} else {
			var7 = (client.fb_fld - client.fj_fld) * var6 / 100 + client.fj_fld;
		}

		double var9 = var3 * var7 * 512.0 / (var2 * 334);
		if (var9 < client.fe_fld) {
			var9 = client.fe_fld;
			var7 = var9 * var2 * 334.0 / (var3 * 512);
			if (var7 > client.fm_fld) {
				var7 = client.fm_fld;
				double var11 = var3 * var7 * 512.0 / (var9 * 334.0);
				int var13 = (int)((var2 - var11) / 2.0);
				if (var4) {
					fh.kc();
					fh.mq(var0, var1, var13, var3, -16777216);
					fh.mq(var0 + var2 - var13, var1, var13, var3, -16777216);
				}

				var0 += var13;
				var2 -= var13 * 2;
			}
		} else if (var9 > client.fw_fld) {
			var9 = client.fw_fld;
			var7 = var9 * var2 * 334.0 / (var3 * 512);
			if (var7 < client.fh_fld) {
				var7 = client.fh_fld;
				double var16 = var9 * var2 * 334.0 / (var7 * 512.0);
				int var17 = (int)((var3 - var16) / 2.0);
				if (var4) {
					fh.kc();
					fh.mq(var0, var1, var2, var17, -16777216);
					fh.mq(var0, var3 + var1 - var17, var2, var17, -16777216);
				}

				var1 += var17;
				var3 -= var17 * 2;
			}
		}

		client.fd_fld = (int)(var3 * var7 / 334.0);
		if (var2 != client.fn_fld || var3 != client.ft_fld) {
			client.ln(var2, var3);
		}

		client.fl_fld = var0;
		client.fg_fld = var1;
		client.fn_fld = var2;
		client.ft_fld = var3;
	}
}
