import java.util.*;
public class NumeroExtenso {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Caracteres numero = new Caracteres();
        numero.setNumero(Integer.parseInt(in.nextLine()));
        Unidade num = new Unidade(numero);
        ManipularCaracteres manipularCaracteres = new ManipularCaracteres(numero);
        System.out.println(numero.getnumero_extenso());
    }
}
