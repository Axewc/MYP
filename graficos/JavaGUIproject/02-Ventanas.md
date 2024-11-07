# 2. Ventanas y Contenedores Básicos

¡Excelente! Vamos a adentrarnos en los elementos principales de una interfaz gráfica en Java: `JFrame` y `JPanel`. Estos son componentes básicos que te permitirán estructurar y organizar los elementos gráficos.

## 1. `JFrame`: La Ventana Principal

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

## 2. `JPanel`: Un Contenedor para Componentes

El `JPanel` es un contenedor flexible que organiza los componentes dentro de una `JFrame`. Los `JPanel` son útiles para agrupar elementos, como etiquetas, botones, y campos de texto, y aplican un `Layout` (diseño de disposición) que define cómo se colocan esos elementos.

### Métodos comunes de `JPanel`

- `add(Component component)`: Agrega un componente (como un botón o etiqueta) al panel.
- `setLayout(LayoutManager layout)`: Configura el diseño del panel.

### Ejemplo de `JPanel` dentro de un `JFrame`

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

## 3. Disposición de Componentes en un `JPanel`

Por defecto, un `JPanel` usa un diseño de disposición (`Layout`) llamado `FlowLayout`, que coloca los elementos uno junto al otro en el orden en que se agregan, similar a una línea de texto.

### Ejemplo con un Diseño Personalizado: `BorderLayout`

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

## 4. Compilación y Ejecución

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

Siguiente Lección: [Componentes Interactivos (`JButton`, `JTextField`, `JLabel`)](03-Componentes.md)

---
[]: # (Final del archivo)
[]: # (graficos/JavaGUIproject/03-Componentes.md)