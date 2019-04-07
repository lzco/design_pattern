package name.lzc.pattern.structural.composite;

import org.junit.Test;

/**
 * Description:   
 * @author:     lzc  
 * @version:    1.0  
 * @date:       2019-04-05 16:04:00  
 *  
 * Modification History:  
 * Date         Author      Version     Description  
 * ------------------------------------------------------------------  
 * 2019-04-05   lzc         1.0         1.0 Version  
 */

public class CompositeTest {

	@Test
	public void test() {
		Leaf leaf1 = new Leaf();
		leaf1.operation();
		Leaf leaf2 = new Leaf();
		leaf2.operation();
		
		Composite composite = new Composite();
		composite.add(leaf1);
		composite.add(leaf2);
		composite.operation();
		
		Component component = composite.getChild(0);
		component.operation();
	}

}
