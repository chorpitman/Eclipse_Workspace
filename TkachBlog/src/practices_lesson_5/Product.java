package practices_lesson_5;

public abstract class Product {

	private static final int DEF_DISCOUNT = 10;

	private String title;

	private double price;

	public double getCost(int quantity) {
		double realCost = quantity * price;
		return realCost - realCost * calcDiscount(quantity) / 100;
	}

	protected int calcDiscount(int quantity) {
		if (quantity > DEF_DISCOUNT) {
			return 10;
		} else {
			return 0;
		}
	}

	/**
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * @param title
	 *            the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
	}

	/**
	 * @return the price
	 */
	public double getPrice() {
		return price;
	}

	/**
	 * @param price
	 *            the price to set
	 */
	public void setPrice(double price) {
		this.price = price;
	}
}
