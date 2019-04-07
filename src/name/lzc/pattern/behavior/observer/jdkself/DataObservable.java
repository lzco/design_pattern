package name.lzc.pattern.behavior.observer.jdkself;

import java.util.Observable;

/**
 * Description:   
 * @author:     lzc  
 * @version:    1.0  
 * @date:       2019-04-05 21:57:36  
 *  
 * Modification History:  
 * Date         Author      Version     Description  
 * ------------------------------------------------------------------  
 * 2019-04-05   lzc         1.0         1.0 Version  
 */

public class DataObservable extends Observable {

	private String data;

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
		super.setChanged();
		super.notifyObservers();
	}
	
}
