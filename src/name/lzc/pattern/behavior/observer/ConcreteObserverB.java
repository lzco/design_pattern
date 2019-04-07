package name.lzc.pattern.behavior.observer;


/**
 * Description: 观察者模式——具体的观察者A  
 * @author:     lzc  
 * @version:    1.0  
 * @date:       2019-04-05 21:05:18  
 *  
 * Modification History:  
 * Date         Author      Version     Description  
 * ------------------------------------------------------------------  
 * 2019-04-05   lzc         1.0         1.0 Version  
 */

public class ConcreteObserverB implements Observer {
	
	@Override
	public void update(Subject subject) {
		System.out.println("观察者B："+subject.getState());
	}
	
}
