package gt.edu.umg.adventuregame;

public abstract class Mueble {

    private  Coordenada coordenada;

    public Mueble(Coordenada coordenada) {
        this.coordenada = coordenada;
    }

    public Coordenada getCoordenada() {
        return coordenada;
    }
}
