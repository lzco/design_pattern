package name.lzc.pattern.creational.factory.abstractfactory;

import org.junit.Test;

import name.lzc.pattern.creational.factory.MediaPlayer;

/**
 * Description:   
 * @author:     lzc  
 * @version:    1.0  
 * @date:       2019-04-01 16:01:12  
 *  
 * Modification History:  
 * Date         Author      Version     Description  
 * ------------------------------------------------------------------  
 * 2019-04-01   lzc         1.0         1.0 Version  
 */

public class FactoryTest {

	@Test
	public void test() {
		MP3PlayerFactory mp3PlayerFactory = new MP3PlayerFactory();
		MediaPlayer mp3Player = mp3PlayerFactory.createPlayer();
		mp3Player.play();
		
		MP4PlayerFactory mp4PlayerFactory = new MP4PlayerFactory();
		MediaPlayer mp4Player = mp4PlayerFactory.createPlayer();
		mp4Player.play();
	}
}
