
public class SameDigits{
	public static void main(String[] args) {
		int a, b, c, d;
		int x = (int) (Math.random()*1000);
		int n = Math.round(x);
			a = n % 10;
			b = (n%100)/10;
			c = (n%1000)/100;
			d = (n%10_000)/1000;
		System.out.println(n);
		
		if (a!=b && a!=c && a!=d && 
			b!=c && b!=d && c!=d) {
			System.out.println("Все цифры числа разные");
	}
		else 
			System.out.println("В этом числе сть одинаковые цифры");
		}
	}