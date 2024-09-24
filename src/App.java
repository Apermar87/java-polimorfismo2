public class App {
    public static void main(String[] args) throws Exception {
        Profesor profesor1 = new ProfesorTitular();
        profesor1.imprimir();
        Profesor profesor2 = (Profesor) profesor1;
        profesor2.imprimir();

    }

}
