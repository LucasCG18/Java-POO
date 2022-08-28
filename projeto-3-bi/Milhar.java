public class Milhar {
    Milhar(Caracteres numero){
        String[] escrita = new String[]{"um mil", "dois mil", "tres mil", "quatro mil", "cinco mil", "seis mil", "sete mil", "oito mil", "nove mil"};
        int milhar = (int) numero.getNumero()/1000;
        int centena = (int) numero.getNumero()/100 - milhar * 10;
        int dezena = numero.getNumero()/10 - milhar * 100 - centena * 10;
        int unidade = numero.getNumero() - (milhar * 1000) - (centena * 100) - (dezena * 10);
        numero.setMilhar(milhar);
        numero.setCentena(centena);
        numero.setDezena(dezena);
        numero.setUnidade(unidade);
        numero.setnumero_extenso("");
        setar(numero, escrita, milhar);
    }
    public void setar(Caracteres numero, String[] escrita, int unidade_atual){
        for (int i = 0; i <= unidade_atual; i++) {
            if (unidade_atual == i && unidade_atual != 0) {
                numero.setnumero_extenso(numero.getnumero_extenso() + escrita[i - 1]);
            }else if (unidade_atual == 0 && numero.getNumero() == 0) {
                numero.setnumero_extenso("zero");
            }else if (unidade_atual == 0) {
                numero.setnumero_extenso(numero.getnumero_extenso());
            }
        }
    }
}
