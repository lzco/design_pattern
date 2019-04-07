# design_pattern
23种设计模式的Java代码实现

23种设计模式<br>
	&emsp;1.创建型（5）<br>
		&emsp;&emsp;1）工厂方法模式（factory method pattern）&emsp;普通工厂方法——>多个工厂方法——>静态工厂方法<br>
		&emsp;&emsp;2）抽象工厂模式（abstract factory pattern）&emsp;抽象工厂创建抽象对象，具体工厂返回具体的对象<br>
		&emsp;&emsp;3）单例模式（singleton pattern）			&emsp;饿汉式、懒汉式（创建对象考虑线程安全）<br>
		&emsp;&emsp;4）创建者模式（builder pattern）			&emsp;内部静态类提供创建主类对象<br>
		&emsp;&emsp;5）原型模式（prototype pattern）			&emsp;浅层克隆、深层克隆（IO流+序列化）<br><br>
	&emsp;2.结构型（7）<br>
		&emsp;&emsp;1）适配器模式（adapter pattern）<br>
			&emsp;&emsp;&emsp;&emsp;类适配器：继承被适配的类，实现扩展类<br>
			&emsp;&emsp;&emsp;&emsp;对象适配器：实现扩展类，主类内部引用被适配的类<br>
			&emsp;&emsp;&emsp;&emsp;接口适配器：抽象类空实现接口，具体类选择性重写抽象类方法<br>
		&emsp;&emsp;2）装饰器模式（decorator pattern）<br>
			&emsp;&emsp;&emsp;&emsp;被装饰对象和装饰对象实现同一接口，装饰对象提供构造器注入或setter注入该接口（的实现类），参照IO流<br>
		&emsp;&emsp;3）代理模式（proxy pattern）<br>
			&emsp;&emsp;&emsp;&emsp;静态代理：代理类实现被代理接口，在内部创建被代理的实现<br>
			&emsp;&emsp;&emsp;&emsp;动态代理：<br>
				&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;基于jdk的动态代理工厂：利用反射（Proxy.newProxyInstance），目标对象是接口的实现<br>
				&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;基于cglib的动态代理工厂：实现MethodInterceptor，重写intercept，目标对象可以没有要实现的接口<br>
		&emsp;&emsp;4）桥接模式（bridge pattern）<br>
			&emsp;&emsp;&emsp;&emsp;抽象类关联实现类接口，提供抽象方法；扩展类实现抽象方法，结合具体实现类的方法（有点绕，建议结合图像和代码）<br>
		&emsp;&emsp;5）复合（组合）模式（composite pattern）<br>
			&emsp;&emsp;&emsp;&emsp;多个类实现共同接口，其中一个实现类具有存储和获取接口实现对象的能力<br>
		&emsp;&emsp;6）外观（门面）模式（facade pattern）<br>
			&emsp;&emsp;&emsp;&emsp;各个独立类实现同一接口，门面类组合这些独立类，共同调用相同方法（可以想象主板统一调度各个模块）<br>
		&emsp;&emsp;7）享元模式（flyweight pattern）<br>
			&emsp;&emsp;&emsp;&emsp;享元接口+具体实现（含外部状态方法），享元模式工厂提供共享对象（根据内部状态创建和存储共享对象）。<br>&emsp;&emsp;&emsp;&emsp;参照数据库连接池<br><br>
	&emsp;3.行为型（11）<br>
		&emsp;&emsp;1）模板方法模式（template pattern）<br>
			&emsp;&emsp;&emsp;&emsp;抽象类提供抽象方法和固定引用这些方法的模板方法，子类只要实现抽象方法即可<br>
		&emsp;&emsp;2）策略模式（strategy pattern）<br>
			&emsp;&emsp;&emsp;&emsp;组合对象提供逻辑抽象接口（方法），委托注入的对象实现（参照Comparator接口与TreeSet类）<br>
		&emsp;&emsp;3）状态模式（state pattern）<br>
			&emsp;&emsp;&emsp;&emsp;状态逻辑接口和动作实现，动作实现类的执行方法可以改变状态逻辑（具体状态逻辑类提供状态逻辑）<br>
		&emsp;&emsp;4）观察者模式（observer pattern）<br>
			&emsp;&emsp;&emsp;&emsp;观察者与被观察者相互联系，被观察者发生变化，观察者随即观察到变化（被动），如数据和以数据为基础的图表。jdk自带。<br>
		&emsp;&emsp;5）备忘录模式（memento pattern）<br>
			&emsp;&emsp;&emsp;&emsp;将要备忘的成员属性同样封装成一个类，在主类中提供以封装类为基础的getter、setter方法再封装<br>
		&emsp;&emsp;6）中介模式（mediator pattern）<br>
			&emsp;&emsp;&emsp;&emsp;请求者之间通过中介进行通信（中介注册请求者，请求者关联中介，请求者实现类发出请求信息，中介告知其它请求者。<br>
			&emsp;&emsp;&emsp;&emsp;说人话：租客跟中介说租房信息，中介告诉房东，房东告诉中介房子信息，中介告诉租客）<br>
		&emsp;&emsp;7）命令模式（command pattern）<br>
			&emsp;&emsp;&emsp;&emsp;命令执行者——>命令执行——>命令接收者 执行<br>
		&emsp;&emsp;8）访问者模式（visitor pattern）<br>
			&emsp;&emsp;&emsp;&emsp;访问者和被访者接口皆存在于对方之中，由被访问者率先接受访问者<br>
		&emsp;&emsp;9）责任链模式（CoR，chain of responsibility pattern）<br>
			&emsp;&emsp;&emsp;&emsp;责任链实现一接口，注册其它实现该接口的对象，接口方法传递请求和责任链；<br>
			&emsp;&emsp;&emsp;&emsp;接口实现对象能自己解决就解决，不能解决就向下传递。参照FilterChain<br>
		&emsp;&emsp;10）迭代器模式（iterator pattern）<br>
			&emsp;&emsp;&emsp;&emsp;迭代器接口+容器接口，容器提供自身的迭代器，具体容器提供具体的迭代器，一一对应。参照jdk集合类和迭代器<br>
		&emsp;&emsp;11）解释器模式（interpreter pattern）<br>
			&emsp;&emsp;&emsp;&emsp;表达式接口有终结表达式和非终结表达式实现类，终结符存储在环境对象中<br>
			&emsp;&emsp;&emsp;&emsp;（表达式a=b+c，其中b、c属于终端符，+属于非终结符）<br>
