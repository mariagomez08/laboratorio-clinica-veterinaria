public abstract class Animal {
    protected String nombre;
    protected int edad;
    protected String propietario;

    public Animal() {
    }

    public Animal(String nombre, int edad, String propietario) {
        this.nombre = nombre;
        this.edad = edad;
        this.propietario = propietario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getPropietario() {
        return propietario;
    }

    public void setPropietario(String propietario) {
        this.propietario = propietario;
    }

    public abstract double calcularCostoConsulta();

    public String fichaPresentacion(){
        return "El nombre de la mascota " + getNombre() + " con edad "+ getEdad() + " y con dueño "+ getPropietario() + " debe pagar " + calcularCostoConsulta() ;
    }


}
