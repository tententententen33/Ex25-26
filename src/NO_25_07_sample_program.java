
public class NO_25_07_sample_program {
	public enum Season {
		SPRING,
		SUMMER,
		AUTUMN,
		WINTER,
	}
	
	public enum Month {
		JANUARY,
		FEBRUARY,
	}
	
	public static void processSeason(Season season) {
		System.out.println(season);
	}
	
	public static void main(String[] args) {
//		processSeason(Month.JANUARY); エラー
		processSeason(Season.SPRING);
	}
}
