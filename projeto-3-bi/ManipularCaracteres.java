public class ManipularCaracteres {
    ManipularCaracteres(Caracteres numero){
        if (numero.getNumero() != 0 && numero.getNumero() != 1) {
            numero.setnumero_extenso(numero.getnumero_extenso().substring(0,1).toUpperCase() + numero.getnumero_extenso().substring(1, numero.getnumero_extenso().length()));
        }else{
            numero.setnumero_extenso(numero.getnumero_extenso().substring(0,1).toUpperCase() + numero.getnumero_extenso().substring(1, numero.getnumero_extenso().length()));
        }
    }
}
