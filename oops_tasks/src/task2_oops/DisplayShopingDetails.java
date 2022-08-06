package task2_oops;

public class DisplayShopingDetails {
	public static void jeansDetails(ShoppingCenter shoppingCenter)
	{
		shoppingCenter.jeans();
		
	}
	public static void main(String[] args) {
		jeansDetails(new Shop1());
		jeansDetails(new Shop2());
	}

}
