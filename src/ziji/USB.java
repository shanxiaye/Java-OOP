package ziji;

public interface USB {//interface定义一个接口,USB其实是一个规范，
	//规范读写
	//谁，怎么读，读什么，写什么，怎么写，都不确定
	//由实现类去处理
	static final double version =3.0;
	public double type=1.9;
	public abstract void read();
	public abstract void write();

}
