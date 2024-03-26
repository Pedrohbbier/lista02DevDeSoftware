public class Ex006 {
    public static void execute(){
        int tamanho = 5;
        double[] notas = new double[tamanho];
        double[] pesos = new double[tamanho];
        
        for (int i = 0; i < tamanho; i++) {
            notas[i] = Prompt.lerDecimal("Digite a nota " + (i + 1) + ": ");
        }
        
        for (int i = 0; i < tamanho; i++) {
            pesos[i] = Prompt.lerDecimal("Digite o peso da nota " + (i + 1) + ": ");
        }
        
        double soma = 0;
        double somaPesos = 0;
        for (int i = 0; i < tamanho; i++) {
            soma += notas[i] * pesos[i];
            somaPesos += pesos[i];
        }
        double mediaPonderada = soma / somaPesos;
        
        Prompt.separador();
        Prompt.imprimir("A média ponderada do aluno é: " + mediaPonderada);
    }
}
