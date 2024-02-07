package practice;
import java.io.*;
public class file_io {
public static void main(String[] args) {
	File file=new File("C:\\Users\\sla\\Desktop\\dd");
	boolean  pp=file.exists();
	System.out.println(pp);
	if(pp==false) {
		file.mkdir();
		pp=file.exists();
		System.out.println(pp);
	}
}
}
