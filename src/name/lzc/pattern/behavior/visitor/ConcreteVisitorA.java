package name.lzc.pattern.behavior.visitor;


/**
 * Description:   
 * @author:     lzc  
 * @version:    1.0  
 * @date:       2019-04-06 15:58:40  
 *  
 * Modification History:  
 * Date         Author      Version     Description  
 * ------------------------------------------------------------------  
 * 2019-04-06   lzc         1.0         1.0 Version  
 */

public class ConcreteVisitorA implements Visitor {

	@Override
	public void visit(Visible visible) {
		System.out.println("I will visit " + visible.getClass().getSimpleName());
	}
	
}
