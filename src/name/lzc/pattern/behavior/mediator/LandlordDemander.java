package name.lzc.pattern.behavior.mediator;


/**
 * Description: 房东  
 * @author:     lzc  
 * @version:    1.0  
 * @date:       2019-04-06 13:54:12  
 *  
 * Modification History:  
 * Date         Author      Version     Description  
 * ------------------------------------------------------------------  
 * 2019-04-06   lzc         1.0         1.0 Version  
 */

public class LandlordDemander extends Demander {

	public LandlordDemander(Mediator mediator) {
		super(mediator);
	}

	@Override
	public void sendMsg(String msg) {
		getMediator().notice(this, msg);
	}

	@Override
	public void showMsg(String msg) {
		System.out.println("房东" + hashCode()+"收到消息：" + msg);
	}

}
