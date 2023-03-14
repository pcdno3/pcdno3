class  VarKind {
	/*
		변수의 종류
		1) 멤버변수 (instance변수)
		2) 클래스변수 (static변수)
		3) 지역변수 (local변수)
			- 매서드나 {}블럭안에서 선언된 변수
			- 지역변수는 반드시 초기화해야 함, 초기화하지 않고 사용하면 error남!
			- 멤버변수와 클래스 변수는 초기화 하지 않아도 default값이 들어감
	*/
	
	//멤버변수
	int x;
	//클래스변수
	static int y;

	public static void main(String[] args) {
		//지역변수
		int z=0;
		String s="", s2="null";
		double d=0.0;
		boolean bool=false;
		int k;

		System.out.println("클래스 변수 y = "+VarKind.y);
		
		VarKind obj = new VarKind();
		
		System.out.println("지역변수 z = "+z+", s="+s+", s2="+s2);
		
		System.out.println("d="+d+",bool="+bool);
		System.out.println("k="+k);
		//error: variable k might not have been initialized 초기화 안하면 이오류ㅎㅎㅎ

	}
}
