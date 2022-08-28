public class Unidade extends Dezena {
    Unidade(Caracteres numero) {
        super(numero);
        if (numero.getDezena() != 1){
            String[] escrita = new String[]{"um", "dois", "tres", "quatro", "cinco", "seis", "sete", "oito", "nove"};
            setar(numero, escrita, numero.getUnidade());
        }
    }
}
