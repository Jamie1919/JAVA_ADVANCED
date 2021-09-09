/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package foreachexample;

/**
 *
 * @author jaypr
 */
public class Person {

    private String givenName;
    private String surName;
    private int age;
    private Gender gender;
    private String eMail;
    private String phone;
    private String address;
    private String city;
    private String state;
    private String code;

    public static class Builder {

        private String givenName = "";
        private String surName = "";
        private int age = 0;
        private Gender gender = Gender.FEMALE;
        private String eMail = "";
        private String phone = "";
        private String address = "";
        private String city = "";
        private String state = "";
        private String code = "";

        public Person.Builder givenName(String givenName) {
            this.givenName = givenName;
            return this;
        }

        public Person.Builder surName(String surName) {
            this.surName = surName;
            return this;
        }

        public Person.Builder age(int val) {
            age = val;
            return this;
        }

        public Person.Builder gender(Gender val) {
            gender = val;
            return this;
        }

        public Person.Builder email(String val) {
            eMail = val;
            return this;
        }

        public Person.Builder phoneNumber(String val) {
            phone = val;
            return this;
        }

        public Person.Builder address(String val) {
            address = val;
            return this;
        }

        public Person.Builder city(String val) {
            city = val;
            return this;
        }

        public Person.Builder state(String val) {
            state = val;
            return this;
        }

        public Person.Builder code(String val) {
            code = val;
            return this;
        }

        public Person build() {
            return new Person(this);
        }
    }

    private Person() {
        super();
    }

    private Person(Person.Builder builder) {
        givenName = builder.givenName;
        surName = builder.surName;
        age = builder.age;
        gender = builder.gender;
        eMail = builder.eMail;
        phone = builder.phone;
        address = builder.address;
        city = builder.city;
        state = builder.state;
        code = builder.code;

    }

    public String getGivenName() {
        return givenName;
    }

    public String getSurName() {
        return surName;
    }

    public int getAge() {
        return age;
    }

    public Gender getGender() {
        return gender;
    }

    public String getEmail() {
        return eMail;
    }

    public String getPhone() {
        return phone;
    }

    public String getAddress() {
        return address;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }

    public String getCode() {
        return code;
    }

 

}
