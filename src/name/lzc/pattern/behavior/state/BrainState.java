package name.lzc.pattern.behavior.state;


/**
 * Description: State模式——状态逻辑接口（大脑状态）  
 * @author:     lzc  
 * @version:    1.0  
 * @date:       2019-04-05 16:35:40  
 *  
 * Modification History:  
 * Date         Author      Version     Description  
 * ------------------------------------------------------------------  
 * 2019-04-05   lzc         1.0         1.0 Version  
 */

public interface BrainState {

	void showState();
	
	boolean changeState(Human context, BrainState state);
	
	void showAndChangeState(Human context);
}
