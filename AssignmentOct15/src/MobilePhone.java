public class MobilePhone {
	private String Manufacturer ;
	private String Model;
	private String Price;
	private String Carrier;
	
	public MobilePhone(String man, String mod, String price, String carrier){
		Manufacturer=man;
		Model=mod;
		Price=price;
		Carrier=carrier;
		}
	String call(String number){
		return ("I am calling "+number);
		}
	String text(String message){
		return message;
		}
@Override
public String toString(){
	return ("Manufacturer: "+Manufacturer+"\nModel: "+Model+"\nPrice: $"+Price+"\nCarrier: "+Carrier);
	}
}
