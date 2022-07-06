import java.util.Scanner;
class ScannerExample
{
	public static void main(String [] args)
	{
		System.out.println("PRODUCT DETAILS");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Product ID: ");
		int productid=sc.nextInt();
		System.out.println("Enter product Name: ");
		String productName = sc.next();
		System.out.println("Enter the payment Status(Y/N)");
		char paidStatus = sc.next().charAt(0);
		System.out.println("Product ID: "+ productid);
		System.out.println("Product Name: "+ productName);
		System.out.println("Payment Status: "+ paidStatus);
	}

}
