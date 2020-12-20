package application;
public class Myclass {
	
	public static void main(String[] args) {
		boolean	isHotOutside = true;
		boolean isWeekday = false;
		boolean hasMoneyInPocket = true;
		double costOfMilk = 2.99;
		double moneyInWallet = 8.50;
		int thirstLevel = 3;

		boolean shouldByIcecream = isHotOutside && hasMoneyInPocket;
			System.out.println(shouldByIcecream );
			
		boolean willGoSwimming = isHotOutside && !isWeekday;
		System.out.println(willGoSwimming );
		
		boolean isAGoodDay = isHotOutside && hasMoneyInPocket && !isWeekday;
		System.out.println(isAGoodDay );
		
		boolean willBuyMilk = isHotOutside && thirstLevel >=3 && moneyInWallet >= costOfMilk * 2;
		System.out.println(willBuyMilk );
	}
}




