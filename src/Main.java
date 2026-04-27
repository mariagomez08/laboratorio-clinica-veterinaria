import java.sql.SQLOutput;

public class Main {
    static void main() {

        Animal perro1= new Perro("motita", 3, "Felipe", "Bull terrier");
        Animal gato1 = new Gato("Michi", 4, "Juan", false);
        Animal ave1 = new Ave("piolin", 2, "Alexandra", 80);

        System.out.println("------FICHA MASCOTAS----------");
        System.out.println(perro1.fichaPresentacion());
        System.out.println(gato1.fichaPresentacion());
        System.out.println(ave1.fichaPresentacion());


        System.out.println("------REGISTRO VACUNAS----------");
        ((Vacunable) perro1).registrarVacuna("Antipulgas");
        ((Vacunable) perro1).registrarVacuna("Antigarrapata1");
        ((Vacunable) gato1).registrarVacuna("Antigarrapata2");
        ((Vacunable) gato1).registrarVacuna("Antigarrapata3");
        System.out.println(((Vacunable) perro1).getVacunasAplicadas());
        System.out.println(((Vacunable) gato1).getVacunasAplicadas());

        /*
        Crea una instancia de Clinica. Ahora tienes tres objetos asegurables: el perro, el gato y la
clínica. Para cada uno, imprime el número de póliza y el valor de la prima anual. Hazlo
usando una referencia de tipo Asegurable donde sea posible.
         */
        System.out.println("------IMPRIMIENDO NUMER DE POLIZA----------");
        Clinica clinica = new Clinica("Huellitas","Bogotá");
        System.out.println(((Asegurable) gato1).obtenerNumeroPoliza());
        System.out.println(((Asegurable) perro1).obtenerNumeroPoliza());
        System.out.println(((Asegurable) clinica).obtenerNumeroPoliza());



    }
}
