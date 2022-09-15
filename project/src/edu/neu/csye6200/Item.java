package edu.neu.csye6200;

public class Item {

	public static final float REVISION = 20;

	private String nameOfItem;
	private double price;

	public String getNameOfItem() {
		return nameOfItem;
	}

	public void setNameOfItem(String nameOfItem) {
		this.nameOfItem = nameOfItem;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	Item(String nameOfItem, double d) {
		this.nameOfItem = nameOfItem;
		this.price = d;
	}

	@Override
	public String toString() {
		return "Item [nameOfItem=" + nameOfItem + ", price=" + price + "$]";
	}

	public static void demo() {

		double expenses = 0;
		//System.out.println("Name of item \t Price ");
		
		System.out.println("Initial amount: "+ REVISION+"$");
		Item object1 = new Item("Orange", 3.5);

		expenses += object1.getPrice();

		System.out.println(object1.toString());
		System.out.println("Total Expenses: "+ expenses+"$");
		System.out.printf("Amount left: %f$", REVISION-expenses);
		System.out.println();

		Item object2 = new Item("Apple", 4);

		expenses += object2.getPrice();

		System.out.println(object2.toString());
		System.out.println("Total Expenses: "+ expenses+"$");
		System.out.printf("Amount left: %f$", REVISION-expenses);
		System.out.println();

		Item object3 = new Item("Grapes", 5);

		expenses += object3.getPrice();

		System.out.println(object3.toString());
		System.out.println("Total Expenses: "+ expenses+"$");
		System.out.printf("Amount left: %f$", REVISION-expenses);
		System.out.println();

		Item object4 = new Item("Peach", 2);

		expenses += object4.getPrice();

		System.out.println(object4.toString());
		
		System.out.println("Total Expenses: "+ expenses+"$");
		
		System.out.printf("Change: %f$", REVISION-expenses);

	}

}
