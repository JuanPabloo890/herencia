public class doctor extends persona {
    private String especialidad;
    private int codigo;
    private String horario;
    private String hospital;

    public doctor(){
        super();
    }

    public doctor(int dni, String nombre, String apellido, String direccion, int telefono, String especialidad, int codigo, String horario, String hospital) {
        super(dni, nombre, apellido, direccion, telefono);
        this.especialidad = especialidad;
        this.codigo = codigo;
        this.horario = horario;
        this.hospital = hospital;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public String getHospital() {
        return hospital;
    }

    public void setHospital(String hospital) {
        this.hospital = hospital;
    }

    public void examinar(){
        System.out.println("Este es el método examinar :0 que pertenece a doctor");

    }
    public void diagnosticar(){
        System.out.println("Este es el método de diagnosticar :D que pertence a doctor");

    }
}
