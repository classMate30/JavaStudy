public interface Items					//Stock�̶�� �ɷ� Item�� �ΰ��� ������ ������ ���� (������  /  ��ȭ)
{														// Item ��� �����ǿ� ��ȭ�� �� ����
	public abstract void add();			//������ ��� �ľ��ؼ� Maximum(10)���� �ѹ��� ä���ִ� ����� ����ϴ� �޼ҵ�
	public abstract String getName();	//Name�� ���� �ϴ� �Լ�
	public abstract int getPrice();		//Price�� ���� �ϴ� �Լ�
	public abstract int getAmount();	//Amount�� ���� �ϴ� �Լ�
}