package Day_1;

public class Baby extends Mother{
public void babyMethod()
{
	System.out.println("I am from babyMethod...");
}
	public static void main(String[] args) {
		Baby b=new Baby(); //Using Child ref(b), both parent and child methods can be accessed
		b.display();
		a=20;
		System.out.println(a);
		b.babyMethod();
		Mother m=new Baby(); //Using parent ref(m), ONly Parent methods can be called 
		m.display();
	}	
}
