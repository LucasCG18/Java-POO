public class Unidade extends Dezena {
    Unidade(Caracteres numero) {
        super(numero);
        if (numero.getDezena() != 0 && numero.getDezena() !=1 && numero.getUnidade() != 0) {
            numero.setnumero_extenso(numero.getnumero_extenso() + " e ");
        }
        if (numero.getDezena() != 1 && numero.getNumero() != 0){
            String[] escrita = new String[]{"","um", "dois", "tres", "quatro", "cinco", "seis", "sete", "oito", "nove"};
            setar(numero, escrita[numero.getUnidade()]);
        }else if (numero.getNumero() == 0) {
            String escrita = "zero";
            setar(numero, escrita);
        }
        
    }
}
