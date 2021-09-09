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
public class Student extends GroupB {    
    private String course;

    public Student(String course, String name, int age, String repo, int att) {
        super(name, age, repo, att);
        this.course = course;
    }

    
    @Override
    public void display() {
        super.display();
        System.out.println("Course: " + getCourse());
        
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }
    
    
}

    
            

