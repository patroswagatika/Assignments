package EmailvalidPack;


import java.util.regex.Pattern;

public class EmailValidation {

	public static void main(String[] args) {
		String email1 = "simplilearn14@gmail.com";
		String email2 = "simplilearn.com";
		String email3 = "com.simplilearn";
		
		System.out.println("email1 = " + validateEmail(email1));
		System.out.println("email2 = " + validateEmail(email2));
		System.out.println("email3 = " + validateEmail(email3));
	}
	
	public static String validateEmail (String email) {
		if (email == null || email.isEmpty()) {
			return "invalid";
		}
		
		String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\."+
		        "[a-zA-Z0-9_+&*-]+)*@" +
				"(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";
		
		Pattern pattern = Pattern.compile(emailRegex);
		if (pattern.matcher(email).matches()) {
			return "valid";
		} else {
			return "invalid";
		}		
	}

}
