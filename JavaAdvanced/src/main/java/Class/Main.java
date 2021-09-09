/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class;

/**
 *
 * @author jaypr
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Student student01 = new Student("JAVA","Trystan", 21, "\"https://github.com/TrystanDames/Java_Beginner.git\";",90);
      Student student02 = new Student("JAVA","Jaden", 19, "\"https://github.com/JadenTurnbull/JavaBeginner\";" ,80);
      Student student03 = new Student("JAVA","Ndabe", 18, "\"https://github.com/grizzly-ops/java\";" ,50);
      Student student04 = new Student("JAVA","Hlumelo", 20, "\"https://github.com/HlumeloZ/javaClaswork.git\";" ,50);
      Student student05 = new Student("JAVA","Gianluca", 18, "\"https://github.com/UselessFish99/JavaBeginner/tree/master/Java11ClassWork\";" ,60); 
      Student student06 = new Student("JAVA","Keagen", 19, "\"https://github.com/KeaganDodsworth/JavaBeginner/tree/master/OneDrive/Documents/NetBeansProjects\";" ,70);
       
      Student [] theStudent ={student01, student02, student03, student04, student05, student06};
      for(Student student : theStudent){
          student.display();
          System.out.println("\n");
      }
    }
    
}
