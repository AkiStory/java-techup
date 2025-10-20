package ja.basic.bmi;

public class SeeResult {
	private double bmi;
	private String grade;

	public SeeResult(double bmi, String grade) {
		this.bmi = bmi;
		this.grade = grade;
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
}
