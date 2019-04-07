package name.lzc.pattern.behavior.iterator;


/**
 * Description: 迭代器模式——容器实现  
 * @author:     lzc  
 * @version:    1.0  
 * @date:       2019-04-06 23:40:58  
 *  
 * Modification History:  
 * Date         Author      Version     Description  
 * ------------------------------------------------------------------  
 * 2019-04-06   lzc         1.0         1.0 Version  
 */

public class ConcreteContainer<E> implements Container<E> {
	
	private Object[] container;
	
	private int size;
	
	private int index;
	
	public ConcreteContainer(int limit) {
		container = new Object[limit];
	}

	@Override
	public void add(E e) {
		container[index++] = e;
		size++;
	}

	@SuppressWarnings("unchecked")
	@Override
	public E get(int index) {
		return (E) container[index];
	}

	@Override
	public int size() {
		return size;
	}

	@Override
	public Iterator<E> iterator() {
		return new ConcreteIterator<E>(this);
	}

}
