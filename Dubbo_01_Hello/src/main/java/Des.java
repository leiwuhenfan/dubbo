
public class Des implements Cloneable {

	int x;
	int y;

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	void test1() {
		Des des1 = new Des();
		des1.setX(1);
		des1.setY(2);
		Des des2 = des1;
		System.out.println("des1=" + des1 + "  des2" + des2);

		System.out.println("des1 x = " + des1.getX() + "  des2 x = " + des2.getX());
		des1.setX(5);
		System.out.println("des1 x = " + des1.getX() + "  des2 x = " + des2.getX());

		// des1=Des@7852e922 des2Des@7852e922
		// des1 x = 1 des2 x = 1
		// des1 x = 5 des2 x = 5
	}

	void test2() throws CloneNotSupportedException {
		Des des1 = new Des();
		des1.setX(1);
		des1.setY(2);
		Des des2 = des1;
		Des des3 = (Des) des1.clone();

		System.out.println("des1=" + des1 + "  des2" + des2 + " des3=" + des3);

		System.out.println("des1 x = " + des1.getX() + "  des2 x = " + des2.getX() + " des3 x = " + des3.getX());
		des1.setX(5);
		System.out.println("des1 x = " + des1.getX() + "  des2 x = " + des2.getX() + " des3 x = " + des3.getX());

		// des1=Des@7852e922 des2Des@7852e922 des3=Des@4e25154f
		// des1 x = 1 des2 x = 1 des3 x = 1
		// des1 x = 5 des2 x = 5 des3 x = 1

	}

	public static void main(String[] args) throws CloneNotSupportedException {
		new Des().test1();

	}

}
