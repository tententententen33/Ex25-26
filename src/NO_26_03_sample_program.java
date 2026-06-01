public class NO_26_03_sample_program {
	public enum Season {
		SPRING(101), 
		SUMMER(102), 
		AUTUMN(103), 
		WINTER(104);

		private int seasonNumber;

		private Season(int seasonNumber) {
			this.seasonNumber = seasonNumber;
		}

		public int getSeasonNumber() {
			return seasonNumber;
		}
	}

	public static void main(String[] args) {
		System.out.println(Season.AUTUMN.getSeasonNumber());
	}
}