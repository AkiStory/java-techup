package ja.basic.rsp;

// 플레이어는 1~3 사이의 숫자를 입력
// 1. 가위, 2. 바위, 3.보
// 컴퓨터는 랜덤으로 1~3사이의 숫자를 생성

public class Main {
	static void main(String[] args) {
		System.out.println("가위바위보를 질 때까지 합니다.");
		Winner.whoWin();
		System.out.println("\n가위바위보를 종료합니다.");
	}
}
