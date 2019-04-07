package name.lzc.pattern.behavior.iterator;


/**
 * Description: 迭代器模式——迭代器接口  
 * @author:     lzc  
 * @version:    1.0  
 * @date:       2019-04-06 23:31:14  
 *  
 * Modification History:  
 * Date         Author      Version     Description  
 * ------------------------------------------------------------------  
 * 2019-04-06   lzc         1.0         1.0 Version  
 */

public interface Iterator<E> {

	boolean hasNext();
	
	E next();
}
