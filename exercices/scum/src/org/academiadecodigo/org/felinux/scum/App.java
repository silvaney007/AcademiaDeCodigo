package org.academiadecodigo.org.felinux.scum;

import org.academiadecodigo.org.felinux.scum.operation.BiOperation;
import org.academiadecodigo.org.felinux.scum.operation.MonoOperation;

public class App {
    public static void main(String[] args) {

        BiOperation<Integer, Integer> sum = (val1, val2) -> val1 + val2;
        BiOperation<String, String> myInfo = (name, city) -> "My name is " +
                name + " ,living in " + city;

        MonoOperation<Integer> myAge = age -> age;
        MonoOperation<String> myColor = String::toUpperCase;

        Scum<String, String> scumString = new Scum<>();
        Scum<Integer, Integer> scumInt = new Scum<>();

        System.out.println(scumString.performing("Diney", "Aveiro", myInfo));
        System.out.println(scumString.performing("Green", myColor));
        System.out.println("My age is " + scumInt.performing(32, myAge));
        scumInt.performing(10, 12, sum);

        BiOperation<Integer, Integer> factorial = new BiOperation<>(){
            @Override
            public Integer biOperation(Integer arg1, Integer arg2) {
                return arg1 == 0 ? arg2 : biOperation(arg1 - 1, arg1 * arg2);
            }
        };

        System.out.println("Factorial de 5 é: " + scumInt.performing(5, 1, factorial));
    }
}
