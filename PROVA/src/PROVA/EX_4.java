package PROVA;

import java.util.ArrayList;

public class EX_4 {
    public static void main(String[] args) {
        int[] array1, array2;  // 'array' de 5 posicions amb valors aleatoris entre 0 i 9
        ArrayList<Integer> resultat;  // 'arraylist' resultant
        
        // Genera un array de 10 posicions amb números aleatoris entre 0 i 9
        array1 = UtilExamen.generaArray(5, 0, 9);
        array2 = UtilExamen.generaArray(5, 0, 9);
        // Calcula l''ArrayList' emprant el mètode 'obteRepetitsOrdenat'
        //   NOTA: el mètode 'obteRepetitsOrdenat' pot servir-se dels mètodes anteriors:
        //         'obteRepetits' -> 'arrayListToArray' -> 'ordenaArray'
        resultat = UtilExamen.obteRepetitsOrdenat(array1, array2);
        
        // Mostra l''ArrayList' resultant
        UtilExamen.mostraArray(array1);
        UtilExamen.mostraArray(array2);
        UtilExamen.mostraArrayListInt(resultat);
    }
}

