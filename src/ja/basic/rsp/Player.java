package ja.basic.rsp;

// 플레이어는 1~3 사이의 숫자를 입력
// 1. 가위, 2. 바위, 3.보
// 컴퓨터는 랜덤으로 1~3사이의 숫자를 생성

import java.util.Scanner;

public class Player {

	public static int inputRSP() {
		try {
			Scanner scan = new Scanner(System.in);
			System.out.println("가위(1) 바위(2) 보(3) : ");
			var RSP = scan.nextInt();
			if (RSP < 1 || RSP > 3) {
				System.out.println("다시 입력하세요. 1 ~ 3");
				return inputRSP();
			}
			return RSP;
		} catch (Exception e) {
			System.out.println("다시 입력하세요. 1 ~ 3");
			return inputRSP();
		}
	}
}
