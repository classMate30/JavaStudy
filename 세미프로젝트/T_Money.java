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
    public int getButtonNumber() {return buttonNumber;}
    public int getAmount() {return amount;}
    public void setButtonNumber(int buttonNumber) {this.buttonNumber = buttonNumber;}
    public void setValue(int value) {this.value = value;}
    public void setAmount(int amount) {this.amount += amount;}
}