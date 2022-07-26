
public class SmsNotification implements NotificationService {

	@Override
	public String message() {
		String message="Sms ile";
		System.out.println("Sms ile kayıt olundu");
		return message;
	}

}
