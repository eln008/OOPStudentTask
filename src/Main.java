import java.time.LocalDate;


public class Main {
    public static void main(String[] args) {
Student student1 = new Student("name",LocalDate.of(2000,1,4)  , 23887789,"Kyrgyz");
Student student2 = new Student("daisy",LocalDate.of(1990,9,1)  , 23887789,"avars");
Student student3 = new Student("namme3",LocalDate.of(2007,12,23)  , 23887789,"russian");
Student student4 = new Student("name4",LocalDate.of(1998,7,8)  , 23887789,"uzbek");
Student student5 = new Student("name5",LocalDate.of(2010,4,1)  , 23887789,"American");
   Student[] student ={student1,student2,student3,student4,student5};
   String result = Student.getAllStudentsInfo(student);
        System.out.println(result);
    }

}