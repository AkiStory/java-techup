package java.basic;

public class VariableMain {
	static void main(String[] args) {
		// 자료형 변수의 이름 = 값
		// 그릇 밥그릇 = 밥
		// = 대입 연산자 좌항에 우항을 대입하다
		// 1 + 1 = 2
		int a; // 선언
		a = 0; // 초기화
		a = 10; // 할당

		int b = 20; // 선언 + 초기화 + 할당 <- 변수선언
		String str = "Hello World";

		// var = ? -> 타입추론 (컴파일러가 타입을 추론)
		// var는 지역변수에서만 사용 가능
		// var는 final 사용이 불가능 , 재할당이 가능하다
		var c = 30;
		c = 10; // 재할당
		// var v; // 타입추론이 불가능, 초기화를 반드시 해야함

	}
}
