import java.util.HashMap;
import java.util.Vector;

public class AdminList // ������ id�� pw�� ���� ��������
{	
	// key : id, value: pw
	// account��� Hashtable �ڷᱸ�� ����
	public static HashMap<String, String> account = new HashMap<String, String>();
	private static final String[] ID = {"��", "��", "��", "��"};
	private static final String[] PW = {"1", "2", "3", "4"};	
	private static final Vector<String> id = new Vector<String>();
	private static final Vector<String> pw = new Vector<String>();
	
	static
	{
		// Vector ���� �ʱ�ȭ
		for (String strID : ID)
			id.add(strID);

		for (String strPW : PW)
			pw.add(strPW);

		for (int i = 0; i < id.size(); i++)
			account.put(id.elementAt(i), pw.elementAt(i));
	}
}