package Day_7.WebsiteVisitorTracker;
import java.util.*;

public class WebsiteVisitorTracker {
    public static void main(String[] args) {
        Map<Integer,List<String>>visitorPages=new HashMap<>();
        visitorPages.put(1,Arrays.asList("home","about", "contact","product"));
        visitorPages.put(2,Arrays.asList("home","product", "contact"));
        visitorPages.put(3,Arrays.asList("home","about","product"));
        visitorPages.put(4,Arrays.asList("home", "contact"));
        visitorPages.put(5,Arrays.asList("about", "contact","product", "Services"));
        Map<String,Integer>pageVisitsCount=new HashMap<>();
        for(List<String>pages: visitorPages.values()){
            for(String page: pages){
                pageVisitsCount.put(page,pageVisitsCount.getOrDefault(page,0)+1);
            }
        }
        String mostPopularpage = "";
        int maxVisits=0;
        for(Map.Entry<String,Integer>entry: pageVisitsCount.entrySet()){
            if(entry.getValue()>maxVisits){
                mostPopularpage=entry.getKey();
                maxVisits=entry.getValue();
            }
        }
        Map<Integer,Integer>visitorPageCount=new HashMap<>();
        for(Map.Entry<Integer,List<String>>entry: visitorPages.entrySet()){
            visitorPageCount.put(entry.getKey(),entry.getValue().size());
        }
        int maxPagesVisited =0;
        int visitorWithMostPages=0;
        for(Map.Entry<Integer,Integer>entry: visitorPageCount.entrySet()){
            if(entry.getValue()>maxPagesVisited){
                visitorWithMostPages=entry.getKey();
                maxPagesVisited=entry.getValue();
            }
        }
        System.out.println("Most popular page: " +mostPopularpage +" with " +maxVisits +" visits. ");
        System.out.println("Visitor with the most pages :" +mostPopularpage +"with" +maxVisits +"visits. ");

    }
}
