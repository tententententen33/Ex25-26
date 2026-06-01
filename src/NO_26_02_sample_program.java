public class NO_26_02_sample_program {
	public enum Season {
		SPRING("春"),
		SUMMER("夏"),
		AUTUMN("秋"),
		WINTER("冬");
		private String seasonNameJp;
		private Season(String seasonNameJp) {
			this.seasonNameJp = seasonNameJp;
		}
		public String getSeasonNameJp() {
			return seasonNameJp;
		}
	}
	public static void main(String[] args) {
		for (Season sampleSeason : Season.values()) {
			System.out.println(sampleSeason + ":" + sampleSeason.getSeasonNameJp());
		}
	}
}
