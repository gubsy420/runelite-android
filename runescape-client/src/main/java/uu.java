import java.io.EOFException;
import java.io.IOException;
import java.util.zip.CRC32;
import net.runelite.api.annotations.ObfuscatedGetter;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("uu")
public class uu {
	@ObfuscatedGetter(
		intValue = 715787267
	)
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int au_fld;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int az_fld;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int av_fld;
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lxi;"
	)
	xi ap_fld;
	@ObfuscatedGetter(
		intValue = 984522711
	)
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public int aw_fld = 0;
	@ObfuscatedGetter(
		intValue = -250896019
	)
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public int ay_fld = 0;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Lua;"
	)
	ua as_fld;
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "Lxz;"
	)
	xz ax_fld;
	@ObfuscatedGetter(
		longValue = 4393259994206568441L
	)
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "J"
	)
	long af_fld;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lxz;"
	)
	xz al_fld;
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lut;"
	)
	ut ab_fld;
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Lxz;"
	)
	xz ai_fld;
	@ObfuscatedGetter(
		intValue = 1335283987
	)
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int an_fld;
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "Lnu;"
	)
	nu aa_fld;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int ag_fld;
	@ObfuscatedGetter(
		intValue = 1376027999
	)
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int ad_fld;
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Lxz;"
	)
	xz am_fld;
	@ObfuscatedGetter(
		intValue = -1116447623
	)
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int ar_fld = 0;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Z"
	)
	boolean ao_fld;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int ak_fld;
	@ObfuscatedName("be")
	@ObfuscatedSignature(
		descriptor = "B"
	)
	byte be_fld;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int ah_fld;
	@ObfuscatedGetter(
		intValue = 891644197
	)
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int ac_fld;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Ljava/util/zip/CRC32;"
	)
	CRC32 aj_fld;
	@ObfuscatedName("bm")
	@ObfuscatedSignature(
		descriptor = "Lxi;"
	)
	xi bm_fld;
	@ObfuscatedName("bd")
	@ObfuscatedSignature(
		descriptor = "[Luv;"
	)
	uv[] bd_fld;
	@ObfuscatedGetter(
		intValue = -599935343
	)
	@ObfuscatedName("bz")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int bz_fld;
	@ObfuscatedGetter(
		intValue = -1929794127
	)
	@ObfuscatedName("br")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int br_fld;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lxi;"
	)
	xi at_fld;
	@ObfuscatedGetter(
		intValue = 975366691
	)
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int aq_fld;

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Luv;I)V"
	)
	void ap(uv var1, int var2) throws EOFException {
		int var3 = 8 * var2 + 5;
		int var4 = 0;
		int var5 = 0;
		if (var3 <= this.bm_fld.al_fld.length - 8) {
			this.bm_fld.au_fld = var3;
			var4 = this.bm_fld.co();
			var5 = this.bm_fld.co();
		}

		if (var4 != 0 || 0 != var5) {
			var1.ah(var4, var5, -1401827433);
		} else if (var1.ar_fld) {
			var1.ae();
		} else {
			throw new RuntimeException("");
		}
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	public boolean ak() throws EOFException {
		long var2 = lz.ak();
		int var4 = (int)(var2 - this.af_fld);
		this.af_fld = var2;
		if (var4 > 200) {
			var4 = 200;
		}

		this.ar_fld += -1817489975 * var4;
		if (this.ad_fld == 0 && 0 == this.an_fld && 0 == this.aq_fld && 0 == this.au_fld) {
			return true;
		} else if (null == this.as_fld) {
			return false;
		} else {
			try {
				if (this.ar_fld > 30000) {
					throw new IOException();
				} else {
					while (this.an_fld < 200 && this.au_fld > 0) {
						ut var5 = (ut)this.al_fld.aq();
						xi var6 = new xi(4);
						var6.bc(1);
						var6.ba((int)var5.hc_fld);
						this.as_fld.ae(var6.al_fld, 0, 4, (byte)-57);
						this.ax_fld.az(var5, var5.hc_fld);
						this.au_fld--;
						this.an_fld++;
					}

					while (this.ad_fld < 200 && this.aq_fld > 0) {
						ut var20 = (ut)this.aa_fld.az();
						xi var22 = new xi(4);
						var22.bc(0);
						var22.ba((int)var20.hc_fld);
						this.as_fld.ae(var22.al_fld, 0, 4, (byte)-16);
						var20.mq_void();
						this.am_fld.az(var20, var20.hc_fld);
						this.aq_fld--;
						this.ad_fld++;
					}

					for (int var21 = 0; var21 < 100; var21++) {
						int var23 = this.as_fld.ag((byte)-120);
						if (var23 < 0) {
							throw new IOException();
						}

						if (var23 == 0) {
							break;
						}

						this.ar_fld = 0;
						byte var7 = 0;
						if (null == this.ab_fld) {
							var7 = 8;
						} else if (this.ac_fld == 0) {
							var7 = 1;
						}

						if (var7 > 0) {
							int var8 = var7 - -661977895 * this.ap_fld.au_fld;
							if (var8 > var23) {
								var8 = var23;
							}

							this.as_fld.av(this.ap_fld.al_fld, -661977895 * this.ap_fld.au_fld, var8, 551980226);
							if (this.be_fld != 0) {
								for (int var9 = 0; var9 < var8; var9++) {
									this.ap_fld.al_fld[var9 + this.ap_fld.au_fld * -661977895] = (byte)(this.ap_fld.al_fld[var9 + this.ap_fld.au_fld * -661977895] ^ this.be_fld);
								}
							}

							this.ap_fld.au_fld += 228932457 * var8;
							if (this.ap_fld.au_fld * -661977895 < var7) {
								break;
							}

							if (this.ab_fld == null) {
								this.ap_fld.au_fld = 0;
								int var25 = this.ap_fld.cg();
								int var10 = xi.tx(this.ap_fld, 1356722622);
								int var11 = this.ap_fld.cg();
								int var12 = this.ap_fld.co();
								long var13 = (var25 << 16) + var10;
								ut var15 = (ut)this.ax_fld.ak(var13);
								this.ao_fld = true;
								if (var15 == null) {
									var15 = (ut)this.am_fld.ak(var13);
									this.ao_fld = false;
								}

								if (null == var15) {
									throw new IOException();
								}

								int var16 = var11 == 0 ? 5 : 9;
								this.ab_fld = var15;
								this.at_fld = new xi(this.ab_fld.az_fld + var16 + var12);
								this.at_fld.bc(var11);
								xi.ld(this.at_fld, var12, (byte)118);
								this.ac_fld = -837528216;
								this.ap_fld.au_fld = 0;
							} else if (this.ac_fld == 0) {
								if (-1 == this.ap_fld.al_fld[0]) {
									this.ac_fld = 969050797;
									this.ap_fld.au_fld = 0;
								} else {
									this.ab_fld = null;
								}
							}
						} else {
							int var24 = this.at_fld.al_fld.length - this.ab_fld.az_fld;
							int var26 = 512 - this.ac_fld;
							if (var26 > var24 - -661977895 * this.at_fld.au_fld) {
								var26 = var24 - -661977895 * this.at_fld.au_fld;
							}

							if (var26 > var23) {
								var26 = var23;
							}

							this.as_fld.av(this.at_fld.al_fld, this.at_fld.au_fld * -661977895, var26, 551980226);
							if (0 != this.be_fld) {
								for (int var27 = 0; var27 < var26; var27++) {
									this.at_fld.al_fld[-661977895 * this.at_fld.au_fld + var27] = (byte)(this.at_fld.al_fld[-661977895 * this.at_fld.au_fld + var27] ^ this.be_fld);
								}
							}

							this.at_fld.au_fld += var26 * 228932457;
							this.ac_fld += var26 * 969050797;
							if (var24 == -661977895 * this.at_fld.au_fld) {
								if (16711935L == this.ab_fld.hc_fld) {
									this.bm_fld = this.at_fld;

									for (int var29 = 0; var29 < 256; var29++) {
										uv var30 = this.bd_fld[var29];
										if (null != var30) {
											el(this, var30, var29);
										}
									}
								} else {
									this.aj_fld.reset();
									this.aj_fld.update(this.at_fld.al_fld, 0, var24);
									int var28 = (int)this.aj_fld.getValue();
									if (-808180635 * this.ab_fld.ag_fld != var28) {
										try {
											this.as_fld.ah((byte)90);
										} catch (Exception var18) {
										}

										this.aw_fld++;
										this.as_fld = null;
										this.be_fld = (byte)(Math.random() * 255.0 + 1.0);
										return false;
									}

									this.aw_fld = 0;
									this.ay_fld = 0;
									this.ab_fld.ak_fld.aw((int)(this.ab_fld.hc_fld & 65535L), this.at_fld.al_fld, (this.ab_fld.hc_fld & 16711680L) == 16711680L, this.ao_fld);
								}

								this.ab_fld.gy_void();
								if (this.ao_fld) {
									this.an_fld--;
								} else {
									this.ad_fld--;
								}

								this.ac_fld = 0;
								this.ab_fld = null;
								this.at_fld = null;
							} else {
								if (512 != this.ac_fld) {
									break;
								}

								this.ac_fld = 0;
							}
						}
					}

					return true;
				}
			} catch (IOException var19) {
				try {
					this.as_fld.ah((byte)116);
				} catch (Exception var17) {
				}

				this.ay_fld++;
				this.as_fld = null;
				return false;
			}
		}
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Z)V"
	)
	public void ag(boolean var1) {
		if (null != this.as_fld) {
			try {
				xi var3 = new xi(4);
				var3.bc(var1 ? 2 : 3);
				var3.ba(0);
				this.as_fld.ae(var3.al_fld, 0, 4, (byte)-55);
			} catch (IOException var6) {
				try {
					this.as_fld.ah((byte)91);
				} catch (Exception var5) {
				}

				this.ay_fld++;
				this.as_fld = null;
			}
		}
	}

	public uu() {
		this.al_fld = new xz(4096);
		this.au_fld = 0;
		this.ax_fld = new xz(32);
		this.an_fld = 0;
		this.aa_fld = new nu();
		this.ai_fld = new xz(4096);
		this.aq_fld = 0;
		this.am_fld = new xz(4096);
		this.ad_fld = 0;
		this.ap_fld = new xi(8);
		this.ac_fld = 0;
		this.aj_fld = new CRC32();
		this.bd_fld = new uv[256];
		this.bz_fld = -225757809;
		this.br_fld = 237950383;
		this.be_fld = 0;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Luv;II)V"
	)
	void ae(uv var1, int var2, int var3) throws EOFException {
		if (var1.ar_fld) {
			if (!var1.as_fld) {
				if (var2 <= this.bz_fld) {
					throw new RuntimeException("");
				}

				if (var2 < this.br_fld) {
					this.br_fld = var2;
				}
			}
		} else {
			if (var2 >= this.br_fld) {
				if (var3 == 314166794) {
					return;
				}

				throw new RuntimeException("");
			}

			if (var2 > this.bz_fld) {
				this.bz_fld = var2;
			}
		}

		if (this.bm_fld != null) {
			el(this, var1, var2);
		} else {
			this.ah(null, ud.ak_fld.bm_fld, 255, 0, (byte)0, true);
			this.bd_fld[var2] = var1;
		}
	}

	@ObfuscatedName("br")
	@ObfuscatedSignature(
		descriptor = "(II)I"
	)
	int br(int var1, int var2) {
		long var3 = var2 + (var1 << 16);
		return this.ab_fld != null && this.ab_fld.hc_fld == var3 ? 1 + this.at_fld.au_fld * -1111302165 / (this.at_fld.al_fld.length - this.ab_fld.az_fld) : 0;
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public void ar() {
		if (this.as_fld != null) {
			try {
				this.as_fld.ah((byte)96);
			} catch (Exception var3) {
			}

			this.as_fld = null;
		}
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(Luv;I)V"
	)
	void am(uv var1, int var2) throws EOFException {
		if (var1.ar_fld) {
			if (!var1.as_fld) {
				if (var2 <= this.bz_fld) {
					throw new RuntimeException("");
				}

				if (var2 < this.br_fld) {
					this.br_fld = var2;
				}
			}
		} else {
			if (var2 >= this.br_fld) {
				throw new RuntimeException("");
			}

			if (var2 > this.bz_fld) {
				this.bz_fld = var2;
			}
		}

		if (this.bm_fld != null) {
			el(this, var1, var2);
		} else {
			this.ah(null, ud.ak_fld.bm_fld, 255, 0, (byte)0, true);
			this.bd_fld[var2] = var1;
		}
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(II)I"
	)
	int ay(int var1, int var2) {
		long var4 = var2 + (var1 << 16);
		return this.ab_fld != null && this.ab_fld.hc_fld == var4 ? 1 + this.at_fld.au_fld * -1111302165 / (this.at_fld.al_fld.length - this.ab_fld.az_fld) : 0;
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(ZZ)I"
	)
	public int as(boolean var1, boolean var2) {
		int var4 = 0;
		if (var1) {
			var4 += this.au_fld + this.an_fld;
		}

		if (var2) {
			var4 += this.ad_fld + this.aq_fld;
		}

		return var4;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Lua;Z)V"
	)
	public void az(ua var1, boolean var2) {
		if (this.as_fld != null) {
			try {
				this.as_fld.ah((byte)69);
			} catch (Exception var8) {
			}

			this.as_fld = null;
		}

		this.as_fld = var1;
		this.ag(var2);
		this.ap_fld.au_fld = 0;
		this.ab_fld = null;
		this.at_fld = null;
		this.ac_fld = 0;

		while (true) {
			ut var4 = (ut)this.ax_fld.aq();
			if (var4 == null) {
				while (true) {
					var4 = (ut)this.am_fld.aq();
					if (null == var4) {
						if (this.be_fld != 0) {
							try {
								xi var10 = new xi(4);
								var10.bc(4);
								var10.bc(this.be_fld);
								var10.bw(0);
								this.as_fld.ae(var10.al_fld, 0, 4, (byte)-61);
							} catch (IOException var7) {
								try {
									this.as_fld.ah((byte)12);
								} catch (Exception var6) {
								}

								this.ay_fld++;
								this.as_fld = null;
							}
						}

						this.ar_fld = 0;
						this.af_fld = lz.ak();
						return;
					}

					this.aa_fld.ag(var4);
					this.ai_fld.az(var4, var4.hc_fld);
					this.aq_fld++;
					this.ad_fld--;
				}
			}

			this.al_fld.az(var4, var4.hc_fld);
			this.au_fld++;
			this.an_fld--;
		}
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	public boolean af() throws EOFException {
		long var1 = lz.ak();
		int var3 = (int)(var1 - this.af_fld);
		this.af_fld = var1;
		if (var3 > 200) {
			var3 = 200;
		}

		this.ar_fld += -1817489975 * var3;
		if (this.ad_fld == 0 && 0 == this.an_fld && 0 == this.aq_fld && 0 == this.au_fld) {
			return true;
		} else if (null == this.as_fld) {
			return false;
		} else {
			try {
				if (this.ar_fld > 30000) {
					throw new IOException();
				} else {
					while (this.an_fld < 200 && this.au_fld > 0) {
						ut var4 = (ut)this.al_fld.aq();
						xi var5 = new xi(4);
						var5.bc(1);
						var5.ba((int)var4.hc_fld);
						this.as_fld.ae(var5.al_fld, 0, 4, (byte)-106);
						this.ax_fld.az(var4, var4.hc_fld);
						this.au_fld--;
						this.an_fld++;
					}

					while (this.ad_fld < 200 && this.aq_fld > 0) {
						ut var19 = (ut)this.aa_fld.az();
						xi var21 = new xi(4);
						var21.bc(0);
						var21.ba((int)var19.hc_fld);
						this.as_fld.ae(var21.al_fld, 0, 4, (byte)-38);
						var19.mq_void();
						this.am_fld.az(var19, var19.hc_fld);
						this.aq_fld--;
						this.ad_fld++;
					}

					for (int var20 = 0; var20 < 100; var20++) {
						int var22 = this.as_fld.ag((byte)-90);
						if (var22 < 0) {
							throw new IOException();
						}

						if (var22 == 0) {
							break;
						}

						this.ar_fld = 0;
						byte var6 = 0;
						if (null == this.ab_fld) {
							var6 = 8;
						} else if (this.ac_fld == 0) {
							var6 = 1;
						}

						if (var6 > 0) {
							int var7 = var6 - -661977895 * this.ap_fld.au_fld;
							if (var7 > var22) {
								var7 = var22;
							}

							this.as_fld.av(this.ap_fld.al_fld, -661977895 * this.ap_fld.au_fld, var7, 551980226);
							if (this.be_fld != 0) {
								for (int var8 = 0; var8 < var7; var8++) {
									this.ap_fld.al_fld[var8 + this.ap_fld.au_fld * -661977895] = (byte)(this.ap_fld.al_fld[var8 + this.ap_fld.au_fld * -661977895] ^ this.be_fld);
								}
							}

							this.ap_fld.au_fld += 228932457 * var7;
							if (this.ap_fld.au_fld * -661977895 < var6) {
								break;
							}

							if (this.ab_fld == null) {
								this.ap_fld.au_fld = 0;
								int var24 = this.ap_fld.cg();
								int var9 = xi.tx(this.ap_fld, 903260344);
								int var10 = this.ap_fld.cg();
								int var11 = this.ap_fld.co();
								long var12 = (var24 << 16) + var9;
								ut var14 = (ut)this.ax_fld.ak(var12);
								this.ao_fld = true;
								if (var14 == null) {
									var14 = (ut)this.am_fld.ak(var12);
									this.ao_fld = false;
								}

								if (null == var14) {
									throw new IOException();
								}

								int var15 = var10 == 0 ? 5 : 9;
								this.ab_fld = var14;
								this.at_fld = new xi(this.ab_fld.az_fld + var15 + var11);
								this.at_fld.bc(var10);
								xi.ld(this.at_fld, var11, (byte)126);
								this.ac_fld = -837528216;
								this.ap_fld.au_fld = 0;
							} else if (this.ac_fld == 0) {
								if (-1 == this.ap_fld.al_fld[0]) {
									this.ac_fld = 969050797;
									this.ap_fld.au_fld = 0;
								} else {
									this.ab_fld = null;
								}
							}
						} else {
							int var23 = this.at_fld.al_fld.length - this.ab_fld.az_fld;
							int var25 = 512 - this.ac_fld;
							if (var25 > var23 - -661977895 * this.at_fld.au_fld) {
								var25 = var23 - -661977895 * this.at_fld.au_fld;
							}

							if (var25 > var22) {
								var25 = var22;
							}

							this.as_fld.av(this.at_fld.al_fld, this.at_fld.au_fld * -661977895, var25, 551980226);
							if (0 != this.be_fld) {
								for (int var26 = 0; var26 < var25; var26++) {
									this.at_fld.al_fld[-661977895 * this.at_fld.au_fld + var26] = (byte)(this.at_fld.al_fld[-661977895 * this.at_fld.au_fld + var26] ^ this.be_fld);
								}
							}

							this.at_fld.au_fld += var25 * 228932457;
							this.ac_fld += var25 * 969050797;
							if (var23 == -661977895 * this.at_fld.au_fld) {
								if (16711935L == this.ab_fld.hc_fld) {
									this.bm_fld = this.at_fld;

									for (int var28 = 0; var28 < 256; var28++) {
										uv var29 = this.bd_fld[var28];
										if (null != var29) {
											el(this, var29, var28);
										}
									}
								} else {
									this.aj_fld.reset();
									this.aj_fld.update(this.at_fld.al_fld, 0, var23);
									int var27 = (int)this.aj_fld.getValue();
									if (-808180635 * this.ab_fld.ag_fld != var27) {
										try {
											this.as_fld.ah((byte)16);
										} catch (Exception var17) {
										}

										this.aw_fld++;
										this.as_fld = null;
										this.be_fld = (byte)(Math.random() * 255.0 + 1.0);
										return false;
									}

									this.aw_fld = 0;
									this.ay_fld = 0;
									this.ab_fld.ak_fld.aw((int)(this.ab_fld.hc_fld & 65535L), this.at_fld.al_fld, (this.ab_fld.hc_fld & 16711680L) == 16711680L, this.ao_fld);
								}

								this.ab_fld.gy_void();
								if (this.ao_fld) {
									this.an_fld--;
								} else {
									this.ad_fld--;
								}

								this.ac_fld = 0;
								this.ab_fld = null;
								this.at_fld = null;
							} else {
								if (512 != this.ac_fld) {
									break;
								}

								this.ac_fld = 0;
							}
						}
					}

					return true;
				}
			} catch (IOException var18) {
				try {
					this.as_fld.ah((byte)16);
				} catch (Exception var16) {
				}

				this.ay_fld++;
				this.as_fld = null;
				return false;
			}
		}
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	public boolean al() throws EOFException {
		long var1 = lz.ak();
		int var3 = (int)(var1 - this.af_fld);
		this.af_fld = var1;
		if (var3 > 200) {
			var3 = 200;
		}

		this.ar_fld += 809406728 * var3;
		if (this.ad_fld * 1237377858 == 0 && 0 == this.an_fld && 0 == this.aq_fld && 0 == this.au_fld) {
			return true;
		} else if (null == this.as_fld) {
			return false;
		} else {
			try {
				if (this.ar_fld > 30000) {
					throw new IOException();
				} else {
					while (this.an_fld < -1878013153 && 794785134 * this.au_fld > 0) {
						ut var4 = (ut)this.al_fld.aq();
						xi var5 = new xi(4);
						var5.bc(1);
						var5.ba((int)var4.hc_fld);
						this.as_fld.ae(var5.al_fld, 0, 4, (byte)-61);
						this.ax_fld.az(var4, var4.hc_fld);
						this.au_fld--;
						this.an_fld += -1842280004;
					}

					while (this.ad_fld < 200 && 870157361 * this.aq_fld > 0) {
						ut var19 = (ut)this.aa_fld.az();
						xi var21 = new xi(4);
						var21.bc(0);
						var21.ba((int)var19.hc_fld);
						this.as_fld.ae(var21.al_fld, 0, 4, (byte)-81);
						var19.mq_void();
						this.am_fld.az(var19, var19.hc_fld);
						this.aq_fld--;
						this.ad_fld++;
					}

					for (int var20 = 0; var20 < 100; var20++) {
						int var22 = this.as_fld.ag((byte)-94);
						if (var22 < 0) {
							throw new IOException();
						}

						if (var22 == 0) {
							break;
						}

						this.ar_fld = 0;
						byte var6 = 0;
						if (null == this.ab_fld) {
							var6 = 8;
						} else if (947860513 * this.ac_fld == 0) {
							var6 = 1;
						}

						if (var6 > 0) {
							int var7 = var6 - 1760172267 * this.ap_fld.au_fld;
							if (var7 > var22) {
								var7 = var22;
							}

							this.as_fld.av(this.ap_fld.al_fld, -661977895 * this.ap_fld.au_fld, var7, 551980226);
							if (this.be_fld != 0) {
								for (int var8 = 0; var8 < var7; var8++) {
									this.ap_fld.al_fld[var8 + this.ap_fld.au_fld * -661977895] = (byte)(this.ap_fld.al_fld[var8 + this.ap_fld.au_fld * -661977895] ^ this.be_fld);
								}
							}

							this.ap_fld.au_fld += 928310612 * var7;
							if (this.ap_fld.au_fld * -661977895 < var6) {
								break;
							}

							if (this.ab_fld == null) {
								this.ap_fld.au_fld = 0;
								int var24 = this.ap_fld.cg();
								int var9 = xi.tx(this.ap_fld, 649784396);
								int var10 = this.ap_fld.cg();
								int var11 = this.ap_fld.co();
								long var12 = (var24 << 16) + var9;
								ut var14 = (ut)this.ax_fld.ak(var12);
								this.ao_fld = true;
								if (var14 == null) {
									var14 = (ut)this.am_fld.ak(var12);
									this.ao_fld = false;
								}

								if (null == var14) {
									throw new IOException();
								}

								int var15 = var10 == 0 ? 5 : 9;
								this.ab_fld = var14;
								this.at_fld = new xi(this.ab_fld.az_fld + var15 + var11);
								this.at_fld.bc(var10);
								xi.ld(this.at_fld, var11, (byte)82);
								this.ac_fld = -1086970144;
								this.ap_fld.au_fld = 0;
							} else if (this.ac_fld * 288620852 == 0) {
								if (-1 == this.ap_fld.al_fld[0]) {
									this.ac_fld = 969050797;
									this.ap_fld.au_fld = 0;
								} else {
									this.ab_fld = null;
								}
							}
						} else {
							int var23 = this.at_fld.al_fld.length - this.ab_fld.az_fld;
							int var25 = 512 - this.ac_fld;
							if (var25 > var23 - -661977895 * this.at_fld.au_fld) {
								var25 = var23 - -1518008311 * this.at_fld.au_fld;
							}

							if (var25 > var22) {
								var25 = var22;
							}

							this.as_fld.av(this.at_fld.al_fld, this.at_fld.au_fld * 1260985487, var25, 551980226);
							if (0 != this.be_fld) {
								for (int var26 = 0; var26 < var25; var26++) {
									this.at_fld.al_fld[684419160 * this.at_fld.au_fld + var26] = (byte)(this.at_fld.al_fld[684419160 * this.at_fld.au_fld + var26] ^ this.be_fld);
								}
							}

							this.at_fld.au_fld += var25 * 228932457;
							this.ac_fld += var25 * 969050797;
							if (var23 == -246889324 * this.at_fld.au_fld) {
								if (16711935L == this.ab_fld.hc_fld) {
									this.bm_fld = this.at_fld;

									for (int var28 = 0; var28 < 256; var28++) {
										uv var29 = this.bd_fld[var28];
										if (null != var29) {
											el(this, var29, var28);
										}
									}
								} else {
									this.aj_fld.reset();
									this.aj_fld.update(this.at_fld.al_fld, 0, var23);
									int var27 = (int)this.aj_fld.getValue();
									if (1329119636 * this.ab_fld.ag_fld != var27) {
										try {
											this.as_fld.ah((byte)8);
										} catch (Exception var17) {
										}

										this.aw_fld += -1687417298;
										this.as_fld = null;
										this.be_fld = (byte)(Math.random() * 255.0 + 1.0);
										return false;
									}

									this.aw_fld = 0;
									this.ay_fld = 0;
									this.ab_fld.ak_fld.aw((int)(this.ab_fld.hc_fld & 65535L), this.at_fld.al_fld, (this.ab_fld.hc_fld & 16711680L) == 16711680L, this.ao_fld);
								}

								this.ab_fld.gy_void();
								if (this.ao_fld) {
									this.an_fld--;
								} else {
									this.ad_fld -= 1549818515;
								}

								this.ac_fld = 0;
								this.ab_fld = null;
								this.at_fld = null;
							} else {
								if (78106353 != this.ac_fld) {
									break;
								}

								this.ac_fld = 0;
							}
						}
					}

					return true;
				}
			} catch (IOException var18) {
				try {
					this.as_fld.ah((byte)62);
				} catch (Exception var16) {
				}

				this.ay_fld++;
				this.as_fld = null;
				return false;
			}
		}
	}

	@ObfuscatedName("bh")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public void bh() {
		if (this.as_fld != null) {
			try {
				this.as_fld.ah((byte)90);
			} catch (Exception var2) {
			}

			this.as_fld = null;
		}
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Luv;IIIBZ)V"
	)
	void at(uv var1, int var2, int var3, int var4, byte var5, boolean var6) {
		long var7 = var3 + (var2 << 16);
		ut var9 = (ut)this.al_fld.ak(var7);
		if (null == var9) {
			var9 = (ut)this.ax_fld.ak(var7);
			if (null == var9) {
				var9 = (ut)this.ai_fld.ak(var7);
				if (null != var9) {
					if (var6) {
						var9.mq_void();
						this.al_fld.az(var9, var7);
						this.aq_fld--;
						this.au_fld++;
					}
				} else {
					if (!var6) {
						var9 = (ut)this.am_fld.ak(var7);
						if (null != var9) {
							return;
						}
					}

					var9 = new ut();
					var9.ak_fld = var1;
					var9.ag_fld = var4;
					var9.az_fld = var5;
					if (var6) {
						this.al_fld.az(var9, var7);
						this.au_fld++;
					} else {
						nu.xt(this.aa_fld, var9);
						this.ai_fld.az(var9, var7);
						this.aq_fld++;
					}
				}
			}
		}
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(Lua;Z)V"
	)
	public void ai(ua var1, boolean var2) {
		if (this.as_fld != null) {
			try {
				this.as_fld.ah((byte)31);
			} catch (Exception var7) {
			}

			this.as_fld = null;
		}

		this.as_fld = var1;
		this.ag(var2);
		this.ap_fld.au_fld = 0;
		this.ab_fld = null;
		this.at_fld = null;
		this.ac_fld = 0;

		while (true) {
			ut var3 = (ut)this.ax_fld.aq();
			if (var3 == null) {
				while (true) {
					var3 = (ut)this.am_fld.aq();
					if (null == var3) {
						if (this.be_fld != 0) {
							try {
								xi var9 = new xi(4);
								var9.bc(4);
								var9.bc(this.be_fld);
								var9.bw(0);
								this.as_fld.ae(var9.al_fld, 0, 4, (byte)-122);
							} catch (IOException var6) {
								try {
									this.as_fld.ah((byte)3);
								} catch (Exception var5) {
								}

								this.ay_fld += -1821960624;
								this.as_fld = null;
							}
						}

						this.ar_fld = 0;
						this.af_fld = lz.ak();
						return;
					}

					this.aa_fld.ag(var3);
					this.ai_fld.az(var3, var3.hc_fld);
					this.aq_fld += -1918361510;
					this.ad_fld -= 1703831858;
				}
			}

			this.al_fld.az(var3, var3.hc_fld);
			this.au_fld++;
			this.an_fld -= -2021503721;
		}
	}

	@ObfuscatedName("zz")
	@ObfuscatedSignature(
		descriptor = "(Luu;Z)V"
	)
	public static void zz(uu var0, boolean var1) {
		if (null != var0.as_fld) {
			try {
				xi var2 = new xi(4);
				var2.bc(var1 ? 2 : 3);
				var2.ba(0);
				var0.as_fld.ae(var2.al_fld, 0, 4, (byte)-63);
			} catch (IOException var5) {
				try {
					var0.as_fld.ah((byte)5);
				} catch (Exception var4) {
				}

				var0.ay_fld += 1223853359;
				var0.as_fld = null;
			}
		}
	}

	@ObfuscatedName("xu")
	@ObfuscatedSignature(
		descriptor = "(Luu;IIB)V"
	)
	public static void xu(uu var0, int var1, int var2, byte var3) {
		if (var0 == null) {
			var0.getClass();
		}

		synchronized (var0) {
			byte var9 = 106;
			long var10 = var2 + (var1 << 16);
			ut var12 = (ut)var0.ai_fld.ak(var10);
			if (null != var12) {
				var0.aa_fld.ag(var12);
			}
		}
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(Z)V"
	)
	public void au(boolean var1) {
		if (null != this.as_fld) {
			try {
				xi var2 = new xi(4);
				var2.bc(var1 ? 2 : 3);
				var2.ba(0);
				this.as_fld.ae(var2.al_fld, 0, 4, (byte)-15);
			} catch (IOException var5) {
				try {
					this.as_fld.ah((byte)11);
				} catch (Exception var4) {
				}

				this.ay_fld++;
				this.as_fld = null;
			}
		}
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(Luv;I)V"
	)
	void ad(uv var1, int var2) throws EOFException {
		if (var1.ar_fld) {
			if (!var1.as_fld) {
				if (var2 <= this.bz_fld) {
					throw new RuntimeException("");
				}

				if (var2 < this.br_fld) {
					this.br_fld = var2 * -1655378791;
				}
			}
		} else {
			if (var2 >= this.br_fld) {
				throw new RuntimeException("");
			}

			if (var2 > this.bz_fld) {
				this.bz_fld = var2;
			}
		}

		if (this.bm_fld != null) {
			el(this, var1, var2);
		} else {
			this.ah(null, ud.ak_fld.bm_fld, 255, 0, (byte)0, true);
			this.bd_fld[var2] = var1;
		}
	}

	@ObfuscatedName("el")
	@ObfuscatedSignature(
		descriptor = "(Luu;Luv;I)V"
	)
	public static void el(uu var0, uv var1, int var2) throws EOFException {
		if (var0 == null) {
			var0.getClass();
		}

		int var4 = 8 * var2 + 5;
		int var5 = 0;
		int var6 = 0;
		if (var4 <= var0.bm_fld.al_fld.length - 8) {
			var0.bm_fld.au_fld = var4;
			var5 = var0.bm_fld.co();
			var6 = var0.bm_fld.co();
		}

		if (var5 != 0 || 0 != var6) {
			var1.ah(var5, var6, 1980068694);
		} else if (var1.ar_fld) {
			var1.ae();
		} else {
			throw new RuntimeException("");
		}
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Luv;I)V"
	)
	void ao(uv var1, int var2) throws EOFException {
		if (var1.ar_fld) {
			if (!var1.as_fld) {
				if (var2 <= this.bz_fld) {
					throw new RuntimeException("");
				}

				if (var2 < this.br_fld) {
					this.br_fld = var2 * 263368019;
				}
			}
		} else {
			if (var2 >= this.br_fld) {
				throw new RuntimeException("");
			}

			if (var2 > this.bz_fld) {
				this.bz_fld = var2;
			}
		}

		if (this.bm_fld != null) {
			el(this, var1, var2);
		} else {
			this.ah(null, ud.ak_fld.bm_fld * 1304960830, 1236753583, 0, (byte)0, true);
			this.bd_fld[var2] = var1;
		}
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Luv;I)V"
	)
	void ab(uv var1, int var2) throws EOFException {
		int var3 = 8 * var2 + 5;
		int var4 = 0;
		int var5 = 0;
		if (var3 <= this.bm_fld.al_fld.length - 8) {
			this.bm_fld.au_fld = var3;
			var4 = this.bm_fld.co();
			var5 = this.bm_fld.co();
		}

		if (var4 != 0 || 0 != var5) {
			var1.ah(var4, var5, 1905278844);
		} else if (var1.ar_fld) {
			var1.ae();
		} else {
			throw new RuntimeException("");
		}
	}

	@ObfuscatedName("bk")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public void bk() {
		if (this.as_fld != null) {
			try {
				this.as_fld.ah((byte)27);
			} catch (Exception var2) {
			}

			this.as_fld = null;
		}
	}

	@ObfuscatedName("np")
	@ObfuscatedSignature(
		descriptor = "(Luu;II)V"
	)
	public static void np(uu var0, int var1, int var2) {
		if (var0 == null) {
			var0.getClass();
		}

		long var3 = var2 + (var1 << 16);
		ut var5 = (ut)var0.ai_fld.ak(var3);
		if (null != var5) {
			var0.aa_fld.ag(var5);
		}
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(II)V"
	)
	void aj(int var1, int var2) {
		long var3 = var2 + (var1 << 16);
		ut var5 = (ut)this.ai_fld.ak(var3);
		if (null != var5) {
			this.aa_fld.ag(var5);
		}
	}

	@ObfuscatedName("bd")
	@ObfuscatedSignature(
		descriptor = "(II)I"
	)
	int bd(int var1, int var2) {
		long var3 = var2 + (var1 << 16);
		return this.ab_fld != null && this.ab_fld.hc_fld == var3 ? 1 + this.at_fld.au_fld * -1111302165 / (this.at_fld.al_fld.length - this.ab_fld.az_fld) : 0;
	}

	@ObfuscatedName("dl")
	@ObfuscatedSignature(
		descriptor = "(Luu;)V"
	)
	public static void dl(uu var0) {
		if (var0 == null) {
			var0.getClass();
		} else {
			if (var0.as_fld != null) {
				try {
					var0.as_fld.ah((byte)12);
				} catch (Exception var2) {
				}

				var0.as_fld = null;
			}
		}
	}

	@ObfuscatedName("yo")
	@ObfuscatedSignature(
		descriptor = "(Luu;Z)V"
	)
	public static void yo(uu var0, boolean var1) {
		if (null != var0.as_fld) {
			try {
				xi var2 = new xi(4);
				var2.bc(var1 ? 2 : 3);
				var2.ba(0);
				var0.as_fld.ae(var2.al_fld, 0, 4, (byte)-105);
			} catch (IOException var5) {
				try {
					var0.as_fld.ah((byte)10);
				} catch (Exception var4) {
				}

				var0.ay_fld++;
				var0.as_fld = null;
			}
		}
	}

	@ObfuscatedName("fp")
	@ObfuscatedSignature(
		descriptor = "(Luv;IIIBZ)V"
	)
	public void fp(uv var1, int var2, int var3, int var4, byte var5, boolean var6) {
		this.ah(var1, var2, var3, var4, var5, var6);
	}

	@ObfuscatedName("bz")
	@ObfuscatedSignature(
		descriptor = "(II)I"
	)
	int bz(int var1, int var2) {
		long var3 = var2 + (var1 << 16);
		return this.ab_fld != null && this.ab_fld.hc_fld == var3 ? 1 + this.at_fld.au_fld * 1062529958 / (this.at_fld.al_fld.length - this.ab_fld.az_fld) : 0;
	}

	@ObfuscatedName("be")
	@ObfuscatedSignature(
		descriptor = "(ZZ)I"
	)
	public int be(boolean var1, boolean var2) {
		int var3 = 0;
		if (var1) {
			var3 += this.au_fld + this.an_fld;
		}

		if (var2) {
			var3 += this.ad_fld + this.aq_fld;
		}

		return var3;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Luv;IIIBZ)V"
	)
	void ah(uv var1, int var2, int var3, int var4, byte var5, boolean var6) {
		synchronized (this) {
			int var17 = 1041178105;
			long var18 = var3 + (var2 << 16);
			ut var20 = (ut)this.al_fld.ak(var18);
			if (null == var20) {
				var20 = (ut)this.ax_fld.ak(var18);
				if (null == var20) {
					var20 = (ut)this.ai_fld.ak(var18);
					if (null != var20) {
						if (var6) {
							var20.mq_void();
							this.al_fld.az(var20, var18);
							this.aq_fld--;
							this.au_fld++;
						}
					} else {
						if (!var6) {
							var20 = (ut)this.am_fld.ak(var18);
							if (null != var20) {
								return;
							}
						}

						var20 = new ut();
						var20.ak_fld = var1;
						var20.ag_fld = var4;
						var20.az_fld = var5;
						if (var6) {
							this.al_fld.az(var20, var18);
							this.au_fld++;
						} else {
							nu.xt(this.aa_fld, var20);
							this.ai_fld.az(var20, var18);
							this.aq_fld++;
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("ge")
	@ObfuscatedSignature(
		descriptor = "(Luu;Lua;Z)V"
	)
	public static void ge(uu var0, ua var1, boolean var2) {
		if (var0.as_fld != null) {
			try {
				var0.as_fld.ah((byte)71);
			} catch (Exception var7) {
			}

			var0.as_fld = null;
		}

		var0.as_fld = var1;
		var0.ag(var2);
		var0.ap_fld.au_fld = 0;
		var0.ab_fld = null;
		var0.at_fld = null;
		var0.ac_fld = 0;

		while (true) {
			ut var3 = (ut)var0.ax_fld.aq();
			if (var3 == null) {
				while (true) {
					var3 = (ut)var0.am_fld.aq();
					if (null == var3) {
						if (var0.be_fld != 0) {
							try {
								xi var9 = new xi(4);
								var9.bc(4);
								var9.bc(var0.be_fld);
								var9.bw(0);
								var0.as_fld.ae(var9.al_fld, 0, 4, (byte)-49);
							} catch (IOException var6) {
								try {
									var0.as_fld.ah((byte)29);
								} catch (Exception var5) {
								}

								var0.ay_fld++;
								var0.as_fld = null;
							}
						}

						var0.ar_fld = 0;
						var0.af_fld = lz.ak();
						return;
					}

					var0.aa_fld.ag(var3);
					var0.ai_fld.az(var3, var3.hc_fld);
					var0.aq_fld++;
					var0.ad_fld--;
				}
			}

			var0.al_fld.az(var3, var3.hc_fld);
			var0.au_fld++;
			var0.an_fld--;
		}
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Lua;Z)V"
	)
	public void aq(ua var1, boolean var2) {
		if (this.as_fld != null) {
			try {
				this.as_fld.ah((byte)5);
			} catch (Exception var7) {
			}

			this.as_fld = null;
		}

		this.as_fld = var1;
		this.ag(var2);
		this.ap_fld.au_fld = 0;
		this.ab_fld = null;
		this.at_fld = null;
		this.ac_fld = 0;

		while (true) {
			ut var3 = (ut)this.ax_fld.aq();
			if (var3 == null) {
				while (true) {
					var3 = (ut)this.am_fld.aq();
					if (null == var3) {
						if (this.be_fld != 0) {
							try {
								xi var9 = new xi(4);
								var9.bc(4);
								var9.bc(this.be_fld);
								var9.bw(0);
								this.as_fld.ae(var9.al_fld, 0, 4, (byte)-35);
							} catch (IOException var6) {
								try {
									this.as_fld.ah((byte)77);
								} catch (Exception var5) {
								}

								this.ay_fld++;
								this.as_fld = null;
							}
						}

						this.ar_fld = 0;
						this.af_fld = lz.ak();
						return;
					}

					this.aa_fld.ag(var3);
					this.ai_fld.az(var3, var3.hc_fld);
					this.aq_fld++;
					this.ad_fld--;
				}
			}

			this.al_fld.az(var3, var3.hc_fld);
			this.au_fld++;
			this.an_fld--;
		}
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Luv;II)V"
	)
	void av(uv var1, int var2, int var3) throws EOFException {
		int var4 = 8 * var2 + 5;
		int var5 = 0;
		int var6 = 0;
		if (var4 <= this.at_fld.al_fld.length - 8) {
			this.at_fld.au_fld = var4;
			var5 = this.bm_fld.co();
			var6 = this.ap_fld.ei();
		}

		if (var5 != 0 || 0 != var6) {
			var1.ah(var5, var6, 1980068694);
		} else if (var1.as_fld) {
			var1.ae();
		} else {
			throw new RuntimeException("");
		}
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(IIB)V"
	)
	void aw(int var1, int var2, byte var3) {
		synchronized (this) {
			byte var9 = 106;
			long var10 = var2 + (var1 << 16);
			ut var12 = (ut)this.al_fld.ah(var10);
			if (null != var12) {
				this.aa_fld.ak(var12);
			}
		}
	}
}
