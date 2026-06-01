
public class NO_25_11_sample_program {
	public enum Menu {
		START,
		SAVE,
		LOAD,
		EXIT,
	}
	
	public static void main(String[] args) {
		for (Menu menu : Menu.values()) {
			System.out.println(menu);
		}
	}
}
