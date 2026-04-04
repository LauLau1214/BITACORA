# Refuerzo – Análisis de Requerimientos (Parte 1)

### Plataforma de Entrenadores Pokémon
**Equipo Rosado · Asignatura: Desarrollo Orientado a Software (DOSW)**


## Descripción del escenario

Una empresa de videojuegos desea desarrollar una aplicación web que permita a los usuarios registrarse como entrenadores y gestionar sus Pokémon para participar en combates contra otros jugadores en línea. El sistema debe permitir la creación de equipos, la interacción entre jugadores y la visualización del progreso de cada entrenador dentro de una liga competitiva.

El cliente no ha entregado documentación formal, únicamente necesidades generales. A partir de estas se realizó el siguiente análisis.

## 1. Identificación de requerimientos

Se identificaron 15 requerimientos en total: 10 funcionales y 5 no funcionales. Se extrajeron tanto los explícitos (mencionados directamente por el cliente) como los implícitos (necesarios pero no mencionados).

| ID | Requerimiento | Origen |
|---|---|---|
| RF-01 | Registro de entrenadores | Implícito |
| RF-02 | Inicio de sesión | Implícito |
| RF-03 | Recuperación de contraseña | Implícito |
| RF-04 | Gestión de perfil del entrenador | Implícito |
| RF-05 | Gestión de Pokémon (colección) | Explícito |
| RF-06 | Creación y gestión de equipos | Explícito |
| RF-07 | Sistema de combates en línea | Explícito |
| RF-08 | Historial de batallas | Explícito |
| RF-09 | Liga competitiva y ranking | Explícito |
| RF-10 | Matchmaking (emparejamiento de jugadores) | Implícito |
| RNF-01 | Seguridad de cuentas | Explícito |
| RNF-02 | Rendimiento y concurrencia | Explícito |
| RNF-03 | Disponibilidad del sistema | Implícito |
| RNF-04 | Experiencia de usuario en combates (latencia) | Explícito |
| RNF-05 | Persistencia y respaldo de datos | Implícito |

---

## 2. Clasificación y redacción correcta

### Requerimientos Funcionales (RF)
Describen qué hace el sistema: acciones, procesos y operaciones.


**RF-01 – Registro de entrenadores**
El sistema debe permitir a los usuarios crear una cuenta de entrenador proporcionando nombre de usuario, correo electrónico y contraseña, y debe enviar un correo de confirmación antes de activar la cuenta.

**Justificacion:** Describe una acción concreta del sistema (crear un usuario). Es el punto de entrada de todo el flujo de la aplicación.


**RF-02 – Inicio de sesión**
El sistema debe permitir a los entrenadores registrados iniciar sesión utilizando su correo electrónico y contraseña, generando una sesión autenticada mediante token.

**Justificación:** Acción directa del sistema. Sin autenticación ningún usuario puede acceder a las funcionalidades.


**RF-03 – Recuperación de contraseña**
El sistema debe permitir a los entrenadores solicitar el restablecimiento de su contraseña mediante un enlace enviado a su correo registrado, con validez máxima de 1 hora.

**Justificación:** Función de gestión de acceso. No fue mencionada explícitamente pero es inherente a cualquier sistema con autenticación.


**RF-04 – Gestión de perfil del entrenador**
El sistema debe permitir al entrenador visualizar y editar su información de perfil, incluyendo nombre de usuario, avatar y región, reflejando los cambios de forma inmediata.

**Justificación:** Función de actualización de datos del usuario. Necesaria para la personalización de la experiencia.


**RF-05 – Gestión de Pokémon**
El sistema debe permitir a los entrenadores agregar Pokémon a su colección, visualizar sus estadísticas y habilidades, y administrar su inventario de hasta 300 Pokémon.

**Justificación:** Función central del producto. Sin una colección de Pokémon no es posible formar equipos ni participar en combates.


**RF-06 – Creación y gestión de equipos**
El sistema debe permitir al entrenador crear equipos de hasta 6 Pokémon seleccionados de su colección, asignarles un nombre y cambiar la composición del equipo fuera de un combate activo.

**Justificación:** El cliente lo mencionó explícitamente. Es condición necesaria para participar en combates.


**RF-07 – Sistema de combates en línea**
El sistema debe permitir a los entrenadores desafiar a otros jugadores en combates por turnos en tiempo real, utilizando el equipo activo seleccionado, y determinar automáticamente al ganador al finalizar el combate.

**Justificación:** Es la funcionalidad principal y razón de ser del producto. El cliente la mencionó explícitamente.


**RF-08 – Historial de batallas**
El sistema debe registrar y mostrar a cada entrenador su historial completo de combates, incluyendo resultado (victoria/derrota), nombre del oponente, Pokémon utilizados y fecha del combate.

**Justificación:** El cliente lo mencionó explícitamente como una de sus preocupaciones ("claridad en el historial de batallas").


**RF-09 – Liga competitiva y ranking**
El sistema debe calcular y mostrar una tabla de clasificación actualizada de entrenadores basada en puntos acumulados por victorias y derrotas, con actualización en tiempo real tras cada combate.

**Justificación:** El cliente mencionó explícitamente la visualización del progreso dentro de una liga competitiva.


**RF-10 – Matchmaking**
El sistema debe emparejar automáticamente a los entrenadores que buscan combate con oponentes de nivel o puntuación similar, en un tiempo máximo de espera de 60 segundos.

**Justificación:** Sin un mecanismo de emparejamiento los jugadores no pueden encontrarse. Es implícito pero crítico para RF-07.


### Requerimientos No Funcionales (RNF)
Describen cómo lo hace el sistema: atributos de calidad, rendimiento, seguridad y confiabilidad.


**RNF-01 – Seguridad de cuentas**
El sistema debe almacenar las contraseñas cifradas mediante bcrypt y gestionar las sesiones con tokens JWT con expiración máxima de 24 horas, protegiendo contra ataques de fuerza bruta mediante bloqueo tras 5 intentos fallidos.

**Justificación:** No describe una función sino un atributo de calidad (seguridad). El cliente lo mencionó explícitamente.


**RNF-02 – Rendimiento y concurrencia**
El sistema debe soportar un mínimo de 500 usuarios concurrentes con un tiempo de respuesta inferior a 2 segundos para operaciones estándar bajo carga normal.

**Justificación:** Restricción de calidad de servicio. El cliente expresó preocupación por soportar múltiples usuarios simultáneos.


**RNF-03 – Disponibilidad**
El sistema debe mantener una disponibilidad del 99.5% mensual, con ventanas de mantenimiento programado notificadas con al menos 24 horas de anticipación.

**Justificación:** Atributo de confiabilidad. No fue mencionado explícitamente pero es esencial para una plataforma de juego en línea.


**RNF-04 – Experiencia de usuario en combates**
El sistema debe reflejar las acciones de un jugador en la pantalla del oponente en un tiempo máximo de 500ms durante el transcurso de un combate activo.

**Justificación:** El cliente mencionó explícitamente su preocupación por la experiencia durante los combates. Este atributo de latencia define directamente esa experiencia.


**RNF-05 – Persistencia de datos**
El sistema debe garantizar que todos los datos del entrenador (Pokémon, equipos, historial, puntuación) sean persistidos de forma duradera, con respaldos automáticos diarios y recuperación en menos de 4 horas ante fallo.

**Justificación:** Atributo de confiabilidad. No mencionado explícitamente pero cualquier pérdida de progreso es inaceptable en un juego competitivo.


## 3. Priorización

| ID | Requerimiento | Prioridad | Criterio |
|---|---|---|---|
| RF-01 | Registro | **Alta** | Bloquea todo el sistema. Sin usuarios no hay plataforma. |
| RF-02 | Inicio de sesión | **Alta** | Depende de RF-01. Necesario para acceder a cualquier función. |
| RF-03 | Recuperación de contraseña | **Media** | No bloquea el lanzamiento pero es esencial para retención. |
| RF-04 | Gestión de perfil | **Media** | Mejora la experiencia pero no es crítica para el MVP. |
| RF-05 | Gestión de Pokémon | **Alta** | Núcleo del producto. Todo lo demás depende de esto. |
| RF-06 | Creación de equipos | **Alta** | Requerido para participar en combates. |
| RF-07 | Combates en línea | **Alta** | Valor central del negocio. Sin combates el producto no tiene propósito. |
| RF-08 | Historial de batallas | **Media** | Importante para experiencia pero no bloquea el funcionamiento básico. |
| RF-09 | Liga y ranking | **Media** | Agrega valor competitivo. Depende de que los combates estén funcionando. |
| RF-10 | Matchmaking | **Alta** | Bloquea RF-07 si no está implementado. |
| RNF-01 | Seguridad | **Alta** | Un fallo de seguridad puede destruir la confianza en el producto. |
| RNF-02 | Rendimiento | **Alta** | El cliente lo mencionó explícitamente. Sistema lento = jugadores abandonan. |
| RNF-03 | Disponibilidad | **Alta** | Una plataforma caída frecuentemente pierde jugadores de forma irreversible. |
| RNF-04 | Latencia en combates | **Alta** | El cliente lo mencionó explícitamente. Diferenciador clave de experiencia. |
| RNF-05 | Persistencia | **Alta** | Perder el progreso de un jugador es fatal para la retención. |


## 4. Identificación de dependencias y bloqueos

### Dependencias entre requerimientos

RF-01 (Registro)
  └── RF-02 (Login)
        └── RF-03 (Recuperar contraseña)
        └── RF-04 (Gestión de perfil)
        └── RF-05 (Gestión de Pokémon)
              └── RF-06 (Crear equipos)
                    └── RF-10 (Matchmaking)
                          └── RF-07 (Combates)
                                └── RF-08 (Historial)
                                └── RF-09 (Liga / Ranking)

Los requerimientos no funcionales RNF-01, RNF-02, RNF-03 y RNF-05 son transversales: deben considerarse desde el diseño inicial de la arquitectura, ya que afectan a todos los módulos.

### Posibles bloqueos

1. **Mecánicas de combate no definidas:** El cliente no especificó si los combates son en tiempo real o por turnos, ni las reglas de estadísticas. Sin esto no se puede desarrollar RF-07 ni RF-10.

2. **Escala de usuarios sin cifra concreta:** RNF-02 no puede dimensionarse sin un número de usuarios concurrentes esperado. Esto impide diseñar la infraestructura adecuadamente.

3. **Reglas de la liga sin definir:** No hay criterios para calcular el ranking (puntos por victoria, penalización por derrota, temporadas). Bloquea RF-09.

4. **Funcionalidades futuras sin arquitectura:** Torneos y recompensas no están definidos. Si la arquitectura actual no los contempla, podría requerirse una refactorización mayor costosa.


## 5. Matriz de trazabilidad

| ID | Requerimiento | Tipo | Módulo | Caso de uso | Prueba / Validación | Prioridad |
|---|---|---|---|---|---|---|
| RF-01 | Registro de entrenadores | Funcional | Autenticación | Registrar usuario | Nuevo usuario crea cuenta y recibe email de confirmación | Alta |
| RF-02 | Inicio de sesión | Funcional | Autenticación | Iniciar sesión | Credenciales correctas conceden acceso; incorrectas son rechazadas | Alta |
| RF-03 | Recuperación de contraseña | Funcional | Autenticación | Recuperar acceso | Enlace de recuperación es enviado y permite cambiar contraseña | Media |
| RF-04 | Gestión de perfil | Funcional | Perfil | Editar perfil | Cambios en perfil se guardan y reflejan correctamente | Media |
| RF-05 | Gestión de Pokémon | Funcional | Pokémon | Gestionar colección | Entrenador agrega Pokémon y visualiza sus estadísticas | Alta |
| RF-06 | Creación de equipos | Funcional | Equipo | Armar equipo | Se puede crear equipo con hasta 6 Pokémon y guardarlo | Alta |
| RF-07 | Combates en línea | Funcional | Combate | Iniciar combate | Dos jugadores ejecutan un combate completo hasta determinar ganador | Alta |
| RF-08 | Historial de batallas | Funcional | Historial | Ver historial | Tras un combate ambos jugadores ven el resultado en su historial | Media |
| RF-09 | Liga y ranking | Funcional | Liga | Ver ranking | El ranking se actualiza correctamente tras cada combate | Media |
| RF-10 | Matchmaking | Funcional | Combate | Buscar oponente | El sistema conecta dos jugadores de nivel similar en menos de 60s | Alta |
| RNF-01 | Seguridad de cuentas | No funcional | Autenticación | Protección de datos | Contraseñas no están en texto plano; tokens expiran correctamente | Alta |
| RNF-02 | Rendimiento y concurrencia | No funcional | Infraestructura | Carga del sistema | Prueba de carga con 500 usuarios simultáneos sin degradación | Alta |
| RNF-03 | Disponibilidad | No funcional | Infraestructura | Operación continua | Monitoreo de uptime durante 30 días muestra ≥99.5% disponibilidad | Alta |
| RNF-04 | Latencia en combates | No funcional | Combate | Tiempo real | Latencia entre acción y reflejo en pantalla del oponente ≤500ms | Alta |
| RNF-05 | Persistencia de datos | No funcional | Base de datos | Almacenamiento seguro | Tras reinicio del servidor los datos del entrenador permanecen intactos | Alta |


## 6. Análisis de ambigüedades

Se identificaron 5 aspectos ambiguos o incompletos en el enunciado que requieren validación con el cliente antes de comenzar el desarrollo.


### Ambigüedad 1 – "Múltiples usuarios simultáneos" sin cifra concreta

**Problema:** El enunciado menciona la necesidad de soportar múltiples usuarios concurrentes pero no define un número específico. La arquitectura técnica (número de servidores, tipo de base de datos, uso de websockets o colas de mensajes) cambia radicalmente según se trate de 100, 1,000 o 100,000 usuarios.

**Pregunta al cliente:** ¿Cuántos usuarios concurrentes se esperan en el lanzamiento? ¿Cuál es el pico máximo proyectado?


### Ambigüedad 2 – Mecánicas de combate no definidas

**Problema:** Se menciona que los usuarios participarán en combates, pero no se especifica si son en tiempo real o por turnos, si los Pokémon tienen estadísticas propias del sistema o heredadas de la franquicia, si se puede abandonar un combate activo o si hay tiempo límite por turno. Sin estas definiciones es imposible diseñar la lógica del sistema.

**Pregunta al cliente:** ¿Cómo funcionan exactamente los combates? ¿Tienen alguna referencia de un sistema existente (Pokémon GO, los juegos principales de la franquicia)?


### Ambigüedad 3 – Reglas de la liga competitiva sin definir

**Problema:** Se menciona una "liga competitiva" y la visualización del "progreso dentro de la liga", pero no hay ninguna regla de negocio definida: ¿cómo se calculan los puntos? ¿existen divisiones o categorías? ¿hay temporadas con reinicio de puntuación? ¿cuántos puntos se ganan o pierden por combate? Esto afecta directamente el diseño de la base de datos y la lógica de negocio.

**Pregunta al cliente:** ¿Cómo funciona el sistema de puntos y ranking? ¿Tiene referencia de otro juego competitivo similar (Elo, MMR, ligas de League of Legends)?


### Ambigüedad 4 – Alcance de la seguridad no especificado

**Problema:** El cliente menciona "seguridad de las cuentas" como preocupación, pero no define el alcance: ¿solo autenticación fuerte? ¿doble factor (2FA)? ¿protección contra bots y cuentas múltiples? ¿prevención de trampas en combates? Cada nivel implica una complejidad y costo diferente.

**Pregunta al cliente:** ¿Qué tipo de amenazas le preocupan específicamente? ¿Tiene requerimientos de cumplimiento normativo (GDPR, COPPA para menores de edad)?


### Ambigüedad 5 – Funcionalidades futuras sin especificación ni plazo

**Problema:** El cliente menciona torneos, recompensas y modos de juego adicionales como funcionalidades futuras "aunque aún no están completamente definidas". Esto representa un riesgo arquitectónico: si no se diseña el sistema actual pensando en estas extensiones, podría ser necesaria una refactorización mayor y costosa en el futuro.

**Pregunta al cliente:** ¿Tiene alguna prioridad o plazo estimado para estas funcionalidades? ¿Podría describir brevemente cómo imagina los torneos? Así se puede diseñar la arquitectura actual de forma que las soporte sin rediseño.


## Conclusión

Este análisis demuestra que, a partir de un enunciado con información incompleta y sin documentación formal, es posible estructurar una base sólida de requerimientos identificando tanto lo explícito como lo implícito, clasificando correctamente cada requerimiento, detectando vacíos de información y estableciendo dependencias claras entre módulos.

Los puntos críticos antes de iniciar el desarrollo son: definir las mecánicas de combate, establecer la escala de usuarios esperada y formalizar las reglas de la liga competitiva.

