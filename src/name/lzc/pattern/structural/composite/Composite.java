package name.lzc.pattern.structural.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * Description: 复合模式  
 * @author:     lzc  
 * @version:    1.0  
 * @date:       2019-04-05 15:53:05  
 *  
 * Modification History:  
 * Date         Author      Version     Description  
 * ------------------------------------------------------------------  
 * 2019-04-05   lzc         1.0         1.0 Version  
 */

public class Composite implements Component {
	
	private List<Component> children = new ArrayList<>();

	@Override
	public void add(Component component) {
		children.add(component);
	}

	@Override
	public Component getChild(int index) {
		return children.get(index);
	}

	@Override
	public void remove(Component component) {
		children.remove(component);
	}

	@Override
	public void operation() {
		for(Component component : children) {
			component.operation();
		}
	}

}
