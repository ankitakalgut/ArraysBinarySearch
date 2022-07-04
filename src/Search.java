import java.util.Arrays;

public class Search {

	private static final String[] datset1 = { "KP","US" ,"ABCE","HIKJ"};
	private static final String[] dataset2 = { "AU", "CA" };

	public static void main(String args[]) {
		
		System.out.println(ispresent());
		System.out.println(isdata());
		System.out.println(isdat2a());
	}

	public static int ispresent() {
		return Arrays.binarySearch(datset1,"KP");

	}

	public static boolean isdata() {
		return Arrays.binarySearch(dataset2, "CA")>=0;

	}
	
	public static boolean isdat2a() {
		return Arrays.binarySearch(dataset2, "CA")>=0;

	}
}
