class Money
{
    int buttonNumber;
    int value;
    int amount;
    
	Money(int buttonNumber, int value, int amount) {
        this.buttonNumber =  buttonNumber;
        this.value = value;
        this.amount = amount;

    }
    public int getValue(){return value ;}
    public int getAmount() {return amount;}
    public void setAmount(int amount) {this.amount += amount;}
}