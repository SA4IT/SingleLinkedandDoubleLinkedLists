package SingleLinkedLists;

public class List_1 {
    private LinkList_Student_1 head;

    public List_1(){// изначально head = 0, т.к. нет ссыланий первого узла на предыдущий
        head = null;
    }

    public boolean Empty(){
        return head == null;
    }

    public void add(int number, String name, String surname, int age, double advBall, int namClass){ //добавление узлов в список
        LinkList_Student_1 temp = new LinkList_Student_1(number, name,surname,age, advBall, namClass);
        temp.next = head;
        head = temp;
    }

    public boolean isEmpty(){
        return head == null;
    }


    public void remove(){//удаление последнего узла из списка
        head = head.next;
    }

    public void removeAt(int key){// удаление конекретного узла
        LinkList_Student_1 head_temp = head;
        LinkList_Student_1 prev = null;
        while(head_temp.next != null){
            if(head_temp.number == key){
                if(head_temp == head){
                    head = head.next;
                }
                else{
                    prev.next = head_temp.next;
                }
            }
            prev = head_temp;
            head_temp = head_temp.next;
        }
    }

    public void printOfknot(int key){//печать конкретного узла
        LinkList_Student_1 cur = head;
        LinkList_Student_1 prev = null;
        while(cur.next != null){
            if(cur.number == key){
                if(cur == head){
                    head = cur.next;
                    System.out.println(cur.number + " Имя: "+ cur.name +  "; Фамилия: " + cur.surname + "; Возраст: " + cur.age + "; Средний балл: " + cur.avrmark + "; Класс: " + cur.namClass );
                    break;
                }
                else{
                    prev.next =cur.next;
                    System.out.println(cur.number + " Имя: "+ cur.name +  "; Фамилия: " + cur.surname + "; Возраст: " + cur.age + "; Средний балл: " + cur.avrmark + "; Класс: " + cur.namClass );
                    break;
                }
            }
            prev = cur;
            cur = cur.next;
        }
    }


    public void print(){// вывод списка
        LinkList_Student_1 head_temp = head;
        while(head_temp != null){
            System.out.println(head_temp.number + " Имя: "+ head_temp.name +  "; Фамилия: " + head_temp.surname + "; Возраст: " + head_temp.age + "; Средний балл: " + head_temp.avrmark + "; Класс: " + head_temp.namClass );
            head_temp = head_temp.next;
        }
    }

    public void removeAll(){
        while (head != null){
            remove();
        }
        System.out.println("Список очищен!");
    }
}
