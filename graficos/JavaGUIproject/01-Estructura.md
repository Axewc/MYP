# 1. Configuración inicial y estructura del proyecto

Para iniciar con una estructura básica y configuración del proyecto en Java para interfaces gráficas en Ubuntu.

## 1. Creación de la Estructura de Archivos

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

## 2. Crear el Archivo `Main.java`

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

## 3. Crear la Clase de la Ventana Principal (`VentanaPrincipal`)

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

## 4. Compilación desde la Terminal

Para compilar el proyecto sin Maven, usa el comando `javac`. Coloca tu terminal en la carpeta raíz `JavaGUIProject` y ejecuta los siguientes comandos:

```bash
cd src
javac Main.java gui/VentanaPrincipal.java
```

Esto generará los archivos `.class` en las mismas carpetas.

## 5. Ejecutar el Programa

Una vez compilado, ejecuta el programa usando `java` desde la carpeta `src`:

```bash
java Main
```

Al ejecutar este comando, deberías ver una ventana con un título "Ventana Principal", un mensaje de bienvenida y un botón.

Siguiente Lección: [Ventanas y contenedores básicos (`JFrame`, `JPanel`).](02-Ventanas.md)

---
[]: # (Final del archivo)
[]: # (graficos/JavaGUIproject/02-Ventanas.md)
