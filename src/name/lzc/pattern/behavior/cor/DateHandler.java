package name.lzc.pattern.behavior.cor;

import java.util.Date;

/**
 * Description:   
 * @author:     lzc  
 * @version:    1.0  
 * @date:       2019-04-06 17:08:51  
 *  
 * Modification History:  
 * Date         Author      Version     Description  
 * ------------------------------------------------------------------  
 * 2019-04-06   lzc         1.0         1.0 Version  
 */

public class DateHandler implements Handler {

	@Override
	public void handle(Object request, HandlerChain handler) {
		System.out.println("进入DateHandler...");
		if(request instanceof Date) {
			System.out.println("处理日期请求");
			return;
		}
		handler.handle(request, handler);
	}

}
