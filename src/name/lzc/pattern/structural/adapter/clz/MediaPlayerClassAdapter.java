package name.lzc.pattern.structural.adapter.clz;

import name.lzc.pattern.structural.adapter.MediaPlayer;
import name.lzc.pattern.structural.adapter.MediaTarget;

/**
 * Description: 适配器模式-类适配器  
 * @author:     lzc  
 * @version:    1.0  
 * @date:       2019-04-02 14:56:18  
 *  
 * Modification History:  
 * Date         Author      Version     Description  
 * ------------------------------------------------------------------  
 * 2019-04-02   lzc         1.0         1.0 Version  
 */

public class MediaPlayerClassAdapter extends MediaPlayer implements MediaTarget{

	@Override
	public void playAvi() {
		System.out.println("play avi");
	}

}
