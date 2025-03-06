package comparation.Homework;

import java.util.ArrayList;
import java.util.Comparator;

public class StudentNull {

    String name;

    public StudentNull(String name){
        this.name = name;
    }

    @Override
    public String toString(){
        return "Student: " + this.name;
    }
}

class NullNameComparator implements Comparator<StudentNull>{

    @Override
    public int compare(StudentNull st1, StudentNull st2){

        if (st1.name == null){
            return 1;
        }
        else if (st2.name == null){
            return -1;
        }
        else {
            return st1.name.compareTo(st2.name);
        }
    }
}

class Main{
    public static void main(String[] args) {
        ArrayList<StudentNull> aL = new ArrayList<>();
        aL.add(new StudentNull("Konstantin"));
        aL.add(new StudentNull(null));
        aL.add(new StudentNull("Alexander"));
        aL.add(new StudentNull("Zaur"));
        aL.add(new StudentNull(null));

        System.out.println("Before sorting...");
        System.out.println(aL);
        System.out.println();

        System.out.println("After sorting");
        aL.sort(new NullNameComparator());
        System.out.println(aL);

    }
}
