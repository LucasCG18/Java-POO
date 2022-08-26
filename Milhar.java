public class Milhar {
    Milhar(Caracteres numero){
        int milhar = (int) numero.getNumero()/1000;
        int centena = (int) numero.getNumero()/100 - milhar * 10;
        int dezena = numero.getNumero()/10 - milhar * 100 - centena * 10;
        int unidade = numero.getNumero() - (milhar * 1000) - (centena * 100) - (dezena * 10);
        numero.setMilhar(milhar);
        numero.setCentena(centena);
        numero.setDezena(dezena);
        numero.setUnidade(unidade);
        setar(numero, "mil", milhar);
    }

    public void setar(Caracteres numero, String escrita, int unidade_atual){
        if (unidade_atual == 1){
            numero.setnumero_extenso(numero.getnumero_extenso() + "um " + escrita);
        }else if (unidade_atual == 2) {
            numero.setnumero_extenso(numero.getnumero_extenso() + "dois " + escrita);
        }else if (unidade_atual == 3) {
            numero.setnumero_extenso(numero.getnumero_extenso() + "tres " + escrita);
        }else if (unidade_atual == 4) {
            numero.setnumero_extenso(numero.getnumero_extenso() + "quatro " + escrita);
        }else if (unidade_atual == 5) {
            numero.setnumero_extenso(numero.getnumero_extenso() + "cinco " + escrita);
        }else if (unidade_atual == 6) {
            numero.setnumero_extenso(numero.getnumero_extenso() + "seis " + escrita);
        }else if (unidade_atual == 7) {
            numero.setnumero_extenso(numero.getnumero_extenso() + "sete " + escrita);
        }else if (unidade_atual == 8) {
            numero.setnumero_extenso(numero.getnumero_extenso() + "oito " + escrita);
        }else if (unidade_atual == 9) {
            numero.setnumero_extenso(numero.getnumero_extenso() + "nove " + escrita);
        }
    }
    public void setar(Caracteres numero, String[] escrita, int unidade_atual){
        if (unidade_atual == 1){
            numero.setnumero_extenso(numero.getnumero_extenso() + " " + escrita[unidade_atual-1]);
        }else if (unidade_atual == 2) {
            numero.setnumero_extenso(numero.getnumero_extenso() +  " " + escrita[unidade_atual-1]);
        }else if (unidade_atual == 3) {
            numero.setnumero_extenso(numero.getnumero_extenso() +  " " + escrita[unidade_atual-1]);
        }else if (unidade_atual == 4) {
            numero.setnumero_extenso(numero.getnumero_extenso() + " " + escrita[unidade_atual-1]);
        }else if (unidade_atual == 5) {
            numero.setnumero_extenso(numero.getnumero_extenso() + " " + escrita[unidade_atual-1]);
        }else if (unidade_atual == 6) {
            numero.setnumero_extenso(numero.getnumero_extenso() +  " " + escrita[unidade_atual-1]);
        }else if (unidade_atual == 7) {
            numero.setnumero_extenso(numero.getnumero_extenso() +  " " + escrita[unidade_atual-1]);
        }else if (unidade_atual == 8) {
            numero.setnumero_extenso(numero.getnumero_extenso() +  " " + escrita[unidade_atual-1]);
        }else if (unidade_atual == 9) {
            numero.setnumero_extenso(numero.getnumero_extenso() +  " " + escrita[unidade_atual-1]);
        }

    }
}
