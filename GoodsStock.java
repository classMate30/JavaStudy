//��ǰ A10001, ������� 500
// ��� ����, ���Ұ� ���� �Է¹޾Ƽ�
//��� - �������, �����



import java.util.Scanner;

class GoodsStock{
	String goodsCode;
	int stockNum;
		
	void addStock(int a) {
		//��� ���ϱ�
		stockNum = stockNum + a;

		System.out.println(goodsCode + "�� �������� "+ stockNum +"�� �Դϴ�.");
	}
	
	int subStock(int b) {
		stockNum = stockNum - b;	
		System.out.println(goodsCode + "�� �������� "+ stockNum +"�� �Դϴ�.");	
		return stockNum;
	}

	
}

public class GoodsStockMain {
		
	public static void main(String[] args) {
		// ��ǰ ���� amount �� ����, ���ҿ� ���� ������ ó��
		
				
		GoodsStock G1 = new GoodsStock();
		G1.goodsCode = "A10001";
		G1.stockNum = 500;

		Scanner sc = new Scanner(System.in);
		Scanner sc1 = new Scanner(System.in);
		
		System.out.print("������ ������ �Է� : ");
		int a1 = sc.nextInt();

		G1.addStock(a1);
		System.out.println("------------------");

		System.out.print("������ ���Ұ� �Է� : ");
		int a2 = sc1.nextInt();
		int ra = G1.subStock(a2);
		System.out.println("�������� "+ ra + "�� ����Ǿ����ϴ�.");
		System.out.println("------------------");
		

	}

}