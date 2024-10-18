import java.util.Scanner;

public class Grifo {

    Scanner gabriel = new Scanner(System.in);
    double subtotal, vuelto, igv, total, pago;
    double cantidad;
    double precioTotal = 0;

    String nombreUsuario = "luzMelani";
    String correo = "omar@gmail.com";
    String contrasena = "root";

    public void igv() {
        igv = precioTotal * 0.18;
        subtotal = precioTotal - igv;
        total = subtotal + igv;
        System.out.println("SUBTOTAL " + subtotal);
        System.out.println("IGV " + igv);
        System.out.println("TOTAL A PAGAR " + total);
    }
    public void funcionVuelto() {
        System.out.println("Ingrese con cuanto va a pagar:");
        pago = gabriel.nextDouble();
        vuelto = pago - precioTotal;
        if (vuelto <= 0) {
            System.out.println("Su compra fue cancelada >:v");
            System.exit(0);
        } else if (vuelto == precioTotal) {
            System.out.println("Pago completo gracias por su compra :3");
            igv();
        } else if (vuelto > 0) {
            System.out.println("Su vuelto es: " + vuelto +" Gracias por su compra :3");
        }
    }
    public void omarVentaCombustible(){
        int opcion;
        do {
            System.out.println("|== Bienvenido a Grifo Primax    ==================|");
            System.out.println("|== Seleccione el tipo de combustible que desea   =|");
            System.out.println("|== 1. Gasolina Regular: 10.45   ==================|");
            System.out.println("|== 2. Gasolina Premiun: 13.17   ==================|");
            System.out.println("|== 3. Diesel S-50: 12.94        ==================|");
            System.out.println("|== 4. Regresar                  ==================|");
            System.out.println("|== Elija una opcion:");
            opcion = gabriel.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("|== Ingrese la cantidad de galones que desea: ");
                    cantidad = gabriel.nextDouble();
                    precioTotal = cantidad * 10.45;
                    break;
                case 2:
                    System.out.println("|== Ingrese la cantidad de galones que desea: ");
                    cantidad = gabriel.nextDouble();
                    precioTotal = cantidad * 13.17;
                    break;
                case 3:
                    System.out.println("|== Ingrese la cantidad de galones que desea: ");
                    cantidad = gabriel.nextDouble();
                    precioTotal = cantidad * 12.94;
                    break;
                case 0:
                    System.out.println("|== Regresando al menu");
                    MenuGeneral();
                    break;
                default:
                    System.out.println("|== Opción no válida.");
            }
            if (precioTotal > 0) {
                System.out.println("|== El precio a pagar: $" + precioTotal);
                gabriel.nextLine();
                funcionVuelto();
                igv();
                System.out.println("|== Gracias por su compra");
                MenuGeneral();
            }
        }while (opcion != 0);
    }

    //Falta completar
    public void gabrielTallerAutomotriz(){
        int opcion;
        do {
            System.out.println("Bienvenido al taller de Grifo Primax");
            System.out.println("Ud que necesita :");
            gabriel.nextLine();
            System.out.println("Menu principal Taller:");
            String menuPrincipal = gabriel.nextLine();
            System.out.println("Tenemos estas opciones:");
            System.out.println("Opcion 1: Cambio de aceite");
            System.out.println("Opcion 2: limpieza Veicular");
            System.out.println("Opcion 3: Inflado de llantas");
            System.out.println("Opcion 0: salir del taller");
            opcion = gabriel.nextInt();
            gabriel.nextLine();
            switch (opcion) {
                case 1:
                    System.out.println("CAMBIO DE ACIETE");
                    System.out.println("Precio: $ 149.90");
                    double cambiodeaceite = 149.90;
                    double igv = cambiodeaceite * 0.18;
                    double subtotal;
                    igv = (cambiodeaceite) * 0.18;
                    subtotal = (cambiodeaceite) - igv;
                    cambiodeaceite = subtotal + igv;

                    System.out.println("cambio de aceite: ");
                    System.out.println("Ud debe pagara $149.90");
                    double pago = gabriel.nextInt();
                    if (pago >= 149.90) {
                        if (pago > 149.90) {
                            double vuelto = pago - 149.90;
                            System.out.println("su vuelto es: " + vuelto);
                            System.out.println("*************************************");
                            System.out.println("Subtotal: " + subtotal);
                            System.out.println("igv(18%): " + igv);
                            System.out.println("TOTAL PAGAR: " + cambiodeaceite);
                            System.out.println("*************************************");
                        }
                        System.out.println("Gracias por pagar ahora empazamos a cambiar el aceite....");
                        gabriel.nextLine();
                        System.out.println("Espere por favor.....");
                        for (int i = 1; i <= 45; i++) {
                            System.out.println("minuto " + i);
                        }
                        System.out.println("Gracias por esperar hemos acabado");
                    }
                case 2:
                    System.out.println("LIMPIEZA VEHICULAR");
                    System.out.println("Precio: 39.90");
                    double limpiezavehicular = 39.90;
                    double subtotaldelimpieza;
                    igv = limpiezavehicular;
                    igv = (limpiezavehicular * 0.18);
                    subtotaldelimpieza = (limpiezavehicular) - igv;
                    limpiezavehicular = subtotaldelimpieza + igv;

                    System.out.println("limpieza vehicular ");
                    System.out.println("Ud debe pagara $39.90");
                    System.out.print("Ingrese el dinero:");
                    double pagodelimpieza = gabriel.nextInt();
                    if (pagodelimpieza >= 39.90) {

                        if (pagodelimpieza > 39.90) {
                            double vuelto = pagodelimpieza - 39.90;
                            System.out.println("su vuelto es: " + vuelto);
                            System.out.println("*************************************");
                            System.out.println("Subtotal: " + subtotaldelimpieza);
                            System.out.println("igv(18%): " + igv);
                            System.out.println("TOTAL PAGAR: " + limpiezavehicular);
                            System.out.println("*************************************");
                        }
                        System.out.println("Gracias por pagar ahora empazamos a cambiar el aceite....");
                        gabriel.nextLine();
                        System.out.println("Espere por favor.....");
                        for (int i = 1; i <= 25; i++) {
                            System.out.println("minuto " + i);
                        }
                        System.out.println("Gracias por esperar hemos acabado");
                    } else {
                        System.out.println("Regresa con plata🤦‍♂️🤦‍♂️: ");
                        System.exit(0);
                    }
                case 3:
            }
        }while (opcion !=0);
    }


    public void luzFinilisacionVenta(double precioEstimado){
        double igvLuz = precioEstimado * 0.18;
        double totalPagarLuz = precioEstimado + igvLuz;

        System.out.println("||-- Se te esta cobrando asi 👇:");
        System.out.println("||-- Tu deuda Neta es: " +precioEstimado);
        System.out.println("||-- Tu deudaIgv es: " +igvLuz);
        System.out.println("||-- Por tanto tu total a pagar es S/ " + totalPagarLuz);
        System.out.println("||-- Haora Ingresa tu pago: ");
        double pagoLuz = gabriel.nextInt();

        while (pagoLuz < totalPagarLuz){
            double faltaPagarLuz = totalPagarLuz - pagoLuz;
            System.out.println("El pago es incompleto falta: " + faltaPagarLuz);
            totalPagarLuz -= pagoLuz;

            System.out.println("Ingresa el pago faltante: ");
            pagoLuz = gabriel.nextInt();
            //Con este if le perdonamos al usuario de equivocacion una vez XD

            if (pagoLuz == 0) {
                System.out.println("No te pases de chistoso 🤦‍♀️. Bay");
                System.exit(0);
            }
        }

        if (pagoLuz >= totalPagarLuz) {
            double vueltoLuz = pagoLuz - totalPagarLuz;
            System.out.println("Tu vuelto es de: " + vueltoLuz);
            System.out.println("Gracias por adquirir nuestro servicio 🥳");
            MenuGeneral();
        }

    }
    public void menuDeCargaLavadoLuz() {
        for (int i = 0; i < 2; i++) {
            System.out.println(i + " segundos...");
        }
        System.out.println("Su auto está siendo lavado 💦🚗💦");


        for (int i = 0; i < 2; i++) {
            System.out.println(i + " segundos...");
        }
        System.out.println("Su auto está siendo enjabonado 🧼🚗🧼");


        for (int i = 0; i < 2; i++) {
            System.out.println(i + " segundos...");
        }
        System.out.println("Su auto está siendo enjuagado 🚿🚗🚿");


        for (int i = 0; i < 2; i++) {
            System.out.println(i + " segundos...");
        }
        System.out.println("Su auto está siendo secado con aire 💨🚗💨");


        for (int i = 0; i < 6; i++) {
            System.out.println(i + " segundos...");
        }
        System.out.println("Su auto está listo ✨🚗✨");

        System.out.println("Gracias " + nombreUsuario + " por usar nuestro servicio 😊");

    }
    public void luzLavadoDeAutos(){
        System.out.println("Bienvenido al Lavado de Autos");
        int tipoServicio;
        int tamanoAuto;
        double precioEstimado;
        do {
            System.out.println("|-- Elija el tipo de servicio:");
            System.out.println("|-- 1. Barato");
            System.out.println("|-- 2. Intermedio");
            System.out.println("|-- 3. Caro");
            System.out.println("|-- 0. Regresar");
            System.out.println("|-- Ingrese una Opcion:");
            tipoServicio = gabriel.nextInt();
            gabriel.nextLine();

            switch (tipoServicio) {
                case 1:
                    do {
                        System.out.println("|-- Elija el tamaño del auto:");
                        System.out.println("|-- 1. Pequeño (Hatchbacks, sedanes compactos)");
                        System.out.println("|-- 2. Intermedio (Sedanes medianos, SUV compactos)");
                        System.out.println("|-- 3. Grande (SUV grandes, camionetas)");
                        System.out.println("|-- 0. Regresar");
                        System.out.println("|-- Ingrese una Opcion:");
                        tamanoAuto = gabriel.nextInt();
                        gabriel.nextLine();
                        switch (tamanoAuto) {
                            case 1:
                                precioEstimado = 20;
                                menuDeCargaLavadoLuz();
                                luzFinilisacionVenta(precioEstimado);
                                break;
                            case 2:
                                precioEstimado = 30;
                                menuDeCargaLavadoLuz();
                                luzFinilisacionVenta(precioEstimado);
                                break;
                            case 3:
                                precioEstimado = 40;
                                menuDeCargaLavadoLuz();
                                luzFinilisacionVenta(precioEstimado);
                                break;
                            case 0:
                                System.out.println("Regresando 🤞");

                                break;
                            default:
                                System.out.println("Opcion no valida 💀");
                        }
                    } while (tamanoAuto != 0);
                    break;
                case 2:
                    do {
                        System.out.println("|-- Elija el tamaño del auto:");
                        System.out.println("|-- 1. Pequeño (Hatchbacks, sedanes compactos)");
                        System.out.println("|-- 2. Intermedio (Sedanes medianos, SUV compactos)");
                        System.out.println("|-- 3. Grande (SUV grandes, camionetas)");
                        System.out.println("|-- 0. Regresar");
                        System.out.println("|-- Ingrese una Opcion:");
                        tamanoAuto = gabriel.nextInt();
                        gabriel.nextLine();
                        switch (tamanoAuto) {
                            case 1:
                                precioEstimado = 45;
                                menuDeCargaLavadoLuz();
                                luzFinilisacionVenta(precioEstimado);
                                break;
                            case 2:
                                precioEstimado = 55;
                                menuDeCargaLavadoLuz();
                                luzFinilisacionVenta(precioEstimado);
                                break;
                            case 3:
                                precioEstimado = 65;
                                menuDeCargaLavadoLuz();
                                luzFinilisacionVenta(precioEstimado);
                                break;
                            case 0:
                                System.out.println("Regresando 🤞");
                                break;
                            default:
                                System.out.println("Opcion no valida 💀");
                        }
                    } while (tamanoAuto != 0);
                    System.out.println();
                    break;
                case 3:
                    do {
                        System.out.println("|-- Elija el tamaño del auto:");
                        System.out.println("|-- 1. Pequeño (Hatchbacks, sedanes compactos)");
                        System.out.println("|-- 2. Intermedio (Sedanes medianos, SUV compactos)");
                        System.out.println("|-- 3. Grande (SUV grandes, camionetas)");
                        System.out.println("|-- 0. Regresar");
                        System.out.println("|-- Ingrese una Opcion:");
                        tamanoAuto = gabriel.nextInt();
                        gabriel.nextLine();
                        switch (tamanoAuto) {
                            case 1:
                                precioEstimado = 80;
                                menuDeCargaLavadoLuz();
                                luzFinilisacionVenta(precioEstimado);
                                break;
                            case 2:
                                precioEstimado = 110;
                                menuDeCargaLavadoLuz();
                                luzFinilisacionVenta(precioEstimado);
                                break;
                            case 3:
                                precioEstimado = 150;
                                menuDeCargaLavadoLuz();
                                luzFinilisacionVenta(precioEstimado);
                                break;
                            case 0:
                                System.out.println("Regresando 🤞");
                                break;
                            default:
                                System.out.println("Opcion no valida 💀");
                        }
                    } while (tamanoAuto != 0);
                    break;
                case 0:
                    System.out.println("Estas Regresando 🥲");
                    break;
                default:
                    System.out.println("Opcion no valida 💀");
            }
        } while (tipoServicio != 0);
    }


    public void vladimirSnack(){
        int vladimir;
        double subtotal, igv, total_a_pagar = 0;
        do {
            System.out.println("---BIENVENIDO! Aqui tenemos algunos Snacks populares---");
            System.out.println("opcion 1: Palomitas de maiz - S/.8.00");
            System.out.println("opcion 2: Papas fritas - S/.6.00");
            System.out.println("opcion 3: Barritas de granola - S/.5.00");
            System.out.println("opcion 4: Chocolate Bom Bom - S/.2.00");
            System.out.println("opcion 5: Muchas Frutas");
            System.out.println("opcion 6: Empanada de carne - S/.10.00");
            System.out.println("opcion 0: Volver al menú principal");
            System.out.println("Ingrese una opcion:");
            vladimir = gabriel.nextInt();
            switch (vladimir) {
                case 1:
                    System.out.println("Ingrese la cantidad de palomitas  de maiz a comprar:");
                    int cantidad1 = gabriel.nextInt();
                    double palomitasdemaiz = 8.00;
                    igv = 0.50;
                    subtotal = palomitasdemaiz * cantidad1;
                    total_a_pagar = subtotal + igv;
                    System.out.println("SUBTOTAL " + subtotal);
                    System.out.println("IGV " + igv);
                    System.out.println("TOTAL A PAGAR ES S/. " + total_a_pagar);
                    break;
                case 2:
                    System.out.println("Ingrese la cantidad de papas fritas comprar:");
                    int cantidad2 = gabriel.nextInt();
                    double papasfritas = 6.00;
                    igv = 0.50;
                    subtotal = papasfritas * cantidad2;
                    total_a_pagar = subtotal + igv;
                    System.out.println("SUBTOTAL " + subtotal);
                    System.out.println("IGV " + igv);
                    System.out.println("TOTAL A PAGAR ES S/. " + total_a_pagar);
                    break;
                case 3:
                    System.out.println("Ingrese la cantidad de Barritas de granola a comprar:");
                    int cantidad3 = gabriel.nextInt();
                    double barritasdegranola3 = 5.00;
                    igv = 0.50;
                    subtotal = barritasdegranola3 * cantidad3;
                    total_a_pagar = subtotal + igv;
                    System.out.println("SUBTOTAL " + subtotal);
                    System.out.println("IGV " + igv);
                    System.out.println("TOTAL A PAGAR ES S/. " + total_a_pagar);
                    break;
                case 4:
                    System.out.println("Ingrese la cantidad de chocolates a comprar:");
                    int cantidad4 = gabriel.nextInt();
                    double chocolates = 2.00;
                    igv = 0.50;
                    subtotal = chocolates * cantidad4;
                    total_a_pagar = subtotal + igv;
                    System.out.println("SUBTOTAL " + subtotal);
                    System.out.println("IGV " + igv);
                    System.out.println("TOTAL A PAGAR ES S/. " + total_a_pagar);
                    break;
                case 5:
                    int tipo;
                    do {
                        System.out.println("Tenemos los siguientes tipos de frutas");
                        System.out.println("1)--->manzana: S/.8.00 el kilo");
                        System.out.println("2)--->pera: S/.7.00 el kilo");
                        System.out.println("3)--->platano: S/.6.00 el kilo");
                        System.out.println("4)--->uva: S/. 7.00 el kilo");
                        System.out.println("5)--->sandia: S/. 5.00 el kilo");
                        System.out.println("6)--->melon: S/. 5.00 el kilo");
                        System.out.println("7)--->mango: S/.7.00 el kilo");
                        System.out.println("8)--->papaya: S/.8.00 el kilo");
                        System.out.println("0)--->Regresar");
                        System.out.println("Ingrese los siguientes tipos de frutas:");
                        tipo = gabriel.nextInt();
                        switch (tipo) {
                            case 1:
                                System.out.println("Ingrese cuantos kilos desea  comprar:");
                                int cantKl1 = gabriel.nextInt();
                                double manzana = 8.00;
                                igv = 0.50;
                                subtotal = manzana * cantKl1;
                                total_a_pagar = subtotal + igv;
                                System.out.println("SUBTOTAL " + subtotal);
                                System.out.println("IGV " + igv);
                                System.out.println("TOTAL A PAGAR ES S/. " + total_a_pagar);
                                break;
                            case 2:
                                System.out.println("Ingrese cuantos kilos desea  comprar:");
                                int cantKl2 = gabriel.nextInt();
                                double pera = 7.00;
                                igv = 0.50;
                                subtotal = pera * cantKl2;
                                total_a_pagar = subtotal + igv;
                                System.out.println("SUBTOTAL " + subtotal);
                                System.out.println("IGV " + igv);
                                System.out.println("TOTAL A PAGAR ES S/. " + total_a_pagar);
                                break;
                            case 3:
                                System.out.println("Ingrese cuantos kilos desea  comprar:");
                                int cantKl3 = gabriel.nextInt();
                                double platano = 6.00;
                                igv = 0.50;
                                subtotal = platano * cantKl3;
                                total_a_pagar = subtotal + igv;
                                System.out.println("SUBTOTAL " + subtotal);
                                System.out.println("IGV " + igv);
                                System.out.println("TOTAL A PAGAR ES S/. " + total_a_pagar);
                                break;
                            case 4:
                                System.out.println("Ingrese cuantos kilos desea comprar:");
                                int cantKl4 = gabriel.nextInt();
                                double uva = 7.00;
                                igv = 0.50;
                                subtotal = uva * cantKl4;
                                total_a_pagar = subtotal + igv;
                                System.out.println("SUBTOTAL " + subtotal);
                                System.out.println("IGV " + igv);
                                System.out.println("TOTAL A PAGAR ES S/. " + total_a_pagar);
                                break;
                            case 5:
                                System.out.println("Ingrese cuantos kilos desea comprar:");
                                int cantKl5 = gabriel.nextInt();
                                double sandia = 5.00;
                                igv = 0.50;
                                subtotal = sandia * cantKl5;
                                total_a_pagar = subtotal + igv;
                                System.out.println("SUBTOTAL " + subtotal);
                                System.out.println("IGV " + igv);
                                System.out.println("TOTAL A PAGAR ES S/. " + total_a_pagar);
                                break;
                            case 6:
                                System.out.println("Ingrese cuantos kilos desea comprar:");
                                int cantKl6 = gabriel.nextInt();
                                double melon = 5.00;
                                igv = 0.50;
                                subtotal = melon * cantKl6;
                                total_a_pagar = subtotal + igv;
                                System.out.println("SUBTOTAL " + subtotal);
                                System.out.println("IGV " + igv);
                                System.out.println("TOTAL A PAGAR ES S/. " + total_a_pagar);
                                break;
                            case 7:
                                System.out.println("Ingrese cuantos kilos desea  Comprar: ");
                                int cantKl7 = gabriel.nextInt();
                                double mango = 7.00;
                                igv = 0.50;
                                subtotal = mango * cantKl7;
                                total_a_pagar = subtotal + igv;
                                System.out.println("SUBTOTAL " + subtotal);
                                System.out.println("IGV " + igv);
                                System.out.println("TOTAL A PAGAR ES S/. " + total_a_pagar);
                                break;
                            case 8:
                                System.out.println("Ingrese cuantos kilos desea  comprar: ");
                                int cantKl8 = gabriel.nextInt();
                                double papaya = 8.00;
                                igv = 0.50;
                                subtotal = papaya * cantKl8;
                                total_a_pagar = subtotal + igv;
                                System.out.println("SUBTOTAL " + subtotal);
                                System.out.println("IGV " + igv);
                                System.out.println("TOTAL A PAGAR ES S/. " + total_a_pagar);
                                break;
                            case 0:
                                System.out.println("Estas regresando....");
                                break;
                            default:
                                System.out.println("Cantidad no valida");
                                break;
                        }
                    } while (tipo != 0);
                    break;
                case 6:
                    System.out.println("Ingrese la cantidad de empanadas a comprar:");
                    int cantidad6 = gabriel.nextInt();
                    double empanadas = 10.00;
                    igv=0.50;
                    subtotal = empanadas* cantidad6;
                    total_a_pagar = subtotal + igv;
                    System.out.println("SUBTOTAL " + subtotal);
                    System.out.println("IGV " + igv);
                    System.out.println("TOTAL A PAGAR ES S/. " + total_a_pagar);
                    break;
                case 0:
                    System.out.println("Gracias por usar nuestro servicio :D");
                    MenuGeneral();
                    break;
                default:
                    System.out.println("Cantidad no valida...");
                    break;
            }
        }
        while (vladimir != 0);
    }


    public void MenuGeneral() {
        int vladimir;
        do {
            System.out.println("\n--- Grifo Primax ---");
            System.out.println("1. Combustible");
            System.out.println("2. Taller Automotriz");
            System.out.println("3. Lavado de Autos");
            System.out.println("4. Snack");
            System.out.println("0. Salir");
            System.out.print("Selecciona una opción: ");
            vladimir = gabriel.nextInt();
            switch (vladimir) {
                case 1:
                    omarVentaCombustible();
                    break;
                case 2:
                    gabrielTallerAutomotriz();
                    break;
                case 3:
                    luzLavadoDeAutos();
                    break;
                case 4:
                    vladimirSnack();
                    break;
                case 0:
                    System.out.println("Saliendo del sistema...");
                    Login();
                    break;
                default:
                    System.out.println("Opción no válida.");
                    break;
            }
        } while (vladimir != 0);
    }

    public void Login() {
        int oportunidades = 0;
        int omar;
        do {
            System.out.println("Benvenido al Logeo General :3");
            System.out.println("1) Crear Cuenta");
            System.out.println("2) Inicia Secion");
            System.out.println("0) Salir");
            omar = gabriel.nextInt();
            gabriel.nextLine();
            switch (omar) {
                case 1:
                    System.out.println("Bienvenido a Grifo Primax");
                    System.out.println("----Crear cuenta----");
                    System.out.println("Ingrese su Nombre");
                    nombreUsuario = gabriel.nextLine();
                    System.out.println("Ingrese su correo");
                    correo = gabriel.nextLine();
                    System.out.println("Ingrese su contraseña");
                    contrasena = gabriel.nextLine();
                    System.out.println("Sr." + nombreUsuario + " Su cuenta ha sido creada satisfactoriamente !!");
                    break;
                case 2:
                    boolean luz1 = true;
                    while (luz1) {
                        System.out.println("|----- Iniciar sesion -----|");
                        System.out.println("Ingrese su correo");
                        String correoIngresado = gabriel.nextLine();
                        System.out.println("Ingrese su contraseña");
                        String contrasenaIngresada = gabriel.nextLine();
                        if (correo.equals(correoIngresado) && contrasena.equals(contrasenaIngresada)) {
                            System.out.println("La cuenta "+correoIngresado+" Se a Iniciado Sesion Exitosamente");
                            MenuGeneral();
                        } else {
                            System.out.println("Datos Incorrectos");
                            oportunidades++;
                            System.out.println("Se realizo " + oportunidades + " Intentos >:C");
                        }

                        if (oportunidades == 4) {
                            System.out.println("Mejor crea una cuenta nueva XDDD");
                            luz1 = false;
                        }
                    }
                    break;
                case 0:
                    System.out.println("Saliendo del sistema :'c");
                    break;
                default:
                    System.out.println("Opción no válida >:C");
                    break;
            }
        } while (omar != 0);
    }

    public static void main(String[] args) {
        Grifo luz = new Grifo();
        luz.Login();
    }
}



