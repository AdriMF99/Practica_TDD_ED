public class OperacionesTDD {

    public int suma (String num){
        if (!num.isEmpty()){
            String[] subcadenas = num.split(",");
            int sumatorio = 0;
            for (int i = 0; i < subcadenas.length; i++) {
                sumatorio += Integer.parseInt(subcadenas[i]);
            }
            return sumatorio;
        } else {
            return 0;
        }
    }

}
