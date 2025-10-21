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

		RSPResult.result(player, comChoice);
	}
}
