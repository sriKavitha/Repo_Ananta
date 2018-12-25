package Inherit;

public  class InhAbsTest extends AbsTest{
	public static void main(String[] args) {
		InhAbsTest a = new InhAbsTest();
		a.method1(); 
	a.aMethod();	
	}
		
	public void aMethod()
		{
			System.out.println("Its implemented...");
		}
	}


