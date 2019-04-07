package name.lzc.pattern.creational.prototype;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 * Description: 原型模式  
 * @author:     lzc  
 * @version:    1.0  
 * @date:       2019-04-03 21:25:04  
 *  
 * Modification History:  
 * Date         Author      Version     Description  
 * ------------------------------------------------------------------  
 * 2019-04-03   lzc         1.0         1.0 Version  
 */

public class Prototype implements Cloneable, Serializable {

	private static final long serialVersionUID = 1L;

	private int[] value;

	public int[] getValue() {
		return value;
	}

	public void setValue(int[] value) {
		this.value = value;
	}

	/**
	 * 浅层克隆
	 */
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

	/**
	* <p>描述：深层克隆</p>
	* @return
	* @throws IOException
	* @throws ClassNotFoundException
	* @author lzc
	 */
	public Prototype deepClone() throws IOException, ClassNotFoundException {
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		ObjectOutputStream oos = new ObjectOutputStream(baos);
		oos.writeObject(this);
		
		ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
		ObjectInputStream ois = new ObjectInputStream(bais);
		return (Prototype) ois.readObject();
	}
	
	
}
