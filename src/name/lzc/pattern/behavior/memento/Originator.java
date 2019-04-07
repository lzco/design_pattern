package name.lzc.pattern.behavior.memento;


/**
 * Description: 备忘录模式——发起对象 
 * @author:     lzc  
 * @version:    1.0  
 * @date:       2019-04-05 22:54:41  
 *  
 * Modification History:  
 * Date         Author      Version     Description  
 * ------------------------------------------------------------------  
 * 2019-04-05   lzc         1.0         1.0 Version  
 */

public class Originator {

	private String state;
	
	public Originator() {}

	public Originator(String state) {
		this.state = state;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}
	
	//实际上就是将state封装成一个对象提供给外部
	public Memento createMemento() {
		return new Memento(getState());
	}
	
	//实际上就是将state封装的对象的值传给内部的setter
	public void restore2Memento(Memento memento) {
		setState(memento.getState());
	}
}
