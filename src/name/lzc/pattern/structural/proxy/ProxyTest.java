package name.lzc.pattern.structural.proxy;

import org.junit.Test;

import name.lzc.pattern.structural.proxy.dynamics.CglibProxyFactory;
import name.lzc.pattern.structural.proxy.dynamics.JDKProxyFactory;
import name.lzc.pattern.structural.proxy.statics.TeacherProxy;

/**
 * Description:   
 * @author:     lzc  
 * @version:    1.0  
 * @date:       2019-04-02 18:10:11  
 *  
 * Modification History:  
 * Date         Author      Version     Description  
 * ------------------------------------------------------------------  
 * 2019-04-02   lzc         1.0         1.0 Version  
 */

public class ProxyTest {

	/**
	* <p>描述：静态代理测试</p>
	* @author lzc
	 */
	@Test
	public void test1() {
		//对照组
		Teacher teacher1 = new MathTeacher();
		teacher1.teach();

		Teacher teacher2 = new TeacherProxy();
		teacher2.teach();
	}
	
	/**
	* <p>描述：基于jdk的动态代理测试（目标对象必须要有接口）</p>
	* @author lzc
	 */
	@Test
	public void test2() {
		//对照组
		Teacher teacher1 = new MathTeacher();
		teacher1.teach();
		System.out.println(teacher1.getClass());
		
		Teacher proxy = (Teacher) new JDKProxyFactory(teacher1).getProxyInstance();
		proxy.teach();
		System.out.println(proxy.getClass());
	}
	
	/**
	* <p>描述：基于cglib的动态代理测试（如果目标对象没有实现的接口）</p>
	* @author lzc
	 */
	@Test
	public void test3() {
		//对照组
		CglibTarget cglibTarget = new CglibTarget();
		cglibTarget.doAction();
		System.out.println(cglibTarget.getClass());
		
		CglibTarget proxy = (CglibTarget) new CglibProxyFactory(cglibTarget).getProxyInstance();
		proxy.doAction();
		System.out.println(proxy.getClass());
	}
}
