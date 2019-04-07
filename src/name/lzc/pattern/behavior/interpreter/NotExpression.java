package name.lzc.pattern.behavior.interpreter;


/**
 * Description: 解释器模式——非终结表达式    
 * @author:     lzc  
 * @version:    1.0  
 * @date:       2019-04-07 00:27:17  
 *  
 * Modification History:  
 * Date         Author      Version     Description  
 * ------------------------------------------------------------------  
 * 2019-04-07   lzc         1.0         1.0 Version  
 */

public class NotExpression implements Expression {
	
	private Expression expression;
	
	public NotExpression(Expression expression) {
		this.expression = expression;
	}

	@Override
	public boolean interpret(Context context) {
		return !expression.interpret(context);
	}

}
