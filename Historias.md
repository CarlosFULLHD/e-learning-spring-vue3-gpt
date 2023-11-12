# Análisis y Diseño de Software

## Valor

Crear una plataforma de e-learning intuitiva y dinámica que no solo facilite el acceso a una variedad de recursos educativos, sino que también utilice la inteligencia artificial para personalizar la experiencia de aprendizaje y evaluar de manera interactiva el conocimiento adquirido por los estudiantes.

## Historias de usuario

1. Inicio de sesion(Autenticación y Navegación)
2. Nav bar con inicio, cursos y recursos
3. Dar respuesta con CHAT GPT sobre la importancia de habilidades blandas
4. Listar cursos
5. Mostrar bienvenida de curso y roadmap
6. Mostrar modulos y lecciones del curso
7. Mostrar de la leccion el video y descripcion
8. Asistencia de Chat GPT en preguntas y respuestas para las lecciones
9. Realizar prueba generada por el CHAT GPT segun la leccion
10. Mostrar recursos base para la creacion de los cursos: libros, articulos, canal de yt
11. Crear nuevo curso
12. Subir imagen del curso
13. Modificar curso actual
14. Eliminar curso
15. Modificar modulo
16. Eliminar modulo
17. Crear nuevo modulo
18. Modificar leccion
19. Eliminar leccion
20. Crear leccion
21. Añadir chat gpt con descripcion necesaria para responder y crear prueba

# Ingresos y Membresías

- Usuarios sin membresia: Pueden usar el Chat gpt de la pagina de inicio.
- Membresía Básica: $5/mes (con Chat GPT en preguntas y respuestas para los cursos, pruebas personalizadas de conocimiento por cada curso, acceso a recursos de bibliografía).
- Membresía Premium: $10/mes acceso cursos premium.
- Membresía Avanzada: $20/mes acceso a comunidad privada.

### Hosting y dominio

Costos Anuales

1. Plan VPS (KVM 2)
   Primeros 2 años:

- Precio Mensual: $6,99
- Costo Anual: $6,99 \* 12 = $168
  A partir de 3er año:
- Precio Mensual: $10,99
- Costo Anual: $10,99 \* 12 = $132

2. Certificado SSL
   Costo: Gratis con los planes de hosting de Hostinger.
   SSL Opcion con pago:
   Primeros 2 años:

- Costo Anual: $120
  A partir del 3er año
- Precio Mensual: $6,99
- Costo Anual: $6,99 \* 12 = $84

3. Registro de Dominio .COM
   Primeros 2 años: $25.98
   A partir de 3er año:

- Precio Mensual: $15.99
- Costo Anual: $15.99 \* 12 = $192

### Contenido de los cursos

Generados por la comunidad de instructores

### Marketing en redes + creacion de contenido

- $500/mes

### Costos de Chat GPT

- GPT-3.5:
- Costo de entrada: $0.0010 por 1K tokens.
- Costo de salida: $0.0020 por 1K tokens.

- GPT-4: Usaremos este
  Costo de entrada: $0.01 por 1K tokens.
  Costo de salida: $0.03 por 1K tokens.

---

Se supone:

- Usuarios sin membresia: 1000 -> $35
- Usuarios con membresia Básica: 100 -> $7
- Preguntas: alrededor de 50 tokens
- Respuestas: alrededor de 300 tokens
- Pagina de inicio: 10 preguntas y respuestas para todos los usuarios
- TOTAL TOKENS: 3500 ->$0.035
- Pagina de lecciones - Preguntas y respuestas: 10 preguntas y respuestas por usuario con membresia basica
- TOTAL TOKENS: 3500 ->$0.035
- Pagina de pruebas personalizadas de conocimiento:
- por medir

---

# Costos totales para 2 años

- Hosting: $168
- SSL: $120
- Dominio: $25.98
- **Marketing + creacion de contenido: $6000** (no se toma en cuenta)
- Uso chat GPT:
- Usuarios sin membresia: 1000 -> $840
- Usuarios con membresia Básica: 100 -> $168
  TOTAL:
  $1322

# Ingresos

En 2 años:

- Usuarios sin membresia: 1000 -> $0
- Usuarios con membresia Básica: 100 -> $12000

# Sugerencias

Implementarlo dentro de la plataforma para evitar brechas de seguridad?
Delegarlo:
Sugerencias para la Comunidad Privada
Utilizar plataformas como Discord o Slack para crear una comunidad exclusiva.
Realizar sesiones semanales de Q&A a través de Zoom o Google Meet.
Ofertas y Promociones Especiales
Códigos de descuento exclusivos en los videos de YouTube.
Promociones por tiempo limitado, como acceso gratuito a un curso premium por la suscripción anual.
Programa de referidos donde los usuarios existentes obtengan descuentos o beneficios al traer nuevos usuarios

## Whish List

- roadmap personalizado -> con la base de datos y los cursos que se hayan registrado, se cree un roadmap autonmaticamente en una pestaña, eso para cada curso
- Comentarios para el curso y de la comunidad(Se usara disqus o alguna api asi?)
- Integracion con converkit para registro de correos para cada curso o maestro a su lista de correos
- Integracion con Google analytics para analisis de pagina web
- Botones de “reportar un error” para costos menores en soporte
- Diseño de la Base de Datos para KPIs
  Para medir los KPIs, considera tablas para:
- Gamificacion, personalizacion se usuarios con perfiles, insignias y rangos
- KPI's para medir
  Participación del Usuario
  Número de Usuarios Activos: Usuarios que se han registrado y han iniciado sesión en la plataforma durante un periodo específico.
  Tasa de Retención de Usuarios: El porcentaje de usuarios que regresan a la plataforma después de su primera visita.
  Tiempo Promedio en la Plataforma: Cuánto tiempo pasan los usuarios en la plataforma en promedio por sesión.
  Rendimiento del Contenido del Curso
  Tasa de Finalización de Cursos: Porcentaje de cursos que los usuarios completan después de inscribirse.
  Número de Cursos Tomados por Usuario: Promedio de cursos que cada usuario toma.
  Interacciones por Lección: Cuántas veces los usuarios interactúan con el contenido de la lección (por ejemplo, hacer clic en enlaces, descargar recursos, publicar preguntas).
  Evaluación y Pruebas
  Puntuaciones Promedio en Pruebas: Promedio de resultados de pruebas para cada lección o curso, lo que puede indicar la dificultad o efectividad del material.
  Tasa de Mejora de Pruebas: Mejora en las puntuaciones de pruebas a lo largo del tiempo para los usuarios individuales o grupos de usuarios.
  Asistencia y Soporte
  Solicitudes de Asistencia: Número de veces que los usuarios utilizan la función de Chat GPT para pedir ayuda.
  Resolución de Preguntas: Tiempo promedio que tarda Chat GPT en proporcionar una respuesta que el usuario considere útil.
  Engagement y Feedback
  Número de Comentarios/Foros de Discusión: Medir la interacción de los usuarios con los foros de discusión o los comentarios en las lecciones.
  Calificaciones de los Cursos: Evaluaciones promedio que los usuarios dan a los cursos, lo que puede ser un indicador de satisfacción del usuario.
  Eficiencia Operativa
  Costo por Usuario: Costo de operación de la plataforma dividido por el número de usuarios activos.
  Tiempo de Resolución de Incidentes: Tiempo promedio que tarda el equipo de soporte técnico en resolver problemas reportados por los usuarios.
  Crecimiento y Escalabilidad
  Tasa de Crecimiento de Usuarios Nuevos: La velocidad a la que la plataforma está adquiriendo nuevos usuarios.
  Expansión de la Biblioteca de Cursos: Número de nuevos cursos o lecciones añadidas en un periodo de tiempo específico.

  Usuarios: Registro de usuarios, sus suscripciones y actividad.
  Cursos: Información detallada de cada curso, incluyendo inscripciones y finalizaciones.
  Interacciones con Chat GPT: Registro de cada interacción con Chat GPT, incluyendo número de tokens utilizados.
  Pruebas y Evaluaciones: Resultados de las pruebas generadas por Chat GPT.
  Analytics: Datos de tráfico web, tiempo de permanencia, páginas más visitadas, etc.

Uso de Google Analytics y Herramientas de Seguimiento
Google Analytics: Útil para rastrear el comportamiento del usuario, fuentes de tráfico, y la eficacia del SEO. Configura objetivos y conversiones para medir el rendimiento.
Leads y SEO: Utiliza Google Analytics para identificar las páginas más efectivas y las fuentes de tráfico para optimizar estrategias de captación de leads y mejorar el SEO.

- Seccion timer para trabajar? - Integracion con flocus
- Stopwatch
- Musica spotify
- YT music, otros
- Frase motivadora
  https://app.flocus.com/
  https://gridfiti.notion.site/Flocus-by-Gridfiti-Beta-394b66e2d5cd43f98eb2491e68efdd8b
