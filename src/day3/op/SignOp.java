class  SignOp{
	public static void main(String[] args) {
		/*
			단항 - 부호 연산자
			+, -
			피연산자의 부호를 변경하는 데 사용
			boolean, char 제외한 나머지 기본형에서 사용
		*/
		int i=-5;
		i=+i;
		System.out.println("i="+i);

		i=-5;
		i=-i;
		System.out.println(i);

	}
}
