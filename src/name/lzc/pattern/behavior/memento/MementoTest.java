package name.lzc.pattern.behavior.memento;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Description:   
 * @author:     lzc  
 * @version:    1.0  
 * @date:       2019-04-05 22:59:09  
 *  
 * Modification History:  
 * Date         Author      Version     Description  
 * ------------------------------------------------------------------  
 * 2019-04-05   lzc         1.0         1.0 Version  
 */

public class MementoTest {

	@Test
	public void test() {
		//创建原始对象及其原始值
		Originator originator = new Originator("1234");
		System.out.println("原始状态："+originator.getState());

		//备忘对象
		Memento memento = originator.createMemento();
		
		originator.setState("5678");
		System.out.println("修改后的状态："+originator.getState());
		
		//还原
		originator.restore2Memento(memento);
		System.out.println("还原后的状态："+originator.getState());
	}

}
