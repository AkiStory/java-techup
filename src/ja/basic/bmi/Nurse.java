package ja.basic.bmi;

// 간호사 nurse
// 속성 : ...
// 행위 : 환자를 등록하고 정보를 받음, 환자의 정보를 의사에게 전달하고 bmi를 계산 요청
// 환자를 등록한다는 것은 우리의 병원 대기열에 넣는 것을 말함

import java.util.Queue;

public class Nurse {
	public void registerPatient(Patient patient, Queue<Patient> hospitalQueue) {
		hospitalQueue.add(patient);
	}

	public void requestBmiCalculation(Doctor doctor, Queue<Patient> hospitalQueue) {
		var result = doctor.see(hospitalQueue);
		var patient = hospitalQueue.poll();
		patient.notificationBmiResult(result.getBmi(), result.getGrade());
		hospitalQueue.add(patient);
	}
}
