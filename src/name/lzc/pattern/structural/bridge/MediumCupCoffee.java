package name.lzc.pattern.structural.bridge;


/**
 * Description: 桥梁模式——RefinedAbstractionB  
 * @author:     lzc  
 * @version:    1.0  
 * @date:       2019-04-03 22:28:09  
 *  
 * Modification History:  
 * Date         Author      Version     Description  
 * ------------------------------------------------------------------  
 * 2019-04-03   lzc         1.0         1.0 Version  
 */

public class MediumCupCoffee extends Coffee {

	public MediumCupCoffee(CoffeeTaste coffeeTaste) {
		super(coffeeTaste);
	}

	@Override
	public void makeACoffee() {
		System.out.print("得到一杯中杯咖啡 ");
		getCoffeeTaste().add();
	}

}
