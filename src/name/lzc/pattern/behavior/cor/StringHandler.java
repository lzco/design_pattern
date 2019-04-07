package name.lzc.pattern.behavior.cor;


/**
 * Description:   
 * @author:     lzc  
 * @version:    1.0  
 * @date:       2019-04-06 17:03:50  
 *  
 * Modification History:  
 * Date         Author      Version     Description  
 * ------------------------------------------------------------------  
 * 2019-04-06   lzc         1.0         1.0 Version  
 */

public class StringHandler implements Handler {

	@Override
	public void handle(Object request, HandlerChain handler) {
		System.out.println("进入StringHandler...");
		if(request instanceof String) {
			System.out.println("处理字符串请求");
			return;
		}
		handler.handle(request, handler);
	}

}
