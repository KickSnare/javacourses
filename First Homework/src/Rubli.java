
public class Rubli {
	    public static void main(String[] args) { 

	    	int money = 1548;
	    	int x = money % 100;
	    	int y = money % 10;
	    	if (x == 1 || y == 1)
	    	System.out.println(money + " �����");
	    	if (5 > x && x > 1 || y > 1 && y < 5)
	    	System.out.println(money + " �����");
	    	if (20 > x && x > 10 || y > 5 && y < 10)
	    	System.out.println(money + " ������");
	    }
}