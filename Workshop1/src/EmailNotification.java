
public class EmailNotification implements NotificationService{

	@Override
	public String message() {
		String message="Sms ile";
		System.out.println("Email ile kayıt olundu");
		return message;
		
		
	}

}
