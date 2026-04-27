public class Gato extends Animal{

    private boolean esEsterilizado;

    public Gato() {
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
}
