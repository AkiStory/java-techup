package ja.basic.vendingmachine.mode;

import java.util.Scanner;

import ja.basic.vendingmachine.VendingMachine;

public class UserMode implements Mode {

	@Override
	public boolean run(VendingMachine vm, Scanner sc, int money) {

		System.out.println("\n[음료 목록]");

		String[] drinks = vm.getDrinks();
		int[] prices = vm.getPrices();

		System.out.println("잔액: " + money + "원");
		for (int i = 0; i < drinks.length; i++) {
			System.out.printf("%d. %s: %d원\n", i + 1, drinks[i], prices[i]);
		}
		System.out.print("구매할 번호 선택 (0 선택시 구매 안 함) : ");

		int drinkNumber;
		int pick = sc.nextInt();
		if (0 < pick && pick < 4) {
			drinkNumber = pick - 1;
		} else if (pick == 0) {
			System.out.println("\n잔돈 반환: " + money + "원");
			return true;
		} else {
			System.out.println("없는 번호 입니다. 다시 고르세요.");
			return run(vm, sc, money);
		}

		int change = vm.purchase(drinkNumber, money);
		if (change < 0) {
			System.out.println("돈이 부족합니다. 투입금 반환: " + money + "원");
			return true;
		} else if (change < 1000) {
			System.out.println(drinks[drinkNumber] + "가 나왔습니다. \n돈이 부족합니다. 잔돈 반환:" + change + "원");
			return true;
		} else {
			System.out.println(drinks[drinkNumber] + "가 나왔습니다. 잔돈: " + change + "원");
			return run(vm, sc, change);
		}
	}
}