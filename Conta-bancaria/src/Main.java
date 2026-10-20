//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        conta b1 = new conta();
        b1.setNumConta(1);
        b1.setDono("Jubileu");
        b1.abrirConta("CC");
        b1.depositar(70);
        b1.sacar(50);
        b1.pagarMensal();
        b1.fecharConta();
        b1.sacar(58);
        b1.fecharConta();
    }
}