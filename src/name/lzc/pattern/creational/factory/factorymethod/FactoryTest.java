package name.lzc.pattern.creational.factory.factorymethod;

import org.junit.Test;

import name.lzc.pattern.creational.factory.MP3Player;
import name.lzc.pattern.creational.factory.MP4Player;
import name.lzc.pattern.creational.factory.MediaPlayer;

/**
 * Description:   
 * @author:     lzc  
 * @version:    1.0  
 * @date:       2019-04-01 15:44:53  
 *  
 * Modification History:  
 * Date         Author      Version     Description  
 * ------------------------------------------------------------------  
 * 2019-04-01   lzc         1.0         1.0 Version  
 */

public class FactoryTest {

	@Test
	public void test1() {
		PlayerFactory1 playerFactory = new PlayerFactory1();
		MediaPlayer mp3Player = playerFactory.createPlayer("mp3");
		mp3Player.play();
		MediaPlayer mp4Player = playerFactory.createPlayer("mp4");
		mp4Player.play();
	}
	
	@Test
	public void test2() {
		PlayerFactory2 playerFactory = new PlayerFactory2();
		MP3Player mp3Player = playerFactory.createMP3Plyaer();
		mp3Player.play();
		MP4Player mp4Player = playerFactory.createMP4Player();
		mp4Player.play();
	}
	
	@Test
	public void test3() {
		MP3Player mp3Player = PlayerFactory3.createMP3Plyaer();
		mp3Player.play();
		MP4Player mp4Player = PlayerFactory3.createMP4Player();
		mp4Player.play();
	}
}
