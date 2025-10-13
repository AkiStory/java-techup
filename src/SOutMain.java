public class SOutMain {

	static void main(String[] args) {
		// System.out  : 표준 출력 장치(모니터)
		// System.in		: 표준 입력 장치(키보드)
		// System.err	: 표준 에러 출력 장치(모니터)

		System.out.println("hello world"); //ln 라인을 만들어줌
		System.out.print("hello ");
		System.out.print("world \n");

		// printf : 포맷을 지정해서 출력
		// 포맷을 지정할때 형식지정자를 사용 %d 정수, %f 실수, %s 문자열, %b 논리
		int a = 10;
		int b = 20;
		System.out.printf("%d * %d = %d \n", a, b, a * b);
		System.out.println(a + " * " + b + " = " + a * b);
	}
}
