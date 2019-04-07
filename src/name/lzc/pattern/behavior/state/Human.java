package name.lzc.pattern.behavior.state;


/**
 * Description: State模式——动作实现 
 * @author:     lzc  
 * @version:    1.0  
 * @date:       2019-04-05 16:37:02  
 *  
 * Modification History:  
 * Date         Author      Version     Description  
 * ------------------------------------------------------------------  
 * 2019-04-05   lzc         1.0         1.0 Version  
 */

public class Human {

	private BrainState state;

	public Human(BrainState state) {
		this.state = state;
	}
	
	public void showState() {
		state.showState();
	}
	
	boolean changeState(BrainState state) {
		this.state = state;
		return true;
	}
	
	public void showAndChangeState() {
		state.showAndChangeState(this);
	}
}
