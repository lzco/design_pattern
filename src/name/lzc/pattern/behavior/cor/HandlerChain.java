package name.lzc.pattern.behavior.cor;

import java.util.ArrayList;
import java.util.List;

/**
 * Description: 责任链的实现  
 * @author:     lzc  
 * @version:    1.0  
 * @date:       2019-04-06 16:51:55  
 *  
 * Modification History:  
 * Date         Author      Version     Description  
 * ------------------------------------------------------------------  
 * 2019-04-06   lzc         1.0         1.0 Version  
 */

public class HandlerChain implements Handler{
	
	private int index;
	private List<Handler> handlers = new ArrayList<>();
	
	public HandlerChain addHandler(Handler handler) {
		handlers.add(handler);
		return this;
	}

	@Override
	public void handle(Object request, HandlerChain handler) {
		if(index == handlers.size()) {
			return;
		}
		
		Handler _handler = handlers.get(index++);
		_handler.handle(request, handler);
	}

}
