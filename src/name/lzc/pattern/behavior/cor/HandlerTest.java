package name.lzc.pattern.behavior.cor;

import org.junit.Test;

/**
 * Description:   
 * @author:     lzc  
 * @version:    1.0  
 * @date:       2019-04-06 17:09:31  
 *  
 * Modification History:  
 * Date         Author      Version     Description  
 * ------------------------------------------------------------------  
 * 2019-04-06   lzc         1.0         1.0 Version  
 */

public class HandlerTest {

	@Test
	public void test() {
		HandlerChain chain1 = new HandlerChain();
		chain1.addHandler(new DateHandler());
		chain1.addHandler(new IntegerHandler());
		chain1.addHandler(new StringHandler());
		chain1.handle("责任链", chain1);
		System.out.println("------------------------------");
		
		HandlerChain chain2 = new HandlerChain();
		chain2.addHandler(new DateHandler());
		chain2.addHandler(new IntegerHandler());
		chain2.addHandler(new StringHandler());
		chain2.handle(new Integer(5), chain2);
	}

}
