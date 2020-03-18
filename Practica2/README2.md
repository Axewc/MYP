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

State: Este patrón permite que un objeto altere su comportamiento cada vez que se cambie su estado; el propósito
general de state es el de "desacoplar" el estado de la clase en cuestión. Dicho patrón lo podemos utilizar cuando
el comportamiento de un objeto depende de un estado y debe cambiar en tiempo de ejecución según el comportamiento.

Template: El patrón template define una estructura de un algoritmo cuya lógica queda a cargo de las subclases. Para
esto, escribimos una clase abstracta en la que hay parte de la lógica necesaria para llegar a nuestra finalidad.

DESVENTAJAS:
State: El número de subclases que se deben implementar incrementa bastante pues hay que hacer una para cada estado
del objeto en cuestión, no es un problema con objetos "sencillos" pero cuando se quiere trabajar con algo grande,
el número de clases puede ser demasiado.

Template: El "Debugging" del código y el entendimiento del flujo del mismo puede ser confuso en ocasiones. Se pueden
llegar a implementar métodos que no deberían ser implementados o no implementar ningún método abstracto ni siquiera.

---------------------------------------------------
Notas
---------------------------------------------------
Existen en la práctica tal vez unos comentarios que podrían tal vez entrar dentro de llamarse paja, 
pero tanto por ver el código más homogéneo, como por ciertos detalles que seguramente en el
futuro pueda llegar a olvidar. Cosas como constructores o varibles auxiares para un uso específico.
