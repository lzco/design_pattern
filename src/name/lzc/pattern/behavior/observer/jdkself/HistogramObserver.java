package name.lzc.pattern.behavior.observer.jdkself;

import java.util.Observable;
import java.util.Observer;

/**
 * Description:   
 * @author:     lzc  
 * @version:    1.0  
 * @date:       2019-04-05 21:59:48  
 *  
 * Modification History:  
 * Date         Author      Version     Description  
 * ------------------------------------------------------------------  
 * 2019-04-05   lzc         1.0         1.0 Version  
 */

public class HistogramObserver implements Observer {

	@Override
	public void update(Observable o, Object arg) {
		DataObservable observable = (DataObservable)o;
		System.out.println("柱状图数据："+observable.getData());
	}

}
