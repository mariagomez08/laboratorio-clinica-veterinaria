public class Gato extends Animal implements Asegurable, Vacunable{

    private boolean esEsterilizado;
    private int vacuna;


    public Gato() {
    }

    public Gato(int vacuna) {
        this.vacuna = vacuna;
    }

    public Gato(boolean esEsterilizado) {
        this.esEsterilizado = esEsterilizado;
    }

    public Gato(String nombre, int edad, String propietario, boolean esEsterilizado) {
        super(nombre, edad, propietario);
        this.esEsterilizado = esEsterilizado;
    }

    @Override
    public double calcularCostoConsulta(){
        return 38000;
    }


    @Override
    public double calcularPrimaSeguro(){
        if(esEsterilizado){
            return 120000;
        }else{
            return 200000;
        }
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
