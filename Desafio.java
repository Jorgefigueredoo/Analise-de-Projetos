public class Desafio {

    public static void main(String[] args) {
        Desafio pedido = new Desafio();

        double valorFinal = pedido.calcularValorFinal(1200, 3, true, 150);

        System.out.println("Valor Final: " + valorFinal);

    }

    public double calcularValorFinal(double valorBase, int tipo, boolean aplicaDesconto, int pontos) {

        if (!aplicaDesconto) {
            return valorBase;
        }

        double valorComDesconto = valorBase;

        switch (tipo) {
            case 1:
                valorComDesconto = valorBase * 0.90;
                break;
            case 2:
                valorComDesconto = valorBase * 0.85;
                break;
            case 3:
                valorComDesconto = (pontos > 100) ? (valorBase * 0.75) : (valorBase * 0.80);
                break;
            default:
                break;
        }

        if (valorBase > 1000) {
            double descontoFixo = (pontos > 200) ? 100 : 50;
            valorComDesconto -= descontoFixo;
        }

        return Math.max(0, valorComDesconto);
    }
}