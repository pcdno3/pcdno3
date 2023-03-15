import java.util.*;

class ScannerTest3{
	public static void main(String[] args) {
		//사각형의 너비(가로)와 높이(세로)를 입력 받아 넓이를 계산하여 출력하시오 

		Scanner sc=new Scanner(System.in);
		
		System.out.println("사각형의 너비를 입력하세요:");
		String w=sc.nextLine();

		System.out.println("사각형의 높이를 입력하세요:");
		String h=sc.nextLine();


		//2. 로직 처리 - 사각현 면접 구하기
		//문자열을 숫자로 형변환 후 연산
		int width=Integer.parseInt(w);
		int height=Integer.parseInt(h);
		int area = width*height;


		//3. 결과 출력
		System.out.println("사각형 가로 : "+width);
		System.out.println("사각형 가로 : "+height);
		System.out.println("사각형 면적 : "+area);
	}
}
