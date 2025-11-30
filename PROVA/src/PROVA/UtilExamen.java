package PROVA;

import java.util.ArrayList;

public class UtilExamen {
    //---------------------------------------------
    // Ejercicio 1
    //---------------------------------------------
    public static int[] arrayListToArray(ArrayList<Integer> arrayL) {
        int[] resultat = new int[arrayL.size()];
        
        for (int i = 0; i < arrayL.size(); i++) {
            resultat[i] = arrayL.get(i);
        }
        
        return resultat;
    }
    
    public static ArrayList<Integer> arrayToArrayList(int[] array) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        
        for (int a : array) {
            arrayList.add(a);
        }
        
        return arrayList;
    }
    
    public static void mostraArrayListInt(ArrayList<Integer> array){
        System.out.print("[ ");
        
        for (Integer a : array) {
            System.out.print(a + " ");
        }
        
        System.out.println("]");
    }
    
    //---------------------------------------------
    // Ejercicio 2
    //---------------------------------------------
    public static ArrayList<Integer> obteRepetits(int[] array1, int[] array2) {
        ArrayList<Integer> repetido = new ArrayList<>();
        
        for (int i = 0; i < array1.length; i++){
            for (int j = 0; j < array2.length; j++){
                if (array1[i] == array2[j]) {
                    repetido.add(array1[i]);
                    break;
                }
            }
        }
        return repetido;
    }
    
    //---------------------------------------------
    // Ejercicio 3
    //---------------------------------------------
    public static ArrayList<Integer> ordenaArray(int[] array) {
        ArrayList<Integer> resultat = new ArrayList<>();
        
        resultat.add(array[0]);  // CORRECCIÓ: cuidado, un array vacio no se podria ordenar
        for (int i=1; i<array.length; i++) {
            boolean trobat = false;
            for (int j=0; j<resultat.size(); j++) {
                if (array[i] < resultat.get(j))  {
                    resultat.add(j, array[i]);  // afegir en la posició 'j' de 'resultat'
                    trobat = true;
                    break;
                }
            }
            if (!trobat) {
                resultat.add(array[i]);  // afegir al final de 'resultat'
            }
        }
        return resultat;
    }
    
    //---------------------------------------------
    // Ejercicio 4
    //---------------------------------------------
    public static ArrayList<Integer> obteRepetitsOrdenat(int[] array1, int[] array2) {
        ArrayList<Integer> resultado = new ArrayList<>();
        ArrayList<Integer> repetido = new ArrayList<>();
        
        //Obtener los repetidos de ambos arrays
        for (int i = 0; i < array1.length; i++){
            for (int j = 0; j < array2.length; j++){
                if (array1[i] == array2[j]) {
                    repetido.add(array1[i]);
                    break;
                }
            }
        }
        
        //Transformar el arrayList a array
        int[] repetidoA = new int[repetido.size()];
        
        for (int i = 0; i < repetido.size(); i++) {
            repetidoA[i] = repetido.get(i);
        }
        
        //Ordenar el array
        for (int i=0; i<repetidoA.length; i++) {
            boolean trobat = false;
            for (int j=0; j<resultado.size(); j++) {
                if (repetidoA[i] < resultado.get(j))  {
                    resultado.add(j, repetidoA[i]);  // afegir en la posició 'j' de 'resultat'
                    trobat = true;
                    break;
                }
            }
            if (!trobat) {
                resultado.add(repetidoA[i]);  // afegir al final de 'resultat'
            }
        }
        return resultado;
    }
    
    
    //---------------------------------------------
    //  Metodos que no son parte del examen
    //---------------------------------------------
    public static int[] generaArray(int longitud, int minim, int maxim) {
        int[] array = new int[longitud];
        
        for (int i = 0; i < array.length; i++) {
            array[i] = minim + (int) (Math.random() * (maxim - minim + 1));
        }
        return array;
    }
    
    public static void mostraArray(int[] array) {
        String separador = "";
        System.out.print('[');
        for (int i = 0; i < array.length; i++) {
            System.out.print(separador + array[i]);
            separador = ", ";
        }
        System.out.println(']');
    }
}
