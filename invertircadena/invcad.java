public class invcad {
    private static String cadinv(String cadena, int indice){
        String inversa;
        if(indice==0){
            inversa=String.valueOf(cadena.charAt(indice));
        }else {
            inversa=String.valueOf(cadena.charAt(indice))+cadinv(cadena,indice-1);
        }
        return inversa;
    }
        public static String cadinv(String cadena){
        return cadinv(cadena,cadena.length()-1);
        }

}
