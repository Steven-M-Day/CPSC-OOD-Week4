import java.util.Iterator;

public class Cashier {

	Menu cookieMenu;
	Menu brownieMenu;
	
	public Cashier(Menu cookieMenu, Menu brownieMenu)
	{
		this.cookieMenu = cookieMenu;
		this.brownieMenu = brownieMenu;
	}
	
	public void printMenu() {
		Iterator<MenuItem> cookieIterator = cookieMenu.createIterator();
		Iterator<MenuItem> brownieIterator = brownieMenu.createIterator();

		System.out.println("MENU\n----");
		System.out.println("");
		System.out.println("Cookie");
		printMenu(cookieIterator);
		System.out.println("Brownie");
		printMenu(brownieIterator);
	}
	
	private void printMenu(Iterator<MenuItem> iterator) {
		while (iterator.hasNext()) {
			MenuItem menuItem = iterator.next();
			System.out.println(" - " + menuItem.getName());
			System.out.println("    " + menuItem.getDescription() + ": $" + menuItem.getPrice());
			System.out.println("");
		}
	}
}
