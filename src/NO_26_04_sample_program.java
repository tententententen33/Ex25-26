public class NO_26_04_sample_program {
	public enum Season {
		SPRING(101,"春"),
		SUMMER(102,"夏"),
		AUTUMN(103,"秋"),
		WINTER(104,"冬");
		
		private int seasonNumber;
		private String seasonName;
		
		private Season(int seasonNumber, String seasonName) {
			this.seasonNumber = seasonNumber;
			this.seasonName = seasonName;
		}
		
		public int getSeasonNumber() {
			return seasonNumber;
		}
		public String getSeasonName() {
			return seasonName;
		}
	}
	
	public static void main(String[] args) {
		for(Season season : Season.values()) {
			System.out.println(season + " = " 
					+ "管理番号:" + season.getSeasonNumber()
					+ ", 季節名:" + season.getSeasonName());
		}
	}
}
