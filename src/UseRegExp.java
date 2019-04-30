import java.util.Scanner;
import java.util.regex.Pattern;

// Author Flora Lopez April 2019

public class UseRegExp {

	public static void main(String[] args) {
	
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Please enter a valid name : ");
		String name1 = scan.next();
		scan.nextLine();
		
		if (validateName(name1)) {
			System.out.println("Name is valid!");
		} else {	
			System.out.println("Sorry, name is not valid!");
		  }
		
		System.out.print("Please enter a valid email : ");
		String email1 = scan.next();
		scan.nextLine();
		
		if (validateEmail(email1)) {
			System.out.println("Email is valid!");
		} else {	
			System.out.println("Sorry, email is not valid!" + "\n");
		  }
		
		System.out.println("Please enter a valid phone number : "+ "\n");
		String phone1 = scan.next();
		scan.nextLine();
		
		if (validatePhone(phone1)) {
			System.out.println("Phone is valid!" + "\n");
		} else {	
			System.out.println("Sorry, phone is not valid!"+ "\n");
		  }
		
		System.out.print("\n" + "Please enter a valid date : " + "\n");
		String date1 = scan.next();
		scan.nextLine();
		
		if (validateDate(date1)) {
			System.out.println("Date is valid!" + "\n");
		} else {	
			System.out.println("Sorry, date is not valid!" + "\n");
		  }
		scan.close();
		
	    }
	public static boolean validateEmail(String email) {
		
		boolean testEmail = Pattern.matches("[A-Za-z0-9]{5,30}\\@[A-Za-z0-9]{5,10}\\.[A-Za-z]{2,3}",email);
		return testEmail;
	}
	public static boolean validateName(String name) {
		
		boolean testName = Pattern.matches("^[A-Z]{1}[a-z]{1,29}",name);
		return testName;
	}
	public static boolean validatePhone(String phone) {
		boolean testPhone = Pattern.matches("[0-9]{3}\\-[0-9]{3}\\-\\d{4}",phone);
		return testPhone;
		
	}
	public static boolean validateDate(String date) {
	//	boolean testDate = Pattern.matches("[0-1]{1}[0-9]{1}\\/[0-1]{1}[0-9]{1}\\/[1-2]{1}[0-9]{3}",date);
		boolean testDate = Pattern.matches("^(0[1-9]|[12][0-9]|3[01])\\/(0[1-9]|1[012])[- /.](19|20)\\d\\d$",date);
		return testDate;
	}

}
