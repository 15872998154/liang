//import java.util.Exception;
//customnize exception and 
// class MyException extends Exception{
//     public MyException(String name){
//         super(name);
//     }

//     public MyException(Throwable cause){
//         super(cause);
//     }

//     public MyException(String name,Throwable cause){
//         super(name,cause);
//     }

// }

// class Student{
//     String name;

//     public Student(String name){
//         this.name = name;
//     }

//     public void setName(String name )throws MyException{
//         if (name.length()>= 10){
//             throw new MyException("the size of name larger than ten !");
//         }
//     }
// }

// class Test{
//     public static void main(String[] args) {
//         try{
//             new Student("zz").setName("2333333333333");
//         }catch(MyException e){
//             System.out.println(e);
//         }
//     }
// }

//encode and decode
// class Test{
//     public static void main(String[] args) {
//         String str = "abc";
//         try{
//             byte[] bytes = str.getBytes("gbk");
//             String s = new String(bytes,"utf-8");
//             System.out.println(s);
//         }catch(Exception e){
//             e.printStackTrace();
//         }
        
        

//     }
// }
// import java.util.*;
// class Test{
//     public static void main(String[] args) {
//         String s = "aaaa10.2,322,11";
//         Scanner sc = new Scanner(s);
//         sc.useDelimiter("[^0-9]+");
//         double total = 0.0;
//         while(sc.hasNext()){
//             total += sc.nextInt();
//         }
//         System.out.println(total);
//     }
// }

//ava produce the random number
// import java.util.*;
// class Test{
//     public static void main(String[] args) {
//         Calendar c = Calendar.getInstance();
//         c.add(Calendar.DATE,45);
//         System.out.println(c.get(Calendar.DAY_OF_WEEK));
//     }
// }


// import java.util.*;
// class Test{
//     public static void main(String[] args) {
//         Collection c = Arrays.asList(1,2,4);
//         Iterator it = c.iterator();
//         //System.out.println(c);
//         // for(Object o : c){
//         //     System.out.println(o);
//         // }
//         while(it.hasNext()){
//             System.out.println(it.next());
//         }
         
         
//     }
// }

// import java.util.*;
// class MyStack<E> extends LinkedList<E>{
//     private int length = 5;
//     public MyStack(int length){
//         this.length = length;
//     }

//     public void push(E e){
//         if(this.size() < length){
//             super.push(e);
//         }
//         else{
//            throw new RuntimeException("stackOverFlow");
//         }
//     }
// }

// class Test{
//     public static void main(String[] args) {
//         MyStack<Integer> s = new MyStack<Integer>(5);
//         try{
//             for(int i =0;i<7;i++){
//                 s.push(i);
//             }
//         }catch(RuntimeException e){
//             System.out.println(e);
//         }
//     }
// }


// import java.util.*;
// class MyCmp implements Comparator{
//     public int compare(Object element1, Object element2){
//             Student s1 = (Student)element1;
//             Student s2 = (Student)element2;
//             if(s1.getName().compareTo(s2.getName())>0){
//                 return 1;
//             }
//             else if(s1.getName().compareTo(s2.getName())<0){
//                 return -1;
//             }
//             else{
//                 return s1.getId().compareTo(s2.getId());
//             }
//     }
// }
// class Student{
//     String name;
//     String id;
//     public Student(String name,String id){
//         this.name = name;
//         this.id = id;
//     }

//     public String toString(){
//         return this.name + "\t" + this.id;
//     }

//     public String getName(){
//         return this.name;
//     }

//     public String getId(){
//         return this.id;
//     }

//     public boolean equals(Object o){
//         if(this == o){
//             return true;
//         }
//         if(o == null){
//             return false;
//         }
//         if(getClass() != o.getClass())
//             return false;
//         Student s = (Student)o;
//         if(name!=s.getName())
//             return false;
//         if(id != s.getId())
//             return false;
//         return true;
//     } 

//     public int hashCode(){
//         return id.hashCode()+name.hashCode();
//     }

// }

// class Test{
//     public static void main(String[] args) {
//         Set<Student> s = new TreeSet<Student>(new MyCmp());
//         s.add(new Student("Jack","1001"));
//         s.add(new Student("Jack","1002"));
//         System.out.println(s);
//     }
// }


// import java.io.*;
// class Test{
//     public static void main(String[] args) {
//         FileInputStream in = null;
//         FileOutputStream out = null;
//         byte[] buf = new byte[1024];
//         int len = 0;
//         try{
//             in = new FileInputStream("c:/1.txt");
//         }catch(Exception e){
//             e.printStackTrace();
//         }
//         try{
//             out = new FileOutputStream("C:/3.txt");
//             while((len=in.read(buf))!=-1)
//                 out.write(buf,0,len);
//         }catch(Exception e){
//             System.out.println("Operate failed ");
//         }
//         finally{
//             try{
//                 in.close();
//                 out.close();
//             }catch(IOException e){
//                 e.printStackTrace();
//             }
//         }
//     }
// }


// import java.io.*;
// class Test{
//     public static void main(String[] args) {
//         try{
//             int i = 100;
        
//             OutputStream out = new FileOutputStream("C:/1.txt");
//             out.write(i);   
            
//             PrintStream ps = new PrintStream(out);
//             ps.print(2333);
            
//             out.close(); 
//         }catch(Exception e){
//             e.printStackTrace();
//         }
        
        
        

//     }
// }

// import java.io.*;
// class  Test{
//     public static void main(String[] args) {
        
//         File f = new File("C:/KuGou");
        
//         System.out.println( f.exists() );//true

//         System.out.println( f.isDirectory() );//false

//         System.out.println( f.isFile() );//true

//         if ( f.isFile() ) {
//             System.out.println(f.getName()); //output 1.txt
//             System.out.println(f.length());//the size of file
//             System.out.println(f.getPath());
//         }

//         if ( f.isDirectory() ) {
//             readFiles(f.listFiles());
//         }

//     }
    
//     public static void readFiles(File[] files){
//         for( File file : files ) {
//             System.out.println(file.getName());
//             if (file.isDirectory()){
//                 readFiles(file.listFiles());
//             }
//         }
//     }
// }



// class Test {

//     public static void main(String[] args) {
        
//         for(int i = 0; i < 10; i++) {
//             new Saler("Saler" + (i+1) ).start();
//         }
//     }

// }


// class Saler extends Thread {
//     private String name = "";
//     private static int tickets = 100;
//     static Object lock = new Object();

//     public Saler(String name) {
//         this.name = name;
//     }

//     @Override
//     public void run() {
//         while(true) {
            
//             int tick = getTicket();
//             if (tick > 0 )
//                 System.out.println(this.name+":" + tick);
//             else {
//                 System.out.println("sold out !");
//                 return ;
//             }
//         }
//     }
    
//     public synchronized int getTicket() {
        
//             int current = tickets;
//             tickets--;
//             return current;
        
//     }
// }

// import java.io.*;
// class Test{
//     public static void main(String[] args) {
//         File f = new File("C:/KuGou");
//         if(f.isDirectory()){
//             readFiles(f.listFiles());
//         }
        
//     }
//     public static void readFiles(File[] files){
//         for(File file : files){
//             System.out.println(file.getName());
//             if(file.isDirectory()){
//                 readFiles(file.listFiles());
//             }
//         }
//     }
// }
// import java.io.*;
// class Test{
//     public static void main(String[] args) {
//         FileInputStream in = null;
//         FileOutputStream out = null;
//         byte[] buf = new byte[1024];
//         int len = 0;
//         try{
//             in = new FileInputStream("c:/1.txt");
//         }catch(Exception e ){
//             e.printStackTrace();
//         }
//         try{
//             out = new FileOutputStream("copy.txt");
//             while((len=in.read(buf))!=-1){
//                 out.write(buf,0,len);
//             }
//         }catch(Exception e){
//             e.printStackTrace();
//         }
//         finally{
//             try{
//                 in.close();
//                 out.close();
//             }catch(IOException e){
//                 e.printStackTrace();
//             }
            
//         }
//     }
// }
// import java.util.*;
// class MyCmp implements Comparator{
//     public int compare(Object element1,Object element2){
//         Student s1 = (Student)element1;
//         Student s2 = (Student)element2;
//         if(s1.getName().compareTo(s2.getName())>0){
//             return 1;
//         }
//         else if(s1.getName().compareTo(s2.getName())<0){
//             return -1;
//         }
//         else{
//             return s1.getId().compareTo(s2.getId());
//         }
//     }
// }

// class Student{
//     private String name;
//     private String id;
//     public Student(String name,String id){
//         this.name = name;
//         this.id = id;
//     }

//     public String toString(){
//         return this.name + "\t" +this.id;
//     }

//     public String getName(){
//         return this.name;
//     }

//     public String getId(){
//         return this.id;
//     }

// }
// class Test{
//     public static void main(String[] args){
//         Set<Student> s = new TreeSet<Student>(new MyCmp());
//         s.add(new Student("Jack","1001"));
//         s.add(new Student("Rose","1002"));
//         System.out.println(s);
//     }
// }