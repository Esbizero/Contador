public class App {
    public static void main(String[] args) {
        Contador cont = new Contador();
        try {
            cont.contador(40, 50);   
        } catch (ParametrosInvalidosException e) {
            //Receba
            e.printStackTrace();
        }
    }
}
