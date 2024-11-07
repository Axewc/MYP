# 5. Diseño y Disposición con `LayoutManagers` como `BorderLayout`, `GridLayout`

El diseño y disposición de los componentes en una interfaz gráfica de Java se gestiona mediante `LayoutManagers`, que definen cómo se colocarán y redimensionarán los elementos dentro de un contenedor. Los `LayoutManagers` son esenciales para crear interfaces bien organizadas y adaptables. Aquí detallaremos algunos de los gestores de diseño más comunes, como `BorderLayout` y `GridLayout`.

## 1. `BorderLayout`

El `BorderLayout` organiza los componentes en cinco áreas: norte (`NORTH`), sur (`SOUTH`), este (`EAST`), oeste (`WEST`), y centro (`CENTER`). Cada componente se añade a una de estas áreas, y el diseño ajusta su tamaño de acuerdo con la posición.

### Ejemplo de `BorderLayout`

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

## 2. `GridLayout`

El `GridLayout` organiza los componentes en una cuadrícula, dividiendo el contenedor en filas y columnas de tamaño fijo. Cada celda tiene el mismo tamaño, y los componentes se colocan de izquierda a derecha, fila por fila.

### Ejemplo de `GridLayout`

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

## 3. `FlowLayout`

El `FlowLayout` coloca los componentes en una sola fila, de izquierda a derecha, y empieza una nueva fila cuando el espacio se acaba. Este diseño es útil para layouts sencillos, como barras de herramientas.

### Ejemplo de `FlowLayout`

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

## 4. `BoxLayout`

El `BoxLayout` permite organizar los componentes en una sola fila (horizontal) o columna (vertical), con más control sobre el espaciado y alineación. Este diseño es útil cuando deseas alinear elementos en una línea o columna específica.

### Ejemplo de `BoxLayout`

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

## 5. Ejemplo Combinado: Layouts Anidados

Podemos combinar varios `LayoutManagers` en un solo programa, creando layouts anidados donde se integren, por ejemplo, `BorderLayout` y `GridLayout`. Este tipo de organización ayuda a construir interfaces complejas.

### Ejemplo Completo con Layouts Anidados

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

## Resumen

- **`BorderLayout`**: Organiza en áreas de norte, sur, este, oeste y centro. Ideal para interfaces con una estructura de encabezado, contenido principal y pie de página.
- **`GridLayout`**: Crea una cuadrícula de celdas de tamaño uniforme, útil para formularios y paneles de control.
- **`FlowLayout`**: Dispone componentes en una sola fila de izquierda a derecha, empezando una nueva fila si es necesario. Bueno para disposiciones flexibles y adaptativas.
- **`BoxLayout`**: Coloca componentes en una columna o fila específica, ideal para listas o alineaciones de elementos en una sola línea.
