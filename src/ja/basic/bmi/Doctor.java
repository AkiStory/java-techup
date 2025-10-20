package ja.basic.bmi;

// 의사 : doctor
// 속성 : ...
// 행위 : bmi 계산, 비만도 판정

import java.util.Queue;

public class Doctor {

	public SeeResult see(Queue<Patient> hospitalQueue) {
		var patient = hospitalQueue.peek();
		double bmi = calculateBMI(patient.getHeight(), patient.getWeight());
		var grade = determineGrade(bmi);

		// 객체를 만들어서 리턴, Pair로 리턴
		return new SeeResult(bmi, grade);
	}

	private double calculateBMI(double height, double weight) {
		double meter = height / 100;
		return weight / Math.pow(meter, 2);
	}

	public String determineGrade(double i) {
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

}
