
public class NO_25_14_sample_program {
	public enum Season {
		SPRING,
		SUMMER,
		AUTUMN,
		WINTER,
	}
	public static void main(String[] args) {
		Season season = Season.valueOf("SUMMER");
		System.out.println(season);
	}
}
