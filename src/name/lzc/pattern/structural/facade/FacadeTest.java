package name.lzc.pattern.structural.facade;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Description:   
 * @author:     lzc  
 * @version:    1.0  
 * @date:       2019-04-04 17:20:13  
 *  
 * Modification History:  
 * Date         Author      Version     Description  
 * ------------------------------------------------------------------  
 * 2019-04-04   lzc         1.0         1.0 Version  
 */

public class FacadeTest {

	@Test
	public void test() {
		Facade facade = new Facade();
		facade.operationWrapper();
	}

}
