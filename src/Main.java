import java.util.ArrayList;
import java.util.SortedSet;
import java.util.TreeSet;

class Student implements Comparable<Student> {
    public String name;
    public int mark;

    public Student(String name, int mark) {
        this.name = name;
        this.mark = mark;
    }

    @Override
    public int compareTo(Student o) {
        return this.mark - o.mark;
    }
}
public class Main {
    public static void main(String[] args) {
        ArrayList<Student> arrayList = new ArrayList<>();
        arrayList.add(new Student("Ivan", 40));
        arrayList.add(new Student("Olga", 98));
        arrayList.add(new Student("Maria", 64));
        arrayList.add(new Student("Petr", 78));
        arrayList.add(new Student("Max", 49));

        TreeSet<Student> studentTreeSet = new TreeSet<>(arrayList);
        for(Student s: studentTreeSet) {
            System.out.println(s.name + "=>" + s.mark);
        }
        int x = 50;
        // subSet()
        // tailSet()
        // headSet()
        System.out.println();
        SortedSet<Student> result = studentTreeSet.tailSet(new Student("",x));
        for(Student r: result) {
            System.out.println(r.name + "=>" + r.mark);
        }

        SortedSet<Student> result2 = studentTreeSet.subSet(new Student("",x),
                new Student("",Integer.MAX_VALUE));
        for(Student r: result) {
            System.out.println(r.name + "=>" + r.mark);
        }

    }
}