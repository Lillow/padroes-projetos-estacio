package order;

import java.util.List;

public class OrderMemento {
	private List<OrderItem> items;

	public OrderMemento(List<OrderItem> items) {
		this.items = items;
	}

	public List<OrderItem> getItems() {
		return items;
	}
}
