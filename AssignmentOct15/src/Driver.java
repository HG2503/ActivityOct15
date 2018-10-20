import java.util.Scanner;
//import MobilePhone;
public class Driver{
	public static void main(String[] args){
		Scanner myScan= new Scanner(System.in);
		System.out.println("Who made your phone?");
		String manufacturer= myScan.nextLine();
		System.out.println("What is the model of your phone?");
		String model=myScan.nextLine();
		System.out.println("How much was your phone?");
		String price=myScan.nextLine();
		System.out.println("Who is your service carrier?");
		String carrier=myScan.nextLine();
		
		MobilePhone myPhone=new MobilePhone(manufacturer, model,price,carrier);
		
		System.out.println(myPhone.call("867-5309"));
		System.out.println(myPhone.text("Jenny don’t change your number"));
		System.out.println(myPhone);
	}


}
