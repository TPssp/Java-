package FOUR;

import java.util.*;


public class Course {
    private int no;
    private String name;
    private float grade;
    public static Collection courses=new ArrayList();
    public int getNo(){
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGrade(float grade) {
        this.grade = grade;
    }

    //addCourse
    public static void addCourse(Course course){
        courses.add(course);
    }

    //outputCourse
    public static void outputCourses(){
        Course course=null;
        for(Iterator it=courses.iterator(); it.hasNext();){
            course=(Course)it.next();
            System.out.println("no="+course.no+ ", name="+course.name+ ", grade="+course.grade);
        }
    }

    //getCourseByNo
    public static Course getCourse(int no){
        Course course=null;
        for(Iterator it=courses.iterator();it.hasNext();){
            course=(Course)it.next();
            if(no==course.no){
                break;
            }
        }
        return course;
    }

    //deleteCourseByNo
    public static void deleteCourse(int no){
        Course course=null;
        for(Iterator it=courses.iterator(); it.hasNext();){
            course=(Course) it.next();
            if(no==course.no){
                it.remove();
                break;
            }
        }
    }


    public static void main(String[] args){
        Course c1=new Course();
        c1.setNo(1);
        c1.setName("离散数学");
        c1.setGrade(3.5f);
        Course.addCourse(c1);

        //增加数据结构课程
        Course c2=new Course();
        c2.setNo(2);
        c2.setName("数据结构");
        c2.setGrade(3.5f);
        Course.addCourse(c2);

        //增加Java程序设计课程
        Course c3=new Course();
        c3.setNo(3);
        c3.setName("Java程序设计");
        c3.setGrade(2.5f);
        Course.addCourse(c3);

        Course.outputCourses();

        Course.getCourse(1);
        Course.deleteCourse(1);

        Course c=new Course();
        System.out.print("Enter No: ");
        Scanner scanner=new Scanner(System.in);
        int x=scanner.nextInt();

        c=Course.getCourse(x);
        System.out.println("no="+c.no+ ", name="+c.name+ ", grade="+c.grade);

        Course.outputCourses();
    }

}
