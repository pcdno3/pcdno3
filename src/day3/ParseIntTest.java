class ParseIntTest  {
	public static void main(String[] args) {
		//문자열을 숫자형태로 형변환 : Integer.parseInt()메서드 이용
		//public static int parseInt(String s)
		String str="123";
		//★int num=(int)str;//error, : 참조형과 기본형은 Cast연산자로 형변환 불가
		//error: incompatible types: String cannot be converted to int
		
		int n= Integer.parseInt(str);//123

		System.out.println("String str+10="+(str+10)); //12310
		System.out.println("int n+10="+(n+10)); //133

		str="3.14";
		double d=Double.parseDouble(str); 
		System.out.println("d+10="+(d+10));//13.14

		str="abc";
		n= Integer.parseInt(str); //컴파일은 되지만 실행에러 발생 -> 숫자만 가능
		//.NumberFormatException: For input string: "abc"
	}
}
