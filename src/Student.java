import java.time.LocalDate;

public class Student {
    String name;
    LocalDate dateOfBirth;
    int phoneNum;
    String nationality;

    public Student() {
    }
    public Student(String name, LocalDate dateOfBirth, int phoneNum, String nationality) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.phoneNum = phoneNum;
        this.nationality = nationality;


    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                ", phoneNum=" + phoneNum +
                ", nationality='" + nationality + '\'' +
                '}';
    }

    public static String getAllStudentsInfo(Student[] students) {
        StringBuilder sb = new StringBuilder();
        for (Student student : students) {
            sb.append(student).append("\n");
        }  return sb.toString();



    }
}
