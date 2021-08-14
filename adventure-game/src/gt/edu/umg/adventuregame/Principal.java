package gt.edu.umg.adventuregame;

public class Principal {


    public static void main(String[] args) {

        Personaje heroe1= createHero(new Coordenada(5,5));
        Personaje enemigo1 = createEnemigo(new Coordenada(6,6));

        Inmueble arbol1 = new Arbol(new Coordenada(7,7));
        Inmueble muro1 = new Arbol(new Coordenada(7,7));
        Inmueble torre1 = new Arbol(new Coordenada(7,7));

        Mueble alimento1 = new Alimento(new Coordenada(3,3));
        Mueble proyectil1 = new Proyectil(new Coordenada(3,3));
        Mueble arma1 = new Arma(new Coordenada(3,3));

        recogerObjeto((Recolector) enemigo1, alimento1);

    }

    static Heroe createHero(Coordenada coordenada){
        return new Heroe(coordenada);
    }

    static Enemigo createEnemigo(Coordenada coordenada){
        return new Enemigo(coordenada);
    }

    static void recogerObjeto(Recolector recolector, Mueble mueble){
        recolector.recogerMueble(mueble);
    }
}
