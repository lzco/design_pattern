package name.lzc.pattern.structural.proxy.dynamics;

import java.lang.reflect.Method;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

/**
 * Description: 代理模式-cglib动态代理  
 * @author:     lzc  
 * @version:    1.0  
 * @date:       2019-04-02 21:08:00  
 *  
 * Modification History:  
 * Date         Author      Version     Description  
 * ------------------------------------------------------------------  
 * 2019-04-02   lzc         1.0         1.0 Version  
 */

public class CglibProxyFactory implements MethodInterceptor {
	
	//被代理对象
	private Object target;
	
	public CglibProxyFactory(Object target) {
		this.target = target;
	}

	@Override
	public Object intercept(Object proxy, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
		System.out.println("代理前置信息");
		Object retVal = method.invoke(target, args);
		System.out.println("代理后置信息");
		return retVal;
	}
	
	/**
	* <p>描述：获取代理对象</p>
	* @return
	* @author lzc
	 */
	public Object getProxyInstance() {
		//获取工具类
		Enhancer enhancer = new Enhancer();
		//设置父类
		enhancer.setSuperclass(this.target.getClass());
		//设置回调函数
		enhancer.setCallback(this);
		//创建代理对象
		return enhancer.create();
	}

}
