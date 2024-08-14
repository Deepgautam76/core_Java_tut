import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Student {
    int age;
    String name;

    Student(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public String toString() {
        return "Student [age - " + age + " Name: " + name + "]";
    }

}

public class collectionOf {
    public static void main(String[] args) {

        //Lanbda expression use hare 
        Comparator<Student> com = (i,j) ->  i.age > j.age?1:-1;

        List<Student> li = new ArrayList<>();
        li.add(new Student(20, "kamal"));
        li.add(new Student(23, "govind"));
        li.add(new Student(22, "goldy"));

        Collections.sort(li,com);

        for (Student s : li)
            System.out.println(s);

    }
}
