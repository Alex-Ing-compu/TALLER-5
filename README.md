# Ciclo de vida de los Beans (CDI Scopes)
```shell script 
Autor: Jhon Córdova
```

## @ApplicationScoped:
Una única instancia durante todad la aplicación.
Los beans con este alcance son compartidos por toda la aplicación. Se crea una única instancia que vive durante toda la ejecución de la app.

1. **Servicio de Configuración Global**: Clase que carga y mantiene las propiedades de configuración del sistema (ej. lectura de `application.properties`).
2. **Cache en Memoria**: Servicio que almacena resultados de consultas frecuentes para evitar llamadas repetitivas a la base de datos.
3. **Colector de Métricas**: Clase encargada de agregar métricas de uso de la aplicación para monitoreo (ej. Micrometer).
4. **Despachador de Eventos (EventBus)**: Centralizador que gestiona el envío de eventos entre diferentes partes de la aplicación.
5. **Gestor de Sesiones de Seguridad**: Componente que valida tokens JWT o gestiona la lista negra de tokens revocados a nivel global.
6. **Pool de Conexiones a APIs Externas**: Servicio que mantiene una conexión persistente o pool para consumir un servicio de terceros.
7. **Servicio de Scheduler (Tareas Programadas)**: Clase que gestiona los cron jobs o tareas que corren en background durante todo el ciclo de vida de la app.

## @Dependent:
Se crea una nueva instancia cada vez que se inyecta.
Es el alcance por defecto. La instancia vive y muere junto con el bean donde fue inyectado. Es ideal para objetos que no deben ser compartidos.

1. **Mapeador de DTOs (Converter)**: Clase que convierte una entidad JPA a un DTO específico para un endpoint; no necesita mantener estado.
2. **Validador de Entrada de Formularios**: Lógica de validación que se instancia solo cuando se procesa un request HTTP específico.
3. **Helper de Formateo de Strings**: Clase de utilidad para formatear mensajes de error o logs de forma dinámica según el contexto.
4. **Productor de Objetos Complejos (Factory)**: Bean que ayuda a construir un objeto complejo (usando el patrón Builder) que es único para la operación actual.
5. **Cliente API Contextual**: Cliente REST configurado con headers que cambian según el usuario que hace el request (ej. Tenant ID).
6. **Buffer Temporal**: Objeto que acumula datos durante un proceso corto y se destruye al finalizar la transacción o el método.
7. **Wrapper de Transacción Específica**: Clase que agrupa lógica de negocio que debe ejecutarse dentro de una transacción que vive solo mientras el bean inyector está activo.

## @Singleton:
Una unica instancia en toda la aplicación, controlada estrictamente.
Similar a ApplicationScoped, pero sin el proxy de CDI. Se usa para acceso directo y es extremadamente eficiente para compartir estado simple, pero requiere gestión de hilos (thread-safety).

1. **Generador de Números Aleatorios**: Servicio que mantiene la semilla (seed) de aleatoriedad y requiere acceso rápido sin proxy.
2. **Contador Atómico de Visitas**: Servicio que usa `AtomicLong` para contar peticiones sin necesidad de concurrencia compleja de CDI.
3. **Bandera de Estado del Sistema (System Flag)**: Un booleano sencillo que indica si el sistema está en modo "Mantenimiento" o "Operativo".
4. **Gestor de Locks de Concurrencia**: Clase que expone un `ReentrantLock` para sincronizar procesos críticos entre diferentes hilos.
5. **Registro de Componentes Simples**: Un mapa sencillo (no persistente) para registrar nombres de servicios activos durante el runtime.
6. **Interface de Hardware**: Clase que encapsula la lectura de un sensor o puerto físico donde solo puede haber una única instancia de acceso directo.
7. **Logger de Consola Personalizado**: Un wrapper sencillo de bajo nivel para escribir en consola que no requiere la complejidad de un proxy de contexto.
