
public class StaticProduct {

	
	static int id,qty;
	static String name;
	static float price,totalCost;
	
	static void assignValues() {
		id=1001;
		name="phone";
		price=254656.52f;
		qty=5;
		
	}
	
	static void computeCost() {
		totalCost=qty*price;
	}
	static void showDetails() {
		System.out.println(id);
		System.out.println(name);
		System.out.println(qty);
		System.out.println(price);
		System.out.println(totalCost);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		assignValues();
		computeCost();
		showDetails();
	}

}
