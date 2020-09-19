package stringoperation;

import java.io.*;
import java.io.IOException;
import java.lang.String;


public class StringOperation {

    
    public static void main(String[] args) {
        
        String s1 = "kamiL3";
        String s2 = "kamil3";
        String s3 ;
        int a, b;
        
        s3= s1.concat(s2); 
        a = s1.compareTo(s2); 
        b = s1.compareToIgnoreCase(s2); 
        System.out.println(s3);
        System.out.println(a);
        System.out.println(b);
        
        try{
            FileOutputStream fout = new FileOutputStream("out.txt");
            //BufferedOutputStream bof = new BufferedOutputStream(fout);// buffer kullanarak yazma işlemi
            String s = "Welcome coding with ZIRILTI..";
            String ss = " naber tirrek";
            s = s.concat(ss);
            byte b1[] = s.getBytes();
//            bof.write(b1);
//            bof.flush();
//            bof.close();
            fout.write(b1);
            fout.close();
            //System.out.println("b1[0]" + (char)b1[0]);
                    
        }
        catch(Exception e){
            System.out.println(e);}
        
        try{
            FileInputStream fin = new FileInputStream("out.txt");
            int i = fin.read();
            System.out.println((char)i);
            while((i = fin.read())!= -1 ){
                System.out.print((char)i);}
            
            fin.close();
        }
        catch(Exception e){
            System.out.println(e);}
    
    
    }    
}
