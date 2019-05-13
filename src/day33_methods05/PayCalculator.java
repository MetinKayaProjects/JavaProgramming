package day33_methods05;

public class PayCalculator {
	public static void main(String[] args) {
		
		int pay = gethourlyPay(40, 50);
		System.out.println("Total pay for 40 hours: " + pay);
		System.out.println("Total pay for 100 hours: " + gethourlyPay(100, 50));
		
		System.out.println();
		
		System.out.println("Total pay for -100 hours: " + gethourlyPay(-100, 50));
		System.out.println("Total pay for -50 rate: " + gethourlyPay(100, -50));
		
		System.out.println();
		
		int noPay = gethourlyPay(10,0);
		System.out.println("noPay: " + noPay );
	}
	
//	Method: getHourlyPay
//	ReturnType : int
//	params : int hours, int rate
//	return total pay by multiplying hours * rate
//	if hours is 0 or negative 
//				print "invalid hours"
//					return 0;
	
//	if rate is 0 or negative 
//				print "invalid rate"
//					return 0;
	public static int gethourlyPay(int hours, int rate) {
		
		if (hours<=0) {
			System.out.println("Invalid hours");
			return 0;
		}
		if (rate <=0) {
			System.out.println("Invalid rate");
			return 0;
		}else {
			int totalPay = hours * rate;
			return totalPay;
		}
	}

}
