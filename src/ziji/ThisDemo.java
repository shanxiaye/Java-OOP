package ziji;
public class ThisDemo {  
    String name="Mick";
    public void print(String name){
        System.out.println("类中的属性 name="+this.name);
        System.out.println("局部传参的属性="+name);
    }   
    int number;
    ThisDemo increment(){
         number++;
         return this;
    }  
  private void print1(){
         System.out.println("number="+number);
    }
  int age;
  public ThisDemo (){ 
      this.name="年";
 }     
  public ThisDemo(String name,int age){
      this();
      this.name="Mick";
  }     
private void print2(){
       System.out.println("最终名字="+this.name);
       System.out.println("最终的年龄="+this.age);
  }
    public static void main(String[] args) {
        ThisDemo tt=new ThisDemo();
        tt.print("Orson");
        ThisDemo ss=new ThisDemo();
        ss.increment().increment().print1();
        ThisDemo pp=new ThisDemo("号",0); //随便传进去的参数
        pp.print2();
    }
}