package name.lzc.pattern.behavior.command;

import org.junit.Test;

/**
 * Description:   
 * @author:     lzc  
 * @version:    1.0  
 * @date:       2019-04-06 15:00:53  
 *  
 * Modification History:  
 * Date         Author      Version     Description  
 * ------------------------------------------------------------------  
 * 2019-04-06   lzc         1.0         1.0 Version  
 */

public class CommandTest {

	//从结构上看有点像策略模式（委托），如果是直接执行command.execute()的话
	@Test
	public void test() {
		//命令接收者
		Receiver receiver = new Receiver();
		//命令对象
		Command command = new ConcreteCommand(receiver);
		//命令执行者，执行命令
		Invoker invoker = new Invoker(command);
		invoker.invoke();
	}

}
