package name.lzc.pattern.creational.singleton;


/**
 * Description: 单例模式——饿汉式（线程安全）  
 * @author:     lzc  
 * @version:    1.0  
 * @date:       2019-04-01 16:14:46  
 *  
 * Modification History:  
 * Date         Author      Version     Description  
 * ------------------------------------------------------------------  
 * 2019-04-01   lzc         1.0         1.0 Version  
 */

public class Singleton1 {

	private static Singleton1 singleton1 = new Singleton1();
	
	private Singleton1() {};
	
	public static Singleton1 getInstance() {
		return singleton1;
	}
}
