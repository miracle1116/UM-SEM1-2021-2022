package lab9;

public class Lecturer extends PersonProfil{
    private String [] courseCode,CourseName,session, semester ;
    private int[]numberOfRegistered;
private double[] creditHour;

    public Lecturer(String[] courseCode, String[] CourseName, String[] session, String[] semester, double [] creditHour, int[] numberOfRegistered, String name, char gender, String DOB) {
        super(name, gender, DOB);
        this.courseCode = courseCode;
        this.CourseName = CourseName;
        this.session = session;
        this.semester = semester;
        this.creditHour = creditHour;
        this.numberOfRegistered = numberOfRegistered;
    }

    public void setCourseCode(String[] courseCode) {
        this.courseCode = courseCode;
    }

    public void setCourseName(String[] CourseName) {
        this.CourseName = CourseName;
    }

    public void setSession(String[] session) {
        this.session = session;
    }

    public void setSemester(String[] semester) {
        this.semester = semester;
    }

    public void setCreditHour(double[] creditHour) {
        this.creditHour = creditHour;
    }

    public void setNumberOfRegistered(int[] numberOfRegistered) {
        this.numberOfRegistered = numberOfRegistered;
    }

    public double[] getCreditHour() {
        return creditHour;
    }

    public String[] getCourseCode() {
        return courseCode;
    }

    public String[] getCourseName() {
        return CourseName;
    }

    public String[] getSession() {
        return session;
    }

    public String[] getSemester() {
        return semester;
    }

    public int[] getNumberOfRegistered() {
        return numberOfRegistered;
    }

  
  

    public void compute(){
        for(int i=0;i<4;i++){
            if(numberOfRegistered[i]>=150){
                 creditHour[i]= creditHour[i]*3;
            }else if(numberOfRegistered[i]>=100&&numberOfRegistered[i]<150){
                 creditHour[i]= creditHour[i]*2;
            }else if(numberOfRegistered[i]>=50&&numberOfRegistered[i]<100){
                creditHour[i]= creditHour[i]*1.5;
            }else 
                creditHour[i]= creditHour[i]*1;
    }
    }
}
        
