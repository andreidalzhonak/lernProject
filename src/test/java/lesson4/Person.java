package lesson4;

public class Person {
    private String name;

    private String position;

    private String email;

    private String number;
    private int salary;
    private int age;

    public int getAge() {
        return age;
    }

    public Person(String name, String position, String email, String number, int salary, int age) {
        this.name = name;
        this.position = position;
        this.email = email;
        this.number = number;
        this.salary = salary;
        this.age = age;
    }


    @Override
    public String toString() {
        return String.format("Имя: %s \nДолжность: %s \nEmail: %s \nНомер телефона: %s \nЗарплата: %d \nВозраст: %d \n",
                name, position, email, number, salary, age);
    }


    public void printInfo() {
        System.out.println(this);
    }
}

