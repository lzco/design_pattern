package name.lzc.pattern.behavior.template;


/**
 * Description:   
 * @author:     lzc  
 * @version:    1.0  
 * @date:       2019-04-04 18:01:35  
 *  
 * Modification History:  
 * Date         Author      Version     Description  
 * ------------------------------------------------------------------  
 * 2019-04-04   lzc         1.0         1.0 Version  
 */

public class NormalChargePhone extends MobilePhone {

	@Override
	protected void start() {
		System.out.println("常规充电：开始...");
		try {
			Thread.sleep(2500);
			System.out.println("用时2.5秒");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	@Override
	protected void stop() {
		System.out.println("常规充电：结束");
	}

}
