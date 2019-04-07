package name.lzc.pattern.creational.singleton;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import org.junit.Test;

/**
 * Description:   
 * @author:     lzc  
 * @version:    1.0  
 * @date:       2019-04-01 16:25:00  
 *  
 * Modification History:  
 * Date         Author      Version     Description  
 * ------------------------------------------------------------------  
 * 2019-04-01   lzc         1.0         1.0 Version  
 */

public class SingletonTest {

	@Test
	public void test() {
		ExecutorService executorService = Executors.newScheduledThreadPool(10);
		for(int i=0;i<10;i++) {
			executorService.execute(new Runnable() {
				@Override
				public void run() {
//					System.out.println(Singleton1.getInstance());
					System.out.println(Singleton2.getInstance());
				}
			});
		}
	}
}
