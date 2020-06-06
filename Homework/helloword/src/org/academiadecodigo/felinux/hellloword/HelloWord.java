package org.academiadecodigo.felinux.hellloword;

public class HelloWord {
    public static void main(String[] args) {
        String[] oquetuquiseres = {"João", "Carolina", "David", "Joana", "Gonçalo", "Ines", "Pedro", "Maria", "Tiago", "Clauia"};
        String [] name = names(oquetuquiseres);
        System.out.println("Boys Names: " + name[0]);
        System.out.println("Girls Names: " + name[1]);
        reverseNames(name);
        removeNames(name);

    }

    private static String [] names(String[] arrayNomes) {
        String[] result = {"", ""};
        for (int i = 0; i < arrayNomes.length; i++) {
            if (i % 2 == 0) {
                result[0] += arrayNomes[i] + " ";
            } else {
                result[1] += arrayNomes[i] + " ";
            }
        }
        return result;
    }


    private static void reverseNames(String[] arrayNomes) {
        String[] result = {"",""};
        int j=0;
        while(j<arrayNomes.length){
           String[] values = arrayNomes[j].split(" ");
            for (int i = 0 ;i < values.length-1; i++){
                result[j]+=values[i] + " ";
            }
            j++;
        }
        System.out.println("Boys Names: " + result[0]);
        System.out.println("Girls Names: " + result[1]);
    }


    private static void removeNames(String[] arrayNomes) {
        String result = "";
        int j=0;
        while(j<arrayNomes.length) {
            String[] value = arrayNomes[j].split(" ");
            for (int i = 0; i < value.length - 1; i++) {
                if (value[i].charAt(0) < value[i + 1].charAt(0)) {
                    result = value[i];
                }
            }
            System.out.println(result);
            j++;
        }
    }
}