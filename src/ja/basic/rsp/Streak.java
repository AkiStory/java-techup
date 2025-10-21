package ja.basic.rsp;

// 비기면 다시 게임시작 연승횟수는 유지
// 내가 이기면 연승 +1 하고 다시 게임시작
// 내가 지면 게임종료, 최종연승출력

public class Streak {
	private static int winStreak = 0;

	public static void addWin() {
		winStreak++;
		System.out.println("현재 연승: " + winStreak + "\n");
	}

	public static void keepStreak() {
		System.out.println("현재 연승: " + winStreak + "\n");
	}

	public static void endStreak() {
		System.out.println("최종 연승: " + winStreak);
		winStreak = 0;
	}

}
