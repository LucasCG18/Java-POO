public class Dezena extends Centena{
    Dezena(Caracteres numero){
        super(numero);
        if (numero.getDezena() == 1 && numero.getUnidade() == 0){
            numero.setnumero_extenso(numero.getnumero_extenso() + "dez");
        }else if (numero.getDezena() == 1 && numero.getUnidade() != 0){
            if (numero.getDezena() == 1 && numero.getUnidade() == 0){
                numero.setnumero_extenso(numero.getnumero_extenso() + "dez");
            }else if (numero.getDezena() == 1 && numero.getUnidade() != 0){
                if (numero.getUnidade() == 1){
                    numero.setnumero_extenso(numero.getnumero_extenso() + "onze");
                }else if (numero.getUnidade() == 2) {
                    numero.setnumero_extenso(numero.getnumero_extenso() + "doze");
                }else if (numero.getUnidade() == 3) {
                    numero.setnumero_extenso(numero.getnumero_extenso() + "treze");
                }else if (numero.getUnidade() == 4) {
                    numero.setnumero_extenso(numero.getnumero_extenso() + "quatorse");
                }else if (numero.getUnidade() == 5) {
                    numero.setnumero_extenso(numero.getnumero_extenso() + "quinze");
                }else if (numero.getUnidade() == 6) {
                    numero.setnumero_extenso(numero.getnumero_extenso() + "dezesseis");
                }else if (numero.getUnidade() == 7) {
                    numero.setnumero_extenso(numero.getnumero_extenso() + "dezesete");
                }else if (numero.getUnidade() == 8) {
                    numero.setnumero_extenso(numero.getnumero_extenso() + "dezoito");
                }else if (numero.getUnidade() == 9) {
                    numero.setnumero_extenso(numero.getnumero_extenso() + "dezenove");
                }
            }else{
                String[] escrita = new String[]{"dez", "vinte", "trinta", "quarenta", "cinquenta", "sessenta", "setenta", "oitenta", "noventa"};
                setar(numero, escrita, numero.getDezena());
            }
        }else{
            String[] escrita = new String[]{"dez", "vinte", "trinta", "quarenta", "cinquenta", "sessenta", "setenta", "oitenta", "noventa"};
            setar(numero, escrita, numero.getDezena());
        }
    }
    
}
