package ProductApp;

class Product {

	private String name;
	private int price;
	private int discountPercentage;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getDiscountPercentage() {
		return discountPercentage;
	}
	public void setDiscountPercentage(int discountPercentage) {
		this.discountPercentage = discountPercentage;
	}
	public float getDiscountPrice()
	{
		float disPrice = getPrice()*(getDiscountPercentage()/100f);// calculate discount price after giving discount on product
		return (getPrice()-disPrice); 
	} 
}
