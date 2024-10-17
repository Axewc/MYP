
# README - Proyecto 01: CheemsMart

**Equipo**: CheemsMart Dev Team  
**Integrantes**:  

- Axel Casas Espinosa - 316218849

**Nombre del Proyecto**: Implementación de un sistema de tienda virtual - CheemsMart

## Introducción

Este proyecto tiene como objetivo implementar un sistema de tienda virtual para la empresa CheemsMart, usando patrones de diseño para resolver la problemática de flexibilidad, extensibilidad y eficiencia en el software. Los patrones se utilizan para evitar problemas de rigidez, fragilidad, inmovilidad y viscosidad.

En este README se justifican los patrones de diseño utilizados en cada parte del sistema y se explica brevemente el funcionamiento del sistema CheemsMart.

## Patrones de Diseño Utilizados y Justificación

1. **Patrón Strategy**  
   *En la parte de la personalización del idioma de la tienda virtual decidimos usar el patrón Strategy.*  
   El patrón Strategy permite implementar diferentes estrategias para cambiar el idioma de la tienda (inglés, español y portugués) de acuerdo con la nacionalidad del cliente. De esta forma, el sistema es fácil de extender cuando se incorporen nuevos países, ya que basta con agregar nuevas implementaciones de `EstrategiaIdioma` sin modificar el núcleo del sistema.

2. **Patrón Proxy**  
   *En la parte de la carga del catálogo decidimos usar el patrón Proxy.*  
   Debido a que se requiere proteger el catálogo real de vulnerabilidades de seguridad, el patrón Proxy permite crear un acceso seguro al catálogo, mostrando una representación del catálogo a los clientes, sin exponer la información original. Esto es importante para evitar modificaciones no autorizadas del catálogo.

3. **Patrón Factory**  
   *En la parte de la generación de ofertas decidimos usar el patrón Factory.*  
   Utilizamos el patrón Factory para encapsular la lógica de creación de ofertas según el país de origen del cliente. Esto facilita la extensión del sistema, ya que nuevas reglas de oferta pueden ser añadidas simplemente implementando nuevas clases de ofertas y registrándolas en la `OfertaFactory`.

4. **Patrón Singleton**  
   *En la parte del control del catálogo se usó el patrón Singleton.*  
   Para garantizar que exista una única instancia del catálogo y evitar inconsistencias de datos, utilizamos el patrón Singleton en la implementación de la clase `Catalogo`. De esta manera, todos los clientes que acceden al catálogo lo hacen a la misma instancia.

5. **Patrón MVC (Model-View-Controller)**  
   *En la estructura general del sistema, se utilizó el patrón MVC.*  
   Para mantener una separación clara entre la lógica de negocio (modelo), la presentación (vista) y la interacción con el usuario (controlador), implementamos la estructura MVC. Esto mejora la mantenibilidad y facilita la modificación del sistema sin afectar otras capas.

## Estructura del Código

El código está dividido en los siguientes paquetes:

1. **com.cheemsmart.model**  
   Contiene las clases que representan el modelo del sistema, incluyendo `Cliente`, `Producto`, `Catalogo`, y `Oferta`. Estas clases manejan la información fundamental de la tienda virtual.

2. **com.cheemsmart.factory**  
   Contiene la clase `OfertaFactory`, la cual es responsable de crear ofertas según el país del cliente.

3. **com.cheemsmart.strategy**  
   Define la interfaz `EstrategiaIdioma` y sus implementaciones (`EstrategiaEspanol`, `EstrategiaPortugues`, `EstrategiaIngles`) para adaptar el idioma de la tienda.

4. **com.cheemsmart.controller**  
   Contiene el controlador `CheemsMartController`, que maneja el flujo de la aplicación, incluyendo la autenticación de clientes y la gestión de compras.

5. **com.cheemsmart.proxy**  
   Contiene la clase `ProxyCatalogo`, la cual actúa como un proxy seguro para acceder al catálogo de productos.

## Ejemplo de Ejecución

Para probar el sistema, se proporcionan algunos datos de ejemplo:

### Cliente de Ejemplo

- **Nombre de Usuario**: `juan_perez`
- **Contraseña**: `contraseña123`
- **Cuenta Bancaria**: `1234567890`
- **País de Origen**: `México`
- **Saldo**: `$5000.00`

Este cliente ya está registrado en el sistema, y se puede utilizar para ejecutar las funcionalidades de la tienda, como la autenticación y la compra de productos.

### Pasos para Ejecutar

1. Ejecutar el archivo principal `CheemsMartApp`.
2. Iniciar sesión con el cliente de ejemplo.
3. Probar las opciones de ver el catálogo, realizar una compra, y cerrar sesión.

## Herramientas y Tecnología Utilizadas

- **Lenguaje de Programación**: Java (JDK 22)
- **Patrones de Diseño**: Strategy, Proxy, Factory, Singleton, MVC
- **Documentación**: Javadoc (documentación del código fuente incluida)

## Notas Adicionales

- El código está documentado con **Javadoc**, siguiendo los lineamientos del proyecto.
- Los diagramas UML, incluyendo el diagrama de clases y el diagrama de secuencia, se encuentran adjuntos en la entrega en formato PNG.
- Se ha utilizado **Java 22 (JDK 22)** para la implementación del proyecto. Es importante asegurarse de tener esta versión instalada para ejecutar el código correctamente.
  
## Lineamientos de Entrega

- El archivo de entrega está comprimido en un `.zip` titulado `Practica01_CheemsMartDevTeam.zip`.
- El `.zip` contiene:
  - Este archivo README en formato PDF.
  - Diagramas UML en imágenes (JPG/PNG).
  - Carpeta `src` con todos los archivos `.java` del proyecto.
  
## Evaluación

- **50% Patrones, implementación, y justificación**: Se aplicaron y justificaron los patrones de diseño mencionados arriba.
- **30% UML**: Se adjuntan los diagramas de clases y secuencia según los requerimientos.
- **20% Funcionamiento**: El sistema cumple con los requerimientos de funcionalidad especificados.

## Contacto

Para cualquier duda o comentario sobre este proyecto, puedes contactarme en: <axew@ciencias.unam.mx>

---

### Descripción del Diagrama de Clases

- **Paquete `com.cheemsmart.model`**: Contiene las clases `Cliente`, `Producto`, `Catalogo`, y `Oferta`, que representan la información fundamental de la tienda virtual.
- **Paquete `com.cheemsmart.factory`**: La clase `OfertaFactory` es una fábrica que crea objetos de tipo `Oferta` según el país.
- **Paquete `com.cheemsmart.strategy`**: Define la interfaz `EstrategiaIdioma` y sus implementaciones `EstrategiaEspanol`, `EstrategiaPortugues`, y `EstrategiaIngles`.
- **Paquete `com.cheemsmart.controller`**: Contiene la clase `CheemsMartController`, que controla el flujo del programa, utiliza `EstrategiaIdioma` y maneja la autenticación de clientes y las compras.
- **Paquete `com.cheemsmart.proxy`**: Contiene la interfaz `CatalogoProxy` y la clase `ProxyCatalogo`, que actúa como un proxy para acceder al catálogo de productos.

### Explicación del Diagrama de Secuencia

- **Cliente (`c`)**: El usuario que interactúa con el sistema.
- **CheemsMartController (`cc`)**: Controlador principal del sistema que coordina las operaciones.
- **ProxyCatalogo (`pc`)**: Proxy que controla el acceso seguro al catálogo de productos.
- **Catalogo (`cat`)**: Representación del catálogo real de la tienda.
- **Cliente (`cli`)**: Clase que representa la lógica relacionada con el cliente y sus datos.
- **OfertaFactory (`of`)**: Fábrica que genera las ofertas dependiendo del país del cliente.
- **Compra (`com`)**: Registro de la compra efectuada.

#### Flujo

1. El cliente inicia sesión.
2. Si las credenciales son válidas, se muestra el menú de opciones.
3. El cliente puede optar por ver el catálogo y luego realizar una compra.
4. El catálogo es cargado a través del proxy, que interactúa con el catálogo real.
5. Si el cliente elige realizar una compra, se valida su saldo.
6. Se genera una oferta aplicable (si corresponde) según el país del cliente.
7. El cliente ingresa su cuenta bancaria para confirmar la compra.
8. Si todos los datos son válidos, se registra la compra y se muestra un ticket.