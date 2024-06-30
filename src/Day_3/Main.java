package Day_3;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Main {
    public static boolean validateEmail(String email){
        String pattern="^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";
        Pattern r= Pattern.compile(pattern);
        Matcher m= r.matcher(email);
        return m.matches();
    }
    public static boolean ValidatePhoneNumber(String phoneNumber) {
        String pattern = "^\\+?\\d{1,3}?[-.\\s]?(\\d{3})[-,\\s]?(\\d{3}[-.\\s]?(\\d{4})$)";
        Pattern r = Pattern.compile(pattern);
        Matcher m = r.matcher(phoneNumber);
        return m.matches();
    }
    public static void main(String[] args){
        String email = "example@example.com";
        String phoneNumber ="+1(555) 123-4567";
        if(validateEmail(email)){
            System.out.println("Email address is valid: ");
        }else{
            System.out.println("Invalid email address.");
        }
        if(ValidatePhoneNumber(phoneNumber)) {
            System.out.println("Phone number is valid.");
        } else {
            System.out.println("Invalid phone number.");
        }

        }

    }
