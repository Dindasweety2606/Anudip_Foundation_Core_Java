import java.util.Scanner;
class Cllg
{
	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("STUDENT DETAILS");
		System.out.println("Enter Student ID: ");
		int stId= sc.nextInt();
		System.out.println("Enter Student Name: ");
		String name= sc.next();
		System.out.println("Enter Address: ");
		String add= sc.nextLine();
		System.out.println("Enter Mobile no: ");
		long mob= sc.nextLong();
		System.out.println("Enter Gender (M/F): ");
		char gen= sc.next().charAt(0);
		System.out.println("Enter DOB(dd-mm-yyyy): ");
		String date= sc.next();
		System.out.println("Enter Height: ");
		double height= sc.nextDouble();
		System.out.println("Enter Weight: ");
		double weight= sc.nextDouble();
		System.out.println("Enter Degree pursude(B.Sc/B.A): ");
		String deg= sc.next();
		System.out.println("Enter Year of Study: ");
		short year= sc.nextShort();
		System.out.println("Enter Average GPA: ");
		float cg= sc.nextFloat();
		System.out.println("With/without tuition grant: ");
		String tut= sc.next();
		System.out.println("Is/is not a scholar: ");
		String sch= sc.next();
 		System.out.println("STUDENT DETAILS");
		System.out.println("Student ID: "+ stId);
		System.out.println("Student Name:"+ name);
		System.out.println("Address: "+ add);
		System.out.println("Mobile no: "+ mob);
		System.out.println("Gender:"+ gen);
		System.out.println("DOB: "+ date);
		System.out.println("Height: "+ height);
		System.out.println("Weight: "+ weight);
		System.out.println("Degree pursude:"+ deg);
		System.out.println("Year of Study: "+ year);
		System.out.println("Average GPA: "+ cg);
		System.out.println(tut +"Tuition grant");
		System.out.println(sch +"scholar");
		
	}
}