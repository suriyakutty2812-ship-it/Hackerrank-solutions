import java.util.*;

class Student {
    private int id;
    private String name;
    private double cgpa;

    public Student(int id, String name, double cgpa) {
        this.id = id;
        this.name = name;
        this.cgpa = cgpa;
    }

    public int getId() { return id; }
    public String getName() { return name; }
    public double getCgpa() { return cgpa; }
}

public class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = Integer.parseInt(in.nextLine());

        List<Student> students = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int id = in.nextInt();
            String name = in.next();
            double cgpa = in.nextDouble();
            students.add(new Student(id, name, cgpa));
        }

        
        Collections.sort(students, new Comparator<Student>() {
            public int compare(Student s1, Student s2) {
                if (s1.getCgpa() != s2.getCgpa()) {
                    return Double.compare(s2.getCgpa(), s1.getCgpa()); // Desc
                } else if (!s1.getName().equals(s2.getName())) {
                    return s1.getName().compareTo(s2.getName()); // Asc
                } else {
                    return Integer.compare(s1.getId(), s2.getId()); // Asc
                }
            }
        });

        // Output
        for (Student s : students) {
            System.out.println(s.getName());
        }

        in.close();
    }
}
