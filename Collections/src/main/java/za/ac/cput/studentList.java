package za.ac.cput;

/**
 * Created by LILO on 2016/03/12.
 */
public class studentList {
    private  String name;
    private  String course;

    public studentList(){}

    public studentList(String name, String course){
        this.name = name;
        this.course = course;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setCourse(String course){
        this.course = course;
    }

    public  String getName(){
        return name;
    }

    public String getCourse(){
        return course;
    }

    @Override
    public String toString() {
        return "Student Name: " + name + "\n" + "Course Name: " + course;
    }
}
