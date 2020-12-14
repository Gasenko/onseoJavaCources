/*
Реализовать метод fight                                                  
                                               
                                                  
public class Cat {                                                  
    public int age;                                                  
    public int weight;                                                  
    public int strength;                                                  
                                                  
    public Cat() {                                                  
    }                                                  
                                                  
    public boolean fight(Cat anotherCat) {                                                  
        //напишите тут ваш код
                   int ageScore = Integer.compare(this.age, anotherCat.age);
                int weightScore = Integer.compare(this.weight, anotherCat.weight);
                int strengthScore = Integer.compare(this.strength, anotherCat.strength);

                int score = ageScore + weightScore + strengthScore;
                return score > 0; // return score > 0 ? true : false;                                               
    }                                                  
                                                  
    public static void main(String[] args) {                                                  
                                                  
    }                                                  
}                            


Реализуй метод boolean fight(Cat anotherCat):
продумай механизм драки котов в зависимости от их веса, возраста и силы.
Сравни каждый критерий по отдельности, чтобы победителем был тот, у кого были лучшие показатели по большинству критериев.
Метод должен определять, выиграли ли мы (this) бой или нет, т.е. возвращать true, если выиграли и false - если проиграли.
Если ничья и никто не выиграл, возвращаем false.
Требования:
- класс Cat должен содержать конструктор без параметров;
- класс Cat должен содержать всего три поля: age, weight, strength.Поля должны быть публичными.
- в классе Cat должен быть метод fight.
- в методе fight реализовать механизм драки котов в зависимости от их веса, возвраста и силы согласно условию.
- метод должен возвращать одно и тоже значение, если мы деремся с одним и тем же котом.
- если некий кот1 выигрывает у кота кот2, то кот2 должен проигровать коту кот1.
*/
