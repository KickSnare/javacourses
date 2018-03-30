
public class Pifagor {

	public static void main(String[] args) {

		double a = Math.random();
		double b = Math.random();
		double r = Math.random();
		System.out.println("a = "+a+"\nb = "+b+"\nрадиус = "+r++);
		
		if ((r * r) >= Math.sqrt(a*a+b*b))
		    System.out.println("Можно");
		else
		    System.out.println("Нельзя");
	}
}
