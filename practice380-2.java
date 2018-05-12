class Test{
    public static void main(String[] args) {
        Person p = new Person("chilly");
        Student s = new Student("weixing","dayi");
        Employee e = new Employee("zhangsan","wuhan","15872998154","@qq.com");
        System.out.println(p); 
        System.out.println(s); 
        System.out.println(e); 
    }
}

class Person{
    protected String name;
    Person(String name){
        this.name = name;
    }
    public String toString(){
        return "Person : " + this.name;
    }

}

class Student extends Person{
    private final String grade;
    Student(String name,String grade){
        super(name);
        this.grade = grade;
    }
    public String toString(){
        return "Student : " + name + grade;
    }
}

class Employee extends Person{
    protected String address,phoneNumber,email;
    Employee(String name,String address,String p,String email){
        super(name);
        this.address = address;
        this.phoneNumber = p;
        this.email = email;
    }
    public String toString(){
        return "Employee : " + address +"\t" + phoneNumber + "\t" +email;
    }
}

