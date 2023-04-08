package assi;
import java.util.Scanner;

class Phone{
	String name,tel;
	public Phone(String name, String tel) {
		this.name=name;
		this.tel=tel;
	}
}

public class PhoneBook {
	public static void main(String[]args) {
		Scanner scanner=new Scanner(System.in);
		System.out.print("인원수>>");
		int n=scanner.nextInt();
		
		Phone[] p;
		p= new Phone[n]; //인원수 만큼의 레퍼런스 배열 생성
		
		for(int i=0;i<p.length;i++) {
			System.out.print("이름과 전화번호(이름과 번호는 빈 칸없이 입력)>>");
			String name=scanner.next();
			String tel=scanner.next();
			p[i]=new Phone(name,tel);
		}
		System.out.println("저장되었습니다...");
		
		while(true) {
			System.out.print("검색할 이름>>");
			String SearchName=scanner.next();
			
			if (SearchName.equals("그만"))
				break;
			
			for(int i=0;i<p.length;i++) {
				if (SearchName.equals(p[i].name)) 
					System.out.println(p[i].name+"의 번호는 "+p[i].tel+"입니다.");
			
				else
					System.out.println(SearchName+"이 없습니다.");
			
			}	
		}
		scanner.close();
	}
}

