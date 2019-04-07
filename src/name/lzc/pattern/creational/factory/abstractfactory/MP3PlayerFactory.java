package name.lzc.pattern.creational.factory.abstractfactory;

import name.lzc.pattern.creational.factory.MP3Player;
import name.lzc.pattern.creational.factory.MediaPlayer;

/**
 * Description:   
 * @author:     lzc  
 * @version:    1.0  
 * @date:       2019-04-01 15:58:52  
 *  
 * Modification History:  
 * Date         Author      Version     Description  
 * ------------------------------------------------------------------  
 * 2019-04-01   lzc         1.0         1.0 Version  
 */

public class MP3PlayerFactory implements PlayerFactory{

	@Override
	public MediaPlayer createPlayer() {
		return new MP3Player();
	}
}
