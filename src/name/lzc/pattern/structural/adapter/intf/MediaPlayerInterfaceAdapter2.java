package name.lzc.pattern.structural.adapter.intf;


/**
 * Description: 适配器模式-接口适配器  
 * @author:     lzc  
 * @version:    1.0  
 * @date:       2019-04-02 15:21:12  
 *  
 * Modification History:  
 * Date         Author      Version     Description  
 * ------------------------------------------------------------------  
 * 2019-04-02   lzc         1.0         1.0 Version  
 */

public class MediaPlayerInterfaceAdapter2 extends AbstractMediaTarget {

	@Override
	public void playMP4() {
		System.out.println("play MP4 by adapter2");
	}

	@Override
	public void playAvi() {
		System.out.println("play avi by adapter2");
	}

}
