Modelado y Programación
---------------------------------------------------
Integrantes:
Casas Espinosa Axel
Figueroa Aldaco Eliot
---------------------------------------------------
Practica 2: Patrones de diseño 'Template' y 'State'
---------------------------------------------------
Parte Teórica
---------------------------------------------------
Menciona los principios de diseño esenciales del patrón State y Template. Menciona una desventaja de cada patrón.

State: Este patrón permite que un objeto altere su comportamiendo cada vez que se cambie su estado; el propósito
general de state es el de "desacoplar" el estado de la clase en cuestion. Dicho partrón lo podemos utilizar cuando
el comportamiendot de un objeto depende de un estado y debe cambiar en tiempo de ejecución segun el ccomportamiento.

Template: El patrón template define una estructura de un algoritmo cuya lógica queda a cargo de las subclases. Para
esto, escribimos una clase abstracta en la que hay parte de la lógica necesaria para llegar a nuestra finalidad.

DESVENTAJAS:
State: El número de subclases que se deben implementar incrementa bastante pues hay que hacer una para cada estado
del objeto en cuestión, no es un problema con onjetos "sencillos" pero cuando se quiere trabajar con algo grande,
el número de clases puede ser demasiado.

Template: El "Debugging" del código y el entendimiento del flujo del mismo puede ser confuso en ocasiones. Se pueden
llegar a implementar metodos que no deberian ser implementados o no implementar ningún metodo abstracto ni siquiera.
---------------------------------------------------
Notas
---------------------------------------------------