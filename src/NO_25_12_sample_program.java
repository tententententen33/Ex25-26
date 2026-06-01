
public class NO_25_12_sample_program {
	public enum Season {
		SPRING,
		SUMMER,
		AUTUMN,
		WINTER,
	}
	
	public static void main(String[] args) {
		Season season = Season.AUTUMN;
		System.out.println(season.ordinal());
		
		if (((Season.AUTUMN).name()).equals("AUTUMN")) {
			System.out.println("true");
		}else System.out.println("false");
	}
}
