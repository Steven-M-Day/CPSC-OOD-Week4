import java.util.*;


public class BrownieMenu implements Menu {

	ArrayList<MenuItem> menuItems;
	
	public BrownieMenu() {
		menuItems = new ArrayList<MenuItem>();
		
		addItem("Fudge Brownie", "A Fudge Brownie", 1.10);
		
		addItem("Caramel Brownie", "A Caramel Brownie", 1.30);
		
		addItem("Peanut Butter Brownie", "A Peanut Butter Brownie", 1.20);
		
		addItem("Double Fudge Brownie", "A Double Fudge Brownie", 1.50);
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
