//Demonstrate the enumerated data type

public class EnumDemo {
	enum Day {SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Day workDay = Day.WEDNESDAY;
		System.out.println(workDay);
		
		if (workDay.equals(Day.WEDNESDAY))
		{
			System.out.println("The ordinal value is " + workDay.ordinal());
		}
		
		if (workDay.compareTo(Day.FRIDAY) < 0)
		{
			System.out.println(workDay + " is less than Friday");
		}
		else
		{
			System.out.println(workDay + " is greater than Friday");
		}
	}

}
