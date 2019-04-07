package name.lzc.pattern.creational.factory.factorymethod;

import name.lzc.pattern.creational.factory.MP3Player;
import name.lzc.pattern.creational.factory.MP4Player;

/**
 * Description: 工厂模式——静态工厂方法模式   
 * @author:     lzc  
 * @version:    1.0  
 * @date:       2019-04-01 15:42:11  
 *  
 * Modification History:  
 * Date         Author      Version     Description  
 * ------------------------------------------------------------------  
 * 2019-04-01   lzc         1.0         1.0 Version  
 */

public class PlayerFactory3 {
	
	public static MP3Player createMP3Plyaer() {
		return new MP3Player();
	}
	
	public static MP4Player createMP4Player() {
		return new MP4Player();
	}
}
