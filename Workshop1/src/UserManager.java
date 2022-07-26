import java.util.ArrayList;
import java.util.List;

public class UserManager {
	private List<User> users = new ArrayList<User>();

	public void register(User user) {
		System.out.println(user.getNotificationService().message() + " Kayıt olundu");
		users.add(user);

	}

	public void forgotPassword(User user) {
		System.out.println(user.getFirstName()+" Kullanıcısına "+ user.getNotificationService().message()+ " ile sifre yenileme gönderildi");

	}

	public List<User> getUsers() {

		for (int i = 0; i < users.size(); i++) {
			System.out.println("Kullanıcı: " + users.get(i).getFirstName() + " " + users.get(i).getNotificationService().message()
					+ " ile bilgilendirildi");
		}

		return null;
	}
	public void removeUser(User user) {
		users.remove(user);
		System.out.println("Kullanici silindi: "+ user.getFirstName());
	}
}
