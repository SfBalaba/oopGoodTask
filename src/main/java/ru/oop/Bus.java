package ru.oop;

/**
 * Класс автобуса, который также как и любой вид
 * транспорта может переместить человека в заданную точку
 */
public class Bus implements Transport{
    private String number;
    private Person person;
    public Bus(String number, Person person) {
        this.number = number;
        this.person = person;
    }

    /**
     * @return текущее местоположение автобуса
     */
    @Override
    public Position getPosition() {
        return null;
    }

    /**
     * перемещает человека в ближайшую точку к точке назначения, в которой может остановитсья
     * @param person человек
     * @param destination точка назначения
     */
    @Override
    public void go(Person person, Position destination) {

    }
}
