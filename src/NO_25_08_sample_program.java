
public class NO_25_08_sample_program {
	public enum Season {
		SPRING,
		SUMMER,
		AUTUMN,
		WINTER,
	}
	
	public static void main(String[] args) {
		Season season = Season.AUTUMN;
		switch (season) {
		case SPRING:
			System.out.println("春です");
			break;
		
		case SUMMER:
			System.out.println("夏です");
			break;
		
		case AUTUMN:
			System.out.println("秋です");
			break;
			
		case WINTER:
			System.out.println("冬です");
			break;
		}
	}
}
