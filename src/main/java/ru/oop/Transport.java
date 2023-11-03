package ru.oop;

/**
 * интерфейс транспорта
 * транспорт может переместить человека в точку назначения
 * нельзя создать экземпляр абстрактного транспорта
 */
public interface Transport extends Positioned {

    /**
     * {@inheritDoc}
     */
    Position getPosition();

    /**
     * перемещает человека в ближайшее к точке назначения место остановки
     * @param person человек
     * @param destination место назначения
     */
    public void go(Person person, Position destination);
}
