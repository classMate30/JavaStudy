import java.util.Scanner;
public class Main {
    static Scanner sc = new Scanner(System.in);
    static VendingMachine vendingmachine = new VendingMachine();
    static AdminMode am = new AdminMode(vendingmachine);
    static UserMode um = new UserMode(vendingmachine);

    public static void main(String[] args) {

        boolean flag = true;
        int sel = 0;
        System.out.println("���Ǳ⸦ �����մϴ�. ��带 �������ּ���");
        System.out.println("1.������ ��� | 2.�Ǹ� ���");
        int mode = sc.nextInt();

        do {
            switch (mode) {
                case 1:
                    System.out.println("������ ��尡 ����˴ϴ�.");
                    sel = am.display();
                    flag = am.process(sel);
                    if (sel == 5){ mode = 2 ;}
                    break;
                case 2:
                    System.out.println("�Ǹ� ��尡 ����˴ϴ�.");
                    sel = um.display();
                    flag = um.process(sel);
                    if (sel == 99){ mode = 1 ;}
                    break;
                default:
                    System.out.println("�߸� �Է��ϼ̽��ϴ�.");

            }
        } while (flag) ;

        System.out.println("���α׷��� �����մϴ�.");
        System.exit(-1);
    }
}
