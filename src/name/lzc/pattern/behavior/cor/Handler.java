package name.lzc.pattern.behavior.cor;


/**
 * Description: 责任链（chain of responsibility）模式
 * @author:     lzc  
 * @version:    1.0  
 * @date:       2019-04-06 16:47:56  
 *  
 * Modification History:  
 * Date         Author      Version     Description  
 * ------------------------------------------------------------------  
 * 2019-04-06   lzc         1.0         1.0 Version  
 */

public interface Handler {

	void handle(Object request, HandlerChain handler);
}
