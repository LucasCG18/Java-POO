public class Dezena extends Centena{
    Dezena(Caracteres numero){
        super(numero);
        if (numero.getCentena() != 0 && numero.getDezena() !=0 || numero.getUnidade() != 0 && numero.getNumero() > 100) {
            numero.setnumero_extenso(numero.getnumero_extenso() + "e ");
        }
        if (numero.getDezena() == 1 && numero.getUnidade() == 0){
            numero.setnumero_extenso(numero.getnumero_extenso() + "dez");
        }else if (numero.getDezena() == 1 && numero.getUnidade() != 0){
            String[] escrita = new String[]{"onze", "doze", "treze", "quatorse ", "quinze ", "dezesseis ", "dezesete ", "dezoito ", "dezenove "};
            setar(numero, escrita, numero.getDezena());
        }else{
            String[] escrita = new String[]{"dez", "vinte e ", "trinta e ", "quarenta e ", "cinquenta e ", "sessenta e ", "setenta e ", "oitenta e ", "noventa e "};
            setar(numero, escrita, numero.getDezena());
        }
    }
    
}

