import java.util.LinkedList;

// Demonstrate the Iterable forEach method.

public class forEachDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] names = {"Anna", "Bob", "Mike", "Nike"};
		LinkedList<String> list = new LinkedList<> ();
		
		for (String name : names)
		{
			list.add(name);
		}
		
		// print name and length of name in list
		list.forEach(
				x -> {
				System.out.printf("%s %d\n", x, x.length());
				});
	}

}
