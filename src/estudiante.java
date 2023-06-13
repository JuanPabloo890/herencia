public class estudiante extends persona {
    //atributos
    private int CodU;
    private String correo;
    private String semestre;
    private String carrera;

    //constructor especifico

    public estudiante(){
        super();
    }
    public estudiante(int dni, String nombre, String apellido, String direccion, int telefono, int CodU, String correo, String semestre, String carrera) {
        super(dni, nombre, apellido, direccion, telefono); //elementos heredados
        //elementos propios de la clase estudiante
        this.CodU = CodU;
        this.correo = correo;
        this.semestre = semestre;
        this.carrera = carrera;

    }

    public int getCodU() {
        return CodU;
    }

    public void setCodU(int codU) {
        CodU = codU;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getSemestre() {
        return semestre;
    }

    public void setSemestre(String semestre) {
        this.semestre = semestre;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public void estudiar(){
        System.out.println("Este es le metodo estudiar :) que pertenece a estudiante ");

    }
    public void memorizar(){
        System.out.println("Este es el método de memorizar :D que pertenece a estudiante");

    }
    public void leer(){
        System.out.println("Este es el método de leer :D que pertebece a estudiante");

    }
}
