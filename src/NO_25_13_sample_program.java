public class NO_25_13_sample_program {
	public enum Season {
		SPRING, 
		SUMMER, 
		AUTUMN, 
		WINTER
	}

	public static void main(String[] args) {
		Season season = Season.SUMMER;
		System.out.println(season.name());
	}
}