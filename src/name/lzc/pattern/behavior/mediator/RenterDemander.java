package name.lzc.pattern.behavior.mediator;


/**
 * Description: 求租客  
 * @author:     lzc  
 * @version:    1.0  
 * @date:       2019-04-06 14:13:33  
 *  
 * Modification History:  
 * Date         Author      Version     Description  
 * ------------------------------------------------------------------  
 * 2019-04-06   lzc         1.0         1.0 Version  
 */

public class RenterDemander extends Demander {

	public RenterDemander(Mediator mediator) {
		super(mediator);
	}

	@Override
	public void sendMsg(String msg) {
		getMediator().notice(this, msg);
	}

	@Override
	public void showMsg(String msg) {
		System.out.println("租客" + hashCode()+"收到消息：" + msg);
	}

}
