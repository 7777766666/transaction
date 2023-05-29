package com.example.transaction.database.entity.test;

public class A implements Cloneable {

    int x;
    int y;

    @Override
    public Object clone() throws CloneNotSupportedException {
        // Поверхностная копия объекта
        A cloned = (A) super.clone();

        // Дополнительные действия для получения глубокой копии
        // ...

        return cloned;
    }

}
