
public class NO_25_03_sample_program {
	
	public static final int SPRING = 0;
	public static final int SUMMER = 1;
	public static final int AUTUMN = 2;
	public static final int WINTER = 3;
	
	public static void processSeason(int season) {
		if(season == SPRING) {
			System.out.println("春です");
		}else if(season == SUMMER) {
			System.out.println("夏です");
		}else if(season == AUTUMN) {
			System.out.println("秋です");
		}else if(season == WINTER) {
			System.out.println("冬です");
		}
	}
	
	public static void main(String[] args) {
		processSeason(100);
		
	}
}
