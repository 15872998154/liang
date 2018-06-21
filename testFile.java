import java.io.*;
class  Test{
    public static void main(String[] args) {
        
        File f = new File("C:/KuGou");
        
        System.out.println( f.exists() );//true

        System.out.println( f.isDirectory() );//false

        System.out.println( f.isFile() );//true

        if ( f.isFile() ) {
            System.out.println(f.getName()); //output 1.txt
            System.out.println(f.length());//the size of file
            System.out.println(f.getPath());
        }

        if ( f.isDirectory() ) {
            readFiles(f.listFiles());
        }

    }
    
    public static void readFiles(File[] files){
        for( File file : files ) {
            System.out.println(file.getName());
            if (file.isDirectory()){
                readFiles(file.listFiles());
            }
        }
    }
}