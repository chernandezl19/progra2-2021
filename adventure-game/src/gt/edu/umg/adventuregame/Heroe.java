package gt.edu.umg.adventuregame;

import java.util.ArrayList;

public class Heroe extends Personaje implements Recolector{
    private ArrayList<Mueble> mochila = new ArrayList<Mueble>();
    private int maxMueble = 3;
    public Heroe(Coordenada coordenada) {
        super(coordenada);
    }


    @Override
    public void recogerMueble(Mueble mueble) {
        if (mochila.size()<=maxMueble){
            mochila.add(mueble);
        }
    }
}
