public class Ave extends Animal{

    private double pesoGramos;

    public Ave() {
    }

    public Ave(double pesoGramos) {
        this.pesoGramos = pesoGramos;
    }

    public Ave(String nombre, int edad, String propietario, double pesoGramos) {
        super(nombre, edad, propietario);
        this.pesoGramos = pesoGramos;
    }


    @Override
    public double calcularCostoConsulta(){
        return 28000 + (pesoGramos* 500);
    }
}
