package name.lzc.pattern.structural.composite;


/**
 * Description:   
 * @author:     lzc  
 * @version:    1.0  
 * @date:       2019-04-05 15:49:33  
 *  
 * Modification History:  
 * Date         Author      Version     Description  
 * ------------------------------------------------------------------  
 * 2019-04-05   lzc         1.0         1.0 Version  
 */

public interface Component {

	void add(final Component component);
	
	Component getChild(int index);
	
	void remove(final Component component);
	
	void operation();
}
