package jaswithp;

public class TypeNotifications {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Notifications[] a= { new Emailnotification(), new SmsNotification()};
		for(int i=0; i<2; i++) {
			a[i].message("you have notification");
		}
	}

}
