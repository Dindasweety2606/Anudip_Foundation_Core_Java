import java.util.Scanner;
class Student
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("STUDENT DETAILS");
		System.out.println("Enter Student ID: ");
		int stId= sc.nextInt();
		System.out.println("Enter Student Name: ");
		String stName= sc.next();
		System.out.println("Enter gender(M/F): ");
		char gender= sc.next().charAt(0);
		System.out.println("Enter age: ");
		byte age= sc.nextByte();
		System.out.println("Enter Mobile no:");
		long mob= sc.nextLong();
		System.out.println("Enter CGPA: ");
		double cg= sc.nextDouble();
		System.out.println("STUDENT DETAILS");
		System.out.println("Student ID: "+ stId);
		System.out.println("Student Name: "+ stName);
		System.out.println("Gender: "+ gender);
		System.out.println("Age: "+ age);
		System.out.println("Mobile no: "+ mob);
		System.out.println("CGPA: "+ cg);
	}
}

