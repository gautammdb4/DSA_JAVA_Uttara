package com.gautam.chaurasia.generic.priorityqueue;

public class Key<T> implements Comparable<Key<T>> {
	
	private T value;

	public Key(T value) {
		this.value = value;
	}

	public T getValue() {
		return value;
	}

	@SuppressWarnings("unchecked")
	@Override
	public int compareTo(Key<T> other) {
		
		
		if (value instanceof Comparable && other.value instanceof Comparable) {
			return ((Comparable<T>) value).compareTo(other.value);
		} else {
			// Handle non-comparable types
			throw new UnsupportedOperationException("Comparison not supported for non-comparable types.");
		}
	}
}
