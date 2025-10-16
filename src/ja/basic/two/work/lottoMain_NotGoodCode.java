package ja.basic.two.work;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class lottoMain_NotGoodCode {
	static void main(String[] args) {
		List<Integer> numbers = new ArrayList<>();
		for (int i = 1; i <= 45; i++)
			numbers.add(i);

		Collections.shuffle(numbers);

		List<Integer> lotto = numbers.subList(0, 6);

		Collections.sort(lotto);
		System.out.println(lotto);
	}
}