package EnumProgram;

public enum Phone {

	SAMSUNG("S20", 500), APPLE("Iphone13", 700), GOOGLE("GooglePixel6", 400);

	final String product;
	final int price;

	Phone(String product, int price) {

		this.product = product;
		this.price = price;
	}

}
