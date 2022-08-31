public class Centena extends Milhar {
    Centena(Caracteres numero){
        super(numero);
        if (numero.getMilhar() != 0 && (numero.getDezena() !=0 || numero.getUnidade() != 0 || numero.getCentena() != 0)) {
            numero.setnumero_extenso(numero.getnumero_extenso() + " e ");
        }
        if (numero.getCentena() == 1 && numero.getDezena() == 0 && numero.getUnidade() == 0){
            numero.setnumero_extenso(numero.getnumero_extenso() + "cem");
        }else{
            String[] escrita = new String[]{"","cento", "duzentos", "trezentos", "quatrocentos", "quinhentos", "seiscentos", "setecentos", "oitocentos", "novecentos"};
            setar(numero, escrita[numero.getCentena()]);
        }
        
    }
}
