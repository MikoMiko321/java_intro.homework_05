package geekbrains.java_intro.homework_05;

//* Создать класс "Сотрудник" с полями: ФИО, должность, email, телефон, зарплата, возраст;
//        * Конструктор класса должен заполнять эти поля при создании объекта;
//        * Внутри класса «Сотрудник» написать метод, который выводит информацию об объекте в консоль;
//        * Создать массив из 5 сотрудников
//        Пример:
//        Person[] persArray = new Person[5]; // Вначале объявляем массив объектов
//        persArray[0] = new Person("Ivanov Ivan", "Engineer", "ivivan@mailbox.com", "892312312", 30000, 30); // потом для каждой ячейки массива задаем объект
//        persArray[1] = new Person(...);
//        ...
//        persArray[4] = new Person(...);
//
//        * С помощью цикла вывести информацию только о сотрудниках старше 40 лет;

public class Main {

    public Main() {
    }

    public static void main(String[] args) {
        Employee[] persArray = new Employee[5];
        persArray[0] = new Employee("Ivanov Ivan", "Engineer", "ivivan@mailbox.com", 892312312, 30000, 30);
        persArray[1] = new Employee("Петров Петр", "Начальник отдела", "ppetr@mailbox.com", 892343212, 70000, 41);
        persArray[2] = new Employee("Сидоров Сидор", "Специалист", "ssidor@mailbox.com", 895672312, 22000, 22);
        persArray[3] = new Employee("Антонов Антон", "Главный Бухгалтер", "aanton@mailbox.com", 892316542, 100000, 50);
        persArray[4] = new Employee("Сергеев Сергей", "Торговый представитель", "ssergei@mailbox.com", 892121312, 27000, 27);

        for (int i = 0; i<persArray.length;i++){
            if(persArray[i].getAge()>40) {
                persArray[i].printEmployee();
            }
        }

    }
}
