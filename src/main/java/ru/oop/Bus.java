package ru.oop;

/**
 * Класс автобуса, который также как и любой вид
 * транспорта может переместить человека в заданную точку
 */
public class Bus implements Transport{
    /**
     * номер автобуса
     */
    private String number;
    /**
     * человек, который поедет в автобусе
     * человек внутри автобуса
     */
    private Person person;
    public Bus(String number, Person person) {
        this.number = number;
        this.person = person;
    }

    /**
        * @return текушую позицию автобуса
     */
    @Override
    public Position getPosition() {
        return null;
    }

    /**
     * преемещается вместе с человеком в пункт назначения
     * @param person      человек
     * @param destination место назначения
     */
    @Override
    public void go(Person person, Position destination) {

    }

}
