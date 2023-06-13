public class persona {
    //atributos
    private int dni;
    private String nombre;
    private String apellido;
    private String direccion;
    private int telefono;
    private int edad;
    private String signo;
    private String profesion;

    //constructor

    public persona(){
    }

    public persona(int dni, String nombre, String apellido, String direccion, int telefono) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
        this.telefono = telefono;
        this.edad = edad;
        this.signo = signo;
        this.profesion = profesion;
    }

    public persona(int dni, String nombre, String apellido, String direccion, int telefono, int edad, String signo, String profesion) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
        this.telefono = telefono;
        this.edad = edad;
        this.signo = signo;
        this.profesion = profesion;
    }


    //setters & getters

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getSigno() {
        return signo;
    }

    public void setSigno(String signo) {
        this.signo = signo;
    }

    public String getProfesion() {
        return profesion;
    }

    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }

    //metodos propios

    public void caminar(){
        System.out.println("Este es el método de caminar :D que pertenece a persona");

    }
    public void trabajar(){

        System.out.println("Este es el metodo trabajar que pertenece a persona ");
    }

}
