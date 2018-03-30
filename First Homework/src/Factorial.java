
public class Factorial {

		public static void main(String[] args) {
			int n=10;
			int fact=1;
			if(n>9 && n<16){
				for (int i = 10; i <= 15; i++) {
					fact*=i;
				}
				System.out.println(n+"!="+fact);
			}
			else
				System.out.println("Неверный ввод!");
		}
		}