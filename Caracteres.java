/**
 * Caracteres
 */
public class Caracteres {

    private int numero;
    private String numero_extenso;
    private int milhar;
    private int centena;
    private int dezena;
    private int unidade;


    public void setnumero_extenso(String numero_extenso) {
        this.numero_extenso = numero_extenso;
    }
    public String getnumero_extenso() {
        return numero_extenso;
    }
    public void setNumero(int numero) {
        this.numero = numero;
    }
    public int getNumero() {
        return numero;
    }
    public void setMilhar(int milhar) {
        this.milhar = milhar;
    }
    public int getMilhar() {
        return milhar;
    }
    public void setCentena(int centena) {
        this.centena = centena;
    }
    public int getCentena() {
        return centena;
    }
    public void setDezena(int dezena) {
        this.dezena = dezena;
    }
    public int getDezena() {
        return dezena;
    }
    public void setUnidade(int unidade) {
        this.unidade = unidade;
    }
    public int getUnidade() {
        return unidade;
    }
}