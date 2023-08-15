package Dz_2607.task3;

public class School<T> {
    T arrayLenght;

    public School(T arrayLenght) {
        this.arrayLenght = arrayLenght;
    }

    public void addArray () {
      T [] array =  (T[])new Object[(int) arrayLenght];
        System.out.println(array.length);


    }
}