public void snack() {
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
                igv = 0.50;
                subtotal = empanada* cantidad6;
                total_a_pagar = subtotal + igv;
                System.out.println("SUBTOTAL " + subtotal);
                System.out.println("IGV " + igv);
                System.out.println("TOTAL A PAGAR ES S/. " + total_a_pagar);
                break;
            case 0:
                System.out.println("Gracias por usar nuestro servicio :D");
                Primax vladimirApaza = new Primax();
                vladimirApaza.MenuGeneral();
                break;
            default:
                System.out.println("Cantidad no valida...");
                break;
        }
    }
    while (vladimir != 0);
}
