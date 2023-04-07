import java.util.Scanner;
class Phone {
	private String name = null;
	private String tel = null;
	Phone(String name, String tel){
		this.name = name;
		this.tel = tel;
	}
	public String getName() {
		return name;
	}
	public String getTel() {
		return tel;
	}
}

class PhoneBook{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Phone phone[];
		int i;
		System.out.print("인원수>>");
		int num = scan.nextInt();
		phone = new Phone[num];
		for(i=0; i<phone.length; i++) {
            System.out.print("이름과 전화번호(이름과 번호는 빈 칸없이 입력)>>");
            String name = scan.next();
            String tel = scan.next();
            phone[i] = new Phone(name, tel);
        }
        System.out.println("저장되었습니다...");
        while(true) {
            System.out.print("검색할 이름 >>");
            String name = scan.next();
            for(i=0; i<num; i++) {
                if(name.equals(phone[i].getName())) {
                    System.out.println(name+"의 번호는 "+phone[i].getTel()+" 입니다.");
                    i--;
                    break;
                }
            }
            if(name.equals("그만")) break;
            if (i == num) System.out.println(name+" 이 없습니다.");
        }

        scan.close();
    }
}