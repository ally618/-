package assi;
import java.util.Scanner;

public class Q12_2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int ans=0;
		
		System.out.println("숫자, 연산자, 숫자 순으로 계산하고 싶은 식을 입력하시오. 사칙연산만 가능합니다.");
		System.out.print("연산>>");
		
		
		int num1=scanner.nextInt();
		String c=scanner.next();
		int num2=scanner.nextInt();
		
		switch (c) {
		case "+": 
			ans=num1+num2;
			System.out.println(num1+c+num2+"의 계산결과는"+ans+"입니다."); break;
		case "-":
			ans=num1-num2;
			System.out.println(num1+c+num2+"의 계산결과는"+ans+"입니다."); break;
		case "/": 
			if(num2==0) 
		    	{System.out.print("0으로는 나눌 수 없습니다.!");}
			ans=num1/num2;
		    System.out.println(num1+c+num2+"의 계산결과는"+ans+"입니다."); 
		    	break;
		case "*": 
			ans=num1*num2;
			System.out.println(num1+c+num2+"의 계산결과는"+ans+"입니다."); break;	
	}
	
	scanner.close();
	}

}
