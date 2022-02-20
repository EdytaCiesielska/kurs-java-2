package devopsi;

public class Main {

    public static void main(String[] args) {
        /*
        Stwórz funkcje static pod funkcja main, która będzie pobierać tablice typu double
        i zwraca zmodyfikowaną tablice bezwzględną (tzn wszystkie jej elementy powinny być dodanie jeśli były wcześniej ujemne)
        */

        System.out.println("-------- ZADANIE 5 ------------");
        double[] inTable = {2.5,-3,12,-88.6};
        double[] outTable = absoluteValue(inTable);

        for (int a = 0; a <outTable.length; a++){
            System.out.println(outTable[a]);
        }

         /*
         Stwórz funkcje static pod funkcja main, która będzie pobierać imię (String) i zwracać typ enum MEN, WOMEN
         w zależności od tego czy imię jest męskie czy nie.
          */

        System.out.println("-------- ZADANIE 6 ------------");
        checkGender("JANUSZ");
    }

    public static double[] absoluteValue(double[] inputTable){

        for (int i = 0; i < inputTable.length; i++) {
            inputTable[i] = Math.abs(inputTable[i]);
        }
        return inputTable;
    }

    public static void checkGender(String firstName){

        if (firstName.endsWith("A") || firstName.endsWith("a"))
            System.out.println(gender.WOMAN);
        else System.out.println(gender.MEN);
    }
}
