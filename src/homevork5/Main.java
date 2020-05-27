package homevork5;

import sun.font.FontRunIterator;

public class Main {


    public static void main(String[] args) {
        Employee[] employees = new Employee[5];

        employees[0] = new Employee("Петров Иван Иванович", "Курьер", "petya777@mail.ru", "+79665487985", 15000, 39);
        employees[1] = new Employee("Карманов Георгий Самсонович", "Механик", "goshafartoviy@ya.ru", "+79855497785", 35000, 49);
        employees[2] = new Employee("Фёдоров Геннадий Иннокентьевич", "Помощник Машиниста", "tutu@poezd.ru", "+79658879663", 150000, 41);
        employees[3] = new Employee("Смолин Сергей Павлович", "Парикмахер", "serega1958@gmail.com", "+79165237898", 50000, 62);
        employees[4] = new Employee("Неумелов Александр Безрукович", "Самонезанятый", "neumeunichego@bk.ru", "+79515558899", 3000, 19);


        printOldPersons(employees);


    }


    public static void printOldPersons(Employee[] employees) {

        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getAge() > 40) {
                employees[i].info();
                System.out.println();


            }


        }
    }
}