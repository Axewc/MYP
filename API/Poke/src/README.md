# Documentación de PokeApiClient.java

## Introducción

`PokeApiClient.java` es una clase en Java que se encarga de realizar peticiones a la API de PokeAPI para obtener información detallada sobre Pokémon. Esta clase incluye métodos para obtener datos de un Pokémon específico y filtrar los movimientos aprendidos subiendo de nivel.

## Requisitos

- Java Development Kit (JDK) 8 o superior
- Biblioteca Gson para trabajar con JSON

## Instalación

1. **Descargar Gson**:
   - Descarga el archivo JAR de Gson desde [Maven Central](https://search.maven.org/artifact/com.google.code.gson/gson).

2. **Agregar Gson al proyecto**:
   - Coloca el archivo `gson-2.11.0.jar` en una carpeta llamada `lib` dentro de tu proyecto.

## Compilación y Ejecución

1. **Compilar el archivo**:
   ```sh
   javac -cp lib/gson-2.11.0.jar src/PokeApiClient.java
   ```

2. **Ejecutar el archivo**:

   ```sh
   java -cp lib/gson-2.11.0.jar:src PokeApiClient
   ```

## Descripción del Código

### Importaciones

```java
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.net.URI;
import com.google.gson.JsonArray;
```

Estas importaciones son necesarias para manejar las conexiones HTTP, leer las respuestas del servidor y trabajar con JSON utilizando la biblioteca Gson.

### Clase `PokeApiClient`

```java
public class PokeApiClient {
```

La clase `PokeApiClient` contiene métodos para realizar peticiones a la API de PokeAPI y procesar las respuestas.

### Constante `API_URL`

```java
private static final String API_URL = "https://pokeapi.co/api/v2/pokemon/";
```

Esta constante define la URL base de la API de PokeAPI para obtener datos de Pokémon.

### Método `main`

```java
public static void main(String[] args) {
    try {
        String pokemonName = "sprigatito"; // Cambia esto por el nombre del Pokémon que desees
        String jsonResponse = getPokemonData(pokemonName);

        JsonObject jsonObject = JsonParser.parseString(jsonResponse).getAsJsonObject();
        System.out.println("Nombre: " + jsonObject.get("name").getAsString());
        System.out.println("Altura: " + jsonObject.get("height").getAsInt());
        System.out.println("Peso: " + jsonObject.get("weight").getAsInt());
        System.out.println("Tipo: " + jsonObject.getAsJsonArray("types").get(0).getAsJsonObject().getAsJsonObject("type").get("name").getAsString());
        System.out.println("Habilidad: " + jsonObject.getAsJsonArray("abilities").get(0).getAsJsonObject().getAsJsonObject("ability").get("name").getAsString());
        // Movimientos del Pokémon 
        // System.out.println("Movimientos:" + jsonObject.getAsJsonArray("moves").get(1).toString());
        // Filtrar e imprimir solo movimientos aprendidos con "level-up"
        System.out.println("Movimientos aprendidos subiendo de nivel:");
        for (int i = 0; i < jsonObject.getAsJsonArray("moves").size(); i++) {
            JsonObject move = jsonObject.getAsJsonArray("moves").get(i).getAsJsonObject();
            JsonArray versionGroupDetails = move.getAsJsonArray("version_group_details");
            for (int j = 0; j < versionGroupDetails.size(); j++) {
                JsonObject versionDetail = versionGroupDetails.get(j).getAsJsonObject();
                if (versionDetail.getAsJsonObject("move_learn_method").get("name").getAsString().equals("level-up")) {
                    System.out.println(move.getAsJsonObject("move").get("name").getAsString());
                    break; // Salir del bucle interno si se encuentra "level-up"
                }
            }
        }
    } catch (Exception e) {
        e.printStackTrace();
    }
}
```

Este método principal realiza las siguientes acciones:

1. Define el nombre del Pokémon que se desea consultar.
2. Llama al método `getPokemonData` para obtener los datos del Pokémon en formato JSON.
3. Analiza la respuesta JSON y extrae información como el nombre, altura, peso, tipo y habilidad del Pokémon.
4. Filtra e imprime los movimientos aprendidos subiendo de nivel.

### Método `getPokemonData`

```java
public static String getPokemonData(String pokemonName) throws Exception {
    URI uri = new URI(API_URL + pokemonName);
    URL url = uri.toURL();
    HttpURLConnection connection = (HttpURLConnection) url.openConnection();
    connection.setRequestMethod("GET");

    int responseCode = connection.getResponseCode();
    if (responseCode == 200) {
        BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
        String inputLine;
        StringBuilder content = new StringBuilder();

        while ((inputLine = in.readLine()) != null) {
            content.append(inputLine);
        }

        in.close();
        connection.disconnect();
        return content.toString();
    } else {
        throw new RuntimeException("Error en la solicitud HTTP: " + responseCode);
    }
}
```

Este método realiza las siguientes acciones:

1. **Construcción de la URL**: Se construye la URL utilizando el nombre del Pokémon.
2. **Apertura de la Conexión**: Se abre una conexión HTTP utilizando `HttpURLConnection`.
3. **Configuración del Método**: Se configura el método HTTP como `GET`.
4. **Manejo de la Respuesta**: Se lee la respuesta del servidor. Si el código de respuesta es `200` (OK), se lee el contenido de la respuesta y se devuelve como una cadena. Si no, se lanza una excepción.

## Conclusión

La clase `PokeApiClient` proporciona una forma sencilla de obtener información detallada sobre Pokémon utilizando la API de PokeAPI. Utiliza la biblioteca Gson para analizar las respuestas JSON y extraer la información relevante. Esta clase puede ser extendida para incluir más funcionalidades según sea necesario.

---