
public class MirrorNum{
	
	public static void main(String[] args) {
		int massive[] = new int[4];
		
		for (int i=0; i>=5; i--) {
			massive[i] = (i*2)-1;
		}
		
		for (int i=1; i<massive.length; i++) {
			System.out.println(massive[i] + " ");
		}
		
		for (int i=4; i<massive.length; i--) {
			System.out.println(massive[i] + " ");
		}
	}
}