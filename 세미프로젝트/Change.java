import java.util.HashMap;

public class Change
{
	public static HashMap<Integer, Integer> change;
	
	static
	{
		// Hash¸Ê±¸Á¶¸¦ ÀÌ¿ëÇØ (¾×¼ö, °¹¼ö)·Î ÀÜµ· ÀÚ·á±¸Á¶ »ı¼º
		change = new HashMap<Integer, Integer>();
		change.put(500,0);
		change.put(1000,0);
		change.put(5000,0);
		change.put(10000,0);
	}
	
	// ÀÜµ· ÃÑ¾×À» ¹İÈ¯ÇØÁÖ´Â ¸Ş¼­µå
	public static int sum()
	{
		// ÀÜµ· ÃÑÇÕÀ» º¯¼ö sum¿¡ ´õÇØÁÜ
		int sum = 0;
		sum += 500 * change.get(500);
		sum += 1000 * change.get(1000);
		sum += 5000 * change.get(5000);
		sum += 10000 * change.get(10000);

		return sum;
	}
}