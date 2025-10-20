package ja.basic.bmi;

import java.util.LinkedList;
import java.util.Queue;

//OOP
public class BMIOOPMain {
	static void main(String[] args) {

		Queue<Patient> patientQueue = new LinkedList<>();

		var nurse = new Nurse();
		var doctor = new Doctor();
		var patient = new Patient();

		nurse.registerPatient(patient, patientQueue);
		nurse.requestBmiCalculation(doctor, patientQueue);

		var endPatient = patientQueue.poll();

		System.out.printf("%s님의 BMI는 %.2f이고, 비만도는 %s입니다.", endPatient.getName()
			, endPatient.getBmi(), endPatient.getGrade());

	}

}
