package name.lzc.pattern.structural.flyweight;

/**
 * Description: 享元模式——具体的享元角色  
 * @author:     lzc  
 * @version:    1.0  
 * @date:       2019-04-04 14:15:25  
 *  
 * Modification History:  
 * Date         Author      Version     Description  
 * ------------------------------------------------------------------  
 * 2019-04-04   lzc         1.0         1.0 Version  
 */

public class ConcreteFlyweight implements Flyweight {
	
	private String internalState;
	
	public ConcreteFlyweight(String internalState) {
		super();
		this.internalState = internalState;
	}

	public String getInternalState() {
		return internalState;
	}

	@Override
	public void operation(final String externalState) {
		System.out.println(this.getClass().getSimpleName()+"：内部值["+getInternalState()+"]；"
				+ "外部值["+externalState+"]");
	}

}
