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
			//디렉터리를 만들겠다
			f0.getParentFile().mkdirs();
		}

		Hashtable<String, String> h1 = new Hashtable<String, String>();

		h1.put("01","엄소연");
		h1.put("02","유동현");
		h1.put("03","임시연");
		h1.put("04","한은영");
		h1.put("05","조현하");
		FileOutputStream fos = new FileOutputStream(f0);
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		oos.writeObject(h1);
		oos.close();
		fos.close();

	}

}