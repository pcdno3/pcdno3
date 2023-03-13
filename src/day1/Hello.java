import java.lang.*;//생략 가능한 패키지 , java 패키지안의 모든 클래스를 패키지명 생략하고
					//클래스명만으로 사용하겠다는 의미

//import java.lang.System; //java.lang 패키지는 생략하고 클래스명인 System만으로 사용하겠다
//import java.lang.String;

/*
	패키지 - 비슷한 유형의 클래들끼리 묶어서 관리
			폴더와 유사한 개념
	import 패키지명.클래스명; =>패키지명을 생략하고 클래스명만으로 사용하겠다는 의미
*/

/*

	모든 자바 프로그램에는 최소한 클래스 한개가 있어야 하며, main메서드가 있어야 한다
	자바 프로그램을 실행시키면 JVM이 해당 클래스(Hello.class)를 부럴오고 그 main
	안에 있는 모든 것을 실행 시킨다;

	- 클래스명과 파일명은 동일해야 함 (클래스명 hello => 파일명 Hello.java)
*/

	//한줄주석

	/*
		여러줄 주석
	*/
/** 
	Document주석, Documentation API를 만들 때 사용하는 주석

*/
public class Hello
{
	public static void main(String[]args)
	{
		System.lang.out.println("Hello JAVA!!");
		System.out.println("hi spring!!");
	}
}

/*
	파일명 : Hello.java

	먼저 소스 코드가 있는 폴더로 이동
	d:
	cd D:\lecture\java\src\day1

	1. 컴파일(컴파일러인 javac 이용)
	javac Hello.java

	2. 실행 (자바 Launcher인 java 이용)
	java Hello

	3. 파일 목록 확인
	dir

*/
