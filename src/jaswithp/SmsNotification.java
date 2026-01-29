package jaswithp;

public class SmsNotification implements Notifications{

	@Override
	public void message(String msg) {
		// TODO Auto-generated method stub
		System.out.println("Sms messge:"+msg);
		
	}
	

}
