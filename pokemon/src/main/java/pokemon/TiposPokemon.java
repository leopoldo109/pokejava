package pokemon;


public enum TiposPokemon {
    AGUA(0),
    FUEGO(1),
    TIERRA(2),
    ROCA(3),
    FANTASMA(4),
    SINIESTRO(5),
    VOLADOR(6),
    VENENO(7),
    NORMAL(8),
    ELECTRICO(10),
    BICHO(11),
    PSIQUICO(12),
    LUCHA(13),
    HIELO(14),
    DRAGON(15);
    
    private TiposPokemon (int tipo){
        this.tipo = tipo;
    }
    
    public int get_tipo(){
        return tipo;
    }
    
    private int tipo;
}
