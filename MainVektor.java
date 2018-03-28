package oppVektor;

public class MainVektor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Vektor3d vektors1 = new Vektor3d(4.5, 5.2, 2.6, 5.2, 6.2, 1.3);

		System.out.println("The sacalar product of vektors1 is: " + vektors1.scalarproductvektor());

		System.out.println("The vektor product of vektors1 is: " + vektors1.vektoronei() + "*i+" + vektors1.vektoronej()
				+ "*j+" + vektors1.vektornonek() + "*k");
		System.out.println("-------------------------------------------------------------------------------------");

		Vektor3d vektors2 = new Vektor3d(1.5, 3.2, 4.6, 2.2, 3.2, 0.3);

		System.out.println("The sacalar product of vektors2 is: " + vektors2.scalarproductvektor());

		System.out.println("The vektor product of vektors2 is: " + vektors2.vektoronei() + "*i+ "
				+ vektors2.vektoronej() + "*j+ " + vektors2.vektornonek() + "*k");

	}

}
