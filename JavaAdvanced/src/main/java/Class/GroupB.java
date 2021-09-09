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
public class GroupB {

    private String name;
    private int age;
    private String repo;
    private int att;

    public void display() {
        System.out.println("name: " + getName());
        System.out.println("age: " + getAge());
        System.out.println("repo: " + getRepo());
        System.out.println("att: " + getAtt());

    }

    public GroupB(String name, int age, String repo, int att) {
        this.name = name;
        this.age = age;
        this.repo = repo;
        this.att = att;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getRepo() {
        return repo;
    }

    public void setRepo(String repo) {
        this.repo = repo;
    }

    public int getAtt() {
        return att;
    }

    public void setAtt(int att) {
        this.att = att;
    }

}
