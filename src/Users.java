/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hamee_000
 */
public class Users {
    private String name,email, pass, gender;
    private  int age;

    public Users(String name, String email, String pass, String gender, int age) {
        this.name = name;
        this.email = email;
        this.pass = pass;
        this.gender = gender;
        this.age = age;
    }

    public Users() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Users{" + "name=" + name + ", email=" + email + ", pass=" + pass + ", gender=" + gender + ", age=" + age + '}';
    }
}
