class youngKid{
	void eat() {
		System.out.println("Baby eat nourishment food");
	}
}
class firstChildren extends youngKid{
	void age(){
		System.out.println("This baby age is 2yrs");
	}
}
class nextChildren extends youngKid{
	void ageShow(){
		System.out.println("This baby age is 4yrs");
	}
}
public class hierarchicalinheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		firstChildren f=new firstChildren();
		nextChildren n=new nextChildren();
		f.eat();
		n.eat();
		f.age();
		n.ageShow();
	}

}
