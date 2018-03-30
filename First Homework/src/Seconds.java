
public class Seconds {
public static void main(String[] args) {
	int sec = 7_586_879;
	int weeks = sec/604800;
	int weeksRest = sec%604800;
	int days = weeksRest/86400;
	int daysRest = weeksRest%86400;
	int hrs = daysRest/3600;
	int hrsRest = daysRest%3600;	
	int min = hrsRest/60;
	int secRest = sec%60;
	
	
			
			System.out.println(sec +  " Секунд это - " + weeks + " Недель;" + days + " Дней;"
			+hrs+ " Часов;" + min + " Минут: " + secRest + " Секунд: ");
			
}
}
