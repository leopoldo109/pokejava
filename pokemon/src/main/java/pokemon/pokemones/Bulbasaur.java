package pokemon.pokemones;

import pokemon.IPlanta;
import pokemon.Pokemon;

public class Bulbasaur extends Pokemon implements IPlanta{
   

    public Bulbasaur(String sexo) {
        super(1, "Bulbasaur", 31.29, sexo, 0);
    }
    
    public String get_nom_pokemon(){
        return this.nombrePokemon;
    }

    protected void placaje() {
        System.out.println("Bulbasuar uso placaje");
    }
    
    protected void arañazo(){
        System.out.println("Bulbasaur uso arañazo");
    }
    
    protected void mordisco(){
        System.out.println("Bulbasaur uso mordisco");
    }
    
    public void atacarParalizar(){
        System.out.println("Bulbasaur uso paralizar");
    }
    
    public void atacarDrenaje(){
        System.out.println("Bulbasaur uso drenaje");
    }
    
    public void atacarHojaAfilada(){
        System.out.println("Bulbasaur uso hoja afilada");
    }
    
    public void atacarLatigoCepa(){
        System.out.println("Bulbasaur uso latigo cepa");
    }
    
    
}
