public class Main {

    public static void main(String[] args) {

        Instructor teacher1 = new Instructor();
        teacher1.id = 1;
        teacher1.firstName = "Nergis";
        teacher1.lastName = "Hati";

        Student student1 = new Student();
        student1.id = 2;
        student1.firstName = "İrem";
        student1.lastName = "Bulut";
        student1.schoolName = "KTÜ";

        UserManager userManager = new UserManager();
        userManager.add(teacher1);
        userManager.add(student1);




    }
}
