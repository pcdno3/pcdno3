class ConversionTest5 {
	public static void main(String[] args) {

		char ch1='a';
		char ch2=(char)(ch1-32);

		System.out.println(ch1+" => 대문자료 변환 : "+ch2);

		float pi=3.141592f;
		float sol=(int)(pi*1000)/1000f; //(int*int)/float = float
		
		
		System.out.println(sol);
	}
}
