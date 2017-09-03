package kongzhu.exam.student.view;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

import kongzhu.exam.student.entity.StudentEntity;
import kongzhu.exam.student.service.StudentServiceImpl;

public class StudentView {

	public static void main(String[] args) {
		BufferedReader br = null;
		BufferedWriter bw = null;
		StudentServiceImpl ssi = new StudentServiceImpl();
		try {
			br = new BufferedReader(new InputStreamReader(System.in));
			bw = new BufferedWriter(new OutputStreamWriter(System.out));
			bw.write("A:�����ѧԱ\n");
			bw.write("B:����ѧԱ��Ϣ\n");
			bw.write("C:����ѧԱ\n");
			bw.write("D:����ѧԱ��������ѧԱ������ģ����ѯ��\n");
			bw.write("E:����ѧԱѧ�Ų���ѧԱ�����Ծ�ȷ��ѯ��\n");
			bw.flush();
			while(true){
				String st = br.readLine();
				StudentEntity student = new StudentEntity();
				switch (st){
				case "A":
					student.setStudent_id(Integer.parseInt(br.readLine()));
					student.setStudent_name(br.readLine());
					student.setStudent_sex(br.readLine());
					student.setStudent_birthday(br.readLine());
					student.setStudent_numble(Integer.parseInt(br.readLine()));
					student.setStudent_qq(Integer.parseInt(br.readLine()));
					student.setStudent_weixin(br.readLine());
					student.setStudent_dizhi(br.readLine());
					ssi.insertStudent(student);
					break;
				case "B":
					student.setStudent_id(Integer.parseInt(br.readLine()));
					student.setStudent_name(br.readLine());
					student.setStudent_sex(br.readLine());
					student.setStudent_birthday(br.readLine());
					student.setStudent_numble(Integer.parseInt(br.readLine()));
					student.setStudent_qq(Integer.parseInt(br.readLine()));
					student.setStudent_weixin(br.readLine());
					student.setStudent_dizhi(br.readLine());
					student.setStudent_dizhi(br.readLine());
					ssi.updateStudent(student);
					break;
				case "C":
					student.setStudent_id(Integer.parseInt(br.readLine()));
					ssi.deleteStudent(student);
					break;
				case "D":
					ssi.selectname(br.readLine());
					break;
				case "E":
					ssi.selectid(Integer.parseInt(br.readLine()));
					break;
				default:
					System.out.println("��������");
					break;
				}
			}
		} catch (Exception e) {
			// TODO: handle exception
		}finally{
			if(br != null){
				try {
					br.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if(bw != null){
				try {
					bw.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
	}

}
