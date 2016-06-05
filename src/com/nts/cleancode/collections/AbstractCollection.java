package com.nts.cleancode.collections;

public abstract class AbstractCollection {
	protected Object[] elements = new Object[10];

	public void addAll(AbstractCollection c) {
		for (int i = 0; i < c.size(); i++) {
			if (!contains(c.get(i)))
				add(c.get(i));
		}
	}
	public abstract boolean isEmpty();
	public abstract void add(Object element);
	public abstract boolean remove(Object element);
	public abstract boolean contains(Object element);
	public abstract int size();

	public void add(Object key, Object value) {
	}

	public Object get(int i) {
		return elements[i];
	}
}
