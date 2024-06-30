package Day_3;

public class StringBuilderStringBuffer {
    public static void main(String[] args) {
        String originalstring="Hello World!";
        StringBuilder stringBuilder= new StringBuilder(originalstring);
        stringBuilder.reverse();
        System.out.println("Reversed string using String Builder:" +stringBuilder);
        StringBuffer stringBuffer= new StringBuffer(originalstring);
        stringBuffer.append("welcome");
        System.out.println("String after appending using StringBufffer:" +stringBuffer);
        int index=7;
        String insertstring="Awesome";
        stringBuilder.insert(index,insertstring);
        System.out.println("String after inserting at index"+index +"using stringBuilder:"+stringBuilder);
        int startIndex=7;
        int endIndex=15;
        stringBuffer.delete(startIndex,endIndex);
        System.out.println("String after deleting characters from index" + startIndex + "to"+ endIndex +"Using StringBuffer:" +stringBuffer);

  }
}
