/*===================================
�����÷��� �����ӿ�ũ���� 
================================*/

//Test163 Ŭ������ �ϼ��Ͽ� ��������� ���� ���α׷��� �����Ѵ�.

/*
���� ��)
����Ǹ�
 [�޴� ����]
 1.��� �߰� add  do while
 2.��� ��� elementAt
 3.��� �˻� 
 4.��� ����
 5. ��� ����
 6.����    switch ��ߵɵ�?

 >>�޴� ����(1-6) : 1

 1��° ��� �Է� : ������
 1��° ��� �Է� ����!
 ��� �Է� ���(Y/N) : y �̰� while�� �̾����Ű���.

 2��° ��� �Է� : ���ҿ�

 ��� �Է� ���(Y/N) : N
 �׷� �ٽ� �޴��ȳ� �������� ���ư���
 [�޴� ����]
 1.��� �߰� add  do while
 2.��� ��� elementAt
 3.��� �˻� 
 4.��� ����
 5. ��� ����
 6.����

  >>�޴� ����(1-6) : 2

  [���� ��ü ���]
  ������
  ���ҿ�
  ���� ��ü ��¿Ϸ�~!!

   [�޴� ����]
 1.��� �߰�
 2.��� ���
 3.��� �˻� 
 4.��� ����
 5. ��� ����
 6.����

  >>�޴� ����(1-6) : 3

  >> �˻��� ��� �Է�: ������

  [�˻� ��� ���]
  �׸��� �����մϴ�.

   [�޴� ����]
 1.��� �߰�
 2.��� ���
 3.��� �˻� 
 4.��� ����
 5. ��� ����
 6.����

  >>�޴� ����(1-6) : 3

  >>�˻��� ��� �Է�: �ݺ���
  
  [�˻� ��� ���] -> if���� �����ؾ��ҵ�
  �׸��� �������� �ʽ��ϴ�.

   [�޴� ����]
 1.��� �߰� 
 2.��� ��� 
 3.��� �˻� 
 4.��� ����
 5. ��� ����
 6.����

  >>�޴� ����(1-6) : 4

  >>������ ��� �Է� : �躸��

  [���� ��� ���]
  �׸��� �������� �ʾ� ������ �� ����.

   [�޴� ����]
 1.��� �߰� 
 2.��� ��� 
 3.��� �˻� 
 4.��� ����
 5. ��� ����
 6.����

  >>�޴� ����(1-6) : 4

  >>������ ��� �Է�: ������

  [���� ��� ���]
  ������ �׸��� �����Ǿ����ϴ�.

   [�޴� ����]
 1.��� �߰� 
 2.��� ��� 
 3.��� �˻� 
 4.��� ����
 5. ��� ����
 6.����

  >>�޴� ����(1-6) : 5

>>������ ��� �Է� : ���ҿ�

  [������ ���]
  ������ ����� �������� �ʽ��ϴ�.

   [�޴� ����]
 1.��� �߰� 
 2.��� ��� 
 3.��� �˻� 
 4.��� ����
 5. ��� ����
 6.����

  >>�޴� ����(1-6) : 5

>>������ ��� �Է� : ���ҿ�
>>������ ���� �Է� : ������

[���� ��� ���]
������ �Ϸ�Ǿ����ϴ�.

[���� ��ü ���]

������
���� ��ü ���

   [�޴� ����]
 1.��� �߰� 
 2.��� ��� 
 3.��� �˻� 
 4.��� ����
 5. ��� ����
 6.����

 >>�޴� ���� : 6

 ���α׷� ����~!!!


 

 
*/

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Vector;
import java.util.Iterator;

class Menus //�ϼ��� Ŭ����
{
	public static final int E_ADD = 1;
	public static final int E_DISP = 2;
	public static final int E_FIND = 3; //sel == Menus.E_DD �̷��� ����ɵ�
	public static final int E_DEL = 4;
	public static final int E_CHA = 5;
	public static final int E_EXIT = 6;
}

public class TTest163
{		//�ֿ� �Ӽ� ���� -> �Ϸ�
	private static final Vector<Object> vt;
	private static BufferedReader br; //�Է¿�
	private static Integer sel;		//���� ��
	private static String con;		//��� ���� ����
	
	static //����ƽ �ʱ�ȭ ���̶�� �Ѵ�.
	{
		//Vector �ڷᱸ�� ����
		vt = new Vector<Object>();

		//BufferedReader Ŭ���� �ν��Ͻ� ����
		br = new BufferedReader(new InputStreamReader(System.in));

		//����� �Է°� �ʱ�ȭ
		sel = 1;
		con = "Y";

	}
   //�޴� ��� -> �޴� ���� -> �ش��� ���� -> �޴� ���
	//�޴� ��� �޼ҵ�
	public static void menuDisp()
	{	
		System.out.println("[�޴� ���]");
		System.out.println("1.��� �߰�");
		System.out.println("2.��� ���");
		System.out.println("3.��� �˻�");
		System.out.println("4.��� ����");
		System.out.println("5.��� ����");
		System.out.println("6.����");
	}

	//�޴� ���� �޼ҵ�
	public static void menuSelect()throws IOException
	{
		
		try
		{
		System.out.print(">>>�޴� ���� : ");
		sel = Integer.parseInt(br.readLine()); //������ ��ȣ �Է�		
		}
		catch (NumberFormatException e) //���� ��� ó�� �ϹǷ� NumberFormatException���� ����
		{
			System.out.println("[����,Ư������,����]�� �Է��׸� ���ԵǾ����� �ʽ��ϴ�.");
			menuSelect(); //�޴����� ��ȣ��
		}
		
		
		
	}
	//���õ� �޴� ���࿡ ���� ��� ȣ�� �޼ҵ�
	public static void menuRun()throws IOException
	{
		switch (sel)
		{
		case Menus.E_ADD : addElement(); break; 
		case Menus.E_DISP : dispElement(); break;
		case Menus.E_FIND : findElement(); break;
		case Menus.E_DEL : delElement(); break;
		case Menus.E_CHA : chaElement(); break;
		case Menus.E_EXIT : exit(); break;
		}
	}

	//�ڷᱸ���� ��� �߰�(�Է�) �޼ҵ�

	public static void addElement() throws IOException
	{//1��° ��� �Է� : ������
	 //1��° ��� �Է� ����!
	 //��� �Է� ���(Y/N) : y �̰� while�� �̾����Ű���.

	 //2��° ��� �Է� : ���ҿ�
	 //��� �Է� ���(Y/N) : N
	 
	 String name="";
	 do
	 {
		 System.out.printf("%d��° ��� �Է� : ",vt.size()+1); 
		 name = br.readLine();
		 vt.add(name); //StringŬ�����̹Ƿ� �ڵ����� ObjectŬ�����ξ�ĳ���� �ɰ�
		 System.out.printf("%d��° ��� �Է¼���\n",vt.size()); 
		 System.out.print("��� �Է� ���(Y/N)");
		 con = br.readLine();
		 con = con.toUpperCase(); //�ҹ���y��  �빮�ڷ� �ν�����
		// decision = (char)System.in.read();
		// System.in.skip(2); //\s \r ��ŵ
		 
	 }
	 while (con.equals("Y"));   //��

	 System.out.println();
		 

	}
	//�ڷᱸ�� ��¸޼ҵ� ���⼭���� Iterator �ʿ��ҵ�
	public static void dispElement()
	{

		//[���� ��ü ���]
		//  ������
		// ���ҿ�
		// ���� ��ü ��¿Ϸ�~!!
		Iterator<Object> vi = vt.iterator(); //hasNext() �� next() 
		System.out.println("[���� ��ü ���]");

		while (vi.hasNext()) 
		{
			System.out.println((String)vi.next()); //Object Ŭ���� �����ν� String���� �ٿ�ĳ����������Ѵ�.
		}
		System.out.print("��� ��ü ��� �Ϸ�");
		System.out.println();
							//��
	  
	}

	//�ڷᱸ���� ��� �˻��޼ҵ�  //.contain(Element) ���
	public static void findElement() throws IOException
	{
	//	>>�˻��� ��� �Է�: �ݺ���

	//	[�˻� ��� ���] -> if���� �����ؾ��ҵ�
	//	�׸��� �������� �ʽ��ϴ�.

	System.out.print(">>�˻��� ��� �Է� : ");
	String eleMent = br.readLine();
	System.out.println("[�˻� ��� ���]");
	if(vt.contains(eleMent))
		{
		int index = vt.indexOf(eleMent);
		System.out.println((String)vt.elementAt(index)+"�� �����մϴ�.");
		}
	else
		{
		System.out.print("�׸��� �������� �ʽ��ϴ�.\n");
		}
		
		
	}
	//�ڷᱸ���� ��� ���� �޼ҵ� //��� ������ ���� contains -> indexOf -> remove
	public static void delElement() throws IOException
	{
//	 >>������ ��� �Է�: ������

 // [���� ��� ���]
 // ������ �׸��� �����Ǿ����ϴ�.
 		
		System.out.print(">>������ ��� �Է� : ");
		String name = br.readLine();
		System.out.println("[���� ��� ���]");
		if(vt.contains(name))
		{
		  int index = vt.indexOf(name);
		  vt.remove(index);
		  System.out.println(name+"  ����.");
		}
		else
		{
			System.out.print("�ش� ��Ҵ� �������� �ʽ��ϴ�.\n");
		}


	}
	//��� ��ȯ
	public static void chaElement() throws IOException
	{
	//	>>������ ��� �Է� : ���ҿ�

	//	[������ ���]
	//	������ ����� �������� �ʽ��ϴ�.
		System.out.print(">>������ ��� �Է� : ");
		String name = br.readLine();
		
		if(vt.contains(name))
		{	
			System.out.print(">>���� ���� �Է� : ");
			String nameCh = br.readLine();
			int index = vt.indexOf(name);
			vt.set(index,nameCh);
			System.out.println(name+" ��(��) "+(String)vt.get(index)+"���� ����Ǿ����ϴ�.");

		}
		else
		{
			System.out.println("[���� ��� ���]");
			System.out.println("�ش� ��Ҵ� �������� �ʽ��ϴ�.");
		}
		
	}

	public static void exit()
	{
		System.out.println("���α׷� ����");
		System.exit(-1);
	}



//main �޼ҵ� �ϼ�
	public static void main(String[] args)throws IOException, NumberFormatException
	{
		do
		{
			menuDisp();
			System.out.println();
			menuSelect();
			System.out.println();
			menuRun();
			System.out.println();
		}
		while (true);


	}
}