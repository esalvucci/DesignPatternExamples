package iterator.rangeIterator;

import java.util.Iterator;

/**
 * 
 * @author Enrico Salvucci(via @author Mirko Viroli)
 * {@link http://campus.unibo.it/160383/1/10-Collections.pdf}
 *
 */
public class RangeIterator implements Iterator<Integer> {

	private int current;
	private int stop;
	private int step;
	
	public RangeIterator(int start, int stop) {
		this.current = start;
		this.stop = stop;
	}
	
	public void setIncrement(int step) {
		this.step = step;
	}
	
	@Override
	public boolean hasNext() {
		return this.current + this.step <= this.stop;
	}

	@Override
	public Integer next() {
		return this.hasNext() ? this.current + this.step : this.current;
	}

}
