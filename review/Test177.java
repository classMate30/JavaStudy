import java.io.File;
import java.util.Hashtable;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.IOException;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.Enumeration;

public class Test177
{
	public static void main(String[] args) throws IOException, ClassNotFoundException
	{
		
		String appDir = System.getProperty("user.dir");
		System.out.println(appDir);
		
		File f0 = new File(appDir,"\\data\\test.ser");

		System.out.println(f0.getParentFile().exists());

		if (!f0.getParentFile().exists())
		{
			//���͸��� ����ڴ�
			f0.getParentFile().mkdirs();
		}

		Hashtable<String, String> h1 = new Hashtable<String, String>();

		h1.put("01","���ҿ�");
		h1.put("02","������");
		h1.put("03","�ӽÿ�");
		h1.put("04","������");
		h1.put("05","������");
		FileOutputStream fos = new FileOutputStream(f0);
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		oos.writeObject(h1);
		oos.close();
		fos.close();
		

		if (f0.exists())
		{
			FileInputStream fis = new FileInputStream(f0);
			ObjectInputStream ois = new ObjectInputStream(fis);
			Hashtable h2 = (Hashtable)ois.readObject();
			ois.close();
			fis.close();
			
			String key;
			String value;
			Enumeration e = h2.keys();
			while (e.hasMoreElements())
			{
				key = (String)e.nextElement();
				System.out.print(key);
				value = (String)h2.get(key);
				System.out.println(key + " ��" + value);
			}
		}
	}

}