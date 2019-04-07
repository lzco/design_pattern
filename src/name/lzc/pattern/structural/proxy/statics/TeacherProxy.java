package name.lzc.pattern.structural.proxy.statics;

import name.lzc.pattern.structural.proxy.MathTeacher;
import name.lzc.pattern.structural.proxy.Teacher;

/**
 * Description: 代理模式-静态代理  
 * @author:     lzc  
 * @version:    1.0  
 * @date:       2019-04-02 18:06:44  
 *  
 * Modification History:  
 * Date         Author      Version     Description  
 * ------------------------------------------------------------------  
 * 2019-04-02   lzc         1.0         1.0 Version  
 */

public class TeacherProxy implements Teacher {
	
	private Teacher teacher;
	
	public TeacherProxy() {
		this.teacher = new MathTeacher();
	}

	@Override
	public void teach() {
		this.teacher.teach();
		System.out.println("讲解数学考卷");
	}

}
