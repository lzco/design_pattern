package name.lzc.pattern.structural.flyweight;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Description: 享元模式工厂（参照数据库连接池）  
 * @author:     lzc  
 * @version:    1.0  
 * @date:       2019-04-04 14:22:52  
 *  
 * Modification History:  
 * Date         Author      Version     Description  
 * ------------------------------------------------------------------  
 * 2019-04-04   lzc         1.0         1.0 Version  
 */

public class FlyweightFactory {

	private final Map<String, Flyweight> pool = new HashMap<>();
	
	public Flyweight getFlyweight(final String internalState) {
		if(pool.containsKey(internalState)) {
			return pool.get(internalState);
		}else {
			Flyweight flyweight = new ConcreteFlyweight(internalState);
			pool.put(internalState, flyweight);
			return flyweight;
		}
	}
	
	public Flyweight getFlyweight(final List<String> internalStates) {
		CompositeFlyweight flyweight = new CompositeFlyweight();
		for(String internalState : internalStates) {
			flyweight.add(internalState, this.getFlyweight(internalState));
		}
		return flyweight;
	}
}
