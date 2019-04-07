package name.lzc.pattern.behavior.interpreter;


/**
 * Description: 解释器模式——终结表达式  
 * @author:     lzc  
 * @version:    1.0  
 * @date:       2019-04-07 00:40:37  
 *  
 * Modification History:  
 * Date         Author      Version     Description  
 * ------------------------------------------------------------------  
 * 2019-04-07   lzc         1.0         1.0 Version  
 */

public class BooleanExpression implements Expression {
	
	@Override
	public boolean interpret(Context context) {
		return context.get(this);
	}

}
