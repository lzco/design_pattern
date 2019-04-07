package name.lzc.pattern.structural.proxy;


/**
 * Description:   
 * @author:     lzc  
 * @version:    1.0  
 * @date:       2019-04-02 18:04:48  
 *  
 * Modification History:  
 * Date         Author      Version     Description  
 * ------------------------------------------------------------------  
 * 2019-04-02   lzc         1.0         1.0 Version  
 */

public class MathTeacher implements Teacher {

	@Override
	public void teach() {
		System.out.println("教数学");
	}

}
