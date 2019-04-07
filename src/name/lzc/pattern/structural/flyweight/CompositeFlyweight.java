package name.lzc.pattern.structural.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * Description: 享元模式——复合的享元角色   
 * @author:     lzc  
 * @version:    1.0  
 * @date:       2019-04-04 15:06:48  
 *  
 * Modification History:  
 * Date         Author      Version     Description  
 * ------------------------------------------------------------------  
 * 2019-04-04   lzc         1.0         1.0 Version  
 */

public class CompositeFlyweight implements Flyweight {
	
	private final Map<String, Flyweight> internalFlyweights = new HashMap<>();
	
	public void add(final String internalState, final Flyweight flyweight) {
		internalFlyweights.put(internalState, flyweight);
	}

	@Override
	public void operation(String externalState) {
		for(Flyweight flyweight : internalFlyweights.values()) {
			flyweight.operation(externalState);
		}

	}

}
