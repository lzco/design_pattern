package name.lzc.pattern.structural.adapter;

import org.junit.Test;

import name.lzc.pattern.structural.adapter.clz.MediaPlayerClassAdapter;
import name.lzc.pattern.structural.adapter.intf.MediaPlayerInterfaceAdapter1;
import name.lzc.pattern.structural.adapter.intf.MediaPlayerInterfaceAdapter2;
import name.lzc.pattern.structural.adapter.obj.MediaPlayerObjectAdapter;

/**
 * Description:   
 * @author:     lzc  
 * @version:    1.0  
 * @date:       2019-04-02 14:58:52  
 *  
 * Modification History:  
 * Date         Author      Version     Description  
 * ------------------------------------------------------------------  
 * 2019-04-02   lzc         1.0         1.0 Version  
 */

public class AdapterTest {

	@Test
	public void testClassAdapter() {
		MediaTarget target = new MediaPlayerClassAdapter();
		target.playMP3();
		target.playMP4();
		target.playAvi();
	}
	
	@Test
	public void testObjectAdapter() {
		MediaTarget target = new MediaPlayerObjectAdapter(new MediaPlayer());
		target.playMP3();
		target.playMP4();
		target.playAvi();
	}
	
	@Test
	public void testInterfaceAdapter() {
		MediaTarget target1 = new MediaPlayerInterfaceAdapter1();
		target1.playMP3();
		target1.playMP4();
		target1.playAvi();
		MediaTarget target2 = new MediaPlayerInterfaceAdapter2();
		target2.playMP3();
		target2.playMP4();
		target2.playAvi();
	}
}
