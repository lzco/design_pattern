package name.lzc.pattern.behavior.interpreter;

import java.util.HashMap;
import java.util.Map;

/**
 * Description: 环境对象，储存和获取终结符  
 * @author:     lzc  
 * @version:    1.0  
 * @date:       2019-04-07 00:24:44  
 *  
 * Modification History:  
 * Date         Author      Version     Description  
 * ------------------------------------------------------------------  
 * 2019-04-07   lzc         1.0         1.0 Version  
 */

public class Context {

	private final Map<BooleanExpression, Boolean> store = new HashMap<>();
	
	public void save(BooleanExpression expression, boolean value) {
		store.put(expression, value);
	}
	
	public boolean get(BooleanExpression expression) {
		Boolean value = store.get(expression);
		if(value == null) {
			throw new IllegalArgumentException();
		}
		return value.booleanValue();
	}
}
