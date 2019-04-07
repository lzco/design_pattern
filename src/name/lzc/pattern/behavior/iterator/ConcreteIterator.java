package name.lzc.pattern.behavior.iterator;


/**
 * Description: 迭代器模式——迭代器实现  
 * @author:     lzc  
 * @version:    1.0  
 * @date:       2019-04-06 23:34:17  
 *  
 * Modification History:  
 * Date         Author      Version     Description  
 * ------------------------------------------------------------------  
 * 2019-04-06   lzc         1.0         1.0 Version  
 */

public class ConcreteIterator<E> implements Iterator<E> {
	
	private Container<E> container;
	
	private int index;

	public ConcreteIterator(Container<E> container) {
		this.container = container;
	}

	@Override
	public boolean hasNext() {
		if(index < container.size()) {
			return true;
		}
		return false;
	}

	@Override
	public E next() {
		return container.get(index++);
	}

}
