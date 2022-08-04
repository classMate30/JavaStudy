public class Money
{
	private String value;
	private int mCount;

	public Money(String value, int mCount)
	{
		this.value = value;
		this.mCount = mCount;
	}

	public String getValue()
	{
		return value;
	}
	
	public void setValue(String value)
	{
		this.value = value;
	}
	public int getCount(int mCount)
	{
		return mCount;
	}
	public void setCount(int count)
	{
		this.mCount = mCount;
	}
	
	public void mCountDown()
	{
		mCount--;
	}
	public void mCountUp()
	{
		mCount++;
	}
	

	
}