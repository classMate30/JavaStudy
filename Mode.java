import java.io.IOException;
public interface Mode
{
	public abstract void display();						//메뉴판을 보여줘야 한다 
	public abstract void select()throws IOException;	//입력을 받고 입력에 따른 내부적으로 기능 호출

}