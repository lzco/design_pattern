package name.lzc.pattern.structural.bridge;

import org.junit.Test;

/**
 * Description:   
 * @author:     lzc  
 * @version:    1.0  
 * @date:       2019-04-03 22:46:42  
 *  
 * Modification History:  
 * Date         Author      Version     Description  
 * ------------------------------------------------------------------  
 * 2019-04-03   lzc         1.0         1.0 Version  
 */

public class BridgeTest {

	@Test
	public void test() {
		CoffeeTaste coffeeTaste = new SweetCoffeeTaste();
		Coffee coffee = new LargeCupCoffee(coffeeTaste);
		coffee.makeACoffee();
	}
}
