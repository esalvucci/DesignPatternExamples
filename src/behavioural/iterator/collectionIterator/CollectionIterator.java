package behavioural.iterator.collectionIterator;

import java.util.Collection;
import java.util.Iterator;

public class CollectionIterator<X> implements Iterator<X> {

	private Iterator<X> iterator;
	
	public CollectionIterator(Collection<X> collection) {
		this.iterator = collection.iterator();
	}
	
	@Override
	public boolean hasNext() {
		return this.iterator.hasNext();
	}

	@Override
	public X next() {
		return this.iterator.next();
	}

}
