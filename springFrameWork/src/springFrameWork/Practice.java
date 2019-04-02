package springFrameWork;

//this is an BEAN.
//Here in this class we only have attributes
public class Practice {
	// Attributes
	String name;
	String address;
	int number;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}
	
	/**
	 * @param name
	 * @param address
	 * @param number
	 */
	public Practice(String name, String address, int number) {
		this.name = name;
		this.address = address;
		this.number = number;
	}

	@Override
	public String toString() {
		return "Practice [name=" + name + ", address=" + address + ", number=" + number + "]";
	}
}
