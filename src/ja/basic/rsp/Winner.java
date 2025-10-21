package ja.basic.rsp;

// 입력이 끝나고 컴퓨터도 숫자생성이 끝나면
// 누가 이겼는지 판정
// 나 : 가위, 컴퓨터 : 보 , 플레이어가 이겼습니다.

public class Winner {
	public static void whoWin() {
		var RSP = Player.inputRSP();
		var player = RSPMean.rspM(RSP);
		System.out.println("당신은 " + player + "를 냈습니다");
		String comChoice = Computers.computerChoice();
		RSPResult(player, comChoice);
	}

	public static void RSPResult(String player, String comChoice) {
		if (player.equals(comChoice)) {
			System.out.println("비겼습니다.");
			Streak.keepStreak();
			whoWin();

		} else if (isPlayerWin(player, comChoice)) {
			System.out.println("당신이 이겼습니다");
			Streak.addWin();
			whoWin();

		} else {
			System.out.println("당신이 졌습니다");
			Streak.endStreak();
		}
	}

	private static boolean isPlayerWin(String player, String computer) {
		return (player.equals("가위") && computer.equals("보")) ||
			(player.equals("바위") && computer.equals("가위")) ||
			(player.equals("보") && computer.equals("바위"));
	}
}
