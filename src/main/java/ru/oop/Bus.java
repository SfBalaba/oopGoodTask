package ru.oop;

/**
 * Класс автобуса, который также как и любой вид
 * транспорта может переместить человека в заданную точку
 */
public class Bus extends Transport{
    /**
     * @return текущее местоположение автобуса
     */
    @Override
    public Position getPosition() {
        return super.getPosition();
    }

    /**
     * перемещает человека в ближайшую точку к точке назначения, в которой может остановитсья
     * @param person человек
     * @param destination точка назначения
     */
    @Override
    public void go(Person person, Position destination) {
        super.go(person, destination);
    }
}
