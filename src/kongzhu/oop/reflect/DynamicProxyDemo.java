package kongzhu.oop.reflect;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class DynamicProxyDemo {

	/**
	 * @param args
	 * ¶¯Ì¬´úÀí
	 */
	public static void main(String[] args) {
		FooImpl realFoo = new FooImpl();
//		realFoo.doSomething();
//		realFoo.doSomething2();
		InvocationHandler handler = new MyInvocationHandler(realFoo);
		Foo proxyFoo = (Foo) Proxy.newProxyInstance(
				Foo.class.getClassLoader(),
				new Class<?>[] { Foo.class,Fo.class },
				handler);
		proxyFoo.doSomething();
		proxyFoo.doSomething2();
	}

}
