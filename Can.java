public class Can {
	//����ʵ�
	public static final int PRODUCT_CNT = 6;
	public final static String[] productNmArray = {"�ݶ�", "���̴�", "����", "ȯŸ", "ĭŸŸ", "���"};
	public final static int[] productPriceArray = {700, 600, 700, 800, 900, 1000};
		
	public final String productNm;
	public final int productPrice;		
	
	//������
	public Can(int i) {
		if(i >= 0 && i < PRODUCT_CNT) { //0~4
			this.productNm = productNmArray[i];
			this.productPrice = productPriceArray[i];	
		} else {
			this.productNm = null;
			this.productPrice = 0;
		}
	}
	
	//�������̵�
	@Override
	public String toString() {
		return String.format("%s (%,d)", this.productNm, this.productPrice);
	}
}