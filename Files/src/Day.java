
public enum Day {
	MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY;
	private Day day;
	

	public void GreetMe(Day day){
		switch (day) {
		case MONDAY:
			System.out.println("E");
			break;
		case TUESDAY:
			System.out.println("EE");
			break;
		case WEDNESDAY:
			System.out.println("EEE");
			break;
		case THURSDAY:
			System.out.println("EEEE");
			break;
		case FRIDAY:
			System.out.println("EEEEE");
			break;
		case SATURDAY:
			System.out.println("EEEEEE");
			break;
		case SUNDAY:
			System.out.println("EEEEEEE");
			break;
			
		}
	}
	public static void main(String[] args){
		//Day d = new Day();
		//d.GreetMe(Day.FRIDAY);
		
	}
}
