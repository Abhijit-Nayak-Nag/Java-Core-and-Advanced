package Advanced_Java_April8.Exercise;

public class Exercise1 {

        public static void main(String[] args) {
            String emptyString = "";

            System.out.println(emptyString.length()); // Length of emptyString
            System.out.println("Gomu Gomu no Bazooka!".length()); // Length of emptyString
            System.out.println((emptyString + 2 + 2 + "22").length()); // Length of concatenated string
            System.out.println("of Edo's rain".length()); // Length of the string "of Edo's rain"
            System.out.println("how many mouthfuls did you drink,".length()); // Length of the string "how many mouthfuls did you drink,"
            System.out.println("cuckoo?".length()); // Length of the string "cuckoo?"
        }
    }


    /*
    The main method displays the values of six strings.

    Modify the code so that it displays the length of each string instead of the value of each string.

Requirements:
Do not change the value of the emptyString variable.
You need to call the length() method on the six strings passed to the println() method.
The program must display six numbers, each on a new line.
     */
