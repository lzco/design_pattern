package name.lzc.pattern.behavior.command;


/**
 * Description:   
 * @author:     lzc  
 * @version:    1.0  
 * @date:       2019-04-06 14:59:02  
 *  
 * Modification History:  
 * Date         Author      Version     Description  
 * ------------------------------------------------------------------  
 * 2019-04-06   lzc         1.0         1.0 Version  
 */

public class Invoker {

	private Command command;

	public Invoker(Command command) {
		this.command = command;
	}
	
	public void invoke() {
		command.execute();
	}
}
