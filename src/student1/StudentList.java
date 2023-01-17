
package student1;

public class StudentList {
    public static void main(String[] args){
        
       // Student1 s1= new Student1("s1"," Mustafa");
       
       Student1[] studentList = new Student1[3]; 
       studentList[0] = new Student1("s1","Mustafa");
       studentList[1] = new Student1("s1","Jhn");
       studentList[2] = new Student1("s1","abc");
       
       for(int i=0; i<studentList.length; i++){
           System.out.println(studentList[i].getStudentName());
       }
       
        
    }
    
    
}
