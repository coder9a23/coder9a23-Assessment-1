package departManagemant;

public class DriverClass {
	public static void main(String []args) {
		
		SuperDepartment Su=new SuperDepartment();
		HrDepartment Hr = new HrDepartment();
		TechDepartment Te=new TechDepartment();
		AdminDepartment Ad=new AdminDepartment();
		
		
		System.out.println(Ad.departmentName());
		System.out.println(Ad.getTodaysWork ());;
		System.out.println(Ad.getWorkDeadline());
		System.out.println(Su.isTodayAHoliday());;
		System.out.println();
		System.out.println();
		
		System.out.println(Hr.departmentName());;
		System.out.println(Hr.getTodaysWork());;
		System.out.println(Hr.getWorkDeadline());;
		System.out.println(Hr.doActivity());;
		System.out.println(Su.isTodayAHoliday());
		System.out.println();
		System.out.println();
		
		
		System.out.println(Te.departmentName());;
		System.out.println(Te.getTodaysWork());;
		System.out.println(Te. getWorkDeadline());
		System.out.println(Te.getTechStackInformation());;
		System.out.println(Su.isTodayAHoliday());
		System.out.println();
		System.out.println();
	}

}
