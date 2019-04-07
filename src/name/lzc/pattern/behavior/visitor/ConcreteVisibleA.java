package name.lzc.pattern.behavior.visitor;


/**
 * Description:   
 * @author:     lzc  
 * @version:    1.0  
 * @date:       2019-04-06 15:52:21  
 *  
 * Modification History:  
 * Date         Author      Version     Description  
 * ------------------------------------------------------------------  
 * 2019-04-06   lzc         1.0         1.0 Version  
 */

public class ConcreteVisibleA implements Visible{
	
	@Override
	public void accept(Visitor visitor) {
		visitor.visit(this);
		System.out.println("visiting ConcreteVisibleA");
	}

}
