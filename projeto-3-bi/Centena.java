public class Centena extends Milhar {
    Centena(Caracteres caracteres, Numero numero){
        super(caracteres, numero);
        if (numero.getMilhar() != 0 && (numero.getDezena() !=0 || numero.getUnidade() != 0 || numero.getCentena() != 0) && (numero.getDezena() ==0 && numero.getUnidade() == 0)) {
            caracteres.setnumero_extenso(caracteres.getnumero_extenso() + " e ");
        }else if (numero.getMilhar() != 0 && numero.getCentena() != 0) {
            caracteres.setnumero_extenso(caracteres.getnumero_extenso() + " ");
        }
        if (numero.getCentena() == 1 && numero.getDezena() == 0 && numero.getUnidade() == 0){
            caracteres.setnumero_extenso(caracteres.getnumero_extenso() + "cem");
        }else{
            String[] escrita = new String[]{"","cento", "duzentos", "trezentos", "quatrocentos", "quinhentos", "seiscentos", "setecentos", "oitocentos", "novecentos"};
            setar(caracteres, escrita[numero.getCentena()]);
        }
        
    }
}
