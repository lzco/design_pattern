package name.lzc.pattern.behavior.memento;


/**
 * Description: 备忘录模式——备忘录  
 * @author:     lzc  
 * @version:    1.0  
 * @date:       2019-04-05 22:51:14  
 *  
 * Modification History:  
 * Date         Author      Version     Description  
 * ------------------------------------------------------------------  
 * 2019-04-05   lzc         1.0         1.0 Version  
 */

public class Memento {

	//备忘值
	private String state;

	public Memento(String state) {
		this.state = state;
	}

	public String getState() {
		return state;
	}
	
}
