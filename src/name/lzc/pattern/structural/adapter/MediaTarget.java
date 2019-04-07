package name.lzc.pattern.structural.adapter;


/**
 * Description: 目标对象  
 * @author:     lzc  
 * @version:    1.0  
 * @date:       2019-04-02 14:54:07  
 *  
 * Modification History:  
 * Date         Author      Version     Description  
 * ------------------------------------------------------------------  
 * 2019-04-02   lzc         1.0         1.0 Version  
 */

public interface MediaTarget {

	void playMP3();
	
	void playMP4();
	
	void playAvi();
}
