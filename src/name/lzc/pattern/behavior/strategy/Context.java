package name.lzc.pattern.behavior.strategy;


/**
 * Description: 策略模式 —— 组合类（委托类）  
 * @author:     lzc  
 * @version:    1.0  
 * @date:       2019-04-05 15:27:38  
 *  
 * Modification History:  
 * Date         Author      Version     Description  
 * ------------------------------------------------------------------  
 * 2019-04-05   lzc         1.0         1.0 Version  
 */

public class Context {

	//被委托对象
	private Strategy strategy;

	public Context(Strategy strategy) {
		this.strategy = strategy;
	}
	
	/**
	* <p>描述：逻辑抽象接口</p>
	* @author lzc
	 */
	public void doAction() {
		//委托Strategy的具体实现类来执行
		strategy.operation();
	}
}
