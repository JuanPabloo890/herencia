public class empleado_publico extends persona {
    private String puesto;
    private String cargo;

    public empleado_publico(){
        super();
    }

    public empleado_publico(int dni, String nombre, String apellido, String direccion, int telefono, String puesto, String cargo) {
        super(dni, nombre, apellido, direccion, telefono);
        this.puesto = puesto;
        this.cargo = cargo;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public void tramitar(){
        System.out.println("Este es el método de hacer tramites :( que pertenece a empleado publico");

    }
}
