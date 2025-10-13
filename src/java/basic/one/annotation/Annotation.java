package java.basic.one.annotation;

public class Annotation {
	static void main(String[] args) {
		// 주석 처리
		// java doc 주석
		// todo 주석
		// fixme 주석
		// 일반 주석 -> //
		// 여러줄 주석 -> /* */
		/**
		 * ㄱ
		 * ㄴ
		 * ㄷ
		 */

		// TODO: 2025. 10. 13. 어떤 작업이 끝나고 나면 이어서 작업 - AKI
		// FIXME : 어떤 작업을 수정해야함 - AKI

		String str = "hello";
		var service = new MemberService();
		service.join("you", 30);

	}
}
