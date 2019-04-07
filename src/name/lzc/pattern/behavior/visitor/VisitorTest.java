package name.lzc.pattern.behavior.visitor;

import org.junit.Test;

/**
 * Description:   
 * @author:     lzc  
 * @version:    1.0  
 * @date:       2019-04-06 16:22:40  
 *  
 * Modification History:  
 * Date         Author      Version     Description  
 * ------------------------------------------------------------------  
 * 2019-04-06   lzc         1.0         1.0 Version  
 */

public class VisitorTest {

	@Test
	public void test() {
		Visitor visitor = new ConcreteVisitorA();
		Visible visible1 = new ConcreteVisibleA();
		visible1.accept(visitor);
		
		Visible visible2 = new ConcreteVisibleB();
		visible2.accept(visitor);
	}

}
