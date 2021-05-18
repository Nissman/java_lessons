package Java_Core.Lesson_1;
/*
1.Создайте три класса Человек, Кот, Робот, которые не наследуются от одного класса.
Эти классы должны уметь бегать и прыгать (методы просто выводят информацию о действии в консоль).

2.Создайте два класса: беговая дорожка и стена, при прохождении через которые, участники должны выполнять соответствующие действия (бежать или прыгать),
 результат выполнения печатаем в консоль (успешно пробежал, не смог пробежать и т.д.).



3.Создайте два массива: с участниками и препятствиями, и заставьте всех участников пройти этот набор препятствий.

4.У препятствий есть длина (для дорожки) или высота (для стены), а участников ограничения на бег и прыжки.
5*.Если участник не смог пройти одно из препятствий, то дальше по списку он препятствий не идет.
 */
public class HW_lesson_1 {

    public static void main(String[] args) {
        Cat cat_1 = new Cat("Murzik");
        Human human_1 = new Human("Ivan");
        Robot robot_1 = new Robot("t3000");
        Do[] members = {cat_1,human_1,robot_1};

Barier[] bariers = {
        new Track(1), new Track(2),new Wall(1),
        new Track(3),new Wall(2),new Track(4),new Wall(3),new Wall(4)};

        for (int i = 0; i < members.length; i++) {
            for (int j = 0; j < bariers.length; j++) {
                members[i].dO(bariers[j]);
            }
            System.out.println();
                    }
/*
        5*.Если участник не смог пройти одно из препятствий, то дальше по списку он препятствий не идет.
                */
        for (int i = 0; i < members.length; i++) {
            for (int j = 0; j < bariers.length; j++) {
                if(!members[i].dO2(bariers[j]))
                {
                 break;
                }
            }
            System.out.println();
        }

    }


}
