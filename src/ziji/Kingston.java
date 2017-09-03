package ziji;
//implements用于实现接口
//实现类必须实现接口里面的所有抽象方法
public class Kingston implements USB{
	public void read(){
		System.out.println("U盘读数据");
	} 

	public void write(){
		System.out.println("U盘写数据");
	} 
}
