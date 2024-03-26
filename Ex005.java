public class Ex005 {
    public static void execute(){
        double vetor[] = new double[5];

        for(int i = 0 ; i < 5 ; i++){
            vetor[i] = Prompt.lerDecimal("Digite o valor do elemento " + (i + 1) + ": ");
        }

        double n = Prompt.lerDecimal("Digite o valor de n: ");

        int count = 0;

        for(int i = 0 ; i < 5 ; i++){
            if(vetor[i] == n){
                count++;
            }
        }

        Prompt.imprimir("Quantidade de vezes que o valor de n está no array: " + count);

    }
}
