package Classes_Objects.InstanceVarAndMethods;

class Sample
{
    int i;
    int j;
    Sample()
    {
        i=10;
        j=20;
    }


public static void main(String[] args) {
        Sample s= new Sample();
    System.out.println(s.i + " " + s.j);

  }
}
