/* Class400 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class400 {
	WorldTile aClass341_5221;
	int anInt5222;
	static int anInt5223;
	static Class4 aClass4_5224;
	public static int anInt5225;

	public Class400(WorldTile class341, int i) {
		((Class400) this).aClass341_5221 = class341;
		((Class400) this).anInt5222 = -2062685815 * i;
	}

	public Class365_Sub1_Sub4_Sub1 method4927(byte i) {
		try {
			Class298_Sub2 class298_sub2 = ((Class298_Sub2) (pb.aClass437_8685
					.get((long) ((((Class400) this).aClass341_5221.plane * 1008331379) << 28
							| 283514611 * (((Class400) this).aClass341_5221.y) << 14
							| -1760580017 * (((Class400) this).aClass341_5221.x)))));
			if (class298_sub2 == null)
				return null;
			WorldTile class341 = pb.aClass283_8716.method2628(681479919);
			int i_0_ = (-1760580017 * ((Class400) this).aClass341_5221.x - class341.x * -1760580017);
			int i_1_ = (283514611 * ((Class400) this).aClass341_5221.y - 283514611 * class341.y);
			if (i_0_ >= 0 && i_1_ >= 0 && i_0_ < pb.aClass283_8716.method2629(-2079172057)
					&& i_1_ < pb.aClass283_8716.method2630(-583720048)) {
				for (Class298_Sub12 class298_sub12 = (Class298_Sub12) class298_sub2.aClass453_7166.method5939(
						1766612795); class298_sub12 != null; class298_sub12 = ((Class298_Sub12) class298_sub2.aClass453_7166
								.method5944(49146))) {
					if (-1600299847 * ((Class400) this).anInt5222 == class298_sub12.anInt7257 * 1768239597)
						return ((Class365_Sub1_Sub4_Sub1) (pb.aClass283_8716.method2675(-1611682495).method4034(
								(((Class400) this).aClass341_5221.plane * 1008331379), i_0_, i_1_, -1919026118)));
				}
			}
			return null;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("qp.a(").append(')').toString());
		}
	}

	public static Class412[] method4928(short i) {
		try {
			return (new Class412[] { Class412.aClass412_6568, Class412.aClass412_6566, Class412.aClass412_6571,
					Class412.aClass412_6564, Class412.aClass412_6565, Class412.aClass412_6570, Class412.aClass412_6569,
					Class412.aClass412_6567, Class412.aClass412_6563, Class412.aClass412_6572 });
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("qp.a(").append(')').toString());
		}
	}

	public static final void method4929(Model class387, Class438 class438, Class438 class438_2_, int i) {
		try {
			if (class438.method5838((short) 225) && class438_2_.method5838((short) 225)) {
				AnimationDefinition class391 = ((Class438) class438).aClass391_5524;
				AnimationDefinition class391_3_ = ((Class438) class438_2_).aClass391_5524;
				class387.method4736((((Class441) ((Class438) class438).aClass441_5534).aClass298_Sub37_Sub4_5583),
						(((Class441) ((Class438) class438).aClass441_5534).anInt5584) * 806878007,
						(((Class441) ((Class438) class438).aClass441_5534).aClass298_Sub37_Sub4_5587),
						-643912397 * ((Class441) (((Class438) class438).aClass441_5534)).anInt5586,
						((Class438) class438).anInt5525 * 458730501,
						(class391.frameDurations[-8792169 * ((Class438) class438).anInt5523]),
						(((Class441) ((Class438) class438_2_).aClass441_5534).aClass298_Sub37_Sub4_5583),
						806878007 * ((Class441) (((Class438) class438_2_).aClass441_5534)).anInt5584,
						(((Class441) ((Class438) class438_2_).aClass441_5534).aClass298_Sub37_Sub4_5587),
						-643912397 * ((Class441) (((Class438) class438_2_).aClass441_5534)).anInt5586,
						458730501 * ((Class438) class438_2_).anInt5525,
						(class391_3_.frameDurations[((Class438) class438_2_).anInt5523 * -8792169]),
						class391.aClass176_1979 == null ? null : class391.aClass176_1979.flowControl,
						class391.aBoolean4185 | class391_3_.aBoolean4185);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("qp.g(").append(')').toString());
		}
	}

	static final void method4930(Class403 class403, byte i) {
		try {
			((Class403) class403).anInt5239 -= -1175642067;
			int i_4_ = (((Class403) class403).anIntArray5244[((Class403) class403).anInt5239 * 681479919]);
			int i_5_ = (((Class403) class403).anIntArray5244[681479919 * ((Class403) class403).anInt5239 + 1]);
			int i_6_ = (((Class403) class403).anIntArray5244[((Class403) class403).anInt5239 * 681479919 + 2]);
			Class298_Sub37_Sub14 class298_sub37_sub14 = Class447.aClass469_5618.method6045(i_4_, (short) -10858);
			if ((class298_sub37_sub14.method3460(i_5_, -827579127).anInt3996 * -1682932563) != 0)
				throw new RuntimeException("");
			((Class403) class403).anIntArray5244[((((Class403) class403).anInt5239 += -391880689) * 681479919
					- 1)] = class298_sub37_sub14.method3458(i_5_, i_6_, 2025629699);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("qp.adp(").append(')').toString());
		}
	}

	static boolean method4931(byte i) {
		try {
			if (19 != -1233866115 * pb.anInt8752)
				return false;
			if (Class315.method3837((byte) -29) || Class489.method6167(-391880689))
				return false;
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("qp.ao(").append(')').toString());
		}
	}
}
