package ciklusok;

public class szamok {

    public static void main(String[] args) {
        System.out.println("ismétlés vagy ismétlés nélkül ?");
        String[] lista= new String[27];
        String[] lista2= new String[27];
        for (int z = 2; z < 5; z++) {
            for (int j = 2; j < 4; j++) {
                for (int i = 2; i < 5; i++) {
                    System.out.println(z + "" + j + "" + i);
                    for (int k = 0; k < 27; k++) {
                        lista[k]=z + "" + j + "" + i;
                    }
                    
                }
            }

        }
        for (int i = 0; i < lista.length; i++) {
            if (lista[i].charAt(0)==lista[i].charAt(1) )
            
        }

    }

}
