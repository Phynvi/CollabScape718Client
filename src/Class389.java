/* Class389 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class389 {
	JS5 aClass243_4159;
	JS5 models;
	Class348 aClass348_4161 = new Class348(64);
	Class348 cache = new Class348(60);
	int anInt4163;
	protected static Class457 aClass457_4164;
	public static Class119[] aClass119Array4165;
	static int anInt4166;

	public void method4856(int i) {
		try {
			synchronized (((Class389) this).aClass348_4161) {
				((Class389) this).aClass348_4161.method4189();
			}
			synchronized (((Class389) this).cache) {
				((Class389) this).cache.method4189();
			}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("qc.i(").append(')').toString());
		}
	}

	public GraphicDefinition getGraphicDefinition(int i, int i_0_) {
		try {
			GraphicDefinition class398;
			synchronized (((Class389) this).aClass348_4161) {
				class398 = (GraphicDefinition) ((Class389) this).aClass348_4161.get((long) i);
			}
			if (class398 != null)
				return class398;
			byte[] is;
			synchronized (((Class389) this).aClass243_4159) {
				is = (((Class389) this).aClass243_4159.getFile(ConfigEntry.aClass120_1449.method1307(i, -880627246),
						ConfigEntry.aClass120_1449.method1305(i, -2138953670)));
			}
			class398 = new GraphicDefinition();
			((GraphicDefinition) class398).provider = this;
			((GraphicDefinition) class398).id = i * 1757755963;
			if (is != null)
				class398.method4915(new RsByteBuffer(is), (byte) -38);
			synchronized (((Class389) this).aClass348_4161) {
				((Class389) this).aClass348_4161.put(class398, (long) i);
			}
			return class398;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("qc.a(").append(')').toString());
		}
	}

	public void method4858(int i) {
		try {
			synchronized (((Class389) this).aClass348_4161) {
				((Class389) this).aClass348_4161.method4187();
			}
			synchronized (((Class389) this).cache) {
				((Class389) this).cache.method4187();
			}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("qc.b(").append(')').toString());
		}
	}

	public void method4859(int i, int i_1_) {
		try {
			synchronized (((Class389) this).aClass348_4161) {
				((Class389) this).aClass348_4161.method4186(i, -465863614);
			}
			synchronized (((Class389) this).cache) {
				((Class389) this).cache.method4186(i, -1017728103);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("qc.p(").append(')').toString());
		}
	}

	public void method4860(int i, int i_2_) {
		try {
			((Class389) this).anInt4163 = i * -1451688935;
			synchronized (((Class389) this).cache) {
				((Class389) this).cache.method4187();
			}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("qc.f(").append(')').toString());
		}
	}

	public Class389(Class411 class411, Class429 class429, JS5 class243, JS5 class243_3_) {
		((Class389) this).aClass243_4159 = class243;
		((Class389) this).models = class243_3_;
		int i = ((Class389) this).aClass243_4159.method2296(1921321046) - 1;
		ConfigEntry.aClass120_1449.method1306((short) 3745);
		((Class389) this).aClass243_4159.getFileCountForArchive(i, -1103317672);
	}

	static final void method4861(Class403 class403, int i) {
		try {
			Class390 class390 = (((Class403) class403).aBoolean5261 ? ((Class403) class403).aClass390_5247
					: ((Class403) class403).aClass390_5246);
			IComponentDefinition class105 = ((Class390) class390).aClass105_4168;
			Class119 class119 = ((Class390) class390).aClass119_4167;
			Class158.method1699(class105, class119, class403, (byte) -85);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("qc.ly(").append(')').toString());
		}
	}

	static final void method4862(IComponentDefinition class105, Class119 class119, Class403 class403, int i) {
		try {
			class105.aBoolean1165 = (((Class403) class403).anIntArray5244[(((Class403) class403).anInt5239 -= -391880689)
					* 681479919]) == 1;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("qc.cr(").append(')').toString());
		}
	}

	static final void method4863(Class403 class403, int i) {
		try {
			((Class403) class403).anIntArray5244[((((Class403) class403).anInt5239 += -391880689) * 681479919
					- 1)] = Class422_Sub25.aClass298_Sub48_8425.aClass422_Sub11_7558.method5667(-369768513);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("qc.ajk(").append(')').toString());
		}
	}

	static final void method4864(Class403 class403, int i) {
		try {
			((Class403) class403).anInt5239 -= -783761378;
			int i_4_ = (((Class403) class403).anIntArray5244[((Class403) class403).anInt5239 * 681479919]);
			int i_5_ = (((Class403) class403).anIntArray5244[1 + 681479919 * ((Class403) class403).anInt5239]);
			((Class403) class403).anIntArray5244[((((Class403) class403).anInt5239 += -391880689) * 681479919
					- 1)] = (Toolkit.aClass256_5315.method2441(i_4_, 2021332528).aCharArray9597[i_5_]);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("qc.acp(").append(')').toString());
		}
	}

	public static Class292 method4865(byte i) {
		try {
			return Class291.aClass292_6466;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("qc.as(").append(')').toString());
		}
	}
}
