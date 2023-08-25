public class Main {
    public static void main(String[] args) {

        Student student = new Student("Fred", "D", "3");

        System.out.println(student.getName());
        System.out.println(student.getGrade());
        System.out.println(student.getGroup());
        student.upgradeGrade();
        System.out.println(student.getGrade());
        student.downgradeGrade();
        System.out.println(student.getGrade());
        student.upgradeGrade();
        student.upgradeGrade();
        student.upgradeGrade();
        System.out.println(student.getGrade());

    }
}