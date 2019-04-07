package name.lzc.pattern.behavior.observer;


/**
 * Description: 观察者模式——被观察者接口  
 * @author:     lzc  
 * @version:    1.0  
 * @date:       2019-04-05 20:53:35  
 *  
 * Modification History:  
 * Date         Author      Version     Description  
 * ------------------------------------------------------------------  
 * 2019-04-05   lzc         1.0         详见jdk自带的{@link java.util.Observable} 
 */

public interface Subject {

	void addObserver(Observer observer);
	
	void removeObserver(Observer observer);
	
	void notifyObservers();

	void setState(String state);

	String getState();
}
