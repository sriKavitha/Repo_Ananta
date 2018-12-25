package Day_1;

public class Binding {
public static void main(String[] args) {
	A a = new A();
	a.method(); //Parent reference Parent Object
	B b= new B();
	b.method(); //Child ref Child Object
	A a1=new B();
	a1.method(); //Prent ref child obj, which means calling OVERRIDDEN Method
}
}
