# 3. Componentes Interactivos

Los componentes interactivos son fundamentales para construir interfaces gráficas que permitan la entrada y visualización de datos. Aquí exploraremos tres componentes comunes: `JButton`, `JTextField`, y `JLabel`.

## 1. `JButton`: Botones Interactivos

`JButton` es un componente que permite al usuario ejecutar acciones con solo hacer clic. Este botón es muy común y se usa en conjunto con eventos para definir lo que debe ocurrir al ser presionado.

- **Creación de un `JButton`**: Puedes crear un botón con texto o iconos.
- **Método principal**:
  - `addActionListener(ActionListener listener)`: Asocia un evento al botón para que responda cuando el usuario hace clic.

### Ejemplo de `JButton`

```java
// Dentro de VentanaPrincipal.java
JButton boton = new JButton("Presiona aquí");
boton.addActionListener(e -> {
    System.out.println("¡Botón presionado!");
});
panel.add(boton); // Agrega el botón al panel
```

Este código crea un botón que imprime un mensaje en la consola cada vez que el usuario lo presiona.

## 2. `JTextField`: Campos de Texto para Entrada de Datos

`JTextField` permite al usuario ingresar texto en una línea. Es útil para obtener información como nombres, direcciones o cualquier dato de tipo texto.

- **Creación de un `JTextField`**: Puedes especificar el ancho en columnas.
- **Métodos principales**:
  - `getText()`: Obtiene el texto ingresado por el usuario.
  - `setText(String text)`: Define el texto dentro del campo.
  - `setEditable(boolean editable)`: Define si el campo es editable.

### Ejemplo de `JTextField`

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

## 3. `JLabel`: Etiquetas para Mostrar Texto

`JLabel` se usa para mostrar texto o imágenes estáticas en la interfaz. Las etiquetas son útiles para informar al usuario sobre el propósito de otros componentes o para mostrar mensajes.

- **Creación de un `JLabel`**: Puedes agregar texto o una imagen.
- **Método principal**:
  - `setText(String text)`: Cambia el texto que muestra la etiqueta.

### Ejemplo de `JLabel`

```java
// Dentro de VentanaPrincipal.java
JLabel etiqueta = new JLabel("Ingrese su nombre:");
panel.add(etiqueta); // Agrega la etiqueta al panel
```

Este código crea una etiqueta con el texto "Ingrese su nombre:" que aparece junto al campo de texto en la interfaz.

## 4. Ejemplo Completo: Interacción entre `JButton`, `JTextField`, y `JLabel`

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

## 5. Compilación y Ejecución del Proyecto

Compila y ejecuta el programa con los siguientes comandos desde la carpeta `src`:

```bash
javac Main.java gui/VentanaPrincipal.java
java Main
```

Siguiente Lección: [Diseño y disposición con `LayoutManagers` (como `BorderLayout`, `GridLayout`).](05-Layouts.md)

---
[]: # (Fin del archivo)
[]: # (graficos/JavaGUIproject/04-Eventos.md)
