public interface Items					//Item을 두개로 나눠서 관리할 것임 공통된 속성을 뽑아서 인터페이스로 만드려고 처음에 설계함 (상하의 / 잡화)
{										//Item 대신 상하의와 잡화를 쓸 것임
	public abstract String getName();	//Name을 리턴 하는 함수
	public abstract int getPrice();		//Price를 리턴 하는 함수
	public abstract int getAmount();	//Amount를 리턴 하는 함수
	public abstract void setAmount();   //Amount를 설정 하는 함수(-1 해줌)
	public abstract void fill();        // 5개씩 추가

}

