## Repaso general de los Patrones

1. **Proxy**
- El patrón de diseño Proxy proporciona un sustituto o marcador de posición para otro objeto, controlando el acceso al objeto original y permitiendo realizar acciones antes o después de que la solicitud llegue al objeto original.
- Se utiliza para implementar la inicialización diferida, evitando la creación de objetos pesados hasta que sean realmente necesarios, y para controlar el acceso a objetos sensibles o críticos.
- También se puede utilizar para ejecutar código antes o después de la lógica principal de una clase, sin necesidad de modificar la clase original.
- El patrón Proxy es útil para introducir la inicialización diferida y el almacenamiento en caché en bibliotecas de terceros.
- Existen diferentes tipos de proxies, como proxies virtuales, proxies de protección, proxies remotos, proxies de registro y proxies de caché.
- El patrón Proxy ofrece ventajas como la flexibilidad para introducir nuevas funcionalidades sin modificar el objeto original, pero también puede añadir complejidad al código y retrasar la respuesta del servicio.

## **Cómo implementarlo**

1. Si no hay una interfaz de servicio preexistente, crea una para que los objetos proxy y de servicio sean intercambiables. No siempre es posible extraer la interfaz de la clase de servicio, porque tienes que cambiar todos los clientes del servicio para utilizar esa interfaz. El plan B es convertir el proxy en una subclase de la clase de servicio, de forma que herede la interfaz del servicio.
2. Crea la clase proxy. Debe tener un campo para guardar una referencia al servicio. Normalmente los proxies crean y gestionan el ciclo de vida completo de sus servicios. En raras ocasiones, el cliente pasa un servicio al proxy a través de un constructor.
3. Implementa los métodos del proxy según su propósito. En la mayoría de los casos, después de hacer algo de trabajo, el proxy debería delegar el trabajo a un objeto de servicio.
4. Piensa en meter un método de creación que decida si el cliente obtiene un proxy o un servicio real. Puede ser un método estático simple en la clase proxy o todo un método de fábrica.
5. Considera implementar la inicialización diferida para el objeto de servicio