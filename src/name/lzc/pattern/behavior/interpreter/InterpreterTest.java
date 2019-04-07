package name.lzc.pattern.behavior.interpreter;

import org.junit.Test;

/**
 * Description:   
 * @author:     lzc  
 * @version:    1.0  
 * @date:       2019-04-07 00:52:15  
 *  
 * Modification History:  
 * Date         Author      Version     Description  
 * ------------------------------------------------------------------  
 * 2019-04-07   lzc         1.0         1.0 Version  
 */

public class InterpreterTest {

	@Test
	public void test() {
		Context context = new Context();
		
		BooleanExpression expression1 = new BooleanExpression();
		context.save(expression1, true);
		NotExpression notExpression1 = new NotExpression(expression1);
		
		BooleanExpression expression2 = new BooleanExpression();
		context.save(expression2, false);
		NotExpression notExpression2 = new NotExpression(expression2);
		
		System.out.println(notExpression1.interpret(context));
		System.out.println(notExpression2.interpret(context));
	}
}
