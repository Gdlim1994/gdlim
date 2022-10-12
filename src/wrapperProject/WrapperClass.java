package wrapperProject;

public class WrapperClass {

	public static void main(String[] args) {
		// Wrapper Class : 기본형과 참조형간의 형변환(박싱, 언박싱 //통칭 오토박싱)
		//박싱 : 기본형 -> 참조형 
		//언박싱 :  참조형 -> 기본형

		int i = 10;
		Integer intg = i; // 박싱  // Integer intg = new Interger(i); // Integer intg = (Integer)i;
		Integer intg2 = new Integer(10);
		int i2 = intg2; // 언박싱
		
		System.out.println(intg2 + i2);
		
		Object obj = (Object)i; //object는 박싱은 가능
		//int i3 = obj; // object는 언박싱은 불가
		
		String str = "50"; // 문자를 넣게되면 int형으로 타입변화를 시킨 것이기 때문에 에러가 난다.
		int i4 = Integer.parseInt(str);
		
		System.out.println(i4);
	}

}
