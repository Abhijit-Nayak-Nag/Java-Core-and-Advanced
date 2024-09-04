public class BlogPost {
    private int postId;
    private String title;
    private String content;
    private String category;
    public BlogPost(int postId, String title, String content) {
        this.postId = postId;
        this.title = title;
        this.content = content;
        init();
    }
    private void init() {
//        category = "Uncategorized";
        category = "Uncategorized";

    }
    public void display() {
        System.out.println("Title: " + title);
        System.out.println("Content: " + content);
        System.out.println("Category: " + category);
    }
    public String displayy(){
        return "Title : " +title + " \nContent: "+ content + " \nCategory: "+ category;
    }

    public BlogPost() {
        // This is a default constructor.
        postId= 1;
        title= "Spring Boot";
        content= "Good";
        category= "Programming";

    }
    public String display1(){
        return "PostId: "+ postId + "\nTitle : " +title + " \nContent: "+ content + " \nCategory: "+ category;
    }

    @Override
    public String toString() {
        return "BlogPost{" +
                "postId=" + postId +
                ", title='" + title + '\'' +
                ", content='" + content + '\'' +
                ", category='" + category + '\'' +
                '}';
    }

    public static void main(String[] args) {
        BlogPost post = new BlogPost(1, "Getting Started with Java", "In this post, we'll explore the basics of Java programming.");
        post.display();
        System.out.println(post);


        System.out.println(post.displayy());


        BlogPost post1= new BlogPost();
        System.out.println(post1);
//        post1.postId= 2;
//        post1.title="";
//        post1.content= "";
//        post1.category= "Hello" ;
//        System.out.println(post1);
//        System.out.println(post1.category);

        System.out.println(post1.display1());



    }
}
