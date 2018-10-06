package Session1;

class WaterFilter {
	private String filter;
	private int capacity;
	private boolean tap;
	private String colour;
	private double price;

	public String getFilter() {
		return filter;
	}

	public int getCapacity() {
		return capacity;
	}

	public boolean isTap() {
		return tap;
	}

	public String getColour() {
		return colour;
	}

	public double getPrice() {
		return price;
	}

	public void setFilter(String filter) {
		this.filter = filter;
	}

	public void setTap(boolean tap) {
		this.tap = tap;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	@Override
	public String toString() {
		return "WaterFilter [filter=" + filter + ", capacity=" + capacity + ", tap=" + tap + ", colour=" + colour
				+ ", price=" + price + "]";
	}

	public void setPrice(double price) {
		this.price = price;
	}
/*	public String toString() {
		return "colour "+this.colour + " FilterType "+ this.filter;
	}*/
}