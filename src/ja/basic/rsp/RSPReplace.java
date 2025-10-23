package ja.basic.rsp;

public class RSPReplace {
	public static String replaceToRSP(int i) {
		if (i == 1) {
			return "가위";
		} else if (i == 2) {
			return "바위";
		} else
			return "보";
	}
}
