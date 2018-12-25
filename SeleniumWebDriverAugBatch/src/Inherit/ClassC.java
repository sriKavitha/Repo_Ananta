package Inherit;

public class ClassC extends ClassB{
public static void methodC()
{
	System.out.println("I am in my home...");
}
public static void main(String[] args) {
	ClassC c=new ClassC();
	c.methodA();
	c.methodC();
	c.methodB();
	System.out.println(c.a);
}

}