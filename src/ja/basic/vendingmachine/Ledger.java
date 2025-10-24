package ja.basic.vendingmachine;

import java.time.LocalDateTime;

public record Ledger(LocalDateTime date, int sales) {

	@Override
	public String toString() {
		return date.withNano(0) + " : " + sales + "원";
	}
}

	/*
	public class Ledger {
	private final LocalDateTime date;
	private final int sales;

	public Ledger(LocalDateTime date, int sales) {
		this.date = date;
		this.sales = sales;
	}

	public LocalDateTime getDate() {
		return date;
	}

	public int getSales() {
		return sales;
	}
	*/
