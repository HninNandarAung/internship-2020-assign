class children{
	void eat() {
		System.out.println("Baby eating nourishment food");
	}
}
class newBorn extends children{
	void cry() {
		System.out.println("Baby cry after wakeup");
	}
}
class Kid extends newBorn{
	void laugh() {
		System.out.println("Baby laugh when watching cartoon");
	}
}


public class multilevelinheritance{
	public static void main(String[] args) {
		Kid k=new Kid();
		k.eat();
		k.cry();
		k.laugh();
	
		// TODO Auto-generated method stub

	}

}