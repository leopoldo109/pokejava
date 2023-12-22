package pokemon;


public enum TiposPokemon {
    AGUA("agua"),
    FUEGO("fuego"),
    TIERRA("tierra"),
    ROCA("roca"),
    FANTASMA("fantasma"),
    SINIESTRO("sieniestro"),
    VOLADOR("volador"),
    VENENO("veneno"),
    NORMAL("normal"),
    ELECTRICO("electrico"),
    BICHO("bicho"),
    PSIQUICO("psiquico"),
    LUCHA("lucha"),
    HIELO("hielo"),
    DRAGON("dragon"),
    PLANTA("planta");
    
    private TiposPokemon (String tipo){
        this.tipo = tipo;
    }
    
    public String get_tipo(){
        return tipo;
    }
    
    private final String tipo;
}
