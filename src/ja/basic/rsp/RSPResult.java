package ja.basic.rsp;

public class RSPResult {

	public static void result(String player, String comChoice) {
		if (player.equals(comChoice)) {
			System.out.println("\n비겼습니다.");
			Streak.keepStreak();
			Winner.GamePlay();

		} else if (isPlayerWin(player, comChoice)) {
			System.out.println("\n당신이 이겼습니다.");
			Streak.addWin();
			Winner.GamePlay();

		} else {
			System.out.println("\n당신이 졌습니다.");
			Streak.endStreak();
		}
	}

	private static boolean isPlayerWin(String player, String computer) {
		return (player.equals("가위") && computer.equals("보")) ||
			(player.equals("바위") && computer.equals("가위")) ||
			(player.equals("보") && computer.equals("바위"));
	}
}
