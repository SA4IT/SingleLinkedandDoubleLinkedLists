package SingleLinkedLists;

public class LinkList_Student_1 {
    public int number;
    public String name;
    public String surname;
    public double avrmark;
    public int namClass;
    public int age;
    public LinkList_Student_1 next;// ссылка на узел (является предыдущим узлом)

    public LinkList_Student_1(int number, String name, String surname, int age, double advBall, int namClass){
        this.number = number;
        this.name = name;
        this.surname = surname;
        this.avrmark = advBall;
        this.namClass = namClass;
        this.age = age;

    }
}
