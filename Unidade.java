public class Unidade extends Dezena {
    Unidade(Caracteres numero) {
        super(numero);
        if (numero.getUnidade() != 1){
            String[] escrita = new String[]{"e um", "e dois", "e tres", "e quatro", "e cinco", "e seis", "e sete", "e oito", "e nove"};
            setar(numero, escrita, numero.getUnidade());
        }
    }
}
