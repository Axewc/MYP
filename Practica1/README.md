# Modelado y Programación
=========================
Integrantes:
Axel Casas Espinosa
Eliot Figueroa Aldaco

------------------------------------------------------
Practica 1: Patrones de diseño 'Strategy' y 'Observer'
------------------------------------------------------

Parte Teórica
------------------------------------------------------
1.Menciona los principios de diseño escenciales del patrón Strategy y Observer.
  Menciona una desventaja de cada patrón.

  Strategy: Este patrón de diseño nos abre la posibilidad de modificar en tiempo
  de ejecución el comportamiento de alguna clase. Este se implementa utilizando
  polimorfismo principalmente para poder hacer uso de comportamientos que pueden
  intercambiarse en la ejecución del programa, haciendo que un objeto se comporte
  de forma distinta según la "estrategia" que se estableció.

  Observer: Este patrón permite "observar" los cambios que fueron efectuados por
  un objeto, cada cambio que modifique el estado del objeto notifica a los observadores.

  Desventajas.

  Strategy:
  1. Dependiendo de que tan compleja sea la estrategia puede incrementar mucho el
  número de objetos en una clase.
  2. Para que funcione bien el cliente debe saber que las diferentes estrategias
  existen y cómo se diferencian una de otra.

  Observer:
  1. Si no se implementa de forma correcta puede añadir complejidad y problemas
  al desempeño del programa.


Notas
------------------------------------------------------
La simulación de servicios se denota según una sucesión (arbitraria) que comienza
en 1 y termina en 10.
Dónde cada caso representa:
    1.  Netflix Básico 
    2.  Netflix Medio 
    3.  Amazon Regular 
    4.  Amazon Premium
    5.  Netflix Premium 
    6.  Spotify Regular
    7.  Spotify Premium
    8.  Twitch
    9. Youtube Regular
    10. Youtube Premium
