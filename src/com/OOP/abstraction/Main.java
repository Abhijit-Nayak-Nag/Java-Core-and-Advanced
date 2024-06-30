package com.OOP.abstraction;
    abstract class Sample {
        void xxx() {
            System.out.println("Defined in Sample");
        }
        abstract void yyy();
    }

    class Sample1 extends Sample {

        void yyy() {
            System.out.println("Implemented in Sample1");
        }
        void zzz() {
            System.out.println("Specific to Sample1");
        }
    }

    abstract class Sample2 extends Sample {
        void ppp() {
            System.out.println("Specific to Sample2");
        }
    }

    public class Main {
        public static void main(String[] args) {
            Sample s1 = new Sample1();   // Valid, Sample1 implements yyy()- and this concept is called upcasting.
//          Sample1 s1= new Sample1(); // if you want to ignore the concept of upcasting then you can directly create the object of concrete class.
            s1.xxx(); // Output: Defined in Sample
            s1.yyy(); // Output: Implemented in Sample1
            // s1.zzz(); // Error: zzz() is not a method of Sample

            // Sample s = new Sample(); // Error: Cannot instantiate abstract class Sample

            Sample2 s2 = new Sample2() { // Anonymous class to instantiate Sample2
                void yyy() {
                    System.out.println("Implemented in anonymous class");
                }
            };
            s2.xxx(); // Output: Defined in Sample
            s2.ppp(); // Output: Specific to Sample2
            s2.yyy(); // Output: Implemented in anonymous class
        }
    }


