package ja.basic.three;

import java.util.Scanner;

public class BMIMain {
	static void main(String[] args) {
		// BMI : Body Mass Index
		// 체질량 지수
		// 몸무게(kg) / (키(m) * 키(m))

		// 1. 키와 몸무게, 성별, 이름을 입력받아서
		// 2. BMI 지수를 계산하고
		// 3. BMI 지수에 따른 결과를 출력하는 프로그램작성
		// 저체중 18.5
		// 정상 22.9
		// 비만 전 24.9
		// 1단계 29.9
		// 2단계 34.9
		// 3단계 35

		// 출력예시
		// 이름 : 홍길동
		// 성별 : 남자
		// 키 : 175.5 cm
		// 몸무게 : 70.2 kg
		// BMI 지수 :
		// 결과 : 정상

		Scanner scanner = new Scanner(System.in);
		System.out.println("이름 : ");
		String name = scanner.nextLine();
		System.out.println("성별 : ");
		String sex = scanner.nextLine();
		System.out.println("키(cm) : ");
		double length = scanner.nextDouble();
		System.out.println("몸무게(kg) : ");
		double weight = scanner.nextDouble();

		double meter = length / 100;
		double bmi = weight / Math.pow(meter, 2);

		String result;

		if (bmi < 18.5 && bmi > 0) {
			result = "저체중";
		} else if (bmi < 22.9) {
			result = "정상";
		} else if (bmi < 24.9) {
			result = "비만 전";
		} else if (bmi < 29.9) {
			result = "비만 1단계";
		} else if (bmi < 34.9) {
			result = "비만 2단계";
		} else if (bmi > 35) {
			result = "비만 3단계";
		} else
			result = "비정상적인 수치";

		System.out.println("이름 = " + name + "\n성별 = " + sex + "\n키 = " + length
			+ "\n몸무게 = " + weight + "\nBMI 지수 = " + bmi + "\n결과 = " + result);

	}
}