package name.lzc.pattern.creational.factory;


/**
 * Description:   
 * @author:     lzc  
 * @version:    1.0  
 * @date:       2019-04-01 15:27:49  
 *  
 * Modification History:  
 * Date         Author      Version     Description  
 * ------------------------------------------------------------------  
 * 2019-04-01   lzc         1.0         1.0 Version  
 */

public class MP4Player implements MediaPlayer {

	@Override
	public void play() {
		System.out.println("play movies by mp4");
	}

}
