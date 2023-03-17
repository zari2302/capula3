import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Student student = new Student();
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        String surName = scanner.nextLine();
        String email = scanner.nextLine();
        String number = scanner.nextLine();
        student.setName(name);
        student.setSurName(surName);
        student.setEmail(email);
        student.setNumber(number);
        student.name2();
        System.out.println(student.getSurName()+"\n"+
                student.getEmail()+"\n"+student.getNumber());
    }
}