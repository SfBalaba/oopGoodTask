package ru.oop;

/**
 * класс машины
 */
public class Car extends Transport{
    /**
     * @return текушую позицию машины
     */
    @Override
    public Position getPosition() {
        return super.getPosition();
    }

    @Override
    public void go(Person person, Position destination) {
        super.go(person, destination);
    }
}
