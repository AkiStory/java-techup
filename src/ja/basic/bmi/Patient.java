package ja.basic.bmi;

// 환자 patient
// 속성 : 이름, 키, 몸무게, 성별, BMI지수, 비만도
// 행위 : ...

import java.util.Scanner;

public class Patient {
	private String name;
	private double height;
	private double weight;
	private String gender;
	private double bmi;
	private String grade;

	public Patient() {
		this.name = inputName();
		this.height = inputHeight();
		this.weight = inputWeight();
		this.gender = inputGender();
	}

	public void notificationBmiResult(double bmi, String grade) {
		this.bmi = bmi;
		this.grade = grade;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public double getBmi() {
		return bmi;
	}

	public void setBmi(double bmi) {
		this.bmi = bmi;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
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

	public static String inputGender() {
		try {
			Scanner scanner = new Scanner(System.in);
			System.out.println("성별 : ");
			var gender = scanner.nextLine();
			if (!"남자".equals(gender) && !"여자".equals(gender)) {
				System.out.println("다시 입력하세요, 남자 또는 여자");
				return inputGender();
			}
			return gender;
		} catch (Exception e) {
			System.out.println("다시 입력하세요, 남자 또는 여자");
			return inputGender();
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
}
