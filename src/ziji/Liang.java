package ziji;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


import java.io.File;


public class Liang {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		@SuppressWarnings("resource")
		String bill=new Scanner(System.in).next();
		char[] cha=bill.toCharArray();
		for(int i=0;i<cha.length;i++){
			cha[i]=(char) (cha[i]+5);
			System.out.println(cha[i]);
		}
		System.out.println();
		bill=String.valueOf(cha);
			System.out.println(bill);
		
		System.out.println();
		for(int i=0;i<cha.length;i++){
			cha[i]=(char) (cha[i]-5);
			System.out.println(cha[i]);
		}
		
		StringBuffer string =new StringBuffer("jfdksdjdf");
		System.out.println(string.reverse().toString());
		String gString=string.reverse().toString();
		char[] ju=gString.toCharArray();
		for(int i=0;i<ju.length;i++){
			for(int j=i+1;j<ju.length;j++){
				if(ju[i]<ju[j]){
					char temp=ju[i];
					ju[i]=ju[j];
					ju[j]=temp;
				} 
			}
		}
		for(int i=0;i<ju.length;i++){
			System.out.println(ju[i]);
		}
		File file=new File("D:\\Java学习\\课上案例\\gh.txt");
//		File fil=new File("D:\\Java学习\\课上案例\\hg.txt");
//		fil.createNewFile();
		BufferedReader br=null;
		BufferedWriter bw=null;
		try{
			br=new BufferedReader(new FileReader(file));
		String dString=null;
		StringBuffer s=new StringBuffer();
		while(br.ready()){
			dString=br.readLine().toUpperCase();
			System.out.println(dString);//System.getProperty("line.separator")系统换行符
			s.append(dString).append("\r\n");
		}
		bw=new BufferedWriter(new FileWriter(file));
		bw.write(s.toString());
		bw.flush();
		}catch(IOException e){
			e.printStackTrace();
		}finally{
			if(bw!=null){
				try{
					br.close();
					bw.close();
				}catch(Exception e){
					e.printStackTrace();
				}
			}
		}
//		br.close();
//		bw.close();
//		boolean success = file.delete();   
//		if (success) {
//			System.out.println("文件删除成功");
//		} else {
//			System.out.println("文件删除失败");
//		}
//		success = fil.renameTo(new File("D:\\Java学习\\课上案例\\gh.txt"));   
//		if (success) {
//			System.out.println("文件改名成功");
//		} else {
//			System.out.println("文件改名失败");
//		}
		for(int i=1;i<10;i++){
			for(int j=i;j<10;j++){
				System.out.print(" ");
			}
			for(int k=1;k<=i*2-1;k++){
				if((k==1)||(k==i*2-1)){
					System.out.print("*");
				}else{
				System.out.print(" ");}
			}
			System.out.println();
		}	
		for(int i=1;i<9;i++){
			for(int j=-1;j<i;j++){
				System.out.print(" ");
			}
			for(int k=1;k<=(9-i)*2-1;k++){
				if((k==1)||(k==(9-i)*2-1)){
					System.out.print("*");
				}else{
				System.out.print(" ");}
			}
			System.out.println();
		}
			

	}

}
