package pokemon;

public enum EstadosPokemon {
    SALUDABLE(1),
    VENENO(2);
    
    private EstadosPokemon(int indice){
       this.indice = indice;
    }
    
    public int getEstado(){
        return indice;
    }
    
    private final int indice;
}
