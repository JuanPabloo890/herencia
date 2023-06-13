public class futbolista extends persona {
    private String equipo;
    private String posicion;
    private int n_camiseta;
    private String representante;
    private int horas_entrenadas;

    public futbolista(){
        super();
    }

    public futbolista(int dni, String nombre, String apellido, String direccion, int telefono, String equipo, String posicion, int n_camiseta, String representante) {
        super(dni, nombre, apellido, direccion, telefono);
        this.equipo = equipo;
        this.posicion = posicion;
        this.n_camiseta = n_camiseta;
        this.representante = representante;
    }

    public String getEquipo() {
        return equipo;
    }

    public void setEquipo(String equipo) {
        this.equipo = equipo;
    }

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    public int getN_camiseta() {
        return n_camiseta;
    }

    public void setN_camiseta(int n_camiseta) {
        this.n_camiseta = n_camiseta;
    }

    public String getRepresentante() {
        return representante;
    }

    public void setRepresentante(String representante) {
        this.representante = representante;
    }

    public void entrenar(){
        System.out.println("Este es el método de entrenar =) ");

    }
}
