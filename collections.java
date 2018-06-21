
import java.util.*;
class Student{
    private String name;
    private int sId;

    Student(String name,int sId){
        this.name = name;
        this.sId = sId;
    }

    public String getName(){
        return name;
    }

    public int getSid(){
        return sId;
    }

    public String toString(){
        return this.name+this.sId;
    }
}


class MyCmp implements Comparator {
    public int compare(Object element1, Object element2) {
        Student s1 = (Student)element1;
        Student s2 = (Student)element2;
        //return s1.getSid().compareTo(s2.getSid());
        if ( s1.getName().compareTo(s2.getName()) > 0 )
            return 1;
        else if ( s1.getName().compareTo(s2.getName()) < 0 ){
            return -1;
        }
        else{
            if(s1.getSid()>s2.getSid()){
                return 1;
            }
            else{
                return -1;
            }
        }

    }
}

class Test{
    public static void main(String[] args) {
        Set<Student> s = new TreeSet<Student>(new MyCmp());
        s.add(new Student("rose",1001));
        s.add(new Student("rose",1002));
        System.out.println(s);
    }
}