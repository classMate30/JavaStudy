import java.util.List;
import java.util.Scanner;

public class UserMenu implements Menu {
    Scanner scanner = new Scanner(System.in);
    private Machine machine;
    private Report report;
    List<Item> items;
    int minPrice;

    public UserMenu(Machine machine) {
        this.machine = machine;
        items = machine.getItems();
        report = machine.getReport();

        minPrice = items.get(0).price;
        for (Item item : items) {
            if (item.price < minPrice) {
                minPrice = item.price;
            }
        }

        System.out.println("===========  ��ǰ ���� ==========");
    }

    public void doProcess() {
        boolean isEnd = false;
        while (true) {
            System.out.print("���� �������� :) ");
            int money = scanner.nextInt();
            machine.setMoney(machine.getMoney() + money);
            if (showCanBuy(machine.getMoney())) {
                System.out.print("���ϴ� ��ǰ�� �����ϼ��� :) ");
                int itemId = scanner.nextInt();
                String item = machine.getItem(itemId).name;
                boolean valid = machine.buy(itemId);
                if(valid){
                    System.out.println(item + "�� �����߽��ϴ�.");
                    report.write(item);
                    System.out.println("�� �����Ͻðڽ��ϱ�? (Y/N) ");
                }else {
                    System.out.println("��� �����մϴ�");
                    System.out.println("�ٸ� ��ǰ�� �����Ͻðڽ��ϱ�? (Y/N) ");
                }
                switch (scanner.next()) {
                    case "Y":case "y":break;
                    case "N":case "n":System.out.println("�Ž����� " + machine.getMoney() + "���� ���������� :) ");
                        machine.setMoney(0);
                        isEnd = true;
                        break;
                    default:
                        System.out.println("�߸��� �Է�.. ó������ �̵��մϴ�.");
                }
            } else {
                continue;
            }
            System.out.println("=======================================");
            if (isEnd) {
                break;
            }
        }

    }

    public void showItems() {
        System.out.println("��ȣ ��ǰ�� ������ �뷮 ����");
        for (Item item : items) {
            System.out.println(item);
        }
    }

    public boolean showCanBuy(int money) {
        if (money < minPrice) {
            System.out.println("���� �ʹ� �����ϴ�.. �� �־��ּ���.. ");
            return false;
        } else {
            System.out.println(money + "������ �� �� �ִ� ����");
            System.out.println("=> ");

            for (Item item : items) {
                if (item.price <= money) {
                    System.out.println(item.itemId + ". " + item.name + " " + item.price + "��");
                }
            }
            return true;
        }
    }

}