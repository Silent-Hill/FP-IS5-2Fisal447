package com.codingelab.tutorial;

public class PersonLocal {
    private String Id;
    private String name;
    private String phone;
    private String email;

    public PersonLocal(String Id, String name, String phone, String email) {
        this.Id = Id;
        this.name = name;
        this.phone = phone;
        this.email = email;
    }

    public PersonLocal( String name, String phone, String email) {
        this.name = name;
        this.phone = phone;
        this.email = email;
    }

    public String getId() {
        return Id;
    }

    public void setId(String Id) {
        this.Id = Id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }



    @Override
    public String toString() {
        return "Person{" +
                "Id='" + Id + '\'' +
                ", name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    public PersonLocal() {
    }
    public  PersonLocal (String id, String name)
    {
        this.Id = id;
        this.name = name;
    }
}
