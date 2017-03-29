// Demonstrate the hashSet class.
import java.util.Set;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.LinkedHashSet;

public class hashSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Set<String> fruits = new HashSet<String> ();
//		fruits.add("apple");
//		fruits.add("banana");
//		fruits.add("pear");
//		System.out.println("fruits are: " + fruits);
		
		List<String> names = Arrays.asList("Chris", "David", "Katherine", "Kenny");
		Set<String> nameSet = new HashSet<String> (names);
		
		Iterator<String> it = nameSet.iterator();
		
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		if (nameSet.contains("Katherine"))
		{
			System.out.println("Katherine is in the set. ");
		}
		else
		{
			System.out.println("Katherine is not in the set. ");
		}
		
		// LinkedHashSet remain the order of items as they added
		Set<String> nameSet1 = new LinkedHashSet<> (names);
		System.out.println(nameSet1);
				
	}

}
