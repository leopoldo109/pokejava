package pokemon;

public abstract class Pokemon {

    // Constructor
    
    public Pokemon(int num_pokedex, String nombrePokemon, double pesoPokemon, String genero, int temporada) {
        this.num_pokedex = num_pokedex;
        this.nombrePokemon = nombrePokemon;
        this.pesoPokemon = pesoPokemon;
        this.genero = genero;
        this.temporada = temporada;
    }
    
    // Metodos
    
    public String getNombre(){
        return "El pokemon es: " + nombrePokemon;
    }
    
    protected abstract void placaje();
    
    protected abstract void arañazo();
    
    protected abstract void mordisco();
    
    // atributos
    protected int num_pokedex;
    
    protected String nombrePokemon;
    
    protected double pesoPokemon;
    
    protected String genero;
    
    protected int temporada;
    
    
}
