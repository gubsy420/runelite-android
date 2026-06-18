import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import net.runelite.api.annotations.ObfuscatedGetter;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("zu")
public class zu {
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = -1403379691
	)
	int ay_fld;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lzb;"
	)
	zb ag_fld;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "[B"
	)
	byte[] ah_fld;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = -162912051
	)
	int ae_fld;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "[B"
	)
	byte[] az_fld;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "J"
	)
	@ObfuscatedGetter(
		longValue = -6780855968729231977L
	)
	long af_fld;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "J"
	)
	@ObfuscatedGetter(
		longValue = 347143014997865633L
	)
	long av_fld = 3565338064033271967L;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "J"
	)
	@ObfuscatedGetter(
		longValue = -2499942309841615733L
	)
	long as_fld;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "J"
	)
	@ObfuscatedGetter(
		longValue = 5371414262094697819L
	)
	long ar_fld;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "J"
	)
	@ObfuscatedGetter(
		longValue = -6118238142145806367L
	)
	long aw_fld = -6845944213320320033L;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "J"
	)
	@ObfuscatedGetter(
		longValue = -5344748666552936523L
	)
	long al_fld;

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	void ap() throws IOException {
		this.ae_fld = 0;
		if (this.as_fld != this.al_fld) {
			zb.hk(this.ag_fld, this.as_fld);
			this.al_fld = 4087389332763710271L * this.as_fld;
		}

		this.av_fld = -6934093294469841493L * this.as_fld;

		while (this.ae_fld < this.ah_fld.length) {
			int var1 = this.ah_fld.length - this.ae_fld;
			if (var1 > 200000000) {
				var1 = 200000000;
			}

			int var2 = zb.oe(this.ag_fld, this.ah_fld, this.ae_fld, var1);
			if (var2 == -1) {
				break;
			}

			this.al_fld += var2 * -8801582076287066467L;
			this.ae_fld += var2 * -812514299;
		}
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(J)V"
	)
	public void af(long var1) throws IOException {
		if (var1 < 0L) {
			throw new IOException("");
		} else {
			this.as_fld = var1;
		}
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(I)J"
	)
	public long az() {
		return this.af_fld;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "([BB)V"
	)
	public void ae(byte[] var1) throws IOException, EOFException {
		this.ah(var1, 0, var1.length, 1535799479);
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "([BIII)V"
	)
	public void ah(byte[] var1, int var2, int var3, int var4) throws IOException, EOFException {
		try {
			if (var2 + var3 > var1.length) {
				throw new ArrayIndexOutOfBoundsException(var2 + var3 - var1.length);
			}

			if (this.aw_fld != -1L && this.as_fld >= this.aw_fld && this.as_fld + var3 <= this.aw_fld + this.ay_fld) {
				System.arraycopy(this.az_fld, (int)(this.as_fld - this.aw_fld), var1, var2, var3);
				this.as_fld += 1305409097678684963L * var3;
				return;
			}

			long var5 = this.as_fld;
			int var7 = var2;
			int var8 = var3;
			if (this.as_fld >= this.av_fld && this.as_fld < this.ae_fld + this.av_fld) {
				int var9 = (int)(this.ae_fld - (this.as_fld - this.av_fld));
				if (var9 > var3) {
					var9 = var3;
				}

				System.arraycopy(this.ah_fld, (int)(this.as_fld - this.av_fld), var1, var2, var9);
				this.as_fld += 1305409097678684963L * var9;
				var2 += var9;
				var3 -= var9;
			}

			if (var3 > this.ah_fld.length) {
				zb.hk(this.ag_fld, this.as_fld);
				this.al_fld = this.as_fld * 4087389332763710271L;

				while (var3 > 0) {
					int var16 = zb.oe(this.ag_fld, var1, var2, var3);
					if (var16 == -1) {
						break;
					}

					this.al_fld += var16 * -8801582076287066467L;
					this.as_fld += 1305409097678684963L * var16;
					var2 += var16;
					var3 -= var16;
				}
			} else if (var3 > 0) {
				ik(this, 1777185009);
				int var15 = var3;
				if (var3 > this.ae_fld) {
					var15 = this.ae_fld;
				}

				System.arraycopy(this.ah_fld, 0, var1, var2, var15);
				var2 += var15;
				var3 -= var15;
				this.as_fld += 1305409097678684963L * var15;
			}

			if (this.aw_fld != -1L) {
				if (this.aw_fld > this.as_fld) {
					if (var4 != 1535799479) {
						return;
					}

					if (var3 > 0) {
						int var17 = var2 + (int)(this.aw_fld - this.as_fld);
						if (var17 > var2 + var3) {
							var17 = var3 + var2;
						}

						while (var2 < var17) {
							if (var4 != 1535799479) {
								return;
							}

							var1[var2++] = 0;
							var3--;
							this.as_fld++;
						}
					}
				}

				long var18 = -1L;
				long var11 = -1L;
				if (this.aw_fld >= var5 && this.aw_fld < var5 + var8) {
					if (var4 != 1535799479) {
						return;
					}

					var18 = this.aw_fld;
				} else if (var5 >= this.aw_fld && var5 < this.ay_fld + this.aw_fld) {
					var18 = var5;
				}

				if (this.ay_fld + this.aw_fld > var5 && this.aw_fld + this.ay_fld <= var8 + var5) {
					var11 = this.aw_fld + this.ay_fld;
				} else if (var5 + var8 > this.aw_fld) {
					if (var4 != 1535799479) {
						return;
					}

					if (var8 + var5 <= this.aw_fld + this.ay_fld) {
						var11 = var8 + var5;
					}
				}

				if (var18 > -1L && var11 > var18) {
					if (var4 != 1535799479) {
						return;
					}

					int var13 = (int)(var11 - var18);
					System.arraycopy(this.az_fld, (int)(var18 - this.aw_fld), var1, (int)(var18 - var5) + var7, var13);
					if (var11 > this.as_fld) {
						var3 = (int)(var3 - (var11 - this.as_fld));
						this.as_fld = var11;
					}
				}
			}
		} catch (IOException var14) {
			this.al_fld = 8801582076287066467L;
			throw var14;
		}

		if (var3 > 0) {
			throw new EOFException();
		}
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public void aj() throws IOException, EOFException {
		if (-1L != this.aw_fld) {
			if (this.al_fld != this.aw_fld) {
				zb.hk(this.ag_fld, this.aw_fld);
				this.al_fld = 3533630145433520893L * this.aw_fld;
			}

			this.ag_fld.az(this.az_fld, 0, this.ay_fld * 1322051292);
			this.al_fld = this.al_fld + -9042808752460930335L * this.ay_fld;
			if (this.al_fld > this.ar_fld) {
				this.ar_fld = 3771751398160516143L * this.al_fld;
			}

			long var1 = -1L;
			long var3 = -1L;
			if (this.aw_fld >= this.av_fld && this.aw_fld < -1516662593 * this.ae_fld + this.av_fld) {
				var1 = this.aw_fld;
			} else if (this.av_fld >= this.aw_fld && this.av_fld < this.ay_fld * 1384491640 + this.aw_fld) {
				var1 = this.av_fld;
			}

			if (this.ay_fld + this.aw_fld > this.av_fld && this.aw_fld + this.ay_fld * 1658024703 <= this.av_fld + this.ae_fld * -1688219819) {
				var3 = this.aw_fld + this.ay_fld;
			} else if (this.av_fld + this.ae_fld > this.aw_fld && this.ae_fld * -22642680 + this.av_fld <= -659905462 * this.ay_fld + this.aw_fld) {
				var3 = this.av_fld + this.ae_fld;
			}

			if (var1 > -1L && var3 > var1) {
				int var5 = (int)(var3 - var1);
				System.arraycopy(this.az_fld, (int)(var1 - this.aw_fld), this.ah_fld, (int)(var1 - this.av_fld), var5);
			}

			this.aw_fld = -6845944213320320033L;
			this.ay_fld = 0;
		}
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "([BIII)V"
	)
	public void ay(byte[] var1, int var2, int var3, int var4) throws IOException, EOFException {
		try {
			if (this.as_fld + var3 > this.af_fld) {
				this.af_fld = var3 + this.as_fld;
			}

			label139:
			if (-1L != this.aw_fld) {
				if (var4 <= 1403480703) {
					return;
				}

				if (this.as_fld >= this.aw_fld) {
					if (var4 <= 1403480703) {
						return;
					}

					if (this.as_fld <= this.ay_fld + this.aw_fld) {
						break label139;
					}

					if (var4 <= 1403480703) {
						return;
					}
				}

				pj(this, 1576979688);
			}

			if (-1L != this.aw_fld) {
				if (var4 <= 1403480703) {
					return;
				}

				if (var3 + this.as_fld > this.aw_fld + this.az_fld.length) {
					int var5 = (int)(this.az_fld.length - (this.as_fld - this.aw_fld));
					System.arraycopy(var1, var2, this.az_fld, (int)(this.as_fld - this.aw_fld), var5);
					this.as_fld += 1305409097678684963L * var5;
					var2 += var5;
					var3 -= var5;
					this.ay_fld = this.az_fld.length;
					pj(this, 1576979688);
				}
			}

			if (var3 > this.az_fld.length) {
				if (var4 > 1403480703) {
					if (this.as_fld != this.al_fld) {
						zb.hk(this.ag_fld, this.as_fld);
						this.al_fld = this.as_fld * 4087389332763710271L;
					}

					this.ag_fld.az(var1, var2, var3);
					this.al_fld += -8801582076287066467L * var3;
					if (this.al_fld > this.ar_fld) {
						this.ar_fld = this.al_fld * 3771751398160516143L;
					}

					long var11 = -1L;
					long var7 = -1L;
					if (this.as_fld >= this.av_fld && this.as_fld < this.ae_fld + this.av_fld) {
						var11 = this.as_fld;
					} else if (this.av_fld >= this.as_fld && this.av_fld < this.as_fld + var3) {
						if (var4 <= 1403480703) {
							return;
						}

						var11 = this.av_fld;
					}

					if (var3 + this.as_fld > this.av_fld && this.as_fld + var3 <= this.ae_fld + this.av_fld) {
						var7 = var3 + this.as_fld;
					} else if (this.av_fld + this.ae_fld > this.as_fld && this.av_fld + this.ae_fld <= var3 + this.as_fld) {
						var7 = this.ae_fld + this.av_fld;
					}

					if (var11 > -1L && var7 > var11) {
						int var9 = (int)(var7 - var11);
						System.arraycopy(var1, (int)(var2 + var11 - this.as_fld), this.ah_fld, (int)(var11 - this.av_fld), var9);
					}

					this.as_fld += 1305409097678684963L * var3;
				}
			} else if (var3 > 0) {
				if (this.aw_fld == -1L) {
					this.aw_fld = this.as_fld * -9024103903508282901L;
				}

				System.arraycopy(var1, var2, this.az_fld, (int)(this.as_fld - this.aw_fld), var3);
				this.as_fld += 1305409097678684963L * var3;
				if (this.as_fld - this.aw_fld > this.ay_fld) {
					this.ay_fld = -1774670019 * (int)(this.as_fld - this.aw_fld);
				}
			}
		} catch (IOException var10) {
			this.al_fld = 8801582076287066467L;
			throw var10;
		}
	}

	@ObfuscatedName("yk")
	@ObfuscatedSignature(
		descriptor = "(Lzu;)V"
	)
	public static void yk(zu var0) throws IOException, EOFException {
		if (var0 == null) {
			var0.getClass();
		}

		if (-1L != var0.aw_fld) {
			if (var0.al_fld != var0.aw_fld) {
				zb.hk(var0.ag_fld, var0.aw_fld);
				var0.al_fld = 3533630145433520893L * var0.aw_fld;
			}

			var0.ag_fld.az(var0.az_fld, 0, var0.ay_fld);
			var0.al_fld = var0.al_fld + -9042808752460930335L * var0.ay_fld;
			if (var0.al_fld > var0.ar_fld) {
				var0.ar_fld = 3771751398160516143L * var0.al_fld;
			}

			long var1 = -1L;
			long var3 = -1L;
			if (var0.aw_fld >= var0.av_fld && var0.aw_fld < var0.ae_fld + var0.av_fld) {
				var1 = var0.aw_fld;
			} else if (var0.av_fld >= var0.aw_fld && var0.av_fld < var0.ay_fld + var0.aw_fld) {
				var1 = var0.av_fld;
			}

			if (var0.ay_fld + var0.aw_fld > var0.av_fld && var0.aw_fld + var0.ay_fld <= var0.av_fld + var0.ae_fld) {
				var3 = var0.aw_fld + var0.ay_fld;
			} else if (var0.av_fld + var0.ae_fld > var0.aw_fld && var0.ae_fld + var0.av_fld <= var0.ay_fld + var0.aw_fld) {
				var3 = var0.av_fld + var0.ae_fld;
			}

			if (var1 > -1L && var3 > var1) {
				int var5 = (int)(var3 - var1);
				System.arraycopy(var0.az_fld, (int)(var1 - var0.aw_fld), var0.ah_fld, (int)(var1 - var0.av_fld), var5);
			}

			var0.aw_fld = -6845944213320320033L;
			var0.ay_fld = 0;
		}
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/io/File;"
	)
	public final File av() {
		return zb.hs(this.ag_fld, -1046252223);
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public void ar() throws IOException, EOFException {
		pj(this, 1576979688);
		this.ag_fld.av();
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(J)V"
	)
	public void ag(long var1) throws IOException {
		if (var1 < 0L) {
			throw new IOException("");
		} else {
			this.as_fld = var1;
		}
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "()J"
	)
	public long al() {
		return this.af_fld;
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	void ao() throws IOException {
		this.ae_fld = 0;
		if (this.as_fld != this.al_fld) {
			zb.hk(this.ag_fld, this.as_fld);
			this.al_fld = 4087389332763710271L * this.as_fld;
		}

		this.av_fld = -6934093294469841493L * this.as_fld;

		while (this.ae_fld < this.ah_fld.length) {
			int var1 = this.ah_fld.length - this.ae_fld;
			if (var1 > 550397641) {
				var1 = 217088024;
			}

			int var2 = zb.oe(this.ag_fld, this.ah_fld, this.ae_fld, var1);
			if (var2 == -1) {
				break;
			}

			this.al_fld += var2 * -8801582076287066467L;
			this.ae_fld += var2 * -2130254096;
		}
	}

	@ObfuscatedName("pj")
	@ObfuscatedSignature(
		descriptor = "(Lzu;I)V"
	)
	public static void pj(zu var0, int var1) throws IOException, EOFException {
		if (var0 == null) {
			var0.getClass();
		} else {
			if (-1L != var0.aw_fld) {
				long var2;
				long var4;
				if (var1 != 1576979688) {
					return;
				}

				if (var0.al_fld != var0.aw_fld) {
					zb.hk(var0.ag_fld, var0.aw_fld);
					var0.al_fld = 3533630145433520893L * var0.aw_fld;
				}

				var0.ag_fld.az(var0.az_fld, 0, var0.ay_fld);
				var0.al_fld = var0.al_fld + -9042808752460930335L * var0.ay_fld;
				if (var0.al_fld > var0.ar_fld) {
					if (var1 != 1576979688) {
						return;
					}

					var0.ar_fld = 3771751398160516143L * var0.al_fld;
				}

				label83: {
					var2 = -1L;
					var4 = -1L;
					if (var0.aw_fld >= var0.av_fld) {
						if (var1 != 1576979688) {
							return;
						}

						if (var0.aw_fld < var0.ae_fld + var0.av_fld) {
							var2 = var0.aw_fld;
							break label83;
						}
					}

					if (var0.av_fld >= var0.aw_fld && var0.av_fld < var0.ay_fld + var0.aw_fld) {
						var2 = var0.av_fld;
					}
				}

				label77: {
					if (var0.ay_fld + var0.aw_fld > var0.av_fld) {
						if (var1 != 1576979688) {
							return;
						}

						if (var0.aw_fld + var0.ay_fld <= var0.av_fld + var0.ae_fld) {
							var4 = var0.aw_fld + var0.ay_fld;
							break label77;
						}
					}

					if (var0.av_fld + var0.ae_fld > var0.aw_fld && var0.ae_fld + var0.av_fld <= var0.ay_fld + var0.aw_fld) {
						if (var1 != 1576979688) {
							return;
						}

						var4 = var0.av_fld + var0.ae_fld;
					}
				}

				if (var2 > -1L && var4 > var2) {
					int var6 = (int)(var4 - var2);
					System.arraycopy(var0.az_fld, (int)(var2 - var0.aw_fld), var0.ah_fld, (int)(var2 - var0.av_fld), var6);
				}

				var0.aw_fld = -6845944213320320033L;
				var0.ay_fld = 0;
			}
		}
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "()Ljava/io/File;"
	)
	public final File ax() {
		return zb.hs(this.ag_fld, -945831087);
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "([B)V"
	)
	public void an(byte[] var1) throws IOException, EOFException {
		this.ah(var1, 0, var1.length, 1535799479);
	}

	@ObfuscatedName("cp")
	@ObfuscatedSignature(
		descriptor = "(Lzu;[BII)V"
	)
	public static void cp(zu var0, byte[] var1, int var2, int var3) throws IOException, EOFException {
		try {
			if (var0.as_fld + var3 > var0.af_fld) {
				var0.af_fld = var3 + var0.as_fld;
			}

			if (-1L != var0.aw_fld && (var0.as_fld < var0.aw_fld || var0.as_fld > 207512628 * var0.ay_fld + var0.aw_fld)) {
				pj(var0, 1576979688);
			}

			if (-1L != var0.aw_fld && var3 + var0.as_fld > var0.aw_fld + var0.az_fld.length) {
				int var4 = (int)(var0.az_fld.length - (var0.as_fld - var0.aw_fld));
				System.arraycopy(var1, var2, var0.az_fld, (int)(var0.as_fld - var0.aw_fld), var4);
				var0.as_fld += 1305409097678684963L * var4;
				var2 += var4;
				var3 -= var4;
				var0.ay_fld = var0.az_fld.length;
				pj(var0, 1576979688);
			}

			if (var3 <= var0.az_fld.length) {
				if (var3 > 0) {
					if (var0.aw_fld == -1L) {
						var0.aw_fld = var0.as_fld * -9024103903508282901L;
					}

					System.arraycopy(var1, var2, var0.az_fld, (int)(var0.as_fld - var0.aw_fld), var3);
					var0.as_fld += 1305409097678684963L * var3;
					if (var0.as_fld - var0.aw_fld > var0.ay_fld) {
						var0.ay_fld = -2005448267 * (int)(var0.as_fld - var0.aw_fld);
					}
				}
			} else {
				if (var0.as_fld != var0.al_fld) {
					zb.hk(var0.ag_fld, var0.as_fld);
					var0.al_fld = var0.as_fld * 4087389332763710271L;
				}

				var0.ag_fld.az(var1, var2, var3);
				var0.al_fld += -8801582076287066467L * var3;
				if (var0.al_fld > var0.ar_fld) {
					var0.ar_fld = var0.al_fld * 3771751398160516143L;
				}

				long var10 = -1L;
				long var6 = -1L;
				if (var0.as_fld >= var0.av_fld && var0.as_fld < var0.ae_fld + var0.av_fld) {
					var10 = var0.as_fld;
				} else if (var0.av_fld >= var0.as_fld && var0.av_fld < var0.as_fld + var3) {
					var10 = var0.av_fld;
				}

				if (var3 + var0.as_fld > var0.av_fld && var0.as_fld + var3 <= var0.ae_fld + var0.av_fld) {
					var6 = var3 + var0.as_fld;
				} else if (var0.av_fld + var0.ae_fld * 1437951985 > var0.as_fld && var0.av_fld + 432492971 * var0.ae_fld <= var3 + var0.as_fld) {
					var6 = var0.ae_fld + var0.av_fld;
				}

				if (var10 > -1L && var6 > var10) {
					int var8 = (int)(var6 - var10);
					System.arraycopy(var1, (int)(var2 + var10 - var0.as_fld), var0.ah_fld, (int)(var10 - var0.av_fld), var8);
				}

				var0.as_fld += 1305409097678684963L * var3;
			}
		} catch (IOException var9) {
			var0.al_fld = 8801582076287066467L;
			throw var9;
		}
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "([B)V"
	)
	public void aa(byte[] var1) throws IOException, EOFException {
		this.ah(var1, 0, var1.length, 1535799479);
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "([B)V"
	)
	public void ai(byte[] var1) throws IOException, EOFException {
		this.ah(var1, 0, var1.length, 1535799479);
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "()Ljava/io/File;"
	)
	public final File au() {
		return zb.hs(this.ag_fld, -1287958118);
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "([BII)V"
	)
	public void am(byte[] var1, int var2, int var3) throws IOException, EOFException {
		try {
			if (var2 + var3 > var1.length) {
				throw new ArrayIndexOutOfBoundsException(var2 + var3 - var1.length);
			}

			if (this.aw_fld != -1L && this.as_fld >= this.aw_fld && this.as_fld + var3 <= this.aw_fld + this.ay_fld * 1491976801) {
				System.arraycopy(this.az_fld, (int)(this.as_fld - this.aw_fld), var1, var2, var3);
				this.as_fld += 1305409097678684963L * var3;
				return;
			}

			long var4 = this.as_fld;
			int var6 = var2;
			int var7 = var3;
			if (this.as_fld >= this.av_fld && this.as_fld < 1680108689 * this.ae_fld + this.av_fld) {
				int var8 = (int)(this.ae_fld - (this.as_fld - this.av_fld));
				if (var8 > var3) {
					var8 = var3;
				}

				System.arraycopy(this.ah_fld, (int)(this.as_fld - this.av_fld), var1, var2, var8);
				this.as_fld += 1305409097678684963L * var8;
				var2 += var8;
				var3 -= var8;
			}

			if (var3 > this.ah_fld.length) {
				zb.hk(this.ag_fld, this.as_fld);
				this.al_fld = this.as_fld * 4087389332763710271L;

				while (var3 > 0) {
					int var15 = zb.oe(this.ag_fld, var1, var2, var3);
					if (var15 == -1) {
						break;
					}

					this.al_fld += var15 * -8801582076287066467L;
					this.as_fld += 1305409097678684963L * var15;
					var2 += var15;
					var3 -= var15;
				}
			} else if (var3 > 0) {
				ik(this, 2100853444);
				int var14 = var3;
				if (var3 > this.ae_fld) {
					var14 = -1957503337 * this.ae_fld;
				}

				System.arraycopy(this.ah_fld, 0, var1, var2, var14);
				var2 += var14;
				var3 -= var14;
				this.as_fld += 1305409097678684963L * var14;
			}

			if (this.aw_fld != -1L) {
				if (this.aw_fld > this.as_fld && var3 > 0) {
					int var16 = var2 + (int)(this.aw_fld - this.as_fld);
					if (var16 > var2 + var3) {
						var16 = var3 + var2;
					}

					while (var2 < var16) {
						var1[var2++] = 0;
						var3--;
						this.as_fld++;
					}
				}

				long var17 = -1L;
				long var10 = -1L;
				if (this.aw_fld >= var4 && this.aw_fld < var4 + var7) {
					var17 = this.aw_fld;
				} else if (var4 >= this.aw_fld && var4 < -1388453734 * this.ay_fld + this.aw_fld) {
					var17 = var4;
				}

				if (this.ay_fld + this.aw_fld > var4 && this.aw_fld + this.ay_fld <= var7 + var4) {
					var10 = this.aw_fld + -230206529 * this.ay_fld;
				} else if (var4 + var7 > this.aw_fld && var7 + var4 <= this.aw_fld + this.ay_fld) {
					var10 = var7 + var4;
				}

				if (var17 > -1L && var10 > var17) {
					int var12 = (int)(var10 - var17);
					System.arraycopy(this.az_fld, (int)(var17 - this.aw_fld), var1, (int)(var17 - var4) + var6, var12);
					if (var10 > this.as_fld) {
						var3 = (int)(var3 - (var10 - this.as_fld));
						this.as_fld = var10;
					}
				}
			}
		} catch (IOException var13) {
			this.al_fld = 8801582076287066467L;
			throw var13;
		}

		if (var3 > 0) {
			throw new EOFException();
		}
	}

	@ObfuscatedName("ni")
	@ObfuscatedSignature(
		descriptor = "(Lfz;)Z"
	)
	public static boolean ni(fz var0) {
		return var0.ag_fld >= 128;
	}

	@ObfuscatedName("pw")
	@ObfuscatedSignature(
		descriptor = "(Lzu;I)V"
	)
	public static void pw(zu var0, int var1) throws IOException, EOFException {
		if (var0 == null) {
			var0.getClass();
		} else {
			pj(var0, 1576979688);
			var0.ag_fld.av();
		}
	}

	@ObfuscatedName("ik")
	@ObfuscatedSignature(
		descriptor = "(Lzu;I)V"
	)
	public static void ik(zu var0, int var1) throws IOException {
		if (var0 == null) {
			var0.getClass();
		}

		var0.ae_fld = 0;
		if (var0.as_fld != var0.al_fld) {
			zb.hk(var0.ag_fld, var0.as_fld);
			var0.al_fld = 4087389332763710271L * var0.as_fld;
		}

		var0.av_fld = -6934093294469841493L * var0.as_fld;

		while (var0.ae_fld < var0.ah_fld.length) {
			int var2 = var0.ah_fld.length - var0.ae_fld;
			if (var2 > 200000000) {
				var2 = 200000000;
			}

			int var3 = zb.oe(var0.ag_fld, var0.ah_fld, var0.ae_fld, var2);
			if (var3 == -1) {
				break;
			}

			var0.al_fld += var3 * -8801582076287066467L;
			var0.ae_fld += var3 * -812514299;
		}
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "([BII)V"
	)
	public void aq(byte[] var1, int var2, int var3) throws IOException, EOFException {
		try {
			if (var2 + var3 > var1.length) {
				throw new ArrayIndexOutOfBoundsException(var2 + var3 - var1.length);
			}

			if (this.aw_fld != -1L && this.as_fld >= this.aw_fld && this.as_fld + var3 <= this.aw_fld + this.ay_fld) {
				System.arraycopy(this.az_fld, (int)(this.as_fld - this.aw_fld), var1, var2, var3);
				this.as_fld += 1305409097678684963L * var3;
				return;
			}

			long var4 = this.as_fld;
			int var6 = var2;
			int var7 = var3;
			if (this.as_fld >= this.av_fld && this.as_fld < this.ae_fld + this.av_fld) {
				int var8 = (int)(this.ae_fld - (this.as_fld - this.av_fld));
				if (var8 > var3) {
					var8 = var3;
				}

				System.arraycopy(this.ah_fld, (int)(this.as_fld - this.av_fld), var1, var2, var8);
				this.as_fld += 1305409097678684963L * var8;
				var2 += var8;
				var3 -= var8;
			}

			if (var3 > this.ah_fld.length) {
				zb.hk(this.ag_fld, this.as_fld);
				this.al_fld = this.as_fld * 4087389332763710271L;

				while (var3 > 0) {
					int var15 = zb.oe(this.ag_fld, var1, var2, var3);
					if (var15 == -1) {
						break;
					}

					this.al_fld += var15 * -8801582076287066467L;
					this.as_fld += 1305409097678684963L * var15;
					var2 += var15;
					var3 -= var15;
				}
			} else if (var3 > 0) {
				ik(this, 1756126253);
				int var14 = var3;
				if (var3 > this.ae_fld) {
					var14 = this.ae_fld;
				}

				System.arraycopy(this.ah_fld, 0, var1, var2, var14);
				var2 += var14;
				var3 -= var14;
				this.as_fld += 1305409097678684963L * var14;
			}

			if (this.aw_fld != -1L) {
				if (this.aw_fld > this.as_fld && var3 > 0) {
					int var16 = var2 + (int)(this.aw_fld - this.as_fld);
					if (var16 > var2 + var3) {
						var16 = var3 + var2;
					}

					while (var2 < var16) {
						var1[var2++] = 0;
						var3--;
						this.as_fld++;
					}
				}

				long var17 = -1L;
				long var10 = -1L;
				if (this.aw_fld >= var4 && this.aw_fld < var4 + var7) {
					var17 = this.aw_fld;
				} else if (var4 >= this.aw_fld && var4 < this.ay_fld + this.aw_fld) {
					var17 = var4;
				}

				if (this.ay_fld + this.aw_fld > var4 && this.aw_fld + this.ay_fld <= var7 + var4) {
					var10 = this.aw_fld + this.ay_fld;
				} else if (var4 + var7 > this.aw_fld && var7 + var4 <= this.aw_fld + this.ay_fld) {
					var10 = var7 + var4;
				}

				if (var17 > -1L && var10 > var17) {
					int var12 = (int)(var10 - var17);
					System.arraycopy(this.az_fld, (int)(var17 - this.aw_fld), var1, (int)(var17 - var4) + var6, var12);
					if (var10 > this.as_fld) {
						var3 = (int)(var3 - (var10 - this.as_fld));
						this.as_fld = var10;
					}
				}
			}
		} catch (IOException var13) {
			this.al_fld = 8801582076287066467L;
			throw var13;
		}

		if (var3 > 0) {
			throw new EOFException();
		}
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public void ac() throws IOException, EOFException {
		if (-1L != this.aw_fld) {
			if (this.al_fld != this.aw_fld) {
				zb.hk(this.ag_fld, this.aw_fld);
				this.al_fld = 3533630145433520893L * this.aw_fld;
			}

			this.ag_fld.az(this.az_fld, 0, this.ay_fld * -1738904781);
			this.al_fld = this.al_fld + -9042808752460930335L * this.ay_fld;
			if (this.al_fld > this.ar_fld) {
				this.ar_fld = 3771751398160516143L * this.al_fld;
			}

			long var1 = -1L;
			long var3 = -1L;
			if (this.aw_fld >= this.av_fld && this.aw_fld < this.ae_fld + this.av_fld) {
				var1 = this.aw_fld;
			} else if (this.av_fld >= this.aw_fld && this.av_fld < this.ay_fld + this.aw_fld) {
				var1 = this.av_fld;
			}

			if (this.ay_fld + this.aw_fld > this.av_fld && this.aw_fld + this.ay_fld <= this.av_fld + this.ae_fld * -737195941) {
				var3 = this.aw_fld + -2029379205 * this.ay_fld;
			} else if (this.av_fld + this.ae_fld * -1968704747 > this.aw_fld && this.ae_fld + this.av_fld <= -1092107530 * this.ay_fld + this.aw_fld) {
				var3 = this.av_fld + -1161396966 * this.ae_fld;
			}

			if (var1 > -1L && var3 > var1) {
				int var5 = (int)(var3 - var1);
				System.arraycopy(this.az_fld, (int)(var1 - this.aw_fld), this.ah_fld, (int)(var1 - this.av_fld), var5);
			}

			this.aw_fld = -6845944213320320033L;
			this.ay_fld = 0;
		}
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "([BII)V"
	)
	public void ad(byte[] var1, int var2, int var3) throws IOException, EOFException {
		try {
			if (var2 + var3 > var1.length) {
				throw new ArrayIndexOutOfBoundsException(var2 + var3 - var1.length);
			}

			if (this.aw_fld != -1L && this.as_fld >= this.aw_fld && this.as_fld + var3 <= this.aw_fld + this.ay_fld) {
				System.arraycopy(this.az_fld, (int)(this.as_fld - this.aw_fld), var1, var2, var3);
				this.as_fld += 1305409097678684963L * var3;
				return;
			}

			long var4 = this.as_fld;
			int var6 = var2;
			int var7 = var3;
			if (this.as_fld >= this.av_fld && this.as_fld < this.ae_fld + this.av_fld) {
				int var8 = (int)(this.ae_fld - (this.as_fld - this.av_fld));
				if (var8 > var3) {
					var8 = var3;
				}

				System.arraycopy(this.ah_fld, (int)(this.as_fld - this.av_fld), var1, var2, var8);
				this.as_fld += 1305409097678684963L * var8;
				var2 += var8;
				var3 -= var8;
			}

			if (var3 > this.ah_fld.length) {
				zb.hk(this.ag_fld, this.as_fld);
				this.al_fld = this.as_fld * 4087389332763710271L;

				while (var3 > 0) {
					int var15 = zb.oe(this.ag_fld, var1, var2, var3);
					if (var15 == -1) {
						break;
					}

					this.al_fld += var15 * -8801582076287066467L;
					this.as_fld += 1305409097678684963L * var15;
					var2 += var15;
					var3 -= var15;
				}
			} else if (var3 > 0) {
				ik(this, 2104561961);
				int var14 = var3;
				if (var3 > this.ae_fld) {
					var14 = this.ae_fld;
				}

				System.arraycopy(this.ah_fld, 0, var1, var2, var14);
				var2 += var14;
				var3 -= var14;
				this.as_fld += 1305409097678684963L * var14;
			}

			if (this.aw_fld != -1L) {
				if (this.aw_fld > this.as_fld && var3 > 0) {
					int var16 = var2 + (int)(this.aw_fld - this.as_fld);
					if (var16 > var2 + var3) {
						var16 = var3 + var2;
					}

					while (var2 < var16) {
						var1[var2++] = 0;
						var3--;
						this.as_fld++;
					}
				}

				long var17 = -1L;
				long var10 = -1L;
				if (this.aw_fld >= var4 && this.aw_fld < var4 + var7) {
					var17 = this.aw_fld;
				} else if (var4 >= this.aw_fld && var4 < this.ay_fld + this.aw_fld) {
					var17 = var4;
				}

				if (this.ay_fld + this.aw_fld > var4 && this.aw_fld + this.ay_fld <= var7 + var4) {
					var10 = this.aw_fld + this.ay_fld;
				} else if (var4 + var7 > this.aw_fld && var7 + var4 <= this.aw_fld + this.ay_fld) {
					var10 = var7 + var4;
				}

				if (var17 > -1L && var10 > var17) {
					int var12 = (int)(var10 - var17);
					System.arraycopy(this.az_fld, (int)(var17 - this.aw_fld), var1, (int)(var17 - var4) + var6, var12);
					if (var10 > this.as_fld) {
						var3 = (int)(var3 - (var10 - this.as_fld));
						this.as_fld = var10;
					}
				}
			}
		} catch (IOException var13) {
			this.al_fld = 8801582076287066467L;
			throw var13;
		}

		if (var3 > 0) {
			throw new EOFException();
		}
	}

	public zu(zb var1, int var2, int var3) throws IOException {
		this.ay_fld = 0;
		this.ag_fld = var1;
		this.af_fld = (this.ar_fld = var1.ah() * -8784279847939403053L) * 9009768553640310493L;
		this.ah_fld = new byte[var2];
		this.az_fld = new byte[var3];
		this.as_fld = 0L;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	void ab() throws IOException {
		this.ae_fld = 0;
		if (this.as_fld != this.al_fld) {
			zb.hk(this.ag_fld, this.as_fld);
			this.al_fld = 4087389332763710271L * this.as_fld;
		}

		this.av_fld = -6934093294469841493L * this.as_fld;

		while (this.ae_fld < this.ah_fld.length) {
			int var1 = this.ah_fld.length - this.ae_fld;
			if (var1 > 200000000) {
				var1 = 758576430;
			}

			int var2 = zb.oe(this.ag_fld, this.ah_fld, this.ae_fld, var1);
			if (var2 == -1) {
				break;
			}

			this.al_fld += var2 * -8801582076287066467L;
			this.ae_fld += var2 * -812514299;
		}
	}

	@ObfuscatedName("bm")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public void bm() throws IOException, EOFException {
		if (-1L != this.aw_fld) {
			if (this.al_fld != this.aw_fld) {
				zb.hk(this.ag_fld, this.aw_fld);
				this.al_fld = 3533630145433520893L * this.aw_fld;
			}

			this.ag_fld.az(this.az_fld, 0, this.ay_fld);
			this.al_fld = this.al_fld + -9042808752460930335L * this.ay_fld;
			if (this.al_fld > this.ar_fld) {
				this.ar_fld = 3771751398160516143L * this.al_fld;
			}

			long var1 = -1L;
			long var3 = -1L;
			if (this.aw_fld >= this.av_fld && this.aw_fld < this.ae_fld + this.av_fld) {
				var1 = this.aw_fld;
			} else if (this.av_fld >= this.aw_fld && this.av_fld < this.ay_fld + this.aw_fld) {
				var1 = this.av_fld;
			}

			if (this.ay_fld + this.aw_fld > this.av_fld && this.aw_fld + this.ay_fld <= this.av_fld + this.ae_fld) {
				var3 = this.aw_fld + this.ay_fld;
			} else if (this.av_fld + this.ae_fld > this.aw_fld && this.ae_fld + this.av_fld <= this.ay_fld + this.aw_fld) {
				var3 = this.av_fld + this.ae_fld;
			}

			if (var1 > -1L && var3 > var1) {
				int var5 = (int)(var3 - var1);
				System.arraycopy(this.az_fld, (int)(var1 - this.aw_fld), this.ah_fld, (int)(var1 - this.av_fld), var5);
			}

			this.aw_fld = -6845944213320320033L;
			this.ay_fld = 0;
		}
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	public void ak(int var1) throws EOFException, IOException {
		pj(this, 1576979688);
		this.ag_fld.av();
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	void aw(int var1) throws IOException {
		this.ae_fld = 0;
		if (this.ar_fld != this.al_fld) {
			zb.hk(this.ag_fld, this.as_fld);
			this.af_fld = 4087389332763710271L * this.af_fld;
		}

		this.av_fld = -6934093294469841493L * this.av_fld;

		while (this.ae_fld < this.ah_fld.length) {
			int var2 = this.az_fld.length - this.ae_fld;
			if (var2 > 200000000) {
				var2 = 200000000;
			}

			int var3 = zb.oe(this.ag_fld, this.ah_fld, this.ae_fld, var2);
			if (var3 == -1) {
				break;
			}

			this.al_fld += var3 * -8801582076287066467L;
			this.ae_fld = this.ay_fld + var3 * -812514299;
		}
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	public void as(int var1) throws EOFException, IOException {
		if (-1L != this.av_fld) {
			long var2;
			long var4;
			if (var1 != 1576979688) {
				return;
			}

			if (this.as_fld != this.ar_fld) {
				zb.hk(this.ag_fld, this.aw_fld);
				this.av_fld = 3533630145433520893L * this.ar_fld;
			}

			this.ag_fld.az(this.ah_fld, 0, this.ay_fld);
			this.av_fld = this.al_fld + -9042808752460930335L * this.ay_fld;
			if (this.av_fld > this.aw_fld) {
				if (var1 != 1576979688) {
					return;
				}

				this.af_fld = 3771751398160516143L * this.aw_fld;
			}

			label80: {
				var2 = -1L;
				var4 = -1L;
				if (this.al_fld >= this.al_fld) {
					if (var1 != 1576979688) {
						return;
					}

					if (this.as_fld < this.ae_fld + this.af_fld) {
						var2 = this.af_fld * -6118238142145806367L;
						break label80;
					}
				}

				if (this.ar_fld >= this.af_fld && this.av_fld < this.ae_fld * -1403379691 + this.av_fld) {
					var2 = this.av_fld;
				}
			}

			label74: {
				if (this.ae_fld * -1403379691 + this.aw_fld > this.al_fld) {
					if (var1 != 1576979688) {
						return;
					}

					if (this.aw_fld + this.ay_fld <= this.as_fld + this.ae_fld) {
						var4 = this.ar_fld + this.ay_fld;
						break label74;
					}
				}

				if (this.af_fld + this.ae_fld > this.al_fld && this.ae_fld + this.aw_fld <= -1403379691 * this.ae_fld + this.ar_fld) {
					if (var1 != 1576979688) {
						return;
					}

					var4 = this.af_fld + -162912051 * this.ay_fld;
				}
			}

			if (var2 > -1L && var4 > var2) {
				int var6 = (int)(var4 - var2);
				System.arraycopy(this.ah_fld, (int)(var2 - this.af_fld), this.ah_fld, (int)(var2 - this.av_fld), var6);
			}

			this.al_fld = -6845944213320320033L;
			this.ay_fld = 0;
		}
	}
}
