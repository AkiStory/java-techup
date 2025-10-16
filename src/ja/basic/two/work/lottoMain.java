package ja.basic.two.work;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class lottoMain {
	// 1~45까지의 랜덤한 정수를 6개 출력
	// 대신 중복된 숫자는 없을 것
	// Set 쓰지 말 것
	static void main(String[] args) {

		List<Integer> list = new ArrayList<>();
		for (int i = 1; i < 46; i++) {
			list.add(i);
		}

		List<Integer> lotto = new ArrayList<>();
		Random random = new Random();

		for (int j = 0; j < 6; j++) {
			int add = random.nextInt(list.size());
			lotto.add(list.remove(add));
		}

		System.out.println(lotto);
	}
}
