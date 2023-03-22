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
    }}
public class Main {
    public static void main(String[] args) {
        ArrayList<Student> arrayList = new ArrayList<>();
        arrayList.add(new Student("Sony", 99));
        arrayList.add(new Student("Taisia", 0));
        arrayList.add(new Student("Anya", 88));
        arrayList.add(new Student("Miron", 72));
        arrayList.add(new Student("Rostislav", 12));

        TreeSet<Student> studentTreeSet = new TreeSet<>(arrayList);
        int x = 50;
        System.out.println();
        SortedSet<Student> result = studentTreeSet.tailSet(new Student("",x));
        SortedSet<Student> result2 = studentTreeSet.subSet(new Student("",x),
                new Student("",Integer.MAX_VALUE));
        for(Student r: result) {
            System.out.println(r.name + "=>" + r.mark);
        }}}