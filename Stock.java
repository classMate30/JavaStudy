public interface Items					//Stock이라는 걸로 Item을 두개로 나눠서 관리할 것임 (상하의  /  잡화)
{														// Item 대신 상하의와 잡화를 쓸 것임
	public abstract void add();			//부족한 재고를 파악해서 Maximum(10)까지 한번에 채워주는 기능을 담당하는 메소드
	public abstract String getName();	//Name을 리턴 하는 함수
	public abstract int getPrice();		//Price를 리턴 하는 함수
	public abstract int getAmount();	//Amount를 리턴 하는 함수
}