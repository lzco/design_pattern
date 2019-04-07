package name.lzc.pattern.creational.factory.abstractfactory;

import name.lzc.pattern.creational.factory.MediaPlayer;

/**
 * Description: 抽象工厂模式  
 * @author:     lzc  
 * @version:    1.0  
 * @date:       2019-04-01 15:53:31  
 *  
 * Modification History:  
 * Date         Author      Version     Description  
 * ------------------------------------------------------------------  
 * 2019-04-01   lzc         1.0         1.0 Version  
 */

public interface PlayerFactory {

	MediaPlayer createPlayer();
}
