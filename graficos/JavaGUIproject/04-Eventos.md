# 4. Eventos de Usuario con `ActionListener`, `MouseListener`, etc

Los eventos de usuario son fundamentales para crear aplicaciones interactivas. En Java, se usan varios tipos de “Listeners” (escuchadores) que detectan las interacciones del usuario, como clics, movimientos de ratón, o acciones de teclado, y permiten responder a cada una de ellas.

Aquí detallaremos algunos de los escuchadores más comunes: `ActionListener`, `MouseListener`, y `KeyListener`.

## 1. `ActionListener`: Responder a Acciones de Componentes

El `ActionListener` es uno de los eventos más comunes y se usa para responder a acciones específicas, como hacer clic en un botón. Cuando un usuario interactúa con un componente, se ejecuta el método `actionPerformed` del `ActionListener` asociado.

### Ejemplo básico de `ActionListener`

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

## 2. `MouseListener`: Detectar Eventos de Ratón

El `MouseListener` permite capturar eventos del ratón, como clics, movimientos, y entradas y salidas de los componentes. Cada evento se asocia con un método específico que se ejecuta según la acción realizada.

### Métodos del `MouseListener`

- `mouseClicked(MouseEvent e)`: Se llama cuando el usuario hace clic.
- `mouseEntered(MouseEvent e)`: Se llama cuando el ratón entra en el componente.
- `mouseExited(MouseEvent e)`: Se llama cuando el ratón sale del componente.
- `mousePressed(MouseEvent e)`: Se llama cuando se presiona el botón del ratón.
- `mouseReleased(MouseEvent e)`: Se llama cuando se suelta el botón del ratón.

### Ejemplo de `MouseListener`

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

## 3. `KeyListener`: Capturar Entradas de Teclado

El `KeyListener` permite detectar eventos relacionados con el teclado. Cada vez que el usuario presiona o libera una tecla, el `KeyListener` ejecuta métodos específicos.

### Métodos del `KeyListener`

- `keyPressed(KeyEvent e)`: Se llama cuando una tecla es presionada.
- `keyReleased(KeyEvent e)`: Se llama cuando una tecla es soltada.
- `keyTyped(KeyEvent e)`: Se llama cuando una tecla es tipeada (presionada y liberada en un solo evento).

### Ejemplo de `KeyListener`

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

## Resumen

1. **`ActionListener`**: Detecta acciones de componentes, útil para botones.
2. **`MouseListener`**: Detecta eventos del ratón como clics, entradas y salidas de un componente.
3. **`KeyListener`**: Captura eventos de teclado, útil para entradas en `JTextField`.

Siguiente Lección: [Diseño y Disposición con `LayoutManagers`](05-Layouts.md)

---
[]: # (Final del archivo)
[]: # (graficos/JavaGUIproject/05-Layouts.md)
