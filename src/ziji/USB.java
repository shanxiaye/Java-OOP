package ziji;

public interface USB {//interface����һ���ӿ�,USB��ʵ��һ���淶��
	//�淶��д
	//˭����ô������ʲô��дʲô����ôд������ȷ��
	//��ʵ����ȥ����
	static final double version =3.0;
	public double type=1.9;
	public abstract void read();
	public abstract void write();

}
