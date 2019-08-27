import java.util.Scanner;
public class Pincipal {
    public static void main(String []args){
        Scanner ler = new Scanner(System.in);
        telefone t = new telefone();
        double bateria = ler.nextDouble();
        t.setBateria(bateria);
        String cor = ler.next();
        t.setCor(cor);
        String marca = ler.next();
        t.setMarca(marca);
        String modelo = ler.next();
        t.setModelo(modelo);
        double tamanho = ler.nextDouble();
        t.setTamanho(tamanho);
        boolean tela = ler.nextBoolean();
        t.setTela(tela);
        System.out.println(t.toString());
    }
    
}
