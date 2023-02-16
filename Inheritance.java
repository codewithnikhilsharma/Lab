package Now;

class Teacher {
    String collegeName = "Ganga Institute of Tech and Management";
    String designation = "Teacher";
    
    void work() {
        System.out.println("Teaching");
    }
  }

class ITTeacher extends Teacher {
    String mainSubject = "Computer Science";
}

class MathTeacher extends Teacher {
    String mainSubject = "Mathematics";
}

class SoftSkillTeacher extends Teacher {
    String mainSubject = "Soft Skills";
}


public class Inheritance {
	 public static void main(String[] args) {
	        ITTeacher itTeacher = new ITTeacher();
	        System.out.println("IT Teacher works in " + itTeacher.collegeName);
	        System.out.println("IT Teacher's designation is " + itTeacher.designation);
	        System.out.println("IT Teacher's main subject is " + itTeacher.mainSubject);
	        itTeacher.work();
	        
	        MathTeacher mathTeacher = new MathTeacher();
	        System.out.println("Math Teacher works in " + mathTeacher.collegeName);
	        System.out.println("Math Teacher's designation is " + mathTeacher.designation);
	        System.out.println("Math Teacher's main subject is " + mathTeacher.mainSubject);
	        mathTeacher.work();
	        
	        SoftSkillTeacher ssTeacher = new SoftSkillTeacher();
	        System.out.println("Soft Skill Teacher works in " + ssTeacher.collegeName);
	        System.out.println("Soft Skill Teacher's designation is " + ssTeacher.designation);
	        System.out.println("Soft Skill Teacher's main subject is " + ssTeacher.mainSubject);
	        ssTeacher.work();
	    }
}
