package ziji;
public class ThisDemo {  
    String name="Mick";
    public void print(String name){
        System.out.println("���е����� name="+this.name);
        System.out.println("�ֲ����ε�����="+name);
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
      this.name="��";
 }     
  public ThisDemo(String name,int age){
      this();
      this.name="Mick";
  }     
private void print2(){
       System.out.println("��������="+this.name);
       System.out.println("���յ�����="+this.age);
  }
    public static void main(String[] args) {
        ThisDemo tt=new ThisDemo();
        tt.print("Orson");
        ThisDemo ss=new ThisDemo();
        ss.increment().increment().print1();
        ThisDemo pp=new ThisDemo("��",0); //��㴫��ȥ�Ĳ���
        pp.print2();
    }
}