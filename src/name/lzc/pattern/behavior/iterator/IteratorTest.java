package name.lzc.pattern.behavior.iterator;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Description:   
 * @author:     lzc  
 * @version:    1.0  
 * @date:       2019-04-06 23:48:10  
 *  
 * Modification History:  
 * Date         Author      Version     Description  
 * ------------------------------------------------------------------  
 * 2019-04-06   lzc         1.0         1.0 Version  
 */

public class IteratorTest {

	@Test
	public void test() {
		Container<String> container = new ConcreteContainer<String>(10);
		container.add("NO.1");
		container.add("NO.2");
		container.add("NO.3");
		container.add("NO.4");
		
		Iterator<String> iterator = container.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}

}
