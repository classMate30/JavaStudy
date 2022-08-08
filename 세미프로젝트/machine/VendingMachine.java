//�Ӽ� + ��� Ŭ���� ������ ����
//���ļ� ���� �ڷᱸ�� �ʿ�(���� �ܰ迡�� �ڷᱸ�� ��� ����)
//��money�� coin�̶�� �����̸� �����ؾ��ԡ� 
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class VendingMachine
{
	//�ֿ� ������ ����
	private List<Items> items ;
	private MoneyInsert moneyinsert;
	private Sales sales;

	public VendingMachine()
	{	
		//List �ε����� �̰͵��� ������ �� �ְ� ��
		items = new ArrayList<>();		//���� ����
		items.add(new Clothes(1, "�μҸ�", 5000, new int[]{5,5,5}));
		items.add(new Clothes(2, "����", 15000, new int[]{5,5,5}));
		items.add(new Clothes(3, "��Ʈ", 50000, new int[]{5,5,5}));
		items.add(new Clothes(4, "�е�", 100000, new int[]{5,5,5}));
		items.add(new Clothes(5, "��Ʈ�ػ���", 10000, new int[]{5,5,5}));
		items.add(new Clothes(6, "�ݹ���", 15000, new int[]{5,5,5}));
		items.add(new Clothes(7, "�����", 20000, new int[]{5,5,5}));
		items.add(new Clothes(8, "������", 30000, new int[]{5,5,5}));
		items.add(new Clothes(9, "��������", 10000, new int[]{5,5,5}));
		items.add(new Clothes(10, "��Ʈ������", 10000, new int[]{5,5,5}));
		items.add(new Accessories(11, "���", 3000,5));
		items.add(new Accessories(12, "����", 15000,5));
		items.add(new Accessories(13, "�񵵸�", 15000,5));
		items.add(new Accessories(14, "�尩", 10000,5));
		items.add(new Accessories(15, "���۶�", 30000,5));
		moneyinsert  = new MoneyInsert() ;
		sales = new Sales(items);
	}
	public void getRanking() {
		sales.ranking();
	}
	public void moneyDisplay() {
		moneyinsert.Display();
	}
	public int getSalesAll() {
		return sales.getsumAll();
	}
	public void ItemsDisplay() {
		for(Items item : items){
			System.out.println(item);
		}
	}
	public List<Items> getItems() {return this.items;}
	public Sales getSales()
	{
		return this.sales;
	}
	public int getInsert(){
		int coin = moneyinsert.insert_coin();
		return coin ;
	}
	public void returnRemainMoney(int remain)
	{
		moneyinsert.returnMoney(remain);
	}
	public void stockUp(int itemId) {
		if (itemId >= 0 && itemId < 15)
		{
			items.get(itemId).fill();
			System.out.println(items.get(itemId).getName() + " ��(��) 5�� �߰��Ǿ����ϴ�.");
		}
		else
		{
			System.out.print("�߸� �Է��ϼ̽��ϴ�.");
		}
	}
	public boolean buy(int itemId) {
		boolean result = items.get(itemId).setAmount();
		return result ;
	}
}