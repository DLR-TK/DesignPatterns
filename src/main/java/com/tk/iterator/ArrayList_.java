package com.tk.iterator;

/**
 * 相比数组，这个容器不用考虑边界问题，可以动态扩展
 */
public class ArrayList_<E> implements Collention_<E>{
    E[] objects = (E[]) new Object[10];

    private int index = 0;

    @Override
    public void add(E o) {
        if (index == objects.length) {
            E[] newObjects = (E[])new Object[objects.length * 2];
            System.arraycopy(objects, 0, newObjects, 0, objects.length);
            objects = newObjects;
        }

        objects[index] = o;
        index++;
    }

    @Override
    public int size() {
        return index;
    }

    @Override
    public Iterator_<E> iterator() {
        return new ArrayListIterator();
    }

    /**
     * 实现迭代功能
     * @param <E>
     */
    private class ArrayListIterator<E> implements Iterator_<E> {

        private int currentIndex = 0;

        @Override
        public boolean hasNext() {
            if (currentIndex >= index) {
                return false;
            }
            return true;
        }

        @Override
        public E next() {
            E o = (E)objects[currentIndex];
            currentIndex++;
            return o;
        }
    }
}
