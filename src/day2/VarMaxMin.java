class VarMaxMin
{
	public static void main(String[] args) 
	{
		/*
			Wrapper 클래스
			- 자료형 대체 클래스
			- 기본형 변수들도 때로는 객체로 다루어져야 하는 경우가 있는데,
			  이때 사용되는 것이 Wrapper 클래스

			  Boolean, Character, Byte, Short, Integer, Long, Float, Double
		*/
		byte b_min=Byte.MIN_VALUE;
		byte b_max=Byte.MAX_VALUE;

		int i_min=Integer.MIN_VALUE;
		int i_max=Integer.MAX_VALUE;
		int i=i_max+1;	// garbage값

		char c_min=Character.MIN_VALUE;
		char c_max=Character.MAX_VALUE;

		System.out.println("byte min="+b_min+", byte max="+b_max);
		System.out.println("int min="+i_min+", int max="+i_max+", i="+i);
		System.out.println("char min="+c_min+", char max="+c_max);
		System.out.println("char min code="+(int)c_min+", char max="+(int)c_max);
	}
}
