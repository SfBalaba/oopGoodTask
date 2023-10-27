package ru.oop;

/**
 * <p>класс транспорта, который перемещает человека</p>
 * <p>в точку назначения</p>
 * <p>или ближайщую точку к месту назначения,</p>
 * <p>где может остановиться данный транспорт</p>
 */
public abstract class Transport implements Positioned{
    @Override
    public Position getPosition() {
        return null;
    }

    public void go(Person person, Position destination) {
    }
}
