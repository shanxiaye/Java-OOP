package kongzhu.oop.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class CommandDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file=new File("D:/Java/eclipse-jee-neon-2-win32-x86_64/"
      			+ "workspace/kongzhu/src/kongzhu/oop/io/copy.txt");
      	BufferedWriter bw=null;	
      	BufferedReader br=null;
        try{
        	br=new BufferedReader(new InputStreamReader(System.in));
        	bw=new BufferedWriter(new OutputStreamWriter(System.out));
        	bw.write("Microsoft Windows [�汾 6.1.7601]");
        	bw.newLine();
        	bw.write("��Ȩ���� (c) 2009 Microsoft Corporation����������Ȩ����");
        	bw.newLine();
        	bw.newLine();
        	bw.write("C:\\Users\\Administrator>");
        	bw.flush();
        	String[] arr=new String[1024];
        	int index=0;
        	String line=null;
        	//��ȡ�û��ղ��������һ�У�����ֵ������line
        	//�Ƚ�line������exit�Ƿ����
        	//��󽫱ȽϽ��ȡ��  
        	//���û��������ݲ���exitʱ����ѭ��
        	while (!(line=br.readLine()).equals("exit")){
        		if(line.endsWith(":")){
        			char c=line.charAt(0);
        			if((c=='c')||(c=='C')||(c=='d')||(c=='D')){
        				bw.newLine();
            			bw.write(line.toUpperCase()+"\\>");
            			arr[index]=line.toUpperCase()+"\\";
            			index++;
        			}else{
        				bw.write("�豸δ����");
        				bw.newLine();
        				bw.newLine();
        				bw.write(arr[index-1]+">");
        			}
        		}else if(line.startsWith("cd")){
//        			if(line.equals("cd..")){
//        				bw.newLine();
//        				String temp=arr[index-1];
//        				int last1=temp.lastIndexOf("\\");
//        				if(temp.charAt(last1-1)==':'){
//        					bw.write(temp.substring(0,last1+1)+">");
//        				}else{
//        					bw.write(temp.substring(0,last1)+">");
//        				}
//        			}
        				bw.newLine();
            			bw.write(arr[index-1]+line.substring(3)+">");
        				arr[index]=arr[index-1]+line.substring(3);
        				index++;
        		}
        		else{
            		bw.write(line);
            	}
        		bw.flush();
        	}
//        	be.newLine();
//        	be.write("24333");		
//        	be.flush();
//        	be.write(bw.readLine());
//        	be.flush();
        }catch(FileNotFoundException e){
        	e.printStackTrace();
        }catch(Exception e){
        	e.printStackTrace();
        }finally{
        	if(bw!=null){
        		try{
        			bw.close();
        		}catch(IOException e){
        			e.printStackTrace();
        		}
        	}
        	if(br!=null){
        		try{
        			br.close();
        		}catch(IOException e){
        			e.printStackTrace();
        		}
        	}
        }

	}

}
