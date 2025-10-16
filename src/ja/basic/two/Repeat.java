package ja.basic.two;

import java.util.List;

public class Repeat {
	static void main(String[] args) {
		// 반복문 : for, while, do-while, foreach
		// 실무에서 제일 만힝 쓰는건 foreach

		// for : 가장 기본적인 형태의 반복문 -> 속도가 제일 빠름
		// for(초기식; 조건삭; 증감식){..}
		// for문은 범위가 명확할 때 사용

		for (int i = 0; i < 4; i++) {
			System.out.println(" " + i);
		}

		// while 문은 조건이 명확할 때 -> 어떤 조건을 검사해서 true
		// 무한 루프에 빠질 가능성이 높음, break;
		int j = 0;
		while (j < 3) {
			System.out.println("Hello World");
			j++;
		}
		// do-while
		int k = 0;
		do {
			System.out.println("Hello World2");
			k++;
		} while (k < 3);

		// foreach : 향상된 for문
		// 배열이나 컬렉션을 다룰 때 주로 사용
		List<Integer> list = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		// for(숫자하나 : 컬렉션) {..}
		for (int n : list) {
			System.out.print(" " + n);
		}

	}
}
