package name.lzc.pattern.creational.factory.factorymethod;

import name.lzc.pattern.creational.factory.MP3Player;
import name.lzc.pattern.creational.factory.MP4Player;
import name.lzc.pattern.creational.factory.MediaPlayer;

/**
 * Description: 工厂模式——普通工厂方法模式  
 * @author:     lzc  
 * @version:    1.0  
 * @date:       2019-04-01 15:32:10  
 *  
 * Modification History:  
 * Date         Author      Version     Description  
 * ------------------------------------------------------------------  
 * 2019-04-01   lzc         1.0         1.0 Version  
 */

public class PlayerFactory1 {

	public MediaPlayer createPlayer(String type) {
		if("mp3".equals(type)) {
			return new MP3Player();
		}else if("mp4".equals(type)){
			return new MP4Player();
		}else {
			return null;
		}
	}
}
