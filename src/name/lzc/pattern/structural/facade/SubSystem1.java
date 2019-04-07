package name.lzc.pattern.structural.facade;


/**
 * Description:   
 * @author:     lzc  
 * @version:    1.0  
 * @date:       2019-04-04 17:16:31  
 *  
 * Modification History:  
 * Date         Author      Version     Description  
 * ------------------------------------------------------------------  
 * 2019-04-04   lzc         1.0         1.0 Version  
 */

public class SubSystem1 implements CommonSystem {

	@Override
	public void operation() {
		System.out.println("子系统1的操作");
	}

}
