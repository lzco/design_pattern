package name.lzc.pattern.structural.decorator;


/**
 * Description: 装饰器模式（结构改造自对象适配器模式）  
 * @author:     lzc  
 * @version:    1.0  
 * @date:       2019-04-02 15:31:21  
 *  
 * Modification History:  
 * Date         Author      Version     Description  
 * ------------------------------------------------------------------  
 * 2019-04-02   lzc         1.0         1.0 Version  
 */

public class PhoneDecorator implements Phone {
	
	private Phone phone;
	
	public PhoneDecorator(Phone phone) {
		this.phone = phone;
	}

	@Override
	public void call() {
		System.out.println("播放彩铃...");
		phone.call();
	}

}
