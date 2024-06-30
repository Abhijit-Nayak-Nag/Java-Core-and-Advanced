package Day_8.BrowserTab;
import java.util.*;
import java.util.Stack;

public class BrowserTab {
    private String currentUrl;
    private final Stack<String>backHistory;
    private final Stack<String> forwardHistory;
    public BrowserTab(String homepage){
        this.currentUrl=homepage;
        this.backHistory=new Stack<>();
        this.forwardHistory=new Stack<>();
    }
    public void visit(String url){
        backHistory.push(currentUrl);
        currentUrl=url;
        forwardHistory.clear();

    }
    public void back(int steps){
        for(int i=0; i<steps && backHistory.isEmpty(); i++){
            forwardHistory.push(currentUrl);
            currentUrl=backHistory.pop();
        }
    }
    public void forward(int steps){
        for(int i=0;i<steps && !forwardHistory.isEmpty();i++){
            backHistory.push(currentUrl);
            currentUrl=forwardHistory.pop();
        }
    }
    public String getCurrentUrl(){
        return currentUrl;
    }

    public static void main(String[] args) {
        BrowserTab tab= new BrowserTab("https://www.example.com");
        tab.visit("https://www.example.com/page1");
        tab.visit("https://www.example.com/page2");
        tab.visit("https://www.example.com/page3");
        tab.back(2);
        System.out.println("Current URL after moving back: " +tab.getCurrentUrl());
        tab.forward(1);
        System.out.println("Current URL after moving Forward: " +tab.getCurrentUrl());


    }

}
