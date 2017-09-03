package ziji;
public class MathDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        //向上取整
        System.out.println(Math.ceil(123.123));
        //向下取整
        System.out.println(Math.floor(123.123));
        //四舍五入
        System.out.println(Math.round(123.823));
        System.out.println(Math.round(124.123));
        //随机数
        System.out.println(Math.random());
        System.out.println(Math.random()*10);
        //绝对值
        System.out.println(Math.abs(-10));
        //加法运算（如果和超出int范围，则方法异常）
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Math.addExact(2000000, 10));
        //减法运算（如果和超出int范围，则方法异常）
        System.out.println(Math.subtractExact(-20, 10));//subtractExact
        //乘法运算
        System.out.println(Math.multiplyExact(20, 10));//mutiplyExact
        //除法运算（如果小数则向下取整）
        System.out.println(Math.floorDiv(-3, 10));
        
        
        
        //练
        System.out.println(Math.floorDiv(10, 4));//floorDiv
        System.out.println(Math.ceil(1.2));//ceil
        System.out.println(Math.floor(1.5));//floor
        System.out.println(Math.round(14.22));//round

	}

}
