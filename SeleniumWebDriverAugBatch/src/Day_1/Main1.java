package Day_1;

public class Main1 {
//public Main1()
	public static void main(String args[]){
Parent p=new Parent();
p.disp(); //displays "Kavi" //parent ref parent obj
p.p();

//displays "AMH" /child ref child obj can call both parent & child
Child c= new Child();
c.disp(); 
c.c();
c.p();

//parent ref child obj can call ONLY "parent" methods
Parent p1=new Child();  
p1.disp(); //display "AMH"
p1.p();


	}}