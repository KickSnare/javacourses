
public class SimpleNum {
	 public static void main (String args[]) {
         int num = 874;
         
         for ( int i=2; i < num; i++) {
                 if ( num%i == 0) {
                         System.out.println("Число Составное!");
                         return;
                 }       
         }
         System.out.println("Число Простое!");          
       }       
}