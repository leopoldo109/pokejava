package pokemon;

import pokemon.pokemones.*;
import entrenador.Entrenador;
import java.util.*;

public class dueloPokemon {

    public static void main(String[] args) {
        
        Bulbasaur bulbasaur = new Bulbasaur("Hembra");
        
        Charmander charmander = new Charmander("Macho");
        
        Entrenador ash = new Entrenador(3, "Ash");
        
        ash.capturarPokemon(charmander);
        
        ash.capturarPokemon(bulbasaur);
        
        for (Pokemon p : ash.getMochila()) {
            if(p != null){
                System.out.println("el pokemon" + p.getNombre());
            }
        }
 
    }
    
}
