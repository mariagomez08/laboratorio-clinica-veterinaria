public class Perro extends Animal{
    private String raza;

    public Perro(String raza) {
        this.raza = raza;
    }

    public Perro(String nombre, int edad, String propietario, String raza) {
        super(nombre, edad, propietario);
        this.raza = raza;
    }

    @Override
    public double calcularCostoConsulta(){
        return 45000 + (getEdad()* 3000);
    }
}
