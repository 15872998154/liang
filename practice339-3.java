class Test{
    public static void main(String[] args){
        MyInteger myint = new MyInteger(3);
        MyInteger myint2 = new MyInteger(4);

        System.out.println(myint.isOdd());
        System.out.println(myint.isEven());
        
        System.out.println(MyInteger.isEven(3));
        System.out.println(MyInteger.isOdd(4));
        
        System.out.println(MyInteger.isOdd(myint));
        System.out.println(MyInteger.isEven(myint));
        
        System.out.println( myint.equals(3));
        System.out.println( myint.equals(myint2));



    }
}

class MyInteger  {
    private int value;
    public MyInteger(int value){
        this.value = value;
    }    
    public int getValue(){
        return this.value;
    }
    public boolean isEven(){
        if (this.value % 2 == 0){
            return true;
        }
        return false;
    }
    public boolean isOdd(){
        if(this.value % 2 == 1){
            return true;
        }
        return false;
    }

    public static boolean isOdd(int value){
        if (value % 2 == 1){
            return true;
        }
        return false;
    }

    public static boolean isEven(int value){
        if (value % 2 == 0){
            return true;
        }
        return false;
    }

    
    public static boolean isEven(MyInteger myint){
        if (myint.value % 2 == 0){
            return true;
        }
        return false;
    }

    public static boolean isOdd(MyInteger myint){
        if(myint.value % 2==1){
            return true;
        }
        return false;
    }

    public boolean equals(int value){
        if (this.value == value){
            return true;
        }
        return false;
    }

    public boolean equals(MyInteger myint){
        if(this.value == myint.getValue()){
            return true;
        }
        return false;
    }
}
