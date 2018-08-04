import java.io.*;
public class CheckEmail {
	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter email: ");
		String email = br.readLine();
		System.out.println(email);
		int c1 = email.indexOf("@");
		int c2 = email.indexOf(".");
		int last_at = email.lastIndexOf("@");
		int last_dot = email.lastIndexOf(".");

		if (email.contains("@") && email.contains(".") && (c1==last_at) && (c2 == last_dot)) {	
				
				String s = email.substring(c2, (email.length() - 1));
				if ((c1 >= 4 && c2 >= 8) && (s.length() >= 2)) {
					System.out.println("valid");
				} else {
					System.out.println("invalid");
				}
			} 
		else {
				System.out.println("invalid");
			}
		} 
	}