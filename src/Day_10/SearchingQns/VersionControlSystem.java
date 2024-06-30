package Day_10.SearchingQns;
import java.util.HashMap;
import java.util.Map;
public class VersionControlSystem {
    private Map<String, Integer> commitMessagesToVersions;
    public VersionControlSystem(){
        commitMessagesToVersions=new HashMap<>();
    }
    public void addCommit(String commitMessage, int versionNumber){
        commitMessagesToVersions.put(commitMessage,versionNumber);
    }
    public  Integer findVersionNumber(String commitMessage){
        return commitMessagesToVersions.get(commitMessage);
    }

    public static void main(String[] args) {
        VersionControlSystem vcs=new VersionControlSystem();
        vcs.addCommit("Initial commit", 1);
        vcs.addCommit("Fix bug #123", 2);
        vcs.addCommit("Add new feature", 3);
        System.out.println("Version number for 'Fixing bug #123' : " + vcs.findVersionNumber("Non-existent commit"));

    }
}
