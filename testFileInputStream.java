import java.io.*;
import java.lang.Exception;
class Test{
    public static void main(String[] args) {
        FileInputStream in = null;
        FileOutputStream out = null;
        byte[] buf = new byte[1024];
        int len= 0; 
        try{
            in = new FileInputStream("c:/1.txt");
        }catch(Exception e){
            System.out.println("源文件不存在,无法复制!");
        }
        try{
            out = new FileOutputStream("c:/2.txt");
            while((len = in.read(buf))!=-1){
                out.write(buf,0,len);
            } 
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            try{
                if (in != null)
                in.close();
            }catch(IOException e){
                System.out.println("Operate failed !");
            }
            try{
                if (in != null)
                out.close();
            }catch(IOException e){
                System.out.println("Operate failed !");
            }
        }
    }
}