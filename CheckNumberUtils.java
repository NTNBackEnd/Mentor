package CheckNumberUtils;

public class CheckNumberUtils {
	public static boolean checkSoNgTo(int n) {
		int count = 0;
		for (int i = 1; i <= n; i++) {
			if (n % i == 0) {
				count++;
			}
		}
		if (count != 2) {
			return false;
		}
		return true;
	}

	public static boolean SoHH(int n) {
		String re = String.valueOf(n);
		int s = 0;
		int f = re.length() - 1;
		while (f > s) {
			if (re.charAt(s) == re.charAt(f)) {
				s++;
				f--;
			} else {
				return false;
			}
		}
		return true;
	}

	public static boolean checkSNT(int n) {
		int i = 2;
		int count = 0;
		if(n == 1 ) {
			return false;
		}
		while (i <= Math.sqrt(n)){
			if (n % i == 0) {
				return false;
			} else {
				i++;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		System.out.println(checkSoNgTo(3));
		System.out.println(SoHH(1234321));
		System.out.println(checkSNT(7));
	}
}
