public class Contador {
    public void contador(int numero1, int numero2) throws ParametrosInvalidosException {
        if (numero2 < numero1) {
            throw new ParametrosInvalidosException();
        }
        
        int ocorrencias = numero1 - numero2;

        for(int i =1; i<=-ocorrencias; i++) {
            System.out.println("Imprimindo " + i);
        }   
    }
}
