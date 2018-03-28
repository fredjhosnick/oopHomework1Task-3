package oppVektor;

public class Vektor3d {

	private double x1;
	private double y1;
	private double z1;
	private double x2;
	private double y2;
	private double z2;
	private double scalarvektors;

	Vektor3d(double x1, double y1, double z1, double x2, double y2, double z2) {

		this.x1 = x1;
		this.y1 = y1;
		this.z1 = z1;
		this.x2 = x2;
		this.y2 = y2;
		this.z2 = z2;
	}

	public double sumVecorsx() {
		double sumX = x1 + x2;
		return sumX;
	}

	public double sumVecorsy() {
		double sumY = y1 + y2;
		return sumY;
	}

	public double sumVecorsz() {
		double sumZ = z1 + z2;
		return sumZ;
	}

	public double scalarproductvektor() {
		this.scalarvektors = (x1 * x2 + y1 * y2 + z1 + z2);
		return scalarvektors;

	}

	public double vektoronei() {

		double i = y1 * z2 - z1 * y2;
		return i;
	}

	public double vektoronej() {
		double j = z1 * x2 - x1 * z2;
		return j;
	}

	public double vektornonek() {
		double k = x1 * y2 - y1 * x2;
		return k;

	}

}
