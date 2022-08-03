import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class AdminMenu implements Menu {
    Scanner scanner = new Scanner(System.in);
    private Machine machine;
    private List<Item> items;
    private Map<Item, Integer> stocks;
    private Report report;

    public AdminMenu(Machine machine) {
        this.machine = machine;
        items = machine.getItems();
        stocks = machine.getStocks();
        report = machine.getReport();
    }

    public void showItems() {
        System.out.println("��ȣ ��ǰ�� ������ �뷮 ���� ���");
        for (Item item : items) {
            System.out.print(item);
            System.out.println(stocks.get(item) + "��");
        }
    }

    public void showMenus() {
        System.out.println("========= ������ �޴�  =======");
        System.out.println("1. ��� ä���");
        System.out.println("2. ������� ���� �̷� ����");
        System.out.print("�޴� ��ȣ�� �Է��ϼ��� :) ");
    }

    public void doProcess(int menuNum) {
        switch (menuNum) {
            case 1:
                showItems();
                fillItems();
                break;
            case 2:
                report.print();
                break;
            default:
                System.out.println("�߸��� �Է�..");
                break;

        }
    }

    public void raisePrice(int itemId, int amount) {
        Item item = machine.getItem(itemId);
        item.price += amount;
    }

    public void reducePrice(int itemId, int amount) {
        Item item = machine.getItem(itemId);
        item.price -= amount;
    }

    public void fillItems() {
        int capacity = machine.getCapacity();
        Map<Item, Integer> needToBuy = new HashMap<>();

        for (Item item : stocks.keySet()) {
            if (stocks.get(item) < capacity) {
                int amount = capacity - stocks.get(item);
                //report.itemIn(item,amount);
                needToBuy.put(item, amount);
            }
        }

        String list = "";
        for (Item item : needToBuy.keySet()) {
            list += item.name + " " + needToBuy.get(item) + "��, ";
        }
        list = list.substring(0, list.length() - 2);

        System.out.println("��� �� ä�����");
        System.out.println(list + "�� �ʿ��մϴ�.");
        System.out.print("�ֹ��Ͻðڽ��ϱ�? (Y/N) ");
        switch (scanner.next()) {
            case "Y":
            case "y":
                for (Item item : needToBuy.keySet()) {
                    machine.fill(item, needToBuy.get(item));
                }
                break;
            case "N":
            case "n":
                System.out.println("������ �޴��� �����մϴ�. :)");
                System.out.println("=============================");
                break;
        }
    }
}