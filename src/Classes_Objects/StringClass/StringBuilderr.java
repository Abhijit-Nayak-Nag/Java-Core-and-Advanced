package Classes_Objects.StringClass;
public class StringBuilderr {
    public static void main(String[] args){
        StringBuilder sentence = new StringBuilder("Hello ");
        System.out.println("Memory address of sentence: " + System.identityHashCode(sentence));
        sentence.append("World, ");
        System.out.println("Memory address of sentence: " + System.identityHashCode(sentence));

        sentence.append(45);
        System.out.println(sentence);
        //System.out.println(sentence.toString());
        //Insert Operation
        sentence.insert(6, "Java");
        System.out.println(sentence);
        //delete operation
        sentence.delete(0,6);
        System.out.println(sentence);
        //reverse operation
        sentence.reverse();
        System.out.println(sentence);

        String name="Abhi";
        int age= 22;
        System.out.printf("Name: %s\nAge: %d\n", name, age );


        String namee="Abhijit";
        int agee= 22;

        String formatting = String.format("Hello my name is %s and I am %d years old.",namee,agee);
        System.out.println(formatting);

        String formattingg= String.format("Hello my name is " +namee +" "+ "and I am " +agee +" Years old");
        System.out.println(formattingg);

        System.out.println("Hello my name is " +namee + " and I am " +age +"years old.");

        System.out.print("Hello" + ",");
        System.out.print("World");

        System.out.println("\nHello" + " " + "World");
        System.out.println("Hello" + " World");




    }

}
