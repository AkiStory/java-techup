package ja.basic.three;

import java.util.Scanner;

/**  자바에서 오류를 핸들링하는 방법은 두 가지 정도
 * 1. try-catch 문 <- 문법
 * 2. 조건문으로 걸러내기
 *
 */

public class BMIClass {

	static void main(String[] args) {

		// 키는 10 ~ 250
		// 몸무게는 2 ~ 300
		// 성별은 남자 여자
		// 이름은 공백없는 문자열 2자리이상 10자리 이하
		// 잘못 입력하면 다시 입력하세요(위의 조건)출력하고 다시 입력받기

		var name = inputName();
		var sex = inputSex();
		var length = inputHeight();
		var weight = inputWeight();

		double meter = length / 100;
		double bmi = weight / Math.pow(meter, 2);

		String result = Grade(bmi);

		printingResult(name, sex, length, weight, bmi, result);

	}

	public static String inputName() {
		try {
			Scanner scanner = new Scanner(System.in);
			System.out.println("이름 : ");
			var name = scanner.nextLine();
			if (!name.matches("^[A-Za-z\\uAC00-\\uD7A3]+$") || name.length() < 2 || name.length() > 10) {
				System.out.println("다시 입력하세요, 한글 또는 영어, 2자 ~ 10자");
				return inputName();
			}
			return name;
		} catch (Exception e) {
			System.out.println("다시 입력하세요, 한글 또는 영어, 2자 ~ 10자");
			return inputName();
		}
	}

	public static String inputSex() {
		try {
			Scanner scanner = new Scanner(System.in);
			System.out.println("성별 : ");
			var sex = scanner.nextLine();
			if (!"남자".equals(sex) && !"여자".equals(sex)) {
				System.out.println("다시 입력하세요, 남자 또는 여자");
				return inputSex();
			}
			return sex;
		} catch (Exception e) {
			System.out.println("다시 입력하세요, 남자 또는 여자");
			return inputSex();
		}
	}

	public static double inputHeight() {
		try {
			Scanner scanner = new Scanner(System.in);
			System.out.println("키(cm) : ");
			var height = scanner.nextDouble();
			if (height < 10 || height > 250) {
				System.out.println("다시 입력하세요, 10 ~ 250");
				return inputHeight();
			}
			return height;
		} catch (Exception e) {
			System.out.println("다시 입력하세요, 10 ~ 250");
			return inputHeight();
		}
	}

	public static double inputWeight() {
		try {
			Scanner scanner = new Scanner(System.in);
			System.out.println("몸무게(kg) : ");
			var weight = scanner.nextDouble();
			if (weight < 2 || weight > 300) {
				System.out.println("다시 입력하세요, 2 ~ 300");
				return inputWeight();
			}
			return weight;
		} catch (Exception e) {
			System.out.println("다시 입력하세요, 2 ~ 300");
			return inputWeight();
		}
	}

	public static String Grade(double i) {
		if (i > 0 && i < 18.5)
			return "저체중";
		else if (i < 22.9)
			return "정상";
		else if (i < 24.9)
			return "비만 직전";
		else if (i < 29.9)
			return "비만 1단계";
		else if (i < 34.9)
			return "비만 2단계";
		else
			return "비만 3단계";
	}

	public static void printingResult(String name, String sex, double height, double weight, double bmi, String result) {
		System.out.println("이름 = " + name);
		System.out.println("성별 = " + sex);
		System.out.println("키 = " + height + "cm");
		System.out.println("몸무게 = " + weight + "kg");
		System.out.println("BMI 지수 = " + bmi);
		System.out.println("결과 = " + result);
	}
}




