package name.lzc.pattern.structural.adapter.obj;

import name.lzc.pattern.structural.adapter.MediaPlayer;
import name.lzc.pattern.structural.adapter.MediaTarget;

/**
 * Description: 适配器模式-对象适配器    
 * @author:     lzc  
 * @version:    1.0  
 * @date:       2019-04-02 15:09:26  
 *  
 * Modification History:  
 * Date         Author      Version     Description  
 * ------------------------------------------------------------------  
 * 2019-04-02   lzc         1.0         1.0 Version  
 */

public class MediaPlayerObjectAdapter implements MediaTarget{
	
	private MediaPlayer mediaPlayer;
	
	public MediaPlayerObjectAdapter(MediaPlayer mediaPlayer) {
		this.mediaPlayer = mediaPlayer;
	}

	@Override
	public void playMP3() {
		this.mediaPlayer.playMP3();
	}

	@Override
	public void playMP4() {
		this.mediaPlayer.playMP4();
		
	}

	@Override
	public void playAvi() {
		System.out.println("play avi");
	}

}
