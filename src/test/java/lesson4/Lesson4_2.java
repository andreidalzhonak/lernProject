package lesson4;

public class Lesson4_2 {
    public static void main(String[] args) {
        Person[] persArray = new Person[5];
        persArray[0] = new Person("Иванов Иван", "Engineer", "ivivan@mailbox.com", "892312312", 30000, 30);
        persArray[1] = new Person("Васильев Иван", "Engineer", "ivivan1@mailbox.com", "892312313", 40000, 35);
        persArray[2] = new Person("Сергеев Сергей", "Engineer", "ivivan2@mailbox.com", "892312314", 50000, 40);
        persArray[3] = new Person("Иванов Артем", "Engineer", "ivivan3@mailbox.com", "892312315", 60000, 50);
        persArray[4] = new Person("Василевский Иван", "Engineer", "ivivan4@mailbox.com", "892312316", 70000, 42);

        for (int i= 0; i < persArray.length; i++){
            if(persArray[i].getAge() >40) {
                persArray[i].printInfo();
            }
        }
    }
}





