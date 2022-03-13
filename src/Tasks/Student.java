package Tasks;

/* Create a program where you can create and have some actions to the following objects:
 * university and student. You should be able to create students that have name, age and
 * mark from their courses and also to create universities which have name, foundationYear
 * and a list of students created earlier.
 * In main program you should be able to create 3 universities with some students in it
 * and calculate the average media between them and print the result in console. */

public class Student {

    private String name;
    private int age;
    private String major;
    private float gpa;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public float getGpa() {
        return gpa;
    }

    public void setGpa(float gpa) {
        this.gpa = gpa;
    }

    public Student(){
        this.name = "";
        this.age = 0;
        this.major = "";
        this.gpa = 0;

    }

    public Student(String n, int a, String m, float g){
        this.name = n;
        this.age = a;
        this.major = m;
        this.gpa = g;
    }

    public void printStudent(){
        System.out.println("        Name: " + this.name);
        System.out.println("        Age: " + this.age);
        System.out.println("        Major: " + this.major);
        System.out.println("        GPA: " + this.gpa);
        System.out.println("------------------------------------");

    }

    public static void main(String[] args) {

        Student ana = new Student();
        ana.setName("Ana");
        ana.setAge(22);
        ana.setMajor("FAF");
        ana.setGpa((float) 9.8);

        Student bill = new Student();
        bill.setName("Bill");
        bill.setAge(21);
        bill.setMajor("FAF");
        bill.setGpa((float) 10.0);

        ana.printStudent();
        System.out.println("------");
        bill.printStudent();
        System.out.println("------");

    }

}
