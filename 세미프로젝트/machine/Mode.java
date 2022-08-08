import java.io.IOException;
public interface Mode
{
	public abstract int display();							//메뉴판을 보여줘야 한다
	public abstract boolean process(int sel) ;
}
