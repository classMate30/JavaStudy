/*=============================================
       ���� �÷��� (Collection) ����
=============================================*/	

//Test163 Ŭ������ �ϼ��Ͽ� ���� ����� ���� ���α׷��� �����Ѵ�

/*
���� ��)

	[�޴� ����]=======
	1.��� �߰�
	2.��� ���
	3.��� �˻�
	4.��� ����
	5.��� ����
	6.����
	=================
>>�޴� ����(1~6)	 : 1

1��° ��� �Է� : ������
1��° ��� �Է� ����~!!!
��� �Է� ���(Y/N)? : y

2��° ��� �Է� : ���ҿ�
2���� ��� �Է� ����~!!!
��� �Է� ���(Y/N)? : N


	[�޴� ����]=======
	1.��� �߰�
	2.��� ���
	3.��� �˻�
	4.��� ����
	5.��� ����
	6.����
	=================
>>�޴� ����(1~6)	 : 2

[���� ��ü ���]
������
���ҿ�
���� ��ü ��� �Ϸ�~!!!


	[�޴� ����]=======
	1.��� �߰�
	2.��� ���
	3.��� �˻�
	4.��� ����
	5.��� ����
	6.����
	=================
>>�޴� ����(1~6)	 : 3

>>�˻��� ��� �Է� : ������

[�˻� ��� ���]
�׸��� �����մϴ�.



	[�޴� ����]=======
	1.��� �߰�
	2.��� ���
	3.��� �˻�
	4.��� ����
	5.��� ����
	6.����
	=================
>>�޴� ����(1~6)	 : 3

>>�˻��� ��� �Է� : �ݺ���

[�˻� ��� ���]
�׸��� �������� �ʽ��ϴ�.

	[�޴� ����]=======
	1.��� �߰�
	2.��� ���
	3.��� �˻�
	4.��� ����
	5.��� ����
	6.����
	=================
>>�޴� ����(1~6)	 : 4

>>������ ��� �Է�: �躸��

[���� ��� ���]
�׸��� �������� �ʾ� ������ �� �����ϴ�


	[�޴� ����]=======
	1.��� �߰�
	2.��� ���
	3.��� �˻�
	4.��� ����
	5.��� ����
	6.����
	=================
>>�޴� ����(1~6)	 : 4

>>������ ��� �Է�: ������

[���� ��� ���]
������ �׸��� �����Ǿ����ϴ�


	[�޴� ����]=======
	1.��� �߰�
	2.��� ���
	3.��� �˻�
	4.��� ����
	5.��� ����
	6.����
	=================
>>�޴� ����(1~6)	 : 5

>>������ ��� �Է� : ������

[���� ��� ���]
������ ����� �������� �ʽ��ϴ�


	[�޴� ����]=======
	1.��� �߰�
	2.��� ���
	3.��� �˻�
	4.��� ����
	5.��� ����
	6.����
	=================
>>�޴� ����(1~6)	 : 5

>>������ ��� �Է� : ���ҿ�
>>������ ���� �Է� : ������

[���� ��� ���]
������ �Ϸ�Ǿ����ϴ�

	[�޴� ����]=======
	1.��� �߰�
	2.��� ���
	3.��� �˻�
	4.��� ����
	5.��� ����
	6.����
	=================
>>�޴� ����(1~6)	 : 2

[���� ��ü ���]
������
���� ��ü ��� �Ϸ�~!!!


	[�޴� ����]=======
	1.��� �߰�
	2.��� ���
	3.��� �˻�
	4.��� ����
	5.��� ����
	6.����
	=================
>>�޴� ����(1~6)	 : 6

���α׷� ����~!!!
����Ϸ��� �ƹ�Ű�� ��������...




*/
import java.util.Vector;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;


class Menus			//�� �ϼ�
{
	public static final int E_ADD = 1;			//-- ��� �߰�
	public static final int E_DISP = 2;			//-- ��� ���
	public static final int E_FIND = 3;			//-- ��� �˻�
	public static final int E_DEL = 4;			//-- ��� ����
	public static final int E_CHA = 5;			//-- ��� ����
	public static final int E_EXIT = 6;			//-- ����
}

public class Test163
{

	//�ֿ� �Ӽ� ����			�� �Ϸ�
	private static final Vector<Object> vt;		//-- �ڷᱸ��
	private static BufferedReader br;			//-- �Է� �� Ȱ��
	private static Integer sel;					//-- ���� ��
	private static String con;					//-- ��� ���� ����


	//static �ʱ�ȭ ��
	static
	{
		
		//Vector �ڷᱸ�� ����
		vt = new Vector<Object>();

		// BufferedReader Ŭ���� �ν��Ͻ� ����
		br = new BufferedReader(new InputStreamReader(System.in));

		//����� �Է°� �ʱ�ȭ
		sel = 1;
		con = "Y";
	}

	//�޴� ��� �޼ҵ�
	public static void menuDisp()
	{
		System.out.println("\t[�޴� ����]=======");
		System.out.println("\t1.��� �߰�");
		System.out.println("\t2.��� ���");
		System.out.println("\t3.��� �˻�");
		System.out.println("\t4.��� ����");
		System.out.println("\t5.��� ����");
		System.out.println("\t6.����");
		System.out.println("\t=================");
		System.out.print("�޴� ����(1~6) : ");

	}
	
	//�޴� ���� �޼ҵ�
	public static void menuSelect() throws IOException, NumberFormatException
	{
		sel = Integer.parseInt(br.readLine());
		if (sel<1 || sel>6)
		{
			exit();
		}
		
		/*
		switch (sel)
		{
		case 1: sel=Menus.E_ADD; break;
		case 2: sel=Menus.E_DISP; break;
		case 3: sel=Menus.E_FIND; break;
		case 4: sel=Menus.E_DEL; break;
		case 5: sel=Menus.E_CHA; break;
		case 6: sel=Menus.E_EXIT; break;
		}
		*/
		
		
	}


	//���õ� �޴� ���࿡ ���� ��� ȣ�� �޼ҵ�
	public static void menuRun() throws IOException
	{
		System.out.println();

		switch (sel)
		{
		/*
		case 1: addElement(); break;
		case 2: dispElement();break;
		case 3: findElement();break;
		case 4: delElement(); break;
		case 5: chaElement(); break;
		case 6: exit(); break;
		*/
		//case Menus.E_ADD: addElement(); break;
		
		case Menus.E_ADD: addElement();break;
		case Menus.E_DISP: dispElement();break;
		case Menus.E_FIND: findElement();break;
		case Menus.E_DEL: delElement();break;
		case Menus.E_CHA:chaElement();break;
		case Menus.E_EXIT:exit();break;
		
		}

		
	}

	//�ڷᱸ���� ��� �߰�(�Է�) �޼ҵ�
	public static void addElement() throws IOException
	{
		
		//1�� ��� �߰� �޼ҵ�
		//Test065 ch!='y' && ch!='Y' �����ؼ� ���ڿ��� �ȵż� equalsȰ������. 
		jump:
		if (sel == 1)
		{	
			int n=1;
			while (true)
			{	
				System.out.print(n + "��° ��� �Է� : ");
				vt.add(br.readLine());
				System.out.println(n + "��° ��� �Է� ����~!!!");
				n++;
				System.out.print("��� �Է� ��� (Y/N)? : ");
				con = br.readLine();
				//System.out.print(vt.elementAt(0));	
				if (!(con.equals("y")||(con.equals("Y"))))
				{
					break jump;
				}
				
			}
			

		}
		/*
		���ϴԲ�
		int i=1;
		  do
		 {
         System.out.printf("%d��° ��� �Է� : ", i);
         vt.addElement(br.readLine());
         System.out.printf("%d��° ��� �Է� ����~!!!\n", i);
         System.out.print("��� �Է� ���(Y/N)? : "); 
         con = br.readLine();
         System.out.println();

         i++;
         
		 }
		 while (con.equals("Y") || con.equals("y"));

		*/


	}
	
	//��¸޼ҵ� 162�� ����
	//�ڷᱸ�� ��ü ��� �޼ҵ�
	public static void dispElement()
	{
		if (sel==2)
		{
			/*
			System.out.println("[���� ��ü ���]");
			for (int i=0; i<vt.size(); i++)
			{
				System.out.printf("%s%n" ,vt.elementAt(i));
			}
			System.out.println();
			*/
			System.out.print("[���� ��ü ���]\n ");
			for (Object obj : vt)
			{
				System.out.print(obj + " ");
			}
			System.out.println();

		}
		/*
		����Բ�
		public static void dispElement()
		 {
		   System.out.println("[���� ��ü ���]");
		  for (Object obj : vt)
		  {
			 System.out.println(obj);
		  }
		  System.out.println();
		 }

		*/
	}
	
	//�˻� Test161����
	//�ڷᱸ�� �� ��� �˻� �޼ҵ�
	public static void findElement() throws IOException
	{	
		String searchName;

		if (sel==3)
		{
			System.out.print("�˻��� ��� �Է� : ");
			
			searchName = br.readLine();

			if (vt.contains(searchName))
			{
				System.out.println("[�˻� ��� ���]");
				System.out.println("�׸��� �����մϴ�");
				System.out.println();
			}
			else if (!(vt.contains(searchName)))
			{
				System.out.println("[�˻� ��� ���]");
				System.out.println("�׸��� �������� �ʽ��ϴ�.");
				System.out.println();
			}
			else
			{
				System.out.println("�߸� �Է��ϼ̽��ϴ�.");
				System.out.println();
				return;
			}

		}
		
	}


/*
			
			if (v.contains(s2))
		{
			i = v.indexOf(s2);
			System.out.println(s2 + " �� index ��ġ : " + i);
			
			//�� �����ϴ����� ���θ� Ȯ���ϰ�
			//�� �켱 ���� �ڵ带 ã��...
			//�� Ȯ���ߴٸ� �����ض�(�����ض�)
			v.remove(i);
		}
*/	//���� = Test161����
	//�ڷᱸ�� �� ��� ���� �޼ҵ�
	public static void delElement() throws IOException
	{
		String removeName;
		int i;
		if (sel==4)
		{	
			System.out.print("������ ��� �Է� : ");
			removeName = br.readLine();
			System.out.println();
			if(vt.contains(removeName))
			{	
				i=vt.indexOf(removeName);
				System.out.println("[���� ��� ���]");
				System.out.println(removeName +"�׸��� �����Ǿ����ϴ�.");
				vt.remove(i);

			}
			else 
			{
				System.out.println("[���� ��� ���]");
				System.out.println("�׸��� �������� �ʾ� ������ �� �����ϴ�.");
			}
		}	
	}


	//  Test160����
	//  �� ù��° ��Ҹ� "�Ͼ�"���� ��.��. �� set() //������ ������
	//	v.set(0, "�Ͼ�");
	//�ڷᱸ�� �� ��� ����(����) �޼ҵ�
	public static void chaElement() throws IOException
	{
		if (sel==5)
		{
			String oriName;
			String chaName;
			int i;
			System.out.print("������ ��� �Է� : ");
			oriName = br.readLine();
			//System.in.skip(2);
			if (vt.contains(oriName))
			{	
				System.out.print("������ ���� �Է� : ");
				chaName=br.readLine();
				i=vt.indexOf(oriName);
				vt.set(i, chaName);

				System.out.println("[���� ��� ���]");
				System.out.println("������ �Ϸ�Ǿ����ϴ�.");
			}
			else 
			{
				System.out.println("[���� ��� ���]");
				System.out.println("������ ����� �������� �ʽ��ϴ�.");
			}
		}
	}

	
	//���α׷� ���� �޼ҵ�()		��	�ϼ�
	public static void exit()
	{
		System.out.println("���α׷� ����~!!!");
		System.exit(-1);
	}
	

	
	//main() �޼ҵ�				��	�ϼ�
	public static void main(String[] args) throws IOException, NumberFormatException
	{	


		do
		{
			menuDisp();
			menuSelect();
			menuRun();
		}
		while (true);

	}
}