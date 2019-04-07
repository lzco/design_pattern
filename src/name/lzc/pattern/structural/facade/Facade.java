package name.lzc.pattern.structural.facade;


/**
 * Description: 外观模式（门面模式）  
 * @author:     lzc  
 * @version:    1.0  
 * @date:       2019-04-04 17:17:20  
 *  
 * Modification History:  
 * Date         Author      Version     Description  
 * ------------------------------------------------------------------  
 * 2019-04-04   lzc         1.0         1.0 Version  
 */

public class Facade {

	private SubSystem1 subSystem1;
	private SubSystem2 subSystem2;
	
	public Facade() {
		subSystem1 = new SubSystem1();
		subSystem2 = new SubSystem2();
	}
	
	public void operationWrapper() {
		System.out.println("======开始=======");
		subSystem1.operation();
		subSystem2.operation();
		System.out.println("======结束=======");
	}
}
