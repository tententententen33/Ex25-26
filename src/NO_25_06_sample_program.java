
public class NO_25_06_sample_program {

	public enum Season {
		SPRING,
		SUMMER,
		AUTUMN,
		WINTER
	}
	
	public static void processSeason(Season season) {
		if (season == Season.SPRING) {
			System.out.println("春です");
		}else if (season == Season.SUMMER) {
			System.out.println("夏です");
		}else if (season == Season.AUTUMN) {
			System.out.println("秋です");
		}else if (season == Season.WINTER) {
			System.out.println("冬です");
		}
	}
	
	public static void main(String[] args) {
		processSeason(Season.SPRING);
	}
}
