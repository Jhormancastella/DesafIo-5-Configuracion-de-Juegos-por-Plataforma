package com.configuraciondejuegosporplataforma;

import java.util.Scanner;

import com.configuraciondejuegosporplataforma.configs.GraphisConfig;
import com.configuraciondejuegosporplataforma.configs.InputConfig;
import com.configuraciondejuegosporplataforma.factories.PCPlataformFactory;

import com.configuraciondejuegosporplataforma.factories.PlataformFactory;
import com.configuraciondejuegosporplataforma.factories.PlayStationPlataformFactory;
import com.configuraciondejuegosporplataforma.factories.XboxPlataformFactory;


public class Client {

    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Mostrar menú para poder seleccionar entre las diferentes plataformas
        
        System.out.println("Seleccione una plataforma:");
        System.out.println("1. PC (Predeterminada)");
        System.out.println("2. PlayStation");
        System.out.println("3. Xbox");
        System.out.print("Ingrese el número de la plataforma (o presione Enter para usar la predeterminada): ");

        String opcion = scanner.nextLine().trim(); // Leer la opción del usuario

        String plataforma = "PC"; // Valor predeterminado

        // Asignar la plataforma según la opción seleccionada

        switch (opcion) {
            case "1":
            case "": // Si el usuario presiona Enter, se usar la opcion predeterminada
                plataforma = "PC";
                break;
            case "2":
                plataforma = "PlayStation";
                break;
            case "3":
                plataforma = "Xbox";
                break;
            default:
                System.out.println("Opción no válida. Usando plataforma predeterminada (PC).");
                break;
        }

        System.out.println("\nDetectando plataforma...");
        System.out.println("Plataforma seleccionada: " + plataforma);

        PlataformFactory factory = null;

        // Crear la fábrica correspondiente a la plataforma seleccionada

        switch (plataforma.toLowerCase()) {
            case "pc":
                factory = new PCPlataformFactory();
                break;
            case "playstation":
                factory = new PlayStationPlataformFactory();
                break;
            case "xbox":
                factory = new XboxPlataformFactory();
                break;
            default:
                System.out.println("Plataforma no soportada.");
                return;
        }

        InputConfig input = factory.createInputConfig();
        GraphisConfig graphics = factory.createGraphisConfig();

        graphics.configureGraphics();
        input.configureInput();

        System.out.println("\n¡Configuración completada! El juego está listo para jugar en " + plataforma + ".");

        scanner.close();
    }
}