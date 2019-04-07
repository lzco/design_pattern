package name.lzc.pattern.structural.adapter.intf;

import name.lzc.pattern.structural.adapter.MediaTarget;

/**
 * Description: 抽象目标对象  
 * @author:     lzc  
 * @version:    1.0  
 * @date:       2019-04-02 15:14:46  
 *  
 * Modification History:  
 * Date         Author      Version     Description  
 * ------------------------------------------------------------------  
 * 2019-04-02   lzc         1.0         1.0 Version  
 */

public abstract class AbstractMediaTarget implements MediaTarget{

	@Override
	public void playMP3() {}

	@Override
	public void playMP4() {}

	@Override
	public void playAvi() {}

	
}
