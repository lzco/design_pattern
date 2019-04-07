package name.lzc.pattern.behavior.mediator;


/**
 * Description: 中介模式——请求者  
 * @author:     lzc  
 * @version:    1.0  
 * @date:       2019-04-06 13:46:42  
 *  
 * Modification History:  
 * Date         Author      Version     Description  
 * ------------------------------------------------------------------  
 * 2019-04-06   lzc         1.0         1.0 Version  
 */

public abstract class Demander {

	private Mediator mediator;

	public Demander(Mediator mediator) {
		this.mediator = mediator;
	}

	public Mediator getMediator() {
		return mediator;
	}

	public void setMediator(Mediator mediator) {
		this.mediator = mediator;
	}
	
	public abstract void sendMsg(String msg);
	
	public abstract void showMsg(String msg);
}
