package name.lzc.pattern.behavior.observer;


/**
 * Description: 观察者模式——观察者接口  
 * @author:     lzc  
 * @version:    1.0  
 * @date:       2019-04-05 20:54:19  
 *  
 * Modification History:  
 * Date         Author      Version     Description  
 * ------------------------------------------------------------------  
 * 2019-04-05   lzc         1.0         详见jdk自带的{@link java.util.Observer}
 */

public interface Observer {

	void update(Subject subject);
}
