import java.util.Scanner;

public class Clothes implements Items //상/하의
{
	int itemId;
	String name;
	int[] size;
	int price;
	long date;
	Scanner sc = new Scanner(System.in);

	public Clothes(int itemId, String name, int price, int[] size) {
		this.itemId = itemId;
		this.name = name;
		this.price = price;
		this.size = size;
		this.date = System.currentTimeMillis();
	} //생성자

	public String getName() {
		return this.name;
	} //Name을 리턴 하는 함수

	public int getPrice() {
		return this.price;
	} //Price를 리턴 하는 함수

	public int getAmount() {                            //Amount를 리턴 하는 함수

		System.out.print("사이즈를 입력해주세요(S/M/L) : ");
		String s = sc.next();
		if (s.equals("S") || s.equals("s")) {
			return size[0];
		} else if (s.equals("M") || s.equals("m")) {
			return size[1];
		} else if (s.equals("L") || s.equals("l")) {
			return size[2];
		} else {
			System.out.print("잘 못 입력하셨습니다. ");
			return 0; // 재입력 받게 끔
		}
	} //Amount를 리턴 하는 함수

	public boolean setAmount() {

		System.out.print("사이즈를 입력해주세요(S/M/L) : ");
		String s = sc.next();
		if (s.equals("S") || s.equals("s")) {
			if (this.size[0] == 0) {
				System.out.println("<<품절>> 구매 불가능 합니다.");
				return false ;
			} else {
				this.size[0] -= 1;
			}
		} else if (s.equals("M") || s.equals("m")) {
			if (this.size[1] == 0) {
				System.out.println("<<품절>> 구매 불가능 합니다.");
				return false ;
			} else {
				this.size[1] -= 1;
			}
		} else if (s.equals("L") || s.equals("l")) {
			if (this.size[2] == 0) {
				System.out.println("<<품절>> 구매 불가능 합니다.");
				return false ;
			} else {
				this.size[2] -= 1;
			}
		} else {
			System.out.print("잘못 입력하셨습니다. ");
			return false ;
		}
		return true;
	} //Amount를 설정 하는 함수(-1 해줌)

	public void fill() {
		System.out.print("사이즈를 입력해주세요(S/M/L) : ");
		String s = sc.next();

		if (s.equals("S") || s.equals("s")) {

			this.size[0] += 5;

		} else if (s.equals("M") || s.equals("m")) {

			this.size[1] += 5;
		} else if (s.equals("L") || s.equals("l")) {

			this.size[2] += 5;
		}
		//System.out.println(this.size[0]+ " " +this.size[1] + " " +this.size[2]);
	} // 5개씩 추가

	public int getSize(int num) {
		return this.size[num];
	}

	@Override
	public String toString() {
		return itemId + ". " + name + "는 현재 S: " + size[0] + "개 M: " + size[1] + "개 L: " + size[2] + "개 입니다.";
	}
}