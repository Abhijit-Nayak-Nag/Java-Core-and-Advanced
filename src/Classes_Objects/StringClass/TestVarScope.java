package Classes_Objects.StringClass;

import Classes_Objects.Pratice_Problem.VarScope;
public class TestVarScope {
    public static void main(String[] args) {
        VarScope vaw= new VarScope();


//     vaw.birth=22; --if the attribute is public it can be accessible by outside the package also.
// if attribute is private then accessible only in the same package and same class if you want
// to access it in different class then you can create a constructor or using getter setter
// you can access it. but make sure classes are in the same package.
//      vaw.method(); --public and non-static (through the object name)
//      VarScope.method(); --  if your method is public and static (through the class name)


// if your method is default then you can only use with in the same package.
// if your method is default and static then you don't need to create object to use your method.
// you can simply use your class name with (.) operator. but make sure you are using your method
// in a same package. if your method is default and non-static then you can use your by creating
// its object. if your method is public and non-static then you can use your method anywhere
// by creating its object, outside the package also. but if your method is public and static
// then you can use it anywhere same package or different package without creating its object
// direct accessing by class name and (.)operator and then your method name.


    }


}
