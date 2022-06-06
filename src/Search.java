import java.util.Arrays;

public class Search {

	private static final String[] ccp = { "KP","US" };
	private static final String[] data = { "AU", "CA" };

	public static void main(String args[]) {
		
		System.out.println(isCCP());
		System.out.println(isdata());
		System.out.println(isdat2a());
		
	

	}

	public static int isCCP() {
		return Arrays.binarySearch(ccp,"KP");

	}

	
	public static boolean isdata() {
		return Arrays.binarySearch(data, "CA")>=0;

	}
	
	public static boolean isdat2a() {
		return Arrays.binarySearch(data, "CA")>=0;

	}
}
