class Teacher {
    String designation = "Teacher";
    String collegeName = "Beginnersbook";
    int id;
    void does(){
     System.out.println("Teaching");
    }
 }
 
 public class PhysicsTeacher extends Teacher{
    String mainSubject = "Physics";
    int age = 66;
    public static void main(String args[]){
     PhysicsTeacher obj = new PhysicsTeacher();
     System.out.println(obj.collegeName);
     System.out.println(obj.designation);
     System.out.println(obj.mainSubject);
     System.out.println(obj.age);
     obj.does();
    }
 }