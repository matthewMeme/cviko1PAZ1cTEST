package cviko1.projekt1;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		System.out.println("Čau Európa!");
		int g = 0;
		for (int i = 0; i < 6; i++) {
			g += 1;
		}
		System.out.println(g);
	}

	private static int plus(int a, int b) {
		return a + b;
	}
	private static int dvekrat(int i) {
		return i*2;
	}
}
