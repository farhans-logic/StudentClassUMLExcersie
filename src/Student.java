public class Student {

    private String name;

    private char grade;

    private String group;

    private String secretName;

    public final String DEFAULT_SECRET_NICK_NAME = "MySecretNickName";

    private final char MAX_GRADE = 'A';
    private final char MIN_GRADE = 'F';

    public Student(String name, String grade, String group) {
        this.name = name;
        this.grade = grade.charAt(0);
        this.group = group;
        this.secretName = DEFAULT_SECRET_NICK_NAME;
    }

    public String getName() {
        return name;
    }

    public String getGrade() {
        return String.valueOf(grade);
    }

    private void updateGrade(char grade) {
        this.grade = grade;
    }

    public String getGroup() {
        return group;
    }

    public void upgradeGrade() {
        if (canChangeGrade(grade)) {
            updateGrade((char) (getGrade().charAt(0) - 1));
        }
    }

    public void downgradeGrade() {
        if (canChangeGrade(grade)) {
            updateGrade((char) (getGrade().charAt(0) + 1));
        }
    }

    private boolean canChangeGrade(char grade) {
        return grade >= MAX_GRADE && grade <= MIN_GRADE;
    }

}
