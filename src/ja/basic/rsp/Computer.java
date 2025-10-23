package ja.basic.rsp;

import java.util.Random;

public class Computer {
	public static String computerChoice() {
		Random random = new Random();
		int com = random.nextInt(3) + 1;
		var choice = RSPReplace.replaceToRSP(com);
		System.out.println("상대방이 " + choice + "를 냈습니다");
		return choice;
	}
}
