public class Static {
	public static final int TARGET_NUM = 10;
	private static int countNum = 0;
	private int favNum = 0;

	public static void main(String[] args) {
		// static context
		// changeFavNum(42);  // static context -> non-static context 
		displayInfo();      // static context -> static context
		// favNum = 10;    // static context -> non-static context
		countNum = 10;
		int h = 2 * TARGET_NUM;
	}

	private void changeFavNum(int i) {
		// non-static context
		favNum = TARGET_NUM + i; // non-static context -> non-static context
		displayInfo();          // non-static context -> static context
	}

	private static void displayInfo() {
		
	}
}