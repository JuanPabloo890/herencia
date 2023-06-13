public class menu {
    public static void main(String[] args) {
        persona miPersona = new persona(1705554572,"Juan","Falconi","Mitad del Mundo",984826658,23,"Sagitario","Developer");

        estudiante Juan = new estudiante(1727938472,"Juan","Apellido","Mitad del Mundo",992910009,202111265,"juan.falconi@epn.edu.ec","Semestre 3","Desarrollo de Software");
        empleado_publico pablo = new empleado_publico(182839,"Pablo","Uchuari","La PAMPA",982323,"Empleado Publico","Empleado Publico");
        estudiante melani = new estudiante(17028475,"Melani","Sangucho","Pomasqui",98765434,20212987,"melani@epn.edu.ec"," Semestre 4","Comunicacion");
        doctor ana = new doctor(1234,"Ana","Hernandez","Pomasqui",999999,"Doctora",123212,"Lunes - Viernes","Sucre");

        System.out.println(miPersona.getNombre()+ " es " + miPersona.getProfesion());
        System.out.println("Tiene "+miPersona.getEdad() + " años" );
        miPersona.caminar();

        System.out.println("\n");

        System.out.println(ana.getNombre()+ " es "+ ana.getProfesion());
        System.out.println("Tiene "+ana.getEdad() + " años");
        ana.examinar();

        System.out.println("\n");

        System.out.println(pablo.getNombre() + " es " +pablo.getCargo());
        System.out.println("Su telefono es: "+ pablo.getTelefono());
        pablo.tramitar();

        System.out.println("\n");

        System.out.println(melani.getNombre()+ " estudia "+melani.getCarrera());
        System.out.println("Esta en"+ melani.getSemestre());
        melani.leer();

    }

}
