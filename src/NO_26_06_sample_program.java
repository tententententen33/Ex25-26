public class NO_26_06_sample_program {
	public enum Season {
		SPRING, 
		SUMMER, 
		AUTUMN, 
		WINTER
	}

	public static void showSeasonMessage(Season sampleSeason) {
		switch (sampleSeason) {
		case SPRING:
			System.out.println("花が咲く季節です");
			break;
		case SUMMER:
			System.out.println("暑さに注意する季節です");
			break;
		case AUTUMN:
			System.out.println("紅葉の季節です");
			break;
		case WINTER:
			System.out.println("寒さに注意する季節です");
			break;
		}
	}

	public static void main(String[] args) {
		showSeasonMessage(Season.SPRING);
		showSeasonMessage(Season.SUMMER);
	}
}