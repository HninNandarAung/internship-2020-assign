
public class Encapsulationgettersetter {
	
	private String empName;
	private int empsalary;
	private String position;
	
public String getEmpName() {
	return empName;
}
public int getEmpSalary() {
	return empsalary;
}
public String getEmpposition() {
	return position;
}
public void setEmpName(String name) {
	empName=name;
}
public void setEmpSalary(int salary) {
	empsalary=salary;
}
public void setEmpposition(String eposition) {
    position=eposition;
}


	public static void main(String[] args) {
		Encapsulationgettersetter obj=new Encapsulationgettersetter();
		obj.setEmpName("Mg Mg");
		obj.setEmpSalary(250000);
		obj.setEmpposition("programmer");
		// TODO Auto-generated method stub
		System.out.println("Employee Name is:"+obj.getEmpName());
		System.out.println("Employee Name is:"+obj.getEmpSalary());
		System.out.println("Employee Name is:"+obj.getEmpposition());
		
	}

}
