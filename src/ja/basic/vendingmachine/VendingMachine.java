package ja.basic.vendingmachine;

// 배열로 음료수를 관리
// private String[] drinks = {"콜라", "사이다", "환타"};
// private int[] prices = {1000, 1200, 1300};

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class VendingMachine {
	private final String[] drinks = {"콜라", "사이다", "환타"};
	private final int[] prices = {1000, 1200, 1300};
	private int totalSales = 0;

	private final List<Ledger> ledgerList = new ArrayList<>();

	public int isPurchasable(int drinkPick, int money) {
		int price = prices[drinkPick];
		if (money < price) {
			return money;
		}
		totalSales += price;
		return money - price;
	}

	public int TotalSales() {
		return totalSales;
	} // TODO.. getter 이용이 바람직

	public void collectSales() {
		ledgerList.add(new Ledger(LocalDateTime.now(), totalSales));
		totalSales = 0;
	}

	public List<Ledger> getLedgerList() {
		return new ArrayList<>(ledgerList); // TODO.. ModifiableList 사용시 변경x
	}

	public String[] getDrinks() {
		return drinks;
	}

	public int[] getPrices() {
		return prices;
	}
}