package ru.oop;

/**
 * интерфейс транспорта
 * транспорт может переместить человека в точку назначения
 * нельзя создать экземпляр абстрактного транспорта
 */
public interface Transport extends Positioned {

    Position getPosition();

    void go(Person person, Position destination);
}
