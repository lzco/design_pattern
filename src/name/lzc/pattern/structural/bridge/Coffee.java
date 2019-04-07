package name.lzc.pattern.structural.bridge;


/**
 * Description: 桥梁模式——Abstraction  
 * @author:     lzc  
 * @version:    1.0  
 * @date:       2019-04-03 22:18:52  
 *  
 * Modification History:  
 * Date         Author      Version     Description  
 * ------------------------------------------------------------------  
 * 2019-04-03   lzc         1.0         1.0 Version  
 */

public abstract class Coffee {

	private CoffeeTaste coffeeTaste;
	
	public Coffee(CoffeeTaste coffeeTaste) {
		this.coffeeTaste = coffeeTaste;
	}

	public CoffeeTaste getCoffeeTaste() {
		return coffeeTaste;
	}
	
	public abstract void makeACoffee();
}
