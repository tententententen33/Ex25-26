public class NO_26_07_sample_program {
	public enum Season {
		SPRING {
			public void season_message() {
				System.out.println("花が咲く季節です");
			}
		},
		SUMMER {
			public void season_message() {
				System.out.println("暑さに注意する季節です");
			}
		},
		AUTUMN {
			public void season_message() {
				System.out.println("紅葉の季節です");
			}
		},
		WINTER {
			public void season_message() {
				System.out.println("寒さに注意する季節です");
			}
		};

		public abstract void season_message();
	}

	public static void main(String[] args) {
		Season.SPRING.season_message();
		Season.SUMMER.season_message();
		Season.AUTUMN.season_message();
		Season.WINTER.season_message();
	}
}