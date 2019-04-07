package name.lzc.pattern.behavior.cor;


/**
 * Description:   
 * @author:     lzc  
 * @version:    1.0  
 * @date:       2019-04-06 17:06:06  
 *  
 * Modification History:  
 * Date         Author      Version     Description  
 * ------------------------------------------------------------------  
 * 2019-04-06   lzc         1.0         1.0 Version  
 */

public class IntegerHandler implements Handler {

	@Override
	public void handle(Object request, HandlerChain handler) {
		System.out.println("进入IntegerHandler...");
		if(request instanceof Integer) {
			System.out.println("处理整型数字请求");
			return;
		}
		handler.handle(request, handler);
	}

}
