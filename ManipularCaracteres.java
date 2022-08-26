public class ManipularCaracteres {
    ManipularCaracteres(String numero){
        Caracteres num = new Caracteres();
        num.setNumero(numero);
        int tamanho = Integer.parseInt(num.getNumero());
        int milhar = (int) tamanho/1000;
        int centena = (int) tamanho/100 - milhar * 10;
        int dezena = tamanho/10 - milhar * 100 - centena * 10;
        int unidade = tamanho - (milhar * 1000) - (centena * 100) - (dezena * 10);
        for(int x = 0;x <tamanho ; x++){
            if(x == 0){
                if (milhar > 0){
                    System.out.println(milhar + " - milhar");
                }
            }else if(x == 1){
                if (centena > 0){
                    System.out.println(centena + " - centena");
                }
            }
            else if(x == 2){

                if (dezena > 0){
                    System.out.println(dezena + " - dezena");
                }
            }
            else if(x == 3){
                
                if (unidade > 0){
                    System.out.println(unidade + " - unidade");
                }
            }
        }

    }
}
