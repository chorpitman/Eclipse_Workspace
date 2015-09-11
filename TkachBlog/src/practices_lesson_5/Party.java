package practices_lesson_5;

import java.util.HashMap;
import java.util.Map;

public class Party {

	private String name;

	private String address;

	private final Map<String, String> properties = new HashMap<String, String>();

	/** dasdasdasdasdsadasdasd dasdsa Что за ебанный карась?
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name
	 *            the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}

	/**
	 * @param address
	 *            the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}

	/**
	 * @return the properties
	 */
	public Map<String, String> getProperties() {
		return properties;
	}

}
