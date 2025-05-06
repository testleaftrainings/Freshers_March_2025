package wek3.day3;

public class AxisBank extends CanaraBank implements RBI {

	@Override
	public void fixedDeposit() {
		System.out.println("Fixed Deposit");
	}

	@Override
	public void homeLoan() {
		System.out.println("Fixed Deposit");

	}

	public static void main(String[] args) {
		
		
		
		
		for (int i = 0; i <=10; i++) {
			
			
			if (i==4) {

				continue;
			}
			System.out.println(i);
			
			
			
			
			
			
			
		}

		int num = 10;

		
		do {
			num=num/2;
			System.out.println("hhh");
			
		} while (num>0);
		
		
		while (num > 0) {

			System.out.println("Print");

			num = num / 2;

		}

		AxisBank obj = new AxisBank();

		obj.fixedDeposit();
		obj.homeLoan();
		obj.InternetBanking();
	}

	@Override
	public void InternetBanking() {
		System.out.println("Internet Banking");
	}

}
