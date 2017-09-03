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
		System.out.println("���÷���֮ǰ��һЩ׼������");
		Object result = method.invoke(obj, args);
//		System.out.println(result);
		System.out.println("���÷���֮���һЩ��β����");
//		method.invoke(obj, args);
//		return obj;
		return result;
	}

}
