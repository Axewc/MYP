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

## 3. Componentes Interactivos

Los componentes interactivos son fundamentales para construir interfaces gráficas que permitan la entrada y visualización de datos. Aquí exploraremos tres componentes comunes: `JButton`, `JTextField`, y `JLabel`.

### 1. `JButton`: Botones Interactivos

`JButton` es un componente que permite al usuario ejecutar acciones con solo hacer clic. Este botón es muy común y se usa en conjunto con eventos para definir lo que debe ocurrir al ser presionado.

- **Creación de un `JButton`**: Puedes crear un botón con texto o iconos.
- **Método principal**:
  - `addActionListener(ActionListener listener)`: Asocia un evento al botón para que responda cuando el usuario hace clic.

#### Ejemplo de `JButton`

```java
// Dentro de VentanaPrincipal.java
JButton boton = new JButton("Presiona aquí");
boton.addActionListener(e -> {
    System.out.println("¡Botón presionado!");
});
panel.add(boton); // Agrega el botón al panel
```

Este código crea un botón que imprime un mensaje en la consola cada vez que el usuario lo presiona.

### 2. `JTextField`: Campos de Texto para Entrada de Datos

`JTextField` permite al usuario ingresar texto en una línea. Es útil para obtener información como nombres, direcciones o cualquier dato de tipo texto.

- **Creación de un `JTextField`**: Puedes especificar el ancho en columnas.
- **Métodos principales**:
  - `getText()`: Obtiene el texto ingresado por el usuario.
  - `setText(String text)`: Define el texto dentro del campo.
  - `setEditable(boolean editable)`: Define si el campo es editable.

#### Ejemplo de `JTextField`

```java
// Dentro de VentanaPrincipal.java
JTextField campoTexto = new JTextField(15); // Campo de texto de 15 columnas
panel.add(campoTexto); // Agrega el campo de texto al panel

// Capturar el texto del JTextField al presionar el botón
boton.addActionListener(e -> {
    String texto = campoTexto.getText(); // Obtiene el texto ingresado
    System.out.println("Texto ingresado: " + texto);
});
```

Este ejemplo agrega un campo de texto y, cuando el usuario presiona el botón, imprime el texto ingresado en la consola.

### 3. `JLabel`: Etiquetas para Mostrar Texto

`JLabel` se usa para mostrar texto o imágenes estáticas en la interfaz. Las etiquetas son útiles para informar al usuario sobre el propósito de otros componentes o para mostrar mensajes.

- **Creación de un `JLabel`**: Puedes agregar texto o una imagen.
- **Método principal**:
  - `setText(String text)`: Cambia el texto que muestra la etiqueta.

#### Ejemplo de `JLabel`

```java
// Dentro de VentanaPrincipal.java
JLabel etiqueta = new JLabel("Ingrese su nombre:");
panel.add(etiqueta); // Agrega la etiqueta al panel
```

Este código crea una etiqueta con el texto "Ingrese su nombre:" que aparece junto al campo de texto en la interfaz.

### 4. Ejemplo Completo: Interacción entre `JButton`, `JTextField`, y `JLabel`

Para un ejemplo completo, crearemos una interfaz que incluya una etiqueta, un campo de texto para ingresar un nombre y un botón que muestre el nombre ingresado en otra etiqueta.

```java
// src/gui/VentanaPrincipal.java
package gui;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPanel;
import java.awt.FlowLayout;

public class VentanaPrincipal extends JFrame {

    public VentanaPrincipal() {
        // Configuración de la ventana principal
        setTitle("Interacción de Componentes");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Configurar el panel y su diseño
        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout()); // Coloca los componentes en línea

        // Crear componentes
        JLabel etiqueta = new JLabel("Ingrese su nombre:");
        JTextField campoTexto = new JTextField(15); // Campo de texto de 15 columnas
        JButton boton = new JButton("Mostrar nombre");
        JLabel resultado = new JLabel(""); // Etiqueta vacía para mostrar el resultado

        // Agregar componentes al panel
        panel.add(etiqueta);
        panel.add(campoTexto);
        panel.add(boton);
        panel.add(resultado);

        // Agregar funcionalidad al botón
        boton.addActionListener(e -> {
            String nombre = campoTexto.getText();
            resultado.setText("Nombre ingresado: " + nombre);
        });

        // Agregar el panel a la ventana
        add(panel);
    }
}
```

En este ejemplo:

1. El usuario ingresa un nombre en el `JTextField`.
2. Al presionar el `JButton`, el texto del `JTextField` se captura y se muestra en el `JLabel` `resultado`.

### 5. Compilación y Ejecución del Proyecto

Compila y ejecuta el programa con los siguientes comandos desde la carpeta `src`:

```bash
javac Main.java gui/VentanaPrincipal.java
java Main
```

## 4. Eventos de Usuario con `ActionListener`, `MouseListener`, etc.

Los eventos de usuario son fundamentales para crear aplicaciones interactivas. En Java, se usan varios tipos de “Listeners” (escuchadores) que detectan las interacciones del usuario, como clics, movimientos de ratón, o acciones de teclado, y permiten responder a cada una de ellas.

Aquí detallaremos algunos de los escuchadores más comunes: `ActionListener`, `MouseListener`, y `KeyListener`.

### 1. `ActionListener`: Responder a Acciones de Componentes

El `ActionListener` es uno de los eventos más comunes y se usa para responder a acciones específicas, como hacer clic en un botón. Cuando un usuario interactúa con un componente, se ejecuta el método `actionPerformed` del `ActionListener` asociado.

#### Ejemplo básico de `ActionListener`

```java
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class VentanaActionListener extends JFrame {
    public VentanaActionListener() {
        setTitle("Ventana con ActionListener");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        JButton boton = new JButton("Presiona aquí");

        // Asignar un ActionListener al botón
        boton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("¡Botón presionado!");
            }
        });

        panel.add(boton);
        add(panel);
    }
}
```

Aquí, al hacer clic en el botón, el `ActionListener` ejecutará el código dentro de `actionPerformed`, que imprime “¡Botón presionado!” en la consola.

### 2. `MouseListener`: Detectar Eventos de Ratón

El `MouseListener` permite capturar eventos del ratón, como clics, movimientos, y entradas y salidas de los componentes. Cada evento se asocia con un método específico que se ejecuta según la acción realizada.

#### Métodos del `MouseListener`

- `mouseClicked(MouseEvent e)`: Se llama cuando el usuario hace clic.
- `mouseEntered(MouseEvent e)`: Se llama cuando el ratón entra en el componente.
- `mouseExited(MouseEvent e)`: Se llama cuando el ratón sale del componente.
- `mousePressed(MouseEvent e)`: Se llama cuando se presiona el botón del ratón.
- `mouseReleased(MouseEvent e)`: Se llama cuando se suelta el botón del ratón.

#### Ejemplo de `MouseListener`

```java
import javax.swing.*;
import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;

public class VentanaMouseListener extends JFrame {
    public VentanaMouseListener() {
        setTitle("Ventana con MouseListener");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        JLabel etiqueta = new JLabel("Haz clic en el panel");

        // Asignar un MouseListener al panel
        panel.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                etiqueta.setText("Ratón clicado en x: " + e.getX() + ", y: " + e.getY());
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                etiqueta.setText("El ratón entró al panel");
            }

            @Override
            public void mouseExited(MouseEvent e) {
                etiqueta.setText("El ratón salió del panel");
            }

            @Override
            public void mousePressed(MouseEvent e) {}

            @Override
            public void mouseReleased(MouseEvent e) {}
        });

        panel.add(etiqueta);
        add(panel);
    }
}
```

En este ejemplo, cuando el ratón interactúa con el panel, el `MouseListener` ejecuta diferentes métodos según el evento.

### 3. `KeyListener`: Capturar Entradas de Teclado

El `KeyListener` permite detectar eventos relacionados con el teclado. Cada vez que el usuario presiona o libera una tecla, el `KeyListener` ejecuta métodos específicos.

#### Métodos del `KeyListener`

- `keyPressed(KeyEvent e)`: Se llama cuando una tecla es presionada.
- `keyReleased(KeyEvent e)`: Se llama cuando una tecla es soltada.
- `keyTyped(KeyEvent e)`: Se llama cuando una tecla es tipeada (presionada y liberada en un solo evento).

#### Ejemplo de `KeyListener`

```java
import javax.swing.*;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;

public class VentanaKeyListener extends JFrame {
    public VentanaKeyListener() {
        setTitle("Ventana con KeyListener");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        JLabel etiqueta = new JLabel("Escribe algo en el campo de texto");

        JTextField campoTexto = new JTextField(15);
        campoTexto.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
                etiqueta.setText("Tecla tipeada: " + e.getKeyChar());
            }

            @Override
            public void keyPressed(KeyEvent e) {
                System.out.println("Tecla presionada: " + e.getKeyCode());
            }

            @Override
            public void keyReleased(KeyEvent e) {
                System.out.println("Tecla liberada: " + e.getKeyCode());
            }
        });

        panel.add(etiqueta);
        panel.add(campoTexto);
        add(panel);
    }
}
```

Este ejemplo cambia el texto de la `JLabel` al detectar la tecla que el usuario está tipeando en el `JTextField`.

### Ejemplo Completo con `ActionListener`, `MouseListener`, y `KeyListener`

```java
import javax.swing.*;
import java.awt.event.*;

public class VentanaCompleta extends JFrame {
    public VentanaCompleta() {
        setTitle("Ventana Completa con Listeners");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        JLabel etiqueta = new JLabel("Interacciones:");
        JTextField campoTexto = new JTextField(10);
        JButton boton = new JButton("Clic");

        // Agregar ActionListener al botón
        boton.addActionListener(e -> etiqueta.setText("Botón presionado"));

        // Agregar MouseListener al campo de texto
        campoTexto.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                etiqueta.setText("Campo de texto clicado");
            }
        });

        // Agregar KeyListener al campo de texto
        campoTexto.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                etiqueta.setText("Tecla tipeada: " + e.getKeyChar());
            }
        });

        panel.add(etiqueta);
        panel.add(campoTexto);
        panel.add(boton);
        add(panel);
    }

    public static void main(String[] args) {
        VentanaCompleta ventana = new VentanaCompleta();
        ventana.setVisible(true);
    }
}
```

### Resumen

1. **`ActionListener`**: Detecta acciones de componentes, útil para botones.
2. **`MouseListener`**: Detecta eventos del ratón como clics, entradas y salidas de un componente.
3. **`KeyListener`**: Captura eventos de teclado, útil para entradas en `JTextField`.

## 5. Diseño y Disposición con `LayoutManagers` como `BorderLayout`, `GridLayout`

El diseño y disposición de los componentes en una interfaz gráfica de Java se gestiona mediante `LayoutManagers`, que definen cómo se colocarán y redimensionarán los elementos dentro de un contenedor. Los `LayoutManagers` son esenciales para crear interfaces bien organizadas y adaptables. Aquí detallaremos algunos de los gestores de diseño más comunes, como `BorderLayout` y `GridLayout`.

### 1. `BorderLayout`

El `BorderLayout` organiza los componentes en cinco áreas: norte (`NORTH`), sur (`SOUTH`), este (`EAST`), oeste (`WEST`), y centro (`CENTER`). Cada componente se añade a una de estas áreas, y el diseño ajusta su tamaño de acuerdo con la posición.

#### Ejemplo de `BorderLayout`

```java
import javax.swing.*;
import java.awt.*;

public class VentanaBorderLayout extends JFrame {
    public VentanaBorderLayout() {
        setTitle("Ejemplo de BorderLayout");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Establece BorderLayout como layout del frame
        setLayout(new BorderLayout());

        // Añadir componentes a cada área
        add(new JButton("Norte"), BorderLayout.NORTH);
        add(new JButton("Sur"), BorderLayout.SOUTH);
        add(new JButton("Este"), BorderLayout.EAST);
        add(new JButton("Oeste"), BorderLayout.WEST);
        add(new JButton("Centro"), BorderLayout.CENTER);
    }

    public static void main(String[] args) {
        VentanaBorderLayout ventana = new VentanaBorderLayout();
        ventana.setVisible(true);
    }
}
```

En este ejemplo, cada botón se coloca en una de las áreas del `BorderLayout`. Observa que `BorderLayout` permite maximizar el uso del espacio, ya que los componentes en las áreas `NORTH`, `SOUTH`, `EAST`, y `WEST` ocupan toda su sección mientras que el `CENTER` se expande para llenar el espacio restante.

### 2. `GridLayout`

El `GridLayout` organiza los componentes en una cuadrícula, dividiendo el contenedor en filas y columnas de tamaño fijo. Cada celda tiene el mismo tamaño, y los componentes se colocan de izquierda a derecha, fila por fila.

#### Ejemplo de `GridLayout`

```java
import javax.swing.*;
import java.awt.*;

public class VentanaGridLayout extends JFrame {
    public VentanaGridLayout() {
        setTitle("Ejemplo de GridLayout");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Establece GridLayout con 3 filas y 2 columnas
        setLayout(new GridLayout(3, 2));

        // Añadir botones a la cuadrícula
        add(new JButton("1"));
        add(new JButton("2"));
        add(new JButton("3"));
        add(new JButton("4"));
        add(new JButton("5"));
        add(new JButton("6"));
    }

    public static void main(String[] args) {
        VentanaGridLayout ventana = new VentanaGridLayout();
        ventana.setVisible(true);
    }
}
```

Aquí, `GridLayout` crea una cuadrícula de 3 filas y 2 columnas. Cada botón ocupa una celda, y todas las celdas tienen el mismo tamaño, ajustándose automáticamente cuando el contenedor cambia de tamaño.

### 3. `FlowLayout`

El `FlowLayout` coloca los componentes en una sola fila, de izquierda a derecha, y empieza una nueva fila cuando el espacio se acaba. Este diseño es útil para layouts sencillos, como barras de herramientas.

#### Ejemplo de `FlowLayout`

```java
import javax.swing.*;
import java.awt.*;

public class VentanaFlowLayout extends JFrame {
    public VentanaFlowLayout() {
        setTitle("Ejemplo de FlowLayout");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Establece FlowLayout como layout del panel
        setLayout(new FlowLayout());

        // Añadir botones al panel
        add(new JButton("Botón 1"));
        add(new JButton("Botón 2"));
        add(new JButton("Botón 3"));
        add(new JButton("Botón 4"));
        add(new JButton("Botón 5"));
    }

    public static void main(String[] args) {
        VentanaFlowLayout ventana = new VentanaFlowLayout();
        ventana.setVisible(true);
    }
}
```

En este ejemplo, el `FlowLayout` coloca los botones en una fila, y si la ventana se redimensiona, se ajustan automáticamente.

### 4. `BoxLayout`

El `BoxLayout` permite organizar los componentes en una sola fila (horizontal) o columna (vertical), con más control sobre el espaciado y alineación. Este diseño es útil cuando deseas alinear elementos en una línea o columna específica.

#### Ejemplo de `BoxLayout`

```java
import javax.swing.*;
import java.awt.*;

public class VentanaBoxLayout extends JFrame {
    public VentanaBoxLayout() {
        setTitle("Ejemplo de BoxLayout");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Crear un panel y establecer BoxLayout en dirección vertical (Y_AXIS)
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

        // Añadir botones al panel
        panel.add(new JButton("Botón 1"));
        panel.add(new JButton("Botón 2"));
        panel.add(new JButton("Botón 3"));

        add(panel);
    }

    public static void main(String[] args) {
        VentanaBoxLayout ventana = new VentanaBoxLayout();
        ventana.setVisible(true);
    }
}
```

En este ejemplo, los botones se alinean verticalmente. Cambiando `BoxLayout.Y_AXIS` por `BoxLayout.X_AXIS`, los componentes se colocarían en una fila horizontal.

### 5. Ejemplo Combinado: Layouts Anidados

Podemos combinar varios `LayoutManagers` en un solo programa, creando layouts anidados donde se integren, por ejemplo, `BorderLayout` y `GridLayout`. Este tipo de organización ayuda a construir interfaces complejas.

#### Ejemplo Completo con Layouts Anidados

```java
import javax.swing.*;
import java.awt.*;

public class VentanaLayoutsAnidados extends JFrame {
    public VentanaLayoutsAnidados() {
        setTitle("Ejemplo de Layouts Anidados");
        setSize(500, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Establece BorderLayout en el marco principal
        setLayout(new BorderLayout());

        // Panel superior con FlowLayout
        JPanel panelSuperior = new JPanel(new FlowLayout());
        panelSuperior.add(new JLabel("Panel Superior"));
        add(panelSuperior, BorderLayout.NORTH);

        // Panel central con GridLayout
        JPanel panelCentral = new JPanel(new GridLayout(2, 2));
        panelCentral.add(new JButton("1"));
        panelCentral.add(new JButton("2"));
        panelCentral.add(new JButton("3"));
        panelCentral.add(new JButton("4"));
        add(panelCentral, BorderLayout.CENTER);

        // Panel inferior con FlowLayout
        JPanel panelInferior = new JPanel(new FlowLayout());
        panelInferior.add(new JButton("Aceptar"));
        panelInferior.add(new JButton("Cancelar"));
        add(panelInferior, BorderLayout.SOUTH);
    }

    public static void main(String[] args) {
        VentanaLayoutsAnidados ventana = new VentanaLayoutsAnidados();
        ventana.setVisible(true);
    }
}
```

### Resumen

- **`BorderLayout`**: Organiza en áreas de norte, sur, este, oeste y centro. Ideal para interfaces con una estructura de encabezado, contenido principal y pie de página.
- **`GridLayout`**: Crea una cuadrícula de celdas de tamaño uniforme, útil para formularios y paneles de control.
- **`FlowLayout`**: Dispone componentes en una sola fila de izquierda a derecha, empezando una nueva fila si es necesario. Bueno para disposiciones flexibles y adaptativas.
- **`BoxLayout`**: Coloca componentes en una columna o fila específica, ideal para listas o alineaciones de elementos en una sola línea.
