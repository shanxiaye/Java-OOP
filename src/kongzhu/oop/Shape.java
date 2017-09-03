package kongzhu.oop;
interface A{

	public abstract void seekArea();
}
public abstract class Shape implements A{
	String shapeName;
	double area;
	public Shape(){}
//	public Shape(String shapeName){
//		this.shapeName=shapeName;
//	}
	public static void wei(Shape a){
			a.seekArea();
		}
	public static void main(String[] args){
		wei(new Rectangle(3.0,4.0));
		wei(new Triangle(3.0,4.0));
		wei(new Circle(3.0));
		Shape a=new Rectangle(3.0,4.0);
		a.seekArea();
	}

}
 class Rectangle extends Shape{
	 private double length;
	 private double width;
	 public double getLength(){
		 return length;
	 }
	 public void setLength(double length){
		 this.length=length;
	 }
	 public double getWidth(){
		 return width;
	 }
	 public void setWidth(double width){
		 this.width=width;
	 }
	 Rectangle(double length,double width){
		 this.length=length;
		 this.width=width;
	 }
	 public void seekArea(){
		  area=length*width;
		  System.out.println("长方形面积："+area);
	  };
}
 class Triangle extends Shape{
	 private double border;
	 private double height;
	 public double getBorder(){
		 return border;
	 }
	 public void setBorder(double border){
		 this.border=border;
	 }
	 public double getHeight(){
		 return height;
	 }
	 public void setHeight(double height){
		 this.height=height;
	 }
	 Triangle(double border,double height){
		 this.border=border;
		 this.height=height;
	 }
	 public void seekArea(){
		  area=border*(height/2);
		  System.out.println("三角形面积："+area);
	  };
}
 class Circle extends Shape{
	 private double radius;
	 public double getRadius() {
		return radius;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}
	Circle(double radius){
		 this.radius=radius;
	 }
	public void seekArea(){
		  area=(radius*radius)*3.14;
		  System.out.println("圆形面积："+area);
	  };
}