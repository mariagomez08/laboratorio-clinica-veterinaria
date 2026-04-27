public class Main {
    static void main() {

        Animal perro1= new Perro("motita", 3, "Felipe", "Bull terrier");
        Animal gato1 = new Gato("Michi", 4, "Juan", false);
        Animal ave1 = new Ave("piolin", 2, "Alexandra", 80);

        System.out.println(perro1.fichaPresentacion());
        System.out.println(gato1.fichaPresentacion());
        System.out.println(ave1.fichaPresentacion());

        /* MiInterfaz obj = new ClaseImplementadora(); y luego llamar a obj.metodo();.
        * */
        System.out.println("------CALCULO DE PRIMA----------");
        System.out.println("La poliza del perro equivale a "+ ((Asegurable) perro1).calcularPrimaSeguro());
        System.out.println("La poliza del gato equivale a "+ ((Asegurable) gato1).calcularPrimaSeguro());

    }
}
