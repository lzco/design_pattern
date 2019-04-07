package name.lzc.pattern.behavior.interpreter;


/**
 * Description: 解释器模式——表达式接口  
 * @author:     lzc  
 * @version:    1.0  
 * @date:       2019-04-07 00:24:02  
 *  
 * Modification History:  
 * Date         Author      Version     Description  
 * ------------------------------------------------------------------  
 * 2019-04-07   lzc         1.0         1.0 Version  
 */

public interface Expression {

	boolean interpret(Context context);
}
