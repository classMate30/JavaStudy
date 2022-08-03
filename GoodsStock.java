//상품 A10001, 기초재고량 500
// 재고 증가, 감소값 각각 입력받아서
//기능 - 재고증가, 재고감소



import java.util.Scanner;

class GoodsStock{
	String goodsCode;
	int stockNum;
		
	void addStock(int a) {
		//재고 더하기
		stockNum = stockNum + a;

		System.out.println(goodsCode + "의 재고수량은 "+ stockNum +"개 입니다.");
	}
	
	int subStock(int b) {
		stockNum = stockNum - b;	
		System.out.println(goodsCode + "의 재고수량은 "+ stockNum +"개 입니다.");	
		return stockNum;
	}

	
}

public class GoodsStockMain {
		
	public static void main(String[] args) {
		// 상품 수량 amount 의 증가, 감소에 따른 재고수량 처리
		
				
		GoodsStock G1 = new GoodsStock();
		G1.goodsCode = "A10001";
		G1.stockNum = 500;

		Scanner sc = new Scanner(System.in);
		Scanner sc1 = new Scanner(System.in);
		
		System.out.print("재고수량 증가값 입력 : ");
		int a1 = sc.nextInt();

		G1.addStock(a1);
		System.out.println("------------------");

		System.out.print("재고수량 감소값 입력 : ");
		int a2 = sc1.nextInt();
		int ra = G1.subStock(a2);
		System.out.println("재고수량이 "+ ra + "로 변경되었습니다.");
		System.out.println("------------------");
		

	}

}