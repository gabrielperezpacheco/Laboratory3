package domain;

public interface VectorList {

    default int size() // devuelve el número de elementos en el vector
    {
        return 0;
    }

    default void clear() //remueve todos los elementos del vector
    {

    }

    default boolean isEmpty() // true si el vector está vacío
    {
        return false;
    }

    default boolean contains(Object element) //true si el elemento existe
    {
        return false;
    }

    default void add(Object element) // inserta un elemento al final
    {

    }

   default void add(int index, Object element) //inserta un elemento en la posición indicada
    {

    }

    default boolean remove(Object element) //true si el elemento es suprimido
    {
        return false;
    }

    default Object remove(int index) //suprime y retorna el elemento
    {
        return null;
    }

    default void sort() //ordena el vector
    {

    }

    default int indexOf(Object element) //devuelve la posición del elemento (primera ocurrencia)
    {
        return 0;
    }

     default Object get(int index) //devuelve el elemento en la posición indicada
    {
        return null;
    }
}
