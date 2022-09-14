public class Unidade extends Dezena {
    Unidade(Caracteres caracteres, Numero numero) {
        super(caracteres, numero);
        if (numero.getDezena() != 0 && numero.getDezena() !=1 && numero.getUnidade() != 0) {
            caracteres.setnumero_extenso(caracteres.getnumero_extenso() + " e ");
        }
        if (numero.getDezena() != 1 && numero.getNumero() != 0){
            String[] escrita = new String[]{"","um", "dois", "tres", "quatro", "cinco", "seis", "sete", "oito", "nove"};
            setar(caracteres, escrita[numero.getUnidade()]);
        }else if (numero.getNumero() == 0) {
            String escrita = "zero";
            setar(caracteres, escrita);
        }
        
    }
}
