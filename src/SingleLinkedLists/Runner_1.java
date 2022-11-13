package SingleLinkedLists;

public class Runner_1 {
    public static void main(String[] args) {

        List_1 list = new List_1();

        System.out.println();
        if(list.isEmpty() == true){
            System.out.println("Список создан! Пока он пуст!");
        }
        else{
            System.out.println("Список заполнен!");
        }
        System.out.println();

        //заполнение списка
        list.add(1,"Валерий","Горчаков",11, 4.24,3);
        list.add(2,"Сергей","Димов",12, 3.74,6);
        list.add(3,"Михаил","Андреев",7, 2.94,1);
        list.add(4,"Владислав","Белых",16, 4.8,10);
        list.add(5,"Алексей","Колесников",14, 3.69,8);
        list.add(6,"Георгий","Малин",15, 2.9,9);
        list.add(7,"Василий","Швыдкий",13, 3.56,7);
        list.add(8,"Роман","Володин",8, 4.44,2);
        list.add(9,"Борис","Ахрамов",15, 3.63,9);

        list.print();//печать списка
        System.out.println();
        if(list.isEmpty() == true){
            System.out.println("Список создан! Пока он пуст!");
        }
        else{
            System.out.println("Список заполнен!");
        }
        System.out.println();

        list.remove();
        list.print();
        System.out.println();
        System.out.println("Удалён последний ученик!");
        System.out.println();


        list.removeAt(4);//удаление n-го ученика из списка
        list.print();
        System.out.println();
        System.out.println("Удалён 4-ый ученик!");
        System.out.println();


        list.printOfknot(7);//печать инф-ции о 7 ученике
        System.out.println();
        System.out.println("Распечатана инф. о 7-ом ученике!");
        System.out.println();

        list.removeAll();
        list.print();//ничего не выведет

    }
}
