package name.lzc.pattern.structural.bridge;


/**
 * Description: 桥梁模式——ConcreteAbstractionImplA  
 * @author:     lzc  
 * @version:    1.0  
 * @date:       2019-04-03 22:31:54  
 *  
 * Modification History:  
 * Date         Author      Version     Description  
 * ------------------------------------------------------------------  
 * 2019-04-03   lzc         1.0         1.0 Version  
 */

public class SweetCoffeeTaste extends CoffeeTaste {

	@Override
	public void add() {
		System.out.println("加糖");
	}

}
