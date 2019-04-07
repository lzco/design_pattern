package name.lzc.pattern.behavior.template;

import org.junit.Test;

/**
 * Description: 模板（方法）模式测试  
 * @author:     lzc  
 * @version:    1.0  
 * @date:       2019-04-04 18:03:57  
 *  
 * Modification History:  
 * Date         Author      Version     Description  
 * ------------------------------------------------------------------  
 * 2019-04-04   lzc         1.0         1.0 Version  
 */

public class TemplateTest {

	@Test
	public void test() {
		MobilePhone qcPhone = new QuickChargePhone();
		qcPhone.charge();
		
		MobilePhone ncPhone = new NormalChargePhone();
		ncPhone.charge();
	}
}
