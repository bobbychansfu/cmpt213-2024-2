public class Static {
	public static final int TARGET_NUM = 10;
	private static int countNum = 0;
	private int favNum = 0;

	public static void main(String[] args) {
		
		changeFavNum(42);  
		displayInfo();
		favNum = 10;  
		countNum = 10;
		int h = 2 * TARGET_NUM;
	}

	private void changeFavNum(int i) {
		
		favNum = TARGET_NUM + i;
		displayInfo();
	}

	private static void displayInfo() {
		
	}
}