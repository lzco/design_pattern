package name.lzc.pattern.creational.builder;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Description:   
 * @author:     lzc  
 * @version:    1.0  
 * @date:       2019-04-03 21:02:48  
 *  
 * Modification History:  
 * Date         Author      Version     Description  
 * ------------------------------------------------------------------  
 * 2019-04-03   lzc         1.0         1.0 Version  
 */

public class BuilderTest {

	@Test
	public void test() {
		Product product = new Product.Builder().id(2019).name("矿泉水").price(1.5).build();
		assertTrue(2019 == product.getId());
		assertEquals("矿泉水", product.getName());
		assertTrue(1.5 == product.getPrice());
	}
}
