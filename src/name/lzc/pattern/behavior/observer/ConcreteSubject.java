package name.lzc.pattern.behavior.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Description: 观察者模式——具体的被观察者 
 * @author:     lzc  
 * @version:    1.0  
 * @date:       2019-04-05 21:00:13  
 *  
 * Modification History:  
 * Date         Author      Version     Description  
 * ------------------------------------------------------------------  
 * 2019-04-05   lzc         1.0         1.0 Version  
 */

public class ConcreteSubject implements Subject {
	
	private String state;

	private List<Observer> observers = new ArrayList<Observer>();
	
	@Override
	public void addObserver(Observer observer) {
		observers.add(observer);
	}

	@Override
	public void removeObserver(Observer observer) {
		observers.remove(observer);
	}

	@Override
	public void notifyObservers() {
		for(Observer observer : observers) {
			observer.update(this);
		}
	}

	@Override
	public void setState(String state) {
		this.state = state;
		this.notifyObservers();
	}

	@Override
	public String getState() {
		return state;
	}

}
