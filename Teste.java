package Semestre1;
public class Teste{
    public static void main(String[] args){
        Caneta c1 = new Caneta();
        c1.cor = "Azul";
        c1.ponta = 0.5f;
        c1.tampada = true;
        c1.carga = 100;
        c1.modelo = "Esferografica";
        c1.status();
    }
}
