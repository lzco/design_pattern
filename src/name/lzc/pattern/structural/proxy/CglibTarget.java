package name.lzc.pattern.structural.proxy;


/**
 * Description: cglib代理-目标对象  
 * @author:     lzc  
 * @version:    1.0  
 * @date:       2019-04-02 21:05:49  
 *  
 * Modification History:  
 * Date         Author      Version     Description  
 * ------------------------------------------------------------------  
 * 2019-04-02   lzc         1.0         1.0 Version  
 */

public class CglibTarget {

	//如果用final或static修饰，将不会执行代理对象的额外操作
	public void doAction() {
		System.out.println("目标对象动作");
	}
}
