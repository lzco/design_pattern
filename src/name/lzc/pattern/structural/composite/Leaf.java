package name.lzc.pattern.structural.composite;


/**
 * Description:   
 * @author:     lzc  
 * @version:    1.0  
 * @date:       2019-04-05 15:47:22  
 *  
 * Modification History:  
 * Date         Author      Version     Description  
 * ------------------------------------------------------------------  
 * 2019-04-05   lzc         1.0         1.0 Version  
 */

public class Leaf implements Component{

	public void operation() {
		System.out.println("It is Leaf"+Integer.toHexString(hashCode()));
	}

	@Override
	public void add(Component component) {
		throw new RuntimeException("Unsupported");
	}

	@Override
	public Component getChild(int index) {
		throw new RuntimeException("Unsupported");
	}

	@Override
	public void remove(Component component) {
		throw new RuntimeException("Unsupported");
	}
}
