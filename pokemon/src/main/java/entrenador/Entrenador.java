package entrenador;

import pokemon.Pokemon;

// el tipo de la mochila podria definirse por el pokemon que elija

public class Entrenador {

    public Entrenador(int capacidad, String nombre) {
        
        this.mochila = new Pokemon[capacidad];
        
        this.nombreEntrenador = nombre;
        
        id = id_Siguiente;
        
        id_Siguiente = id_Siguiente++;
    }
    
    public Pokemon [] getMochila(){
        return this.mochila;
    }
    
    public String get_nom_entrenador(){
        return nombreEntrenador;
    }
    
    public void capturarPokemon(Pokemon pokemon) {
        if (cantidadPokemones < mochila.length) {
            mochila[cantidadPokemones] = pokemon;
            cantidadPokemones++;
            System.out.println(nombreEntrenador + " ha capturado a " + pokemon.getNombre() + "!");
        } else {
            System.out.println("La mochila está llena, no puedes capturar más Pokémon.");
        }
    }
    
    private int cantidadPokemones = 0;
    
    private Pokemon [] mochila;
    
    private final String nombreEntrenador;
    
    private int id;
    
    private static int id_Siguiente = 1;
    
}
