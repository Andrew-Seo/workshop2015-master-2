package Level_3;
import java.util.Date;

public class Prime {
	public static void main(String[] args) {
		Date start = new Date(System.currentTimeMillis());
		long t1 = start.getTime();
		for (int i = 0; i < 100000; i++) {
			if (isPrime(i) == true) {
				// System.out.println(i + " is a Prime Number!");
			}
			if (isPrime(i) == false) {
				// System.out.println(i + " sucks.");
			}
		}
		Date end = new Date(System.currentTimeMillis());
		long t2 = end.getTime();
		System.out.println(t2 - t1);

	}

	static boolean isPrime(int k) {
		for (int i = 2; i < k; i++) {
			if (k % i == 0) {
				return false;
			}
			if (k == 2) {
				return true;
			}
		}
		return true;
	}

}
