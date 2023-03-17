public class Student {
    private String name;
    private String surName;
    private String email;
    private String number;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public void name2() {
        if (this.name.equals("Azamat")) {
            System.out.println("Teacher: " + this.name);
        } else
            System.out.println("Student: " + this.name);
    }

}
