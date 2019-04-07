package name.lzc.pattern.behavior.template;


/**
 * Description:   
 * @author:     lzc  
 * @version:    1.0  
 * @date:       2019-04-04 17:59:36  
 *  
 * Modification History:  
 * Date         Author      Version     Description  
 * ------------------------------------------------------------------  
 * 2019-04-04   lzc         1.0         1.0 Version  
 */

public class QuickChargePhone extends MobilePhone {

	@Override
	protected void start() {
		System.out.println("快速充电：开始...");
		try {
			Thread.sleep(1000);
			System.out.println("用时1秒");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	@Override
	protected void stop() {
		System.out.println("快速充电：结束");
	}

}
