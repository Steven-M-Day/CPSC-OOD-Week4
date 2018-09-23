
public class BakeryOrder {

	public static void main(String args[]) {
		CookieMenu cookieMenu = new CookieMenu();
		BrownieMenu brownieMenu = new BrownieMenu();
 
		Cashier cashier = new Cashier(cookieMenu, brownieMenu);
 
		cashier.printMenu();

	}
}
