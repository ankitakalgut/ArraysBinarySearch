import java.util.ArrayList;
import java.util.Iterator;

//Get the List of Users
public class ArrayList2 {

	public static void main(String args[]) {
		ArrayList<String> al = new ArrayList<String>();
		al.add("Raviraj");
		al.add("Vijaya");
		al.add("Ravia");
		al.add("Ajay");
		Iterator<String> itr = al.iterator();
		while (itr.hasNext()) {
			System.out.println("Print"+itr.next());
		}
	}
}
