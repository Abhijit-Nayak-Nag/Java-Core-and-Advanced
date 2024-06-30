package Day_8.HTMLTagValidator;
import java.util.*;

public class HTMLTagValidator {
    public static boolean isValidHTML(String html){
        Stack<String> stack = new Stack<>();
        int index=0;
        while(index < html.length()){
            int startIndex= html.indexOf('<', index);
            if(startIndex==-1)
            {
                break;
            }
            int endIndex= html.indexOf('>',startIndex);
            if(endIndex ==-1){
                return false;
            }
            String tag=html.substring(startIndex +1, endIndex);
            if(!tag.startsWith("/")){
                stack.push(tag);
            }else{
                if (stack.isEmpty()|| !stack.pop().equals(tag.substring(1))){
                    return false;
                }
            }
            index=endIndex + 1;
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        String html="<html><body><h1>Hello, World!</h1></body></html>";
        System.out.println("IS the HTML tag nested correctly? " +isValidHTML(html));
    }
}
