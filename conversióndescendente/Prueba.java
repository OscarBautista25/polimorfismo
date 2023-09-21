package conversióndescendente;

public class Prueba {
    public static void main(String[] args) {
        Docente docente1 = new DocenteTitular();
        Docente docente2 = (DocenteTitular) docente1;
        docente1.imprimir();
    }
    
}
