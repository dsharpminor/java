package Tasks;

public class University {

    private String name;
    private int foundationDate;
    private Student[] students;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getFoundationDate() {
        return foundationDate;
    }

    public void setFoundationDate(int foundationDate) {
        this.foundationDate = foundationDate;
    }

    public Student[] getStudents() {
        return students;
    }

    public void setStudents(Student[] students) {
        this.students = students.clone();
    }

    public float averageGPA(){
        float sum = 0;
        int allStudents = students.length;

        /*
            for (int i = 0; i < allStudents; i++) {
            sum += students[i].getGpa();
        }
         */
        for (Student student : students) {
            sum += student.getGpa();
        }
        return sum / allStudents;

    }

    public void printUniversity() {
        System.out.println("Name: " + this.name);
        System.out.println("Foundation Year: " + this.foundationDate);
        System.out.println("Students: ");

        /*
             for (int i = 0; i < students.length; i++) {
            students[i].printStudent();
        }
         */

        // enhanced for
        for (Student student : students) {
            student.printStudent();
        }

        System.out.printf("Average GPA: %.2f", this.averageGPA());
        System.out.println();
        System.out.println();
    }

    public University(String n, int f){
        this.name = n;
        this.foundationDate = f;
    }

    public static void main(String[] args) {

        Student[] UTM_stud = new Student[3];
        UTM_stud[0] = new Student("Markus", 20, "FAF", (float) 9.05);
        UTM_stud[1] = new Student("North", 19, "FAF",(float) 8.36);
        UTM_stud[2] = new Student("Simon", 21, "FAF", (float) 9.81);
        University UTM = new University("UTM", 1946);
        UTM.setStudents(UTM_stud);
        UTM.printUniversity();

    }
}
