package bird;

public class TaskA22  {

	public static void main(String[]args) {
		Wings wings=new Wings();
		Pecker pecker=new Pecker();
	
	Bird bird1=new Bird("Eagle", wings, pecker);
	Bird bird2=new Bird("Cormarand", wings, pecker);
	
	System.out.println(bird1);
    bird1.fly();
    bird1.eat();
    bird1.hunt();
    System.out.println("\n"+bird2);
    bird2.fly();
    bird2.eat();
    bird2.hunt();
	}
}