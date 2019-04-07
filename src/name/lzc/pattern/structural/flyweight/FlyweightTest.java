package name.lzc.pattern.structural.flyweight;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

/**
 * Description:   
 * @author:     lzc  
 * @version:    1.0  
 * @date:       2019-04-04 14:30:57  
 *  
 * Modification History:  
 * Date         Author      Version     Description  
 * ------------------------------------------------------------------  
 * 2019-04-04   lzc         1.0         1.0 Version  
 */

public class FlyweightTest {

	@Test
	public void test() {
		FlyweightFactory factory = new FlyweightFactory();
		//单一享元模式
		Flyweight flyweight1 = factory.getFlyweight("可共享");
		System.out.println(flyweight1);
		flyweight1.operation("特定1");
		Flyweight flyweight2 = factory.getFlyweight("可共享");
		System.out.println(flyweight2);
		flyweight2.operation("特定2");
		System.out.println("----------------------------------");
		//复合享元模式
		List<String> internals = new ArrayList<>();
		internals.add("internal1");
		internals.add("internal2");
		internals.add("internal3");
		Flyweight flyweight3 = factory.getFlyweight(internals);
		flyweight3.operation("external1");
		Flyweight flyweight4 = factory.getFlyweight(internals);
		flyweight4.operation("external2");
	}
}
