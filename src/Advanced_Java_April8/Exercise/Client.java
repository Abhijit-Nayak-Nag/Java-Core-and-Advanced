package Advanced_Java_April8.Exercise;

import java.util.Arrays;

class Test {

    public static void main(String[] args) {
        Client client = new Client();
        client.name = "Abhi";
        client.socialMedia = new String[]{"Instagram", "Facebook"};
        client.age = 22;
        client.money = 4444;

        // Print client details to verify
        System.out.println("--Traditional approach---");
        System.out.println("Name: " + client.name);
        System.out.println("Social Media: " + String.join(", ", client.socialMedia));
        System.out.println("Age: " + client.age);
        System.out.println("Money: " + client.money);
       System.out.println("\n--toString approach/Reactive Approach--");
        System.out.println(client);
    }

    public static class Client {
/*
In the Client class, declare the following variables: String name, String[] socialMedia, int age, and int money.
In the main method, create a Client object and store a reference to it in the variable called client.
Hint: Use the following construct to create a Client object and assign a reference to that object to the variable client:
VariableType variableName = new TypeOfObjectBeingCreated();
Requirements:
In the Client class, declare a String variable called name.
In the Client class, declare a String[] variable called socialMedia.
*/
        String name;
        String[] socialMedia;
        int age;
        int money;

        @Override
        public String toString() {
            return "Client{" +
                    "name='" + name + '\'' +
                    ", socialMedia=" + Arrays.toString(socialMedia) +
                    ", age=" + age +
                    ", money=" + money +
                    '}';
        }
    }
}