package pokemon;

public abstract class Pokemon {

    // Constructor
    
    public Pokemon(int num_pokedex, String nombrePokemon, double pesoPokemon, String genero, TiposPokemon tipo) {
        this.num_pokedex = num_pokedex;
        this.nombrePokemon = nombrePokemon;
        this.pesoPokemon = pesoPokemon;
        this.genero = genero;
        this.tipo = tipo;
    }
    
    // Metodos
    
    public String getNombre(){
        return "El pokemon es: " + nombrePokemon;
    }
    
    public TiposPokemon tipoPokemon(){
        return this.tipo;
    }
    
    protected abstract void placaje();
    
    protected abstract void arañazo();
    
    protected abstract void mordisco();
    
    // atributos
    protected int num_pokedex;
    
    protected String nombrePokemon;
    
    protected double pesoPokemon;
    
    protected String genero;
    
    private final TiposPokemon tipo;
    
    
}
