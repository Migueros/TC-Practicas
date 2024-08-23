package Practica3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Run {
    public static void main(String[] args) throws IOException {
        // Mapa para almacenar las zonas y sus precios por minuto
        Map<Integer, Double> zonaPrecios = new HashMap<>();
        zonaPrecios.put(12, 2.0); 
        zonaPrecios.put(15, 2.2);
        zonaPrecios.put(18, 4.5);
        zonaPrecios.put(19, 3.5); 
        zonaPrecios.put(23, 6.0);
        zonaPrecios.put(25, 6.0);
        zonaPrecios.put(29, 5.0);  
        
        
        BufferedReader br = new BufferedReader(
                              new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int t = Integer.parseInt(st.nextToken());

        while (t-- > 0) {
            System.out.println("Ingrese la clave de la zona y la cantidad de minutos separados por una coma (ej: 12,2):");
            String input = br.readLine();
            
            st = new StringTokenizer(input, ",");
            int clave = Integer.parseInt(st.nextToken()); 
            int minutos = Integer.parseInt(st.nextToken()); 

            
            if (zonaPrecios.containsKey(clave)) {
                double precioPorMinuto = zonaPrecios.get(clave);
                double costoTotal = precioPorMinuto * minutos;
                System.out.println("El costo total de la llamada es: $" + costoTotal);
            } else {
                System.out.println("Clave no reconocida.");
            }
        }
    }
}

