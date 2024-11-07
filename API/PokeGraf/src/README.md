Claro, aquí tienes una versión más detallada del archivo

README.md

 que incluye una explicación más profunda sobre cómo funcionan y se realizan las llamadas a la API:

```markdown
# Proyecto PokeGraf

## Introducción

PokeGraf es una aplicación de escritorio en Java que permite obtener información detallada sobre Pokémon utilizando la API de PokeAPI. La aplicación muestra estadísticas base, habilidades y movimientos aprendidos por los Pokémon en diferentes versiones del juego. La interfaz gráfica está construida utilizando Swing y sigue el patrón de diseño MVC (Modelo-Vista-Controlador).

## Requisitos

- Java Development Kit (JDK) 8 o superior
- Biblioteca Gson para trabajar con JSON

## Instalación

1. **Descargar Gson**:
   - Descarga el archivo JAR de Gson desde [Maven Central](https://search.maven.org/artifact/com.google.code.gson/gson).

2. **Agregar Gson al proyecto**:
   - Coloca el archivo `gson-2.11.0.jar` en una carpeta llamada `lib` dentro de tu proyecto.

## Compilación y Ejecución

1. **Compilar el proyecto**:
   ```sh
   javac -cp lib/gson-2.11.0.jar src/PokeApiClient.java src/PokeApiController.java src/GUI.java
   ```

2. **Ejecutar la aplicación**:

   ```sh
   java -cp lib/gson-2.11.0.jar:src GUI
   ```

## Implementación MVC

El proyecto sigue el patrón de diseño MVC (Modelo-Vista-Controlador):

- **Modelo (Model)**: `PokeApiClient.java`
  - Maneja la lógica de negocio y las llamadas a la API.
- **Vista (View)**: `GUI.java`
  - Maneja la interfaz de usuario utilizando Swing.
- **Controlador (Controller)**: `PokeApiController.java`
  - Maneja la comunicación entre el modelo y la vista.

## API de PokeAPI

PokeAPI es una API RESTful que proporciona información sobre Pokémon. La aplicación realiza llamadas a esta API para obtener datos sobre los Pokémon.

### Llamadas a la API

#### Obtener datos de un Pokémon

Para obtener los datos de un Pokémon, se realiza una solicitud HTTP GET a la URL `https://pokeapi.co/api/v2/pokemon/{pokemonName}`, donde `{pokemonName}` es el nombre del Pokémon que se desea consultar.

```java
public static String getPokemonData(String pokemonName) throws Exception {
    URI uri = new URI(API_URL + "pokemon/" + pokemonName);
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

1. **Construcción de la URL**: Se construye la URL utilizando el nombre del Pokémon.
2. **Apertura de la Conexión**: Se abre una conexión HTTP utilizando `HttpURLConnection`.
3. **Configuración del Método**: Se configura el método HTTP como `GET`.
4. **Manejo de la Respuesta**: Se lee la respuesta del servidor. Si el código de respuesta es `200` (OK), se lee el contenido de la respuesta y se devuelve como una cadena. Si no, se lanza una excepción.

#### Obtener versiones del juego

Para obtener las versiones del juego, se realiza una solicitud HTTP GET a la URL `https://pokeapi.co/api/v2/version-group/`.

```java
public static String[] getGameVersions() throws Exception {
    URI uri = new URI(API_URL + "version-group/");
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

        JsonObject jsonObject = JsonParser.parseString(content.toString()).getAsJsonObject();
        JsonArray versionsArray = jsonObject.getAsJsonArray("results");
        String[] versions = new String[versionsArray.size()];
        for (int i = 0; i < versionsArray.size(); i++) {
            versions[i] = versionsArray.get(i).getAsJsonObject().get("name").getAsString();
        }
        return versions;
    } else {
        throw new RuntimeException("Error en la solicitud HTTP: " + responseCode);
    }
}
```

1. **Construcción de la URL**: Se construye la URL para obtener las versiones del juego.
2. **Apertura de la Conexión**: Se abre una conexión HTTP utilizando `HttpURLConnection`.
3. **Configuración del Método**: Se configura el método HTTP como `GET`.
4. **Manejo de la Respuesta**: Se lee la respuesta del servidor. Si el código de respuesta es `200` (OK), se lee el contenido de la respuesta y se convierte en un objeto JSON. Luego, se extraen los nombres de las versiones y se devuelven como un arreglo de cadenas.

## Elementos de Swing Utilizados

- **JFrame**: La ventana principal de la aplicación.
- **JPanel**: Un contenedor para organizar otros componentes.
- **JLabel**: Etiquetas de texto.
- **JTextField**: Campos de texto para la entrada del usuario.
- **JComboBox**: Menú desplegable para seleccionar la versión del juego.
- **JButton**: Botón para iniciar la búsqueda.
- **JTextArea**: Área de texto para mostrar los resultados.
- **JScrollPane**: Contenedor con barra de desplazamiento para el área de texto.

## Ejemplo de Uso

1. Ejecuta la aplicación.
2. Ingresa el nombre de un Pokémon en el campo de texto.
3. Selecciona la versión del juego en el menú desplegable.
4. Haz clic en el botón "Buscar" o presiona Enter.
5. La aplicación mostrará la información del Pokémon, incluyendo estadísticas base, habilidades y movimientos aprendidos.

## Contribuciones

Las contribuciones son bienvenidas. Si deseas contribuir, por favor abre un issue o envía un pull request.

## Licencia

Este proyecto está licenciado bajo la Licencia MIT. Consulta el archivo `LICENSE` para más detalles.

## Anexo: Detalles Teóricos

### Patrón de Diseño MVC

El patrón de diseño Modelo-Vista-Controlador (MVC) es una forma de organizar el código en aplicaciones que separa la lógica de negocio, la interfaz de usuario y la entrada del usuario en tres componentes distintos:

- **Modelo (Model)**: Representa los datos y la lógica de negocio de la aplicación. En este proyecto, `PokeApiClient.java` actúa como el modelo.
- **Vista (View)**: Representa la interfaz de usuario y muestra los datos al usuario. En este proyecto, `GUI.java` actúa como la vista.
- **Controlador (Controller)**: Maneja la entrada del usuario y actualiza el modelo y la vista en consecuencia. En este proyecto, `PokeApiController.java` actúa como el controlador.

### API RESTful

Una API RESTful es una interfaz que utiliza HTTP para obtener y manipular datos. Las API RESTful siguen los principios de REST (Representational State Transfer) y utilizan métodos HTTP estándar como GET, POST, PUT y DELETE.

- **GET**: Recupera información del servidor.
- **POST**: Envía datos al servidor para crear un nuevo recurso.
- **PUT**: Actualiza un recurso existente en el servidor.
- **DELETE**: Elimina un recurso del servidor.

### Swing

Swing es una biblioteca de Java para crear interfaces gráficas de usuario (GUI). Proporciona una amplia gama de componentes como ventanas, botones, campos de texto y áreas de texto.

- **JFrame**: Una ventana principal que puede contener otros componentes.
- **JPanel**: Un contenedor ligero que puede contener otros componentes.
- **JLabel**: Un componente para mostrar texto.
- **JTextField**: Un campo de texto de una sola línea.
- **JComboBox**: Un menú desplegable.
- **JButton**: Un botón que puede ser clicado por el usuario.
- **JTextArea**: Un área de texto de varias líneas.
- **JScrollPane**: Un contenedor que proporciona barras de desplazamiento.

### Gson

Gson es una biblioteca de Java para convertir objetos Java a su representación JSON y viceversa. Es útil para trabajar con datos JSON en aplicaciones Java.

- **JsonObject**: Representa un objeto JSON.
- **JsonArray**: Representa un array JSON.
- **JsonParser**: Proporciona métodos para analizar (parsear) cadenas JSON y convertirlas en objetos Gson.

```

Espero que esta explicación más detallada te ayude a comprender mejor el funcionamiento y la estructura del proyecto PokeGraf. Si tienes alguna otra pregunta o necesitas más información, no dudes en preguntar. ¡Estoy aquí para ayudarte! 😊👍
```
