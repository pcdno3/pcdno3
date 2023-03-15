class IncrementOp {
	public static void main(String[] args) {
		/*
			단항연산자 - 증감연산자
			++, --

			[1]++
			++a : 선증가, 연산전에 1증가
			a++ : 후증가, 연산후에 1증가
				a=a+1 과 동일
			
			[2]--
			--a : 선감소, 연산전에 1감소
			a-- : 후감소, 연산후에 1감소
				a=a-1 과 동일
		*/
		//어떤 수식에 포함된 것이 아니라 단독으로 사용되는 경우
		//-> 선증가, 후증가 결과는 같다
		int a=7;
		a++;	//a=a+1과 같은 의미,
		System.out .println("a="+a);
		a=7;
		++a;
		System.out.println("a="+a);

			System.out.println("Hello World!");
	}
}
