package name.lzc.pattern.behavior.mediator;


/**
 * Description: 中介模式——中介接口  
 * @author:     lzc  
 * @version:    1.0  
 * @date:       2019-04-06 13:39:10  
 *  
 * Modification History:  
 * Date         Author      Version     Description  
 * ------------------------------------------------------------------  
 * 2019-04-06   lzc         1.0         1.0 Version  
 */

public interface Mediator {

	void notice(Demander demander, String msg);
}
