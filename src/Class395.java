/* Class395 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class395 {
	JS5 aClass243_5189;
	public static int anInt5190;
	Class348 aClass348_5191;
	Class348 aClass348_5192 = new Class348(64);

	public Class298_Sub37_Sub4 getCollection(int i, int i_0_) {
		try {
			Class298_Sub37_Sub4 class298_sub37_sub4;
			synchronized (((Class395) this).aClass348_5191) {
				class298_sub37_sub4 = ((Class298_Sub37_Sub4) ((Class395) this).aClass348_5191.get((long) i));
				if (null == class298_sub37_sub4) {
					class298_sub37_sub4 = new Class298_Sub37_Sub4(i);
					((Class395) this).aClass348_5191.put(class298_sub37_sub4, (long) i);
				}
				if (!class298_sub37_sub4.method3412((byte) 45)) {
					Class298_Sub37_Sub4 class298_sub37_sub4_1_ = null;
					return class298_sub37_sub4_1_;
				}
			}
			return class298_sub37_sub4;
		}
		catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("qj.f(").append(')').toString());
		}
	}

	public void method4901(int i) {
		try {
			synchronized (((Class395) this).aClass348_5192) {
				((Class395) this).aClass348_5192.method4187();
			}
			synchronized (((Class395) this).aClass348_5191) {
				((Class395) this).aClass348_5191.method4187();
			}
		}
		catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("qj.b(").append(')').toString());
		}
	}

	public void method4902(int i) {
		try {
			synchronized (((Class395) this).aClass348_5192) {
				((Class395) this).aClass348_5192.method4189();
			}
			synchronized (((Class395) this).aClass348_5191) {
				((Class395) this).aClass348_5191.method4189();
			}
		}
		catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("qj.i(").append(')').toString());
		}
	}

	public Class395(Class411 class411, Class429 class429, JS5 class243, JS5 class243_2_, JS5 class243_3_) {
		((Class395) this).aClass348_5191 = new Class348(100);
		((Class395) this).aClass243_5189 = class243;
		if (null != ((Class395) this).aClass243_5189) {
			int i = ((Class395) this).aClass243_5189.method2296(1196471561) - 1;
			ConfigEntry.aClass120_1409.method1306((short) 21776);
			((Class395) this).aClass243_5189.getFileCountForArchive(i, -1829120689);
		}
		Class_ta_Sub2.method6006(class243_2_, class243_3_, 2, (byte) 2);
	}

	public AnimationDefinition getAnimationDefinition(int i, byte i_4_) {
		try {
			AnimationDefinition class391;
			synchronized (((Class395) this).aClass348_5192) {
				class391 = (AnimationDefinition) ((Class395) this).aClass348_5192.get((long) i);
			}
			if (null != class391)
				return class391;
			byte[] is;
			synchronized (((Class395) this).aClass243_5189) {
				is = (((Class395) this).aClass243_5189.getFile(ConfigEntry.aClass120_1409.method1307(i, 180156567), ConfigEntry.aClass120_1409.method1305(i, -1217474734)));
			}
			class391 = new AnimationDefinition();
			class391.anInt4171 = i * -523719415;
			((AnimationDefinition) class391).aClass395_4170 = this;
			if (is != null)
				class391.method4882(new RsByteBuffer(is), -795902444);
			class391.method4879((byte) -46);
			synchronized (((Class395) this).aClass348_5192) {
				((Class395) this).aClass348_5192.put(class391, (long) i);
			}
			return class391;
		}
		catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("qj.a(").append(')').toString());
		}
	}
	
	public AnimationSkin getSkinDefinition(int file) {
		try {
			byte[] is = method1543(Class284_Sub1.idx2, ConfigEntry.ANIMATION_FLOW, file);
			AnimationSkin skin = new AnimationSkin();
			if (is != null)
				skin.decode(new RsByteBuffer(is));
			return skin;
		} catch (final RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("qj.a(").append(')').toString());
		}
	}
	
	static byte[] method1543(JS5 js5, ConfigEntry entry, int i) {
		if (entry.method1306((short) 0) > 1)
			return js5.getFile(entry.method1307(i, 0), entry.method1305(i, 0));
		return js5.getFile(-1006924897 * entry.anInt1460, i);
	}

	public void method4904(int i, byte i_5_) {
		try {
			synchronized (((Class395) this).aClass348_5192) {
				((Class395) this).aClass348_5192.method4186(i, -208985286);
			}
			synchronized (((Class395) this).aClass348_5191) {
				((Class395) this).aClass348_5191.method4186(i, -1704294236);
			}
		}
		catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("qj.p(").append(')').toString());
		}
	}

	static final void method4905(Class403 class403, int i) {
		try {
			((Class403) class403).anInt5239 -= -783761378;
			int i_6_ = (((Class403) class403).anIntArray5244[((Class403) class403).anInt5239 * 681479919]);
			int i_7_ = (((Class403) class403).anIntArray5244[1 + 681479919 * ((Class403) class403).anInt5239]);
			Class497 class497 = Class92.aClass504_905.method6251(i_7_, -1755093541);
			if (class497.method6206(1883696427))
				((Class403) class403).anObjectArray5240[((((Class403) class403).anInt5241 += 969361751) * -203050393) - 1] = (Class298_Sub32_Sub14.aClass477_9400.getItemDefinitions(i_6_).method6041(i_7_, class497.aString6101, (short) 26472));
			else
				((Class403) class403).anIntArray5244[((((Class403) class403).anInt5239 += -391880689) * 681479919) - 1] = (Class298_Sub32_Sub14.aClass477_9400.getItemDefinitions(i_6_).method6037(i_7_, class497.anInt6100 * -388931549, -2143571113));
		}
		catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("qj.aat(").append(')').toString());
		}
	}

	static final void method4906(Class403 class403, int i) {
		try {
			((Class403) class403).anInt5239 -= -1175642067;
			int i_8_ = (((Class403) class403).anIntArray5244[((Class403) class403).anInt5239 * 681479919]);
			int i_9_ = (((Class403) class403).anIntArray5244[1 + ((Class403) class403).anInt5239 * 681479919]);
			int i_10_ = (((Class403) class403).anIntArray5244[((Class403) class403).anInt5239 * 681479919 + 2]);
			Class301_Sub1.method3713(10, i_8_ << 16 | i_9_, i_10_, "", -1433549098);
		}
		catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("qj.alu(").append(')').toString());
		}
	}

	static boolean method4907(int i, byte i_11_) {
		try {
			if (i == 3 || 4 == i || 5 == i || 6 == i || i == 1001 || 1002 == i)
				return true;
			if (2 == i)
				return true;
			return false;
		}
		catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("qj.bu(").append(')').toString());
		}
	}
}
