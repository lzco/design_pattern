package name.lzc.pattern.structural.decorator;


/**
 * Description:   
 * @author:     lzc  
 * @version:    1.0  
 * @date:       2019-04-02 15:30:32  
 *  
 * Modification History:  
 * Date         Author      Version     Description  
 * ------------------------------------------------------------------  
 * 2019-04-02   lzc         1.0         1.0 Version  
 */

public class CellPhone implements Phone {

	@Override
	public void call() {
		System.out.println("打电话");
	}

}
