package PROVA;

import java.util.ArrayList;

public class UtilExamen {
    //Utilitats generals 
    //Genera un array aleatori

    public static int[] generaArray(int longitud, int minim, int maxim) {
        int[] array = new int[longitud];

        for (int i = 0; i < array.length; i++) {
            array[i] = minim + (int) (Math.random() * (maxim - minim + 1));
        }
        return array;
    }

    //Mostra un array
    public static void mostraArray(int[] array) {
        String separador = "";
        System.out.print('[');

        for (int i = 0; i < array.length; i++) {
            System.out.print(separador + array[i]);
            separador = ", ";
        }
        System.out.println(']');

    }

    //Elimina els repetits dins un array 
    public static ArrayList<Integer> mostrarDiferents(int[] array) {
        ArrayList<Integer> resultat = new ArrayList<>();

        for (Integer num : array) {
            if (!resultat.contains(num)) // si 'num' no es troba en 'resultat', s'afegeix
            {
                resultat.add(num);
            }
        }
        return resultat;
    }

//  EXERCICI 1
//  Apartat A 
//  Metode per passar ArrayList a array
    public static int[] ArrayListToArray(ArrayList<Integer> arrayL) {
        int[] resultat = new int[arrayL.size()];

        for (int i = 0; i < arrayL.size(); i++) {
            resultat[i] = arrayL.get(i);
        }

        return resultat;
    }

//  Apartat B
//  Metode per passar un array a ArrayList <Integer>
    public static ArrayList<Integer> arrayToArrayListInt(int[] array) {
        ArrayList<Integer> arrayList = new ArrayList<>();

        for (int a : array) {
            arrayList.add(a);
        }

        return arrayList;
    }

//  Apartat C
//  Metode per mostrar un ArrayList <Integer>
    public static void mostrarArrayListInt(ArrayList<Integer> array) {
        System.out.print("[ ");
        for (Integer a : array) {
            System.out.print(a + " ");
        }
        System.out.println("]");
    }

//  EXERCICI 2
// Obte els nombres repetits dins 2 arrays de int    
    public static ArrayList<Integer> obteRepetits(int[] array1, int[] array2) {
        ArrayList<Integer> repetit = new ArrayList<>();

        ArrayList<Integer> arrayL1 = mostrarDiferents(array1);
        ArrayList<Integer> arrayL2 = mostrarDiferents(array2);
        for (int i = 0; i < arrayL1.size(); i++) {
            for (int j = 0; j < arrayL2.size(); j++) {
                if (arrayL1.get(i) == arrayL2.get(j)) {
                    repetit.add(arrayL1.get(i));
                }
            }
        }
        return repetit;
    }

//  EXERCICI 3
//  Ordena un array i el torna com arraylist
    public static ArrayList<Integer> ordenaArray(int[] array) {
        ArrayList<Integer> ordenat = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            boolean smaller = false;
            for (int j = 0; j < ordenat.size(); j++) {
                if (array[i] < ordenat.get(j)) {
                    ordenat.add(j, array[i]);
                    smaller = true;
                    break;
                }

            }
            if (!smaller) {
                ordenat.add(array[i]);
            }
        }
        return ordenat;
    }

//  EXERCICI 4
//  Torna un ArrayList <Integer> dels int repetits dins 2 arrays ordenats
    public static ArrayList<Integer> obteRepetitsOrdenat(int[] array1, int[] array2) {
        return (ordenaArray(ArrayListToArray(obteRepetits(array1, array2))));
    }
}
