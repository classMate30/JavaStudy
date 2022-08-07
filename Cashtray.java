import java.util.ArrayList;

public class CashTray 
{
	

    public static void main(String[] args)
	{
		ArrayList<Money> money = new ArrayList<>();
		money.add(new Money(1,50000,20));	//money[0].amount
		money.add(new Money(2,10000,20));
		money.add(new Money(3,5000,20));
		money.add(new Money(4,1000,20));
		money.add(new Money(5,500,20));
		money.add(new Money(6,100,20));

		for (Money ct: money) 
			System.out.printf(" 현금 단위 : %-5d (원) 현금 수량 : %2d\n",ct.value,ct.amount);
	}
}


class Money
{
    int buttonNumber;
    int value;
    int amount;
    
	Money(int buttonNumber, int value, int amount)
	{
        this.buttonNumber =  buttonNumber;
        this.value = value;
        this.amount = amount;

    }
	
}
