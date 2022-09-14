public class Dezena extends Centena{
    Dezena(Caracteres numero){
        super(numero);
        if ((numero.getMilhar() != 0||numero.getCentena() != 0) && (numero.getDezena() !=0 || numero.getUnidade() != 0)) {
            numero.setnumero_extenso(numero.getnumero_extenso() + " e ");
        }
        if (numero.getDezena() == 1 && numero.getUnidade() != 0){
            String[] escrita = new String[]{"","onze", "doze", "treze", "quatorse ", "quinze ", "dezesseis ", "dezesete ", "dezoito ", "dezenove "};
            setar(numero, escrita[numero.getUnidade()]);
        }else{
            String[] escrita = new String[]{"","dez", "vinte", "trinta", "quarenta", "cinquenta", "sessenta", "setenta", "oitenta", "noventa"};
            setar(numero, escrita[numero.getDezena()]);
        }
    }
    
}

