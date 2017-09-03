package kongzhu.oop.reflect;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class MyInvocationHandler implements InvocationHandler {

	private Object obj;
	public MyInvocationHandler(){}
	public MyInvocationHandler(Object obj) {
		this.obj = obj;
	}
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		System.out.println("调用方法之前的一些准备工作");
		Object result = method.invoke(obj, args);
//		System.out.println(result);
		System.out.println("调用方法之后的一些收尾工作");
//		method.invoke(obj, args);
//		return obj;
		return result;
	}

}
