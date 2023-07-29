package name.lzc.pattern.creational.singleton;


/**
 * Description: 单例模式——懒汉式（延迟加载，需要考虑线程安全问题）  
 * @author:     lzc  
 * @version:    1.0  
 * @date:       2019-04-01 16:16:50  
 *  
 * Modification History:  
 * Date         Author      Version     Description  
 * ------------------------------------------------------------------  
 * 2019-04-01   lzc         1.0         1.0 Version  
 */

public class Singleton2 {

	private static volatile Singleton2 singleton2;
	
	private Singleton2() {};
	
	public static Singleton2 getInstance() {
		if(singleton2 == null) {
			//考虑到线程安全，故加synchronized；实例只创建一次，synchronized放在判空语句内，对性能则不会有什么影响
			synchronized(Singleton2.class) {
				if(singleton2 == null) {
					singleton2 = new Singleton2();
				}
			}
		}
		return singleton2;
	}
	
	/*
	//等同于以上方法
	public static Singleton2 getInstance() {
		if(singleton2 == null) {
			init();
		}
		return singleton2;
	}
	
	public static synchronized void init() {
		if(singleton2 == null) {
			singleton2 = new Singleton2();
		}
	}*/
}
