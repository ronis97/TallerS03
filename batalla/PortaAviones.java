import java.util.ArrayList;

public class PortaAviones {
    private final int MIN_TRIPULANTES = 5;
    private int numero;
    private int capacidad;
    private Posicion ubicacion;
    private ArrayList<Marino> marinos;
    private ArrayList<Avion> aviones;
    public int getCapacidad(){
        return capacidad;
    }
}
