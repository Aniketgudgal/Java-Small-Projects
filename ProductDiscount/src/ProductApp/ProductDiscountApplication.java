package ProductApp;
/*
9. Product Discount Calculation
Task:
 Create a Product class with fields: name, price, and discountPercentage.
 In the main method:
Create a Product object.
Calculate the discounted price and print the result.
 */
import java.util.Scanner;
public class ProductDiscountApplication {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the total products");
		int size = sc.nextInt(); // take array object size
		Product[] pt = new Product[size];
		
		// create array of object for product class
		ProductInfo pi = new ProductInfo();
		pi.setProduct(pt); // set reference of object
		pi.inputProductData(); // input data
		//pi.showAllData(); // all product details without discount
		
		System.out.println("See all product yes or no");
		System.out.println("y or n");
		String ip = sc.next();
		if(ip.equals("yes")|| ip.equals("y"))
		{
			System.out.println("See the All product Details");
			pi.getProductWithDiscount(); // call method of product info class that method store the product class objects in array
		}
		else
		{
			System.out.print("Enter the product Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			pi.getProductWithDiscount(name); // search specific product details
		}
		
		
	}
}
