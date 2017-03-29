import java.util.ArrayList;
import java.util.function.Predicate;

// Demonstrate the Collection removeIf method.

public class FilterDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] names = {"Anna", "Bob", "Micheal", "Nike"};
		ArrayList<String> list = new ArrayList<> ();
		
		for (String name : names)
		{
			list.add(name);
		}
		
		Predicate<String> filter = x -> x.length() < 4;
		
		list.removeIf(filter);
		
		System.out.println(list);
	}

}
