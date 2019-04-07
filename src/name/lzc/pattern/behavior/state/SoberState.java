package name.lzc.pattern.behavior.state;


/**
 * Description: State模式——状态逻辑的实现（清醒状态 ）
 * @author:     lzc  
 * @version:    1.0  
 * @date:       2019-04-05 16:48:24  
 *  
 * Modification History:  
 * Date         Author      Version     Description  
 * ------------------------------------------------------------------  
 * 2019-04-05   lzc         1.0         1.0 Version  
 */

public class SoberState implements BrainState {

	@Override
	public void showState() {
		System.out.println("现在是清醒状态...");
	}

	@Override
	public boolean changeState(Human context, BrainState state) {
		context.changeState(state);
		return true;
	}

	@Override
	public void showAndChangeState(Human context) {
		this.showState();
		this.changeState(context, new SleepingState());
	}

}
