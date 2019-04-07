package name.lzc.pattern.behavior.template;


/**
 * Description:   
 * @author:     lzc  
 * @version:    1.0  
 * @date:       2019-04-04 17:55:53  
 *  
 * Modification History:  
 * Date         Author      Version     Description  
 * ------------------------------------------------------------------  
 * 2019-04-04   lzc         1.0         1.0 Version  
 */

public abstract class MobilePhone {

	/**
	* <p>描述：开始充电（子类实现）</p>
	* @author lzc
	 */
	protected abstract void start();
	/**
	* <p>描述：充电结束（子类实现）</p>
	* @author lzc
	 */
	protected abstract void stop();
	
	/**
	* <p>描述：充电（模板方法）</p>
	* @author lzc
	 */
	public final void charge() {
		this.start();
		this.stop();
	}
}
