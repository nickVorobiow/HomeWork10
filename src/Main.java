import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //        task1
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = lastName+ " " + firstName + " " + middleName;
        System.out.println("ФИО сотрудника - " + fullName);

//        task2
        System.out.println("Данные ФИО сотрудника для заполнения отчета - " + fullName.toUpperCase());

//        task3
        String[] nameArr = fullName.split(" ");
        nameArr[0] = "Иванов";
        nameArr[1] = "Семён";
        nameArr[2] = "Семёнович";
        fullName = String.join(" ", nameArr);
        if (fullName.contains("ё")) {
            fullName = fullName.replace('ё', 'е');
        }
        System.out.println(fullName);
    }
}