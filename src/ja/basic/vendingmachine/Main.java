package ja.basic.vendingmachine;

import java.util.Scanner;

import ja.basic.vendingmachine.mode.AdminMode;
import ja.basic.vendingmachine.mode.Mode;
import ja.basic.vendingmachine.mode.UserMode;

// 메인 작동

public class Main {
	public static void main(String[] args) {
		VendingMachine vm = new VendingMachine();
		Scanner sc = new Scanner(System.in);
		boolean powerOn = true;
		Mode mode = null;

		System.out.println("자판기 가동");
		while (powerOn) {
			System.out.print("\n투입금액 입력 : ");
			int input = 0;
			if (sc.hasNextInt()) {
				input = sc.nextInt();
			} else {
				sc.next();
				System.out.println("숫자만 입력하세요.");
				continue;
			}

			if (input == -99) {
				mode = new AdminMode();
			} else if (input > 0) {
				mode = new UserMode();
			} else {
				System.out.println("잘못된 입력입니다.");
				continue;
			}
			powerOn = mode.run(vm, sc, input);
		}
	}
}