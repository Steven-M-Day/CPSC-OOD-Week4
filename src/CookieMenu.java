import java.util.*;

public class CookieMenu implements Menu {

	ArrayList<MenuItem> menuItems;
	
	public CookieMenu() {
		menuItems = new ArrayList<MenuItem>();
		
		addItem("Peanut Butter Cookie", "A Peanut Butter Cookie", 1.10);
		
		addItem("Chocolate Chip Cookie", "A Chocolate Chip Cookie", 1.30);
		
		addItem("Sugar Cookie", "A Sugar Cookie", .99);
		
		addItem("Ginger Snap", "A Ginger Snap Cookie", .99);
	}
	
	public void addItem(String name, String description, double price)
	{
		MenuItem menuItem = new MenuItem(name, description, price);
		menuItems.add(menuItem);
	}
	
	public ArrayList<MenuItem> getMenuItems() {
		return menuItems;
	}
	
	public Iterator<MenuItem> createIterator() {
		return menuItems.iterator();
	}

}
