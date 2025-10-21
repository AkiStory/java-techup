package ja.basic.rsp;

import java.util.Random;

public class Computers {
	public static String computerChoice() {
		Random random = new Random();
		int coms = random.nextInt(3) + 1;
		var choice = RSPMean.rspM(coms);
		System.out.println("상대방이 " + choice + "를 냈습니다");
		return choice;
	}
}
