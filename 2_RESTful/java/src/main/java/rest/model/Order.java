package rest.model;

import java.util.ArrayList;
import java.util.List;

public class Order {

	private Long id;
	private List<Item> items = new ArrayList<Item>();

	public Order(Long id) {
		this.id = id;
	}

	public void add(Item item) {
		item.setId(items.size() + 1L);
		items.add(item);
	}

	public void remove(Item item) {
		if (items != null) {
			items.remove(item);
		}
	}

	public Item find(Long id) {
		for (Item item : items) {
			if (item.getId().equals(id)) {
				return item;
			}
		}
		return null;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}

		Order order = (Order) o;

		return id.equals(order.id);
	}

	@Override
	public int hashCode() {
		return id.hashCode();
	}

	public Long getId() {
		return id;
	}

	public List<Item> getItems() {
		return items;
	}
}
