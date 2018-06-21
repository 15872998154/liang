import java.io.*;
//import java.
class TestException{
    public static void main(String[] args) {
        try{
            FileInputStream f = new FileInputStream("test.txt");
        }
        catch(Exception e){

            e.printStackTrace();
        }

        TestException2 testException = new TestException2();
        try{
            testException.test();
        } 
        catch(Exception e){
            System.out.println("exception occur !");
        }

        try{
            testException.test1();
        } 
        catch(Exception e){
            System.out.println("exception occur in test1 !");
        } 
        
        try{
            testException.test2();
        } 
        catch(Exception e){
            System.out.println("exception occur in test2 !");
        }  
    }
}

class TestException2 {
   
    public void test() throws NullException{
            throw new NullException("test.txt");
    }

    public void test1() throws MyException{
            throw new MyException();
    }

    public void test2() throws MyException2{
            throw new MyException2();
    }
}

class MyException extends Exception{
}

class MyException2 extends RuntimeException{

}

class NullException extends Exception{
    NullException(String str){
    }
}
