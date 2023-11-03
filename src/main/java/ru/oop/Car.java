package ru.oop;

/**
 * класс машины
 */
public class Car implements Transport{
    private Person person;
    public Car(Person person) {
        this.person = person;
    }

    /**
     * @return текушую позицию машины
     */
    @Override
    public Position getPosition() {
        return null;
    }

    /**
     * машина перемещает человека
     * имеется ввиду, что координаты человека тоже изменяются
     * @param person      человек
     * @param destination место назначения
     */
    @Override
    public void go(Person person, Position destination) {

    }
}
