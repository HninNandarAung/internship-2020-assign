class Child{
	void eat() {
		System.out.println("Baby eat nourishment food");
	}
}
class Baby extends Child{ 
	void cry() {
		System.out.println("Baby cry after wake up");
	}
}


public class singleInheritance {

	public static void main(String[] args) {
		Baby b=new Baby();
		b.cry();
		b.eat();
	
		// TODO Auto-generated method stub

	}

}
