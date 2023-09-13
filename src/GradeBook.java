public class GradeBook {
    private String courseName;
    private float GPA;
//    public boolean status;
//    public int creditHours;

    public GradeBook()
    {
        GPA = 0.0f; // double
        courseName = "";
    }
    public GradeBook(String cName, float cGPA)
    {
        GPA = cGPA; // double
        courseName = cName;
    }
//    public void GradeBook()
//    {
//        GPA = 100.0f; // double
//        courseName = "Default course";
//    }
    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName1) {
        courseName = courseName1;
    }

    public float getGPA() {
        return GPA;
    }

    public void setGPA(float GPA1) {
        GPA = GPA1;
    }

    public void displayMessage()
    {
        System.out.println("Welcome to GradeBook Class!");
        System.out.println(courseName);
        System.out.println(GPA);
    }
    public static void main(String[] args) {

        GradeBook gb = new GradeBook("Physics", 2.0f);

        GradeBook gb3 = new GradeBook();

        // user input gpa for gb3
        if(gb3.getGPA() >2.0)
            gb3.setCourseName("Phy");
        else
            gb3.setCourseName("Bio");

        GradeBook gb2 = new GradeBook();
//        GradeBook gbPhysics = new GradeBook();
//        gbPhysics.setCourseName("physics");
        gb.displayMessage();
        gb2.displayMessage();
    }
}

