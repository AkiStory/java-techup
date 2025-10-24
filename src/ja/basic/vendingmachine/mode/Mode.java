package ja.basic.vendingmachine.mode;
// 사람이 자판기 앞에서서 (new)
// 돈을 넣고
// 버튼을 누르고
// 돈이 모자라면 "돈이 부족합니다" 출력
// 돈이 충분하면 음료수를 주고 잔돈을 출력

// 관리자가 앞에 서서 -99를 입력하면
// 자판기의 매출을 출력하도록 하는
// 관리자가 회수를 입력하면 매출이 초기화되고
// 관리자의 장부에 해당 날짜와 매출액이 기록되도록 한다.

// LocalDate today = localDate.now(); //지금의 날짜

// 관리자가 보고를 입력하면 장부에 해당하는 내용들이 쭉 출력되도록 한다.
// 자판기의 온오프버튼 , 관리자만 조작 가능

import java.util.Scanner;

import ja.basic.vendingmachine.VendingMachine;

public interface Mode {

	boolean run(VendingMachine vm, Scanner sc, int input);
}