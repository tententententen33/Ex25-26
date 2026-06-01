
public class NO_25_04_sample_program {

	public static final int SPRING = 0;
	public static final int SUMMER = 1;
	public static final int AUTUMN = 2;
	public static final int WINTER = 3;
	public static final int JANUARY = 0;
	public static final int FEBRUARY = 1;

	public static void processSeason(int season) {
		if (season == SPRING) {
			System.out.println("春です");
		} else if (season == SUMMER) {
			System.out.println("夏です");
		}
	}

	public static void main(String[] args) {
		processSeason(JANUARY);
	}
}
