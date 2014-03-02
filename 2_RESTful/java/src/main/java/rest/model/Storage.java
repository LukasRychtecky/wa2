package rest.model;

import java.util.ArrayList;
import java.util.List;

public class Storage {

	private static final List<Order> ORDERS = new ArrayList<Order>();

	public static Order add() {
		Order order = new Order(ORDERS.size() + 1L);
		ORDERS.add(order);
		return order;
	}

	public static Order find(Long id) {
		for (Order order : ORDERS) {
			if (order.getId().equals(id)) {
				return order;
			}
		}
		return null;
	}
}
