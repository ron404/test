ref = http://stackoverflow.com/questions/10442758/why-must-a-java-file-have-the-same-name-as-its-public-class

I have one file named temp.java. I wrote the following code. Why does this work?

class demo //not public keyword and not same as filename
{
    public static void main(String []args)
    {
        System.out.println("this is Main method");
    }
}
Any why does this not work?

public class demo
{
    public static void main(String []args)
    {
        System.out.println("this is Main method");
    }
}

In your first example, your class is actually declared as "package private" (no modifiers), which means only 
classes within the same package can access it. In your second example, you have declared it as public.

This is a scenario where the compiler has met the JLS quite well.

The JLS states:

When packages are stored in a file system (§7.2.1), the host system may choose to enforce the restriction that it
 is a compile-time error if a type is not found in a file under a name composed of the type name plus an extension
  (such as .java or .jav) if either of the following is true:

The type is referred to by code in other compilation units of the package in which the type is declared.
The type is declared public (and therefore is potentially accessible from code in other packages).
This restriction implies that there must be at most one such type per compilation unit. This restriction makes
it easy for a compiler for the Java programming language or an implementation of the Java virtual machine to 
find a named class within a package; for example, the source code for a public type wet.sprocket.Toad would be
found in a file Toad.java in the directory wet/sprocket, and the corresponding object code would be found in
the file Toad.class in the same directory.
What this means is, for scenario 1, that because you only have temp.java with package private class demo, it is 
not being referred to by code in any other compilation units of the package, therefore it will compile without
issue.

Your second scenario has declared the class public - which means it is potentially accessible from code in other
packages - so it has to conform to the standards that the class name equals the file name.

If you created another class in your first scenario (within the same package) and then tried to reference the
class demo, you should get a compilation error.