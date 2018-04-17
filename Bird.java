package bird;

public class Bird {
	
	public Wings wings;
	public String name;
	public Pecker pecker;

	public Bird(String name, Wings wings, Pecker pecker) {
		this.name = name;
		this.wings = wings;
		this.pecker = pecker;
	}
	public void fly() {
		System.out.println("Bird " + name + " is flying.");
		wings.use();
	}
	public void eat() {
		System.out.println("Bird " + name + " is eating.");
		pecker.use();
	}
	public void hunt() {
		System.out.println("Bird " + name + " is hunting.");
		pecker.use();
	}
	
	public void land() {
		System.out.println("Bird "+name+" landing");
	}
	
	@Override
	public boolean equals (Object obj) {
		if (this == obj);
		return true;
	}
	
	@Override
	public int hashCode() {
		int result = hashCode();
		result = 31*result+name.hashCode();
		return result;
	}
	
	public String toString() {
		return "Bird: '" + name+ "'";
	}
}