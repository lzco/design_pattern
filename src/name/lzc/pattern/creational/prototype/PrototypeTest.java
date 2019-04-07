package name.lzc.pattern.creational.prototype;

import org.junit.Test;

/**
 * Description:   
 * @author:     lzc  
 * @version:    1.0  
 * @date:       2019-04-03 21:40:21  
 *  
 * Modification History:  
 * Date         Author      Version     Description  
 * ------------------------------------------------------------------  
 * 2019-04-03   lzc         1.0         1.0 Version  
 */

public class PrototypeTest {

	@Test
	public void test() throws Exception {
		Prototype prototype = new Prototype();
		prototype.setValue(new int[]{1,2,3});
		System.out.println(prototype);//name.lzc.pattern.creational.prototype.Prototype@2328c243
		System.out.println(prototype.getValue());//FIXME [I@bebdb06
		
		//浅层复制，成员属性引用的对象不变
		Prototype clone1 = (Prototype) prototype.clone();
		System.out.println(clone1);//name.lzc.pattern.creational.prototype.Prototype@7a4f0f29
		System.out.println(clone1.getValue());//FIXME [I@bebdb06
		
		//深层复制，成员属性引用的对象会重新创建
		Prototype clone2 = (Prototype) prototype.deepClone();
		System.out.println(clone2);//name.lzc.pattern.creational.prototype.Prototype@1c4af82c
		System.out.println(clone2.getValue());//FIXME [I@379619aa
	}

}
