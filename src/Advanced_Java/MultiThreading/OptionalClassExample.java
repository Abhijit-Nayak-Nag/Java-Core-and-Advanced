package Advanced_Java.MultiThreading;

import java.util.Optional;

public class OptionalClassExample {
    public static void main(String[] args) {
                // Test with a non-null value
                String name = "John Doe";
                Optional<String> nameOptional = getName(name);
                System.out.println("Name: " + nameOptional.orElse("No name provided"));

                // Test with a null value
                name = null;
                nameOptional = getName(name);
                System.out.println("Name: " + nameOptional.orElse("No name provided"));

                // Using ifPresent to perform an action if the value is present
                nameOptional.ifPresent(n -> System.out.println("Name in uppercase: " + n.toUpperCase()));
            }

            public static Optional<String> getName(String name) {
                return Optional.ofNullable(name);
            }
    }

