package name.lzc.pattern.structural.bridge;


/**
 * Description: 桥梁模式——RefinedAbstractionA  
 * @author:     lzc  
 * @version:    1.0  
 * @date:       2019-04-03 22:29:44  
 *  
 * Modification History:  
 * Date         Author      Version     Description  
 * ------------------------------------------------------------------  
 * 2019-04-03   lzc         1.0         1.0 Version  
 */

public class LargeCupCoffee extends Coffee {

	public LargeCupCoffee(CoffeeTaste coffeeTaste) {
		super(coffeeTaste);
	}

	@Override
	public void makeACoffee() {
		System.out.print("得到一杯大杯咖啡 ");
		getCoffeeTaste().add();
	}

}
