public class Perro extends Animal implements Vacunable, Asegurable{
    private String raza;
    private int vacuna;

    public Perro(String raza) {
        this.raza = raza;
    }

    public Perro(int vacuna) {
        this.vacuna = vacuna;
    }

    public Perro(String nombre, int edad, String propietario, String raza) {
        super(nombre, edad, propietario);
        this.raza = raza;
    }

    @Override
    public double calcularCostoConsulta(){
        return 45000 + (getEdad()* 3000);
    }

    @Override
    public double calcularPrimaSeguro(){
        return 80000 * edad;
    }

    @Override
    public String obtenerNumeroPoliza(){
        return "Poliza perro " + nombre;
    }

    @Override
    public void registrarVacuna(){
        vacuna++;
    }
    @Override
    public int getVacunasAplicadas(){
        return vacuna;
    }
}
