package DoubleLinkedLists;

import SingleLinkedLists.List_1;

public class Runner_2 {
    public static void main(String[] args) {
        List_2 list = new List_2();

        System.out.println();
        if(list.isEmpty() == true){
            System.out.println("Список создан! Пока он пуст!");
        }
        else{
            System.out.println("Список заполнен!");
        }
        System.out.println();


        //заполнение списка
        list.addFirst(5,"Валерий","Горчаков",11, 4.24,3);
        list.addFirst(6,"Сергей","Димов",12, 3.74,6);
        list.addFirst(7,"Михаил","Андреев",7, 2.94,1);
        list.addFirst(8,"Владислав","Белых",16, 4.8,10);
        list.addFirst(9,"Алексей","Колесников",14, 3.69,8);

        list.addLast(4,"Георгий","Малин",15, 2.9,9);
        list.addLast(3,"Василий","Швыдкий",13, 3.56,7);
        list.addLast(2,"Роман","Володин",8, 4.44,2);
        list.addLast(1,"Борис","Ахрамов",15, 3.63,9);

        list.print();//печать списка
        System.out.println();
        if(list.isEmpty() == true){
            System.out.println("Список создан! Пока он пуст!");
        }
        else{
            System.out.println("Список заполнен!");
        }
        System.out.println();

        list.removeFirst();
        list.print();
        System.out.println();
        System.out.println("Удалён последний ученик!");
        System.out.println();

        list.removeLast();
        list.print();
        System.out.println();
        System.out.println("Удалён первый ученик!");
        System.out.println();

        list.removeAt(5);
        list.print();
        System.out.println();
        System.out.println("Удалён 5 ученик!");
        System.out.println();

        list.removeAll();
        list.print();//ничего не выведет
    }
}
