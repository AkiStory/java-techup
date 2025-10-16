package ja.basic.two.work;

import java.util.Arrays;
import java.util.Random;

public class lottoRoy {
	// 1~45까지의 랜덤한 정수를 6개 출력
	// 대신 중복된 숫자는 없을 것
	// Set 쓰지 말 것
	// 1~45까지 1세트
	// 통안에는 20세트의 숫자가 들어가 있다고 가정
	// 큰 공안에서 작은공이 툭 튀어나와서 굴러옴
	// 6개를 꺼내야 함
	// 꺼낸 숫자는 다시 나오지 않아야 하니
	// 같은 숫자가 나오면 다시 뽑기를 반복하여 6개

	static void main(String[] args) {
		//로또 그릇
		int[] lotto = new int[6];

		Random random = new Random();

		for (int i = 0; i < lotto.length; i++) {
			lotto[i] = pick(random, lotto, i);
		}
		// 	for (int j = 0; j < i; j++) {
		// 		if (lotto[j] == number) {
		// 			System.out.print(j + " 중복    ");
		// 		} else {
		// 			System.out.print(j + " 중복아님 | ");
		// 		}
		// 	}
		// 	System.out.println("");
		// 	lotto[i] = number;

		// lotto [0] 과 number 가 같다면 버리고 다시 뽑기
		// 같지 않으면 lotto[1]
		// lotto [0] 과 lotto [1] 과 같다면 버리고 다시 뽑기
		// 같지 않으면 lotto[2] ... 	반복해서 [5] 까지

		System.out.println(Arrays.toString(lotto));
	}

	public static int pick(Random random, int[] lotto, int i) {
		int number = random.nextInt(45) + 1;

		for (int j = 0; j < i; j++) {
			if (lotto[j] == number) {
				System.out.println("중복 " + number);
				return pick(random, lotto, i);
			}
		}
		return number;
	}

}

