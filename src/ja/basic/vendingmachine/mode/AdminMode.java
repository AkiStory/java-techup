package ja.basic.vendingmachine.mode;

import java.util.List;
import java.util.Scanner;

import ja.basic.vendingmachine.Ledger;
import ja.basic.vendingmachine.VendingMachine;

public class AdminMode implements Mode {

	@Override
	public boolean run(VendingMachine vm, Scanner sc, int ignored) {

		while (true) {
			System.out.println("\n[관리자 메뉴]");
			System.out.println("1 : 현재 매출  2 : 매출 회수  3 : 장부 확인  4 : 관리자 종료  5 : 자판기 종료");

			int adminPick = 0;
			while (true) {
				try {
					adminPick = sc.nextInt();
					break;
				} catch (Exception e) {
					sc.next();
					System.out.println("잘못된 입력입니다.");
					System.out.println("1 : 현재 매출  2 : 매출 회수  3 : 장부 확인  4 : 관리자 종료  5 : 자판기 종료");
				}
			}

			switch (adminPick) {
				case 1:
					System.out.println("현재 누적 매출 : " + vm.TotalSales() + "원");
					break;
				case 2:
					System.out.println("매출 회수 : " + vm.TotalSales() + "원");
					vm.collectSales();
					break;
				case 3:
					System.out.println("장부 내역");
					List<Ledger> list = vm.getLedgerList();
					if (list.isEmpty()) {
						System.out.println("기록된 내역이 없습니다.");
					} else {
						list.forEach(System.out::println);
					}
					break;
				case 4:
					System.out.println("관리자 모드 종료");
					return true;
				case 5:
					System.out.println("자판기 종료");
					return false;
				default:
					System.out.println("잘못된 입력입니다.");
			}
		}
	}
}