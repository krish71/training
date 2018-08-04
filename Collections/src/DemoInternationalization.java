import java.util.Locale;
import java.util.ResourceBundle;

public class DemoInternationalization {
	public static void main(String[] args) {
		//i18n demo
		Locale loc = new Locale("hi","in");
		ResourceBundle bundle=ResourceBundle.getBundle("greeting", loc);
		System.out.println(bundle.getString("message"));
	}

}
