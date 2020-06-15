public class EmployeeProperty {

	static String fetchEmpProperties(Employee e) {
		String result = "";
		result += e.getEmpID();
		result += ", ";
		result += e.getEmpName();
		result += ", ";
		result += e.getContactNo();
		return result;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp = new Employee(865806, "Bhaskar", "9988447562");
		
		System.out.println("Properties of employee are: "+fetchEmpProperties(emp));
		
	}
}
