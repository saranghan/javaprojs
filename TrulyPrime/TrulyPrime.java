import java.io.IOException;
import java.util.*;

public class TrulyPrime {

	public static void main(String[] args) throws IOException {

		int dayCount = 0;
		int dayInMonth = 0;
		int monthCount = 0;
		int pDay = 0;

		// StringBuilder str = new StringBuilder();

		int days[] = new int[args.length];
		for (int i = 0; i < args.length; i++) {
			days[i] = Integer.parseInt(args[i]);
			

		}

		// System.out.println(monthCount);
		// System.out.println(dayCount);
		
		int i = 0;
		do {
			monthCount = i+1;
			dayCount += days[i];
			if(isPrime(monthCount)) {
				dayInMonth = days[i];
				pDay = dayCount - dayInMonth;
				for(int x=1; x<dayInMonth+1;x++) {
					if(isPrime(x) && isPrime(pDay+x)) {
						
						System.out.println((pDay+x) +": "+ monthCount+ " "+ x);
					}
				}
			}
			i++;
		}while(i < days.length);

	}

	public static boolean isPrime(int n) {
		if (n <= 1) {
			return false;
		}
		for (int i = 2; i <= Math.sqrt(n); i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}

}
