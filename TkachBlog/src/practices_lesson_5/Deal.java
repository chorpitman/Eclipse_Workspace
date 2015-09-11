package practices_lesson_5;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Deal {

	private final Date date = new Date();

	private final Party buyer;

	private final Party seller;

	private final Map<Product, Integer> products = new HashMap<Product, Integer>();

	public Deal(Party buyer, Party seller) {
		super();
		this.buyer = buyer;
		this.seller = seller;
	}

	public double getSum() {
		double result = 0;
		for (Entry<Product, Integer> entry : products.entrySet()) {
			Product product = entry.getKey();
			int quantity = entry.getValue();
			result += product.getCost(quantity);
		}
		return result;
	}

	/**
	 * @return the date
	 */
	public Date getDate() {
		return date;
	}

	/**
	 * @return the buyer
	 */
	public Party getBuyer() {
		return buyer;
	}

	/**
	 * @return the seller
	 */
	public Party getSeller() {
		return seller;
	}

	/**
	 * @return the products
	 */
	public Map<Product, Integer> getProducts() {
		return products;
	}
}