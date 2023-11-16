package quiz_answer;

import java.util.HashSet;

public class D04_isJavaVariable_answer {
	
	static HashSet<String> reservedKeywords = new HashSet<>();
	static String [] kws = {
	        "abstract", "continue",     "for",          "new",          "switch",
	        "assert",   "default",      "if",           "package",      "synchronized",
	        "boolean",  "do",           "goto",         "private",      "this",
	        "break",    "double",       "implements",   "protected",    "throw",
	        "byte",     "else",         "import",       "public",       "throws",
	        "case",     "enum",         "instanceof",   "return",       "transient",
	        "catch",    "extends",      "int",          "short",        "try",
	        "char",     "final",        "interface",    "static",       "void",
	        "class",    "finally",      "long",         "strictfp",     "volatile",
	        "const",    "float",        "native",       "super",        "while",
	        "null",     "true",         "false"
	    	};
	static {
		// 배열의 모든 내용을 Set에 추가
		for (String kw : kws) {
			reservedKeywords.add(kw);
		}
	}

	boolean checkVerName(String verName) {
		// 매개변수가 예약어목록에 있는지 확인
		if(reservedKeywords.contains(verName)) {
			System.out.printf("%s는 자바 예약어이므로 변수명으로 사용할 수 없습니다.\n", verName);
			return false;
		}
		if(Character.isJavaIdentifierStart(verName.charAt(0))) {
			for(int i = 1; i < verName.length(); i++) {
				char ch = verName.charAt(i);
				if(!Character.isJavaIdentifierPart(i)) {
					System.out.printf("%d 번째 문자 %c는 변수명으로 적합하지 않습니다.", i, ch);
					return false;
				}
			}
			return true;
		} else {
			System.out.printf("첫 번째 문자 %c는 변수명으로 사용할 수 없습니다.\n", verName.charAt(0));
			return false;
		}
	}
	
	public static void main(String[] args) {
		D04_isJavaVariable_answer quiz = new D04_isJavaVariable_answer();
		System.out.println(quiz.checkVerName("ABCD"));
		System.out.println(quiz.checkVerName("7eleven"));
		System.out.println(quiz.checkVerName("channel#3"));
		System.out.println(quiz.checkVerName("int"));
		System.out.println(quiz.checkVerName("_1num$"));
	}
	
}
