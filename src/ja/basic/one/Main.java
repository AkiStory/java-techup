package ja.basic.one;

/*

java -> jvm(자바가상머신) 위에서 동작,
code를 실행할 때 main method를 찾아서 실행
JVM 에게 이 코드의 시작을 main을 통해 알려주는 것 (entry point 지정)
*/
public class Main {

	void main(String[] args) {

		//String
		String str1 = new String("HelloWorld");
		String str2 = "Hello World" + "!!!";

		System.out.println(str1);
		System.out.println(str2);

		System.out.println("1" + 1);
		var a = "1" + 1;
		var b = a instanceof String;
		// var b = a instanceof Integer;  // 오류발생 b = false
		System.out.println(b);

		//Integer : 정수를 다루는 클래스
		//int : 정수를 다루는 기본 자료형(primitive type)
		int int1 = 10;
		int int2 = 20;
		System.out.println(int1 + int2);

		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);

		//Double : 실수(소수점)를 다루는 클래스
		//double : 실수를 다루는 기본 자료형
		double double1 = 1.123456789012345; //15자리
		System.out.println(double1);
		double double2 = 2; //15자리
		System.out.println(double2);

		System.out.println(Double.MAX_VALUE);
		System.out.println(Double.MIN_VALUE);

	}
}


