package c_vehiculos;
public class Main  {
    public static void main(String[] args){
        Automovil miAuto = new Automovil("Toyota", "Corolla", 2022, "Rojo", 4, "Gasolina", 5);
        System.out.println("Marca: " + miAuto.getMarca());
        System.out.println("Modelo: " + miAuto.getModelo());
        System.out.println("Año: " + miAuto.getAño());
        System.out.println("Color: " + miAuto.getColor());
        System.out.println("Número de puertas: " + miAuto.getNumPuertas());
        System.out.println("Tipo de combustible: " + miAuto.getTipoCombustible());
        System.out.println("Capacidad de pasajeros: " + miAuto.getCapPasajeros());
        System.out.println("\n");
        Avion miAvion = new Avion("Boeing", "737", 2020, "Blanco", 150, "TurboHelice");
        miAvion.mostrarDatos();
        System.out.println("\n");
        Camion miCami = new Camion("Volvo", "VNL", 2021, "Azul", 20000);
        miCami.mostrarDatos();
        System.out.println("\n");
        MotoAcuatica miMoto = new MotoAcuatica("Sea-Doo", "RXP-X", 2023,"Azul","Gasolina",true);
        miMoto.mostrarDatos();
        System.out.println("\n");
        bicicletaElectrica miBici = new bicicletaElectrica("Trek", "Powerfly", 2023, "Verde", 50, true);
        miBici.mostrarDatos();
        System.out.println("\n");
        Tractor miTractor = new Tractor("John Deere", "8310R", 2020, "Amarillo", true, "Diésel");
        miTractor.mostrarDatos();
    }
}
