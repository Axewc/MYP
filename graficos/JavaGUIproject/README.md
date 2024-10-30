# `javax.swing`

Este directorio contiene ejemplos de aplicaciones gráficas en Java usando la biblioteca `javax.swing`. Estos ejemplos están diseñados para ser simples y fáciles de entender, y se pueden usar como punto de partida para proyectos más complejos.

1. **Estructura de archivos**: Crea una estructura simple con subcarpetas para organizar las clases y los recursos, si planeas incluir iconos o imágenes. Ejemplo:

   ```
   ├── src/
   │   ├── Main.java
   │   └── gui/
   │       ├── VentanaPrincipal.java
   │       └── Componentes.java
   ```

2. **Temas**:

    1. Configuración inicial y estructura del proyecto.
    2. Ventanas y contenedores básicos (`JFrame`, `JPanel`).
    3. Componentes interactivos (`JButton`, `JTextField`, `JLabel`).
    4. Eventos de usuario con `ActionListener`, `MouseListener`, etc.
    5. Diseño y disposición con `LayoutManagers` (como `BorderLayout`, `GridLayout`).

3. **Compilación y ejecución**: Instrucciones para compilar desde la terminal usando `javac` y ejecutar con `java`.

## 1. Configuración inicial y estructura del proyecto

Para iniciar con una estructura básica y configuración del proyecto en Java para interfaces gráficas en Ubuntu.

### 1. Creación de la Estructura de Archivos

Primero, crea una estructura de carpetas sencilla para organizar el código y facilitar la compilación y ejecución desde la terminal.

```bash
mkdir JavaGUIProject
cd JavaGUIProject
mkdir src
```

Luego, dentro de la carpeta `src`, puedes crear una subcarpeta para agrupar las clases relacionadas con la interfaz gráfica.

```bash
mkdir src/gui
```

La estructura quedaría así:

```
JavaGUIProject/
└── src/
    ├── Main.java
    └── gui/
        └── VentanaPrincipal.java
```

### 2. Crear el Archivo `Main.java`

El archivo `Main.java` contendrá el punto de entrada del programa y se encargará de lanzar la interfaz gráfica.

Usando un editor de texto (como `nano`, `gedit`, o Visual Studio Code), crea el archivo `Main.java` en la carpeta `src`:

```java
// src/Main.java
import javax.swing.SwingUtilities;
import gui.VentanaPrincipal;

public class Main {
    public static void main(String[] args) {
        // Ejecuta la GUI en el hilo de eventos para evitar problemas de concurrencia
        SwingUtilities.invokeLater(() -> {
            VentanaPrincipal ventana = new VentanaPrincipal();
            ventana.setVisible(true);
        });
    }
}
```

### 3. Crear la Clase de la Ventana Principal (`VentanaPrincipal`)

Este archivo contendrá el código de la ventana principal de la interfaz gráfica.

En la carpeta `src/gui`, crea el archivo `VentanaPrincipal.java`:

```java
// src/gui/VentanaPrincipal.java
package gui;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class VentanaPrincipal extends JFrame {

    public VentanaPrincipal() {
        // Configuración básica de la ventana
        setTitle("Ventana Principal");
        setSize(400, 300); // Tamaño de la ventana
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Termina el programa al cerrar la ventana

        // Crear un panel y agregar componentes
        JPanel panel = new JPanel();
        JLabel etiqueta = new JLabel("¡Bienvenido a la GUI en Java!");
        JButton boton = new JButton("Haz clic aquí");

        // Agregar componentes al panel
        panel.add(etiqueta);
        panel.add(boton);

        // Agregar el panel a la ventana
        add(panel);
    }
}
```

### 4. Compilación desde la Terminal

Para compilar el proyecto sin Maven, usa el comando `javac`. Coloca tu terminal en la carpeta raíz `JavaGUIProject` y ejecuta los siguientes comandos:

```bash
cd src
javac Main.java gui/VentanaPrincipal.java
```

Esto generará los archivos `.class` en las mismas carpetas.

### 5. Ejecutar el Programa

Una vez compilado, ejecuta el programa usando `java` desde la carpeta `src`:

```bash
java Main
```

Al ejecutar este comando, deberías ver una ventana con un título "Ventana Principal", un mensaje de bienvenida y un botón.

## 2. Ventanas y Contenedores Básicos

¡Excelente! Vamos a adentrarnos en los elementos principales de una interfaz gráfica en Java: `JFrame` y `JPanel`. Estos son componentes básicos que te permitirán estructurar y organizar los elementos gráficos.

### 1. `JFrame`: La Ventana Principal

En Java, `JFrame` es la ventana principal que contiene la interfaz gráfica. Piensa en él como el “marco” de la aplicación.

- **Creación y Configuración de un `JFrame`**: Puedes ajustar su tamaño, título, comportamiento al cerrar, etc.
- **Métodos clave de `JFrame`**:
  - `setTitle(String title)`: Establece el título de la ventana.
  - `setSize(int width, int height)`: Ajusta el tamaño de la ventana.
  - `setDefaultCloseOperation(int operation)`: Define qué ocurre al cerrar la ventana. Por ejemplo, `JFrame.EXIT_ON_CLOSE` termina el programa.

#### Ejemplo básico de `JFrame`

```java
// src/gui/VentanaPrincipal.java
package gui;

import javax.swing.JFrame;

public class VentanaPrincipal extends JFrame {

    public VentanaPrincipal() {
        // Configuración básica de la ventana
        setTitle("Mi Primera Ventana");
        setSize(500, 400); // Ancho: 500px, Alto: 400px
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Cierra el programa al cerrar la ventana
    }
}
```

Este ejemplo crea una ventana titulada "Mi Primera Ventana" que se cierra al presionar el botón de cierre de la ventana.

### 2. `JPanel`: Un Contenedor para Componentes

El `JPanel` es un contenedor flexible que organiza los componentes dentro de una `JFrame`. Los `JPanel` son útiles para agrupar elementos, como etiquetas, botones, y campos de texto, y aplican un `Layout` (diseño de disposición) que define cómo se colocan esos elementos.

#### Métodos comunes de `JPanel`

- `add(Component component)`: Agrega un componente (como un botón o etiqueta) al panel.
- `setLayout(LayoutManager layout)`: Configura el diseño del panel.

#### Ejemplo de `JPanel` dentro de un `JFrame`

A continuación, ampliamos nuestro código de `VentanaPrincipal` para incluir un `JPanel` con algunos componentes básicos:

```java
// src/gui/VentanaPrincipal.java
package gui;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class VentanaPrincipal extends JFrame {

    public VentanaPrincipal() {
        // Configuración de la ventana principal
        setTitle("Ventana Principal con JPanel");
        setSize(500, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Crear un JPanel para agregar componentes
        JPanel panel = new JPanel(); // Panel por defecto usa FlowLayout

        // Crear componentes
        JLabel etiqueta = new JLabel("Bienvenido a la GUI con JPanel");
        JButton boton = new JButton("Haz clic aquí");

        // Agregar componentes al panel
        panel.add(etiqueta);
        panel.add(boton);

        // Agregar el panel a la ventana
        add(panel); // Se agrega el panel al centro de la ventana
    }
}
```

### 3. Disposición de Componentes en un `JPanel`

Por defecto, un `JPanel` usa un diseño de disposición (`Layout`) llamado `FlowLayout`, que coloca los elementos uno junto al otro en el orden en que se agregan, similar a una línea de texto.

#### Ejemplo con un Diseño Personalizado: `BorderLayout`

Para organizar mejor los componentes en la ventana, puedes usar distintos `LayoutManagers`. Un `BorderLayout`, por ejemplo, permite distribuir componentes en cinco áreas: Norte, Sur, Este, Oeste y Centro.

```java
// src/gui/VentanaPrincipal.java
package gui;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.BorderLayout;

public class VentanaPrincipal extends JFrame {

    public VentanaPrincipal() {
        // Configuración de la ventana principal
        setTitle("Ventana con BorderLayout");
        setSize(500, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Usar BorderLayout en la ventana principal
        setLayout(new BorderLayout());

        // Crear componentes para cada región
        JLabel etiquetaNorte = new JLabel("Norte", JLabel.CENTER);
        JButton botonSur = new JButton("Sur");
        JButton botonEste = new JButton("Este");
        JButton botonOeste = new JButton("Oeste");
        JLabel etiquetaCentro = new JLabel("Centro", JLabel.CENTER);

        // Agregar componentes a cada región de BorderLayout
        add(etiquetaNorte, BorderLayout.NORTH);
        add(botonSur, BorderLayout.SOUTH);
        add(botonEste, BorderLayout.EAST);
        add(botonOeste, BorderLayout.WEST);
        add(etiquetaCentro, BorderLayout.CENTER);
    }
}
```

### 4. Compilación y Ejecución

Compila el código con:

```bash
cd src
javac Main.java gui/VentanaPrincipal.java
```

Ejecuta el programa:

```bash
java Main
```

Esto mostrará una ventana con componentes dispuestos en cada región. Con `JFrame` y `JPanel` como base, tienes la flexibilidad para estructurar interfaces más complejas.

¿Te gustaría seguir con más detalles sobre otros `LayoutManagers`, o prefieres explorar cómo responder a eventos de usuario, como hacer clic en un botón?
