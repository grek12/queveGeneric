import java.util.Scanner;

public class Menu {
    Queue<Integer> t = new Queue<>();
    Queue<String> t2 = new Queue<>();
    Scanner scan = new Scanner(System.in);
    String s = "";
    int x = 0;
    String Elem ;

    void menu(){
            while (!"3".equals(s)) {
                System.out.println("1. Для добавления чисел");
                System.out.println("2. Для добавления строк");
                System.out.println("3. Выход");
                s = scan.next();
                try {
                    x = Integer.parseInt(s);
                } catch (NumberFormatException e) {
                    System.out.println("Неверный ввод");
                }
                switch (x) {
                    case 1:
                        menu2();
                        break;
                    case 2:
                        menu3();
                        break;

                }
            }    }
            void menu2(){
                while (!"5".equals(s)) {
                    System.out.println("1. Для добавления элемента в очередь");
                    System.out.println("2. Для удаления элемента из очереди");
                    System.out.println("3. Вывод текущего состояния ");
                    System.out.println("4. Очистить массив ");
                    System.out.println("5. Выход в главное меню");
                    s = scan.next();
                    try {
                        x = Integer.parseInt(s);
                    } catch (NumberFormatException e) {
                        System.out.println("Неверный ввод");
                    }
                    switch (x) {
                        case 1:
                            System.out.println("Введите число:");
                            Elem = scan.next();
                            t.add(Integer.valueOf(Elem));
                            break;
                        case 2:

                            t.remove();
                            break;
                        case 3:
                            t.print();
                            break;
                        case 4:
                            t.removeAll();
                            break;
                    }
        }}
            void menu3() {
                while (!"5".equals(s)) {
                    System.out.println("1. Для добавления слова в очередь");
                    System.out.println("2. Для удаления элемента из очереди");
                    System.out.println("3. Вывод текущего состояния ");
                    System.out.println("4. Очистить массив ");
                    System.out.println("5. Выход в главное меню");
                    s = scan.next();
                    try {
                        x = Integer.parseInt(s);
                    } catch (NumberFormatException e) {
                        System.out.println("Неверный ввод");
                    }
                    switch (x) {
                        case 1:
                            System.out.println("Введите слово:");
                            Elem = scan.next();
                            t2.add(Elem);
                            break;
                        case 2:
                            t2.remove();
                            break;
                        case 3:
                            t2.print();
                            break;
                        case 4:
                            t2.removeAll();
                            break;
                    }
            }}}

