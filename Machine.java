import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Machine {
    private Report report;
    private List<Item> items = new ArrayList<>();
    private Map<Item, Integer> stocks;
    private int capacity = 10;
    private int money;

    public Machine() {
        items = new ArrayList<>();
        items.add(new Item(1, "해태", 240, 1000, "코코팜"));
        items.add(new Item(2, "동아오츠카", 240, 900, "데자와"));
        items.add(new Item(3, "롯데", 150, 500, "레쓰비"));
        items.add(new Item(4, "롯데", 210, 900, "칠성사이다"));
        items.add(new Item(5, "델몬트", 240, 1100, "오렌지에이드"));

        report = new Report();

        stocks = new HashMap<Item, Integer>();		//처음부터 10개로 초기화 시켜준것 초기화 작업
        for (Item item : items) {
            stocks.put(item, capacity);
        }
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public int getMoney() {
        return money;
    }

    public int getCapacity() {return capacity;}

    public void setCapacity(int capacity) {this.capacity = capacity;}

    public Item getItem(int itemId) {
        Item it = null;
        for (Item item : items) {
            if (item.itemId == itemId) {
                it = item;
            }
        
		}
        if (it == null) {
            System.out.println("찾으시는 상품이 없습니다.");
            return null;    
		} else 
            return it;	
    }

    public void fill(Item item, int amount) {			//물건 떨어졌을때 재고 추가시 추가하는 메소드
        int remains = stocks.get(item);
        stocks.put(item, remains + amount);
    }

    public boolean buy(int itemId) {					
        for (Item item : items) {
            if (item.itemId == itemId) {
                Item it = item;
                int remains = stocks.get(it);
                if (remains == 0) {
                    System.out.println("Sold Out!!");
                    return false;
                } else {
                    stocks.put(it, remains - 1);
                    money -= it.price;
                    return true;
                }
            }
        }
    return false ;
    }

    public List<Item> getItems() {
        return items;
    }

    public Map<Item, Integer> getStocks() {
        return stocks;
    }

    public Report getReport() {
        return report;
    }
}