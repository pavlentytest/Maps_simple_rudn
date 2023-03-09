import java.util.*;

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

        Vector vector = new Vector();
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

        // hash - некое число (хэш-функция)
        Object y = new Object();

        System.out.println(y.hashCode());


        // Maps- мапы, словари, карты, ассоц. массивы
        // Пары: key => value
        //HashMap
        HashMap<String, String> cities = new HashMap<>();
        cities.put("msk","Moscow");
        // 1340958134 => msk, Moscow
        cities.put("spb","Piter");
        // 235893458 => spb, Piter
        cities.get("msk"); // 1340958134
        cities.put("kzn","Kazan");
        cities.put("oms","Omsk");
        cities.put("nsk","Novosibirsk");
        for(Map.Entry<String,String> m: cities.entrySet()) {
            System.out.println(m.getKey() + "=>" + m.getValue());
        }

        class Game {
            public String genre;
            public int year;

            public Game(String genre, int year) {
                this.genre = genre;
                this.year = year;
            }
        }
        //TreeMap
        TreeMap<String,Game> games = new TreeMap<>();
        games.put("nfs", new Game("simulator",2000));
        games.put("amongus", new Game("simulator",2010));
        games.put("cs", new Game("shooter",2000));
        games.put("skyrim", new Game("rpg",2011));
        for(Map.Entry<String,Game> g: games.entrySet()) {
            System.out.println(g.getKey() + "=>" + g.getValue().genre + "("+g.getValue().year+")");
        }

    }
}