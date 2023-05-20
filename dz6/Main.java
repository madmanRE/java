package dz6;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        ArrayList <Notebook> base = createBase();
        greeting(base);
    }

    public static ArrayList<Notebook> createBase() {
        ArrayList<Notebook> base = new ArrayList<Notebook>();
            base.add(new Notebook("LG", 29990.00, 8, "red", "Linux", 256));
            base.add(new Notebook("Sumsung", 49990.00, 16, "white", "Windows 10 home", 500));
            base.add(new Notebook("Huawei", 50000.00, 16, "blue", "Windows 11 home", 1000));
            base.add(new Notebook("Lenovo", 34500.00, 12, "green", "Linux Ubuntu", 256));
            base.add(new Notebook("LG", 29990.00, 8, "red", "Linux", 500));
            base.add(new Notebook("Agidus", 14800.00, 4, "black", "No os", 126));
            base.add(new Notebook("Lenovo", 99990.00, 32, "black", "Windows 11 pro", 1000));
            base.add(new Notebook("LG", 36990.00, 8, "green", "No os", 500));
            base.add(new Notebook("Aser", 49990.00, 12, "red", "Windows pro", 500));
            base.add(new Notebook("LG", 29990.00, 8, "red", "Linux Ubuntu", 256));
            base.add(new Notebook("Mcbook", 99000.00, 16, "silver", "MacOS", 1000));
            base.add(new Notebook("Mcbook", 69500.00, 12, "green", "MacOS", 256));
            base.add(new Notebook("Aser", 25000.00, 8, "silver", "No os", 256));
            base.add(new Notebook("ChuChong", 17700.00, 4, "white", "No os", 126));
        return base;
    }

    public static void showBase(ArrayList<Notebook> base, int method){
        base = base;
        if (method == 1) {
            for (Notebook note : base) {
                System.out.println(note.getTitle());
            }
        }
        if (method == 2) {
            for (Notebook note : base) {
                System.out.println(note);
            }
        }
    }

    public static void showMenu(){
        System.out.println("Вот простой набор команд, с помощью которых ты сможешь быстро разобраться в нашем магазине:\n" +
                "Просто введи одну команду из представленных\n" +
                ">>>1 - Эта команда позволит тебе посмотреть на все товары\n" +
                ">>>2 - Эта команда позволит посмотреть на все товары и их подробные характеристики\n" +
                ">>>3 - Эта функция вызывает фильтр, чтобы удобно задать поисковые парметры и получить релеантные значения из базы\n" +
                ">>>4 - Эта функция позволяет выгрузить базу товаров в текстовый документ (.txt) и обратиться к нему при необходимости\n" +
                ">>>5 - Это сериализатор, который позволяет перевести данные нашей товарной базы в байтовое представление, посредстам встреонного сериализатора\n" +
                ">>>6 - Просто введите 6, если хотите покинуть меню");
    }

    public static void greeting(ArrayList<Notebook> base){
        base = base;
        System.out.println("Приветствуем тебя, новый пользователь нашего магазина!");
        System.out.println("----------------------------------------------------------------");
        showMenu();
        System.out.println("----------------------------------------------------------------");

        Boolean flag = true;
        while (flag==true) {
            System.out.println("Введите команду:");
            Scanner scanner = new Scanner(System.in);
            Integer menu_item = scanner.nextInt();
            if (menu_item.equals(1)) {
                showBase(base, 1);
                System.out.println("----------------------------------------------------------------");
                showMenu();
                System.out.println("----------------------------------------------------------------");
            } else if (menu_item.equals(2)) {
                showBase(base, 2);
                System.out.println("----------------------------------------------------------------");
                showMenu();
                System.out.println("----------------------------------------------------------------");
            } else if (menu_item.equals(3)) {
                ArrayList<Notebook> res = Filter.filter(base, Filter.filterParams());
                System.out.println("================================Результат фильтрации==================================");
                for (Notebook note : res) {
                    System.out.println(note);
                }
                System.out.println("----------------------------------------------------------------");
                showMenu();
                System.out.println("----------------------------------------------------------------");
            } else if (menu_item.equals(4)) {
                File.toFileExtraction(base);
                System.out.println("Ваш файл notebooks.txt готов!");
                System.out.println("----------------------------------------------------------------");
                showMenu();
                System.out.println("----------------------------------------------------------------");
            } else if (menu_item.equals(5)) {
                ToJSON.toJson(base);
                System.out.println("Ваш файл notebooks.json готов, однако в данном случае вы получаете сырые данные, " +
                        "которые подойдут для программного взаимодействия (последующей дисериализации)");
                System.out.println("----------------------------------------------------------------");
                showMenu();
                System.out.println("----------------------------------------------------------------");
            }
            else if (menu_item.equals(6)){
                System.out.println("Пришло время прощаться, заглядывайте к нам в магазин позже!");
                flag=false;
                break;
            }
        }

    }
}
