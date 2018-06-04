package geekbrains.java_intro.homework_05;

public class Employee {
    String name;
    String position;
    String email;
    int phone;
    int salary;
    int age;

    public Employee(String name, String position, String email, int phone, int salary, int age) {
        this.name = name;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    public void printEmployee(){
        System.out.print("Имя сотрудника: " + this.name);
        System.out.print(" Должность сотрудника: " + this.position);
        System.out.print(" Электронная почта: " + this.email);
        System.out.print(" Телефон: " + this.phone);
        System.out.print(" Зарплата: " + this.salary);
        System.out.print(" Возраст: " + this.age);
        System.out.println();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
