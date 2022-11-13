package DoubleLinkedLists;

public class List_2 {
    private LinkList_Student_2 head;
    private LinkList_Student_2 tail;


    public List_2(){
        head = null;
        tail = null;
    }

    public  boolean isEmpty(){

        return head == null;
    }

    public void addFirst(int number, String name, String surname, int age, double advBall, int namClass){//добавление узла в начало
        LinkList_Student_2 temp = new LinkList_Student_2(number, name, surname, age, advBall, namClass);
        if(isEmpty()){
            tail = temp;
        }
        else{
            head.prev = temp;
        }
        temp.next = head;
        head = temp;
    }

    public void addLast(int number, String name, String surname, int age, double advBall, int namClass){//добавление узла в конец
        LinkList_Student_2 temp = new LinkList_Student_2(number, name, surname, age, advBall, namClass);
        if(isEmpty()){
            head = temp;
        }
        else{
            tail.next = temp;
        }
        temp.prev = tail;
        tail = temp;
    }

    public void removeFirst(){//удаление первого узла
        if(head.next == null){
            tail = null;
        }
        else{
            head.next.prev = null;
        }
        head = head.next;
    }
    public void removeLast(){//удаление последнего узла
        if (head.next == null){
            head = null;
        }
        else{
            tail.prev.next = null;
        }
        tail = tail.prev;
    }

    public void removeAt(int key){//удаление конкретного узла
        LinkList_Student_2 head_temp = head;
        while (head_temp.number != key){
            head_temp = head_temp.next;
            if(head_temp == null){
                return;
            }
        }
        if (head_temp == head){
            removeFirst();
        }
        else{
            head_temp.prev.next = head_temp.next;

        }
        if(head_temp == tail){
            removeLast();
        }
        else{
            head_temp.next.prev = head_temp.prev;
        }

    }

    public void print(){//печать списка
        LinkList_Student_2 temp_head = head;
        while (temp_head != null){
            System.out.println(temp_head.number + " Имя: "+ temp_head.name +  "; Фамилия: " + temp_head.surname + "; Возраст: " + temp_head.age + "; Средний балл: " + temp_head.advBall + "; Класс: " + temp_head.namClass );
            temp_head = temp_head.next;
        }

    }

    public void removeAll(){//удаление всего
        while (head != null){
            removeFirst();
        }
        System.out.println("Список очищен!");


    }
}
