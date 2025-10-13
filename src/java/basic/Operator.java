package java.basic;

public class Operator {
	static void main(String[] args) {
		// 연산자 : 산술, 대입, 비교, 논리
		// 산술연산자 : +, -, *, /, %
		// 대입연산자 : =
		// 비교연산자 : >, <, >=, <=, ==, !=
		// 논리연산자 : &&(AND), ||(OR), !(NOT)
		// 증감연산자 : ++ , --
		// AND : 둘 다 true , OR : 하나라도 true면, NOT : 결과를 부정하여 반대로 바꿈
		// 우선순위 -> 논리연산을 하는 경우가 보통 if문에서 많이 사용
		// lazy evaluation(Short-circuit eavaluation)
		// && : 앞이 false면 뒤는 안 봄
		// || : 앞이 true면 뒤는 안 봄
		int a = 10 + 8;
		int b = 10 - 7;
		int c = 10 * 6;
		int d = 10 / 5;
		int e = 10 % 4;

	}
}
