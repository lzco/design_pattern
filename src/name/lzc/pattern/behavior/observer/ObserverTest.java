package name.lzc.pattern.behavior.observer;

import org.junit.Test;

import name.lzc.pattern.behavior.observer.jdkself.DataObservable;
import name.lzc.pattern.behavior.observer.jdkself.HistogramObserver;
import name.lzc.pattern.behavior.observer.jdkself.LineChartObserver;

/**
 * Description:   
 * @author:     lzc  
 * @version:    1.0  
 * @date:       2019-04-05 21:19:07  
 *  
 * Modification History:  
 * Date         Author      Version     Description  
 * ------------------------------------------------------------------  
 * 2019-04-05   lzc         1.0         1.0 Version  
 */

public class ObserverTest {

	@Test
	public void test1() {
		Subject subject = new ConcreteSubject();
		subject.addObserver(new ConcreteObserverA());
		subject.addObserver(new ConcreteObserverB());
		
		subject.setState("11111");
		subject.setState("22222");
	}
	
	@Test
	public void test2() {
		DataObservable dataObservable = new DataObservable();
		dataObservable.addObserver(new HistogramObserver());
		dataObservable.addObserver(new LineChartObserver());
		
		dataObservable.setData("11111");
		dataObservable.setData("22222");
		System.out.println(dataObservable.countObservers());
	}

}
