class ConversionTest2 {
   public static void main(String[] args) {
      char ch1 = 'A', ch2 = 'Z';

      int num1 = ch1; //char => int로 자동형변환됨
      int num2 = (int)ch2; //chardhk int간에는 명시적 형변환하기도 함

      System.out.println("문자 A의 유니코드 값 : " + num1);
      System.out.println("문자 Z의 유니코드 값 : " + num2);

      int n = ch1 + 1; //chat + int => int + int => int, int로 자동형변환되어서 계산
      //=> 'A' + 1 = 65 => 65 + 1 = 66

      char ch3 = (char)(ch1 + 2); //65 + 2 => 67 => char로 형변환
      //char ch4 = (char)ch1 + 2;   //비교, Char + int => int라서 char에 안담김
 
	  int a=97;
	  char b=(char)a;
	  int c=122;
	  char d=(char)c;
	  char d2=(char)c; 
	  //char d2=c;	error, int -> char로 자동 형변환 안됨 !!

	  System.out.println("유니코드"+a+" 에 해당하는 문자 : " +b);
	  System.out.println("유니코드"+c+" 에 해당하는 문자 : " +d);

		
		
   }
}