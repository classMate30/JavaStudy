import java.util.Scanner;
public class Main {
    static Scanner sc = new Scanner(System.in);
    static VendingMachine vendingmachine = new VendingMachine();
    static AdminMode am = new AdminMode(vendingmachine);
    static UserMode um = new UserMode(vendingmachine);

    public static void main(String[] args) {

        boolean flag = true;
        int sel = 0;
        System.out.println("자판기를 실행합니다. 모드를 선택해주세요");
        System.out.println("1.관리자 모드 | 2.판매 모드");
        int mode = sc.nextInt();

        do {
            switch (mode) {
                case 1:
                    System.out.println("관리자 모드가 실행됩니다.");
                    sel = am.display();
                    flag = am.process(sel);
                    if (sel == 5){ mode = 2 ;}
                    break;
                case 2:
                    System.out.println("판매 모드가 실행됩니다.");
                    sel = um.display();
                    flag = um.process(sel);
                    if (sel == 99){ mode = 1 ;}
                    break;
                default:
                    System.out.println("잘못 입력하셨습니다.");

            }
        } while (flag) ;

        System.out.println("프로그램을 종료합니다.");
        System.exit(-1);
    }
}
