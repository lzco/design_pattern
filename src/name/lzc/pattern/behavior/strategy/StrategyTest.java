package name.lzc.pattern.behavior.strategy;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Description:   
 * @author:     lzc  
 * @version:    1.0  
 * @date:       2019-04-05 15:30:15  
 *  
 * Modification History:  
 * Date         Author      Version     Description  
 * ------------------------------------------------------------------  
 * 2019-04-05   lzc         1.0         1.0 Version  
 */

public class StrategyTest {

	@Test
	public void test() {
		//参照Comparator接口与TreeSet类
		Context context1 = new Context(new ConcreteStrategyA());
		context1.doAction();
		Context context2 = new Context(new ConcreteStrategyB());
		context2.doAction();
	}

}
