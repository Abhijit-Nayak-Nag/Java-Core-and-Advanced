package Advanced_Java.MultiThreading;

public class Person {
        // Private instance variable
        private int age;

        // Constructor to set the age
        public Person(int age) {
            this.age = age;
        }

        // Method to set age
        public void setAge(int age) {
            this.age = age;
        }

        // Method to get age
        public int getAge() {
            return this.age;
        }

        // Static method to print age, requiring an instance of Person
        public static void printAge(Person person) {
            System.out.println("Age: " + person.age);
        }

        public static void main(String[] args) {
            Person person = new Person(25);
            Person.printAge(person); // Output: Age: 25
            person.setAge(30);
            System.out.println("Updated Age: " + person.getAge()); // Output: Updated Age: 30
        }
    }

