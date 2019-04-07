package name.lzc.pattern.behavior.state;

import org.junit.Test;

/**
 * Description:   
 * @author:     lzc  
 * @version:    1.0  
 * @date:       2019-04-05 17:00:01  
 *  
 * Modification History:  
 * Date         Author      Version     Description  
 * ------------------------------------------------------------------  
 * 2019-04-05   lzc         1.0         1.0 Version  
 */

public class StateTest {

	@Test
	public void test() {
		//乍一看，有点像策略模式，实现起来有点绕
		BrainState state = new SoberState();
		Human context = new Human(state);
		context.showAndChangeState();
		context.showAndChangeState();
		context.showAndChangeState();
	}

}
