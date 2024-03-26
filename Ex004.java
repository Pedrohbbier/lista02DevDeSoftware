public class Ex004 {
    public static void execute(){
        double[] vetor = new double[5];

        for (int i = 0; i < 5; i++) {
            vetor[i] = Prompt.lerDecimal("Digite o valor do elemento " + (i + 1) + ": ");
        }

        double n = Prompt.lerDecimal("Digite o valor de n: ");

        for(int i = 0 ; i < 5 ; i++){
            if(vetor[i] < n){
                Prompt.imprimir( vetor[i] + " é menor que " + n);
            }
        }

    }
}
