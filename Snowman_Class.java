public class Snowman_Class {
	public static void main(String[] args) {
		for (int i = 4; i <= 12; i+=4) {
			buildBodyComponent(i, i);
		}
	}

	public static void buildBodyComponent(int verticalLength, int radius) {
		for (int y = verticalLength; y > -verticalLength; y--) {
			int x = (int)Math.ceil(Math.sqrt(Math.pow(radius, 2) - Math.pow(y, 2)));
			int posX = 20 + x;
			int negX = 20 - x;
			for (int j = 0; j < negX; j++) {
				System.out.print(" ");
			}
			System.out.print("*");
			for (int k = 0; k < posX - negX; k++) {
				System.out.print(" ");
			}
			System.out.println("*");
		}
	}

}
