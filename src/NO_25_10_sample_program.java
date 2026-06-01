public class NO_25_10_sample_program {
	public enum Season {
		SPRING, 
		SUMMER, 
		AUTUMN, 
		WINTER
	}

	public static void main(String[] args) {

		Season[] seasons = Season.values();
		for (Season season : seasons) {
			System.out.println(season);
		}
	}
}