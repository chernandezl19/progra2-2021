package gt.edu.umg.adventuregame;

public abstract class Inmueble {

    private Coordenada coordenada;

    public Inmueble(Coordenada coordenada) {
        this.coordenada = coordenada;
    }

    public Coordenada getCoordenada() {
        return coordenada;
    }
}
