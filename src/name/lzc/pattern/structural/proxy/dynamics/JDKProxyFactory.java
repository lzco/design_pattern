package name.lzc.pattern.structural.proxy.dynamics;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * Description: 代理模式-动态代理（基于反射）  代理工厂
 * @author:     lzc  
 * @version:    1.0  
 * @date:       2019-04-02 20:33:45  
 *  
 * Modification History:  
 * Date         Author      Version     Description  
 * ------------------------------------------------------------------  
 * 2019-04-02   lzc         1.0         1.0 Version  
 */

public class JDKProxyFactory {

	//被代理对象
	private Object target;
	
	public JDKProxyFactory(Object target) {
		this.target = target;
	}
	
	/**
	* <p>描述：获取代理对象</p>
	* @return
	* @author lzc
	 */
	public Object getProxyInstance() {
		return Proxy.newProxyInstance(this.target.getClass().getClassLoader(),
				this.target.getClass().getInterfaces(), 
				new InvocationHandler() {
					
					@Override
					public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
						System.out.println("代理前置信息");
						Object retVal = method.invoke(target, args);
						System.out.println("代理后置信息");
						return retVal;
					}
				});
	}
}
