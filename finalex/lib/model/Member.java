package lib.model;

public class Member {
    private String name;
    private String email;

    public String getName() { return name;}
    public void setName(String name) { this.name = name;}

    public String getEmail() { return email;}
    public void setEmail(String email) { this.email = email;}

    public Member(String name, String email) {
        setName(name);
        setEmail(email);
    }

    public void print_member() {
        System.out.println("Name: " + name + " " + "Email: " + email);
    }

}