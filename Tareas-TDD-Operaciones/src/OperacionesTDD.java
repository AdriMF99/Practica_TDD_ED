public class OperacionesTDD {

    public int suma (String num){
        int j = 0;
        String finalComa = "";
        String[] subcadenas = num.split(",");
        int sumatorio = 0;
        int numNegativo = 0;

        while (j < num.length()) {
            finalComa = num.substring(j);
            j++;
        }
        if (finalComa.equalsIgnoreCase(",")){
            return -1;
        } else if (!num.isEmpty()){
            for (int i = 0; i < subcadenas.length; i++) {
                sumatorio += Integer.parseInt(subcadenas[i]);
                numNegativo = Integer.parseInt(subcadenas[i]);
                if (numNegativo < 0){
                    System.out.println("Número negativo no permitido.");
                    return -1;
                }
            }
            return sumatorio;
        } else {
            return 0;
        }
    }

}
