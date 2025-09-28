package ProductApp;
import java.util.Scanner;
class ProductInfo 
{
	Product[] p;
	public void setProduct(Product[] p1)
	{
		p = p1;
	}
	public void inputProductData()
	{
		// input data from user and store in array of object data
		Scanner sc = new Scanner(System.in);
		for(int i = 0; i < p.length; i++)
		{
			System.out.print("Enter the product name: ");
			String name = sc.nextLine();
			System.out.print("Enter the price of product: ");
			int price = sc.nextInt();
			System.out.print("Enter the discount on product: ");
			int dis = sc.nextInt();
			
			p[i] = new Product();
			p[i].setName(name);
			p[i].setPrice(price);
			p[i].setDiscountPercentage(dis);
			sc.nextLine();
			System.out.println();
		}
	}
	// show all data
	public void showAllData()
	{
		System.out.println();
		System.out.println("-------------------------------------------------------------------------------------");
		System.out.println("product Name\t"+"original price\t");
		for(int i = 0; i < p.length; i++)
		{
			System.out.println(p[i].getName()+"\t\t"+p[i].getPrice());
		}
	}
	// get all data with discount
	public void getProductWithDiscount()
	{
		System.out.println();
		System.out.println("Welcome to Aniket Kirana Shop");
		System.out.println("-------------------------------------------------------------------------------------");
		System.out.println("product Name\t"+"original price\t"+"Discount\t"+"Price after discount");
		for(int i = 0; i < p.length; i++)
		{
			System.out.println(p[i].getName()+"\t\t"+p[i].getPrice()+"\t\t"+p[i].getDiscountPercentage()+"%"+"\t\t"+p[i].getDiscountPrice());
		}
	}
	// search for specific product details
	public void getProductWithDiscount(String name)
	{
		for(int i = 0; i < p.length; i++)
		{
			if(p[i].getName().equals(name))
			{
				System.out.println();
				System.out.println("Welcome to Aniket Kirana Shop");
				System.out.println("-------------------------------------------------------------------------------------");
				System.out.println("product Name\t"+"original price\t"+"Discount\t"+"Price after discount");
				System.out.println(p[i].getName()+"\t\t"+p[i].getPrice()+"\t\t"+p[i].getDiscountPercentage()+"%"+"\t\t"+p[i].getDiscountPrice());
				break;
			}
			else
			{
				System.out.println("The Enter product not found");
				break;
			}
		}
	}
}
