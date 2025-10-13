public class TypeMain {
	static void main(String[] args) {
		// 자료형
		// 기본 자료형(primitive type) => stack 메모리에 위치
		// 참조 자료형(reference type) => heap 메모리에 위치
		// 기본값이 다름
		// int => 0, Integer => null
		// double => 0.0, Double => null
		// boolean => false, Boolean => null

		int a = 1;      // 소문자로 시작 -> 기본 자료형
		Integer b = 1;  // 대문자로 시작 -> 참조 자료형

		double c = 1.0;
		Double d = 1.0;

		boolean f = true;
		Boolean g = true;

		// null, generic
		// primitive type을 우선적으로 사용하되 특별한 경우에만 reference type을 사용

	}
}
