# Historia: Asistencia de Preguntas y respuestas con chat GPT para las lecciones

- Yo como: Usuario
- Quiero: hacer preguntas específicas sobre los contenidos de la lección que estoy tomando
- Para: obtener claridad instantánea y mejorar mi comprensión del tema.

## Pendientes de definición.

1. ¿Cómo se manejará la contextualización de las preguntas en relación con la lección específica?
2. ¿Existirá un límite en el número de preguntas que un estudiante puede hacer en una sesión?

## Especificación de requerimientos.

1. La plataforma debe integrar la API de Chat GPT de manera que pueda comprender el contexto de la lección actual.
2. El Chat GPT debe ser capaz de proporcionar respuestas específicas basadas en el contenido de la lección.
3. Los estudiantes deben poder interactuar con el Chat GPT desde la interfaz de la lección sin interrumpir su experiencia de aprendizaje

## Analisis

### Pantalla de modulos y lecciones con una leccion de ejemplo

A continuación se presenta la pantalla de modulos y lecciones.

1. El usuario ingresa su pregunta en la entrada.
2. El usuario deberá obtener una respuesta a su pregunta según la duda que tenga...

![Alt text](image-5.png)

### Pantalla de subida de imagen

## Criterios de aceptacion

Gherkin

### Interacción efectiva con Chat GPT

- Dado: Que el estudiante está aprendiendo sobre "Comunicación Efectiva".
- Cuando: El estudiante hace una pregunta específica relacionada con la lección.
- Entonces: El sistema utiliza Chat GPT para generar una respuesta contextualizada y útil.

### cantidad minima de caracteres por pregunta

- Dado: Que el usuario tiene una pregunta por hacer
- Cuando: Este por escribir la pregunta que tenga
- Entonces: El sistema debe validar que subio al menos 20 caracteres como entrada.

### Rechaza la pregunta si hace preguntas indebidas o fuera del tema

- Dado: Que el usuario tiene una pregunta
- Cuando: Este por escribir la pregunta que sea indebida o fuera del tema
- Entonces: El sistema debe dar una respuesta de pregunta invalida.

### Generación de respuesta contextualizada

- Dado: Que el estudiante ha formulado una pregunta que depende del contexto de lecciones anteriores.
- Cuando: El sistema envía esta pregunta junto con el contexto relevante a la API de Chat GPT.
- Entonces: Chat GPT genera una respuesta que considera toda la información proporcionada.

### Restricción de acceso según permisos

- Dado: Que el estudiante intenta usar la asistencia de Chat GPT.
- Cuando: El estudiante no tiene los permisos necesarios (por ejemplo, no ha pagado por el acceso a esta característica).
- Entonces: El sistema debe mostrar un mensaje informando al estudiante sobre las restricciones y cómo obtener acceso.

## Disenio

### Pantalla de respueta del chat

1. Para obtener respuestas a las preguntas hechas por el usuario:

Request:

```
POST https://api.openai.com/v1/chat/completions
Accept: application/json
Authorization: "Bearer YOUR_OPENAI_API_KEY"

{
  "model": "gpt-3.5-turbo",
  "messages": [
    {
      "role": "system",
      "content": "This is a helpful assistant that can answer questions related to the 'Effective Communication' lesson."
    },
    {
      "role": "user",
      "content": "What is meant by non-verbal communication?"
    }
  ]
}

```

Response: Exitoso statusCode: 200

```
{
  "id": "chatcmpl-XXXXXXXXXXXXXXXXXXXXX",
  "object": "chat.completion",
  "created": 1624390452,
  "model": "gpt-3.5-turbo",
  "choices": [
    {
      "message": {
        "role": "assistant",
        "content": "Non-verbal communication refers to the ways we convey a message without using spoken language. This can include facial expressions, body language, gestures, and other forms of physical expression that communicate your feelings or intentions."
      },
      "index": 0,
      "finish_reason": "stop"
    }
  ],
  "usage": {
    "completion_tokens": 4,
    "prompt_tokens": 8,
    "total_tokens": 12
  }
}

```

Response: No encontrado statusCode: 404

```
{
    "code" : "ERROR 404",
    "result" : null,
    "message" : "Ingrese al menos un pregunta mas precisa de mas de 20 caracteres"
}
```

2. Para obtener respuestas a las preguntas indebidas hechas por el usuario:
   Response: No encontrado statusCode: 406

```
{
"code" : "ERROR 406",
"result" : null,
"message" : "Pregunta no autorizada, por favor revise que la pregunta tenga que ver con el tema, gracias!"
}
```

3. No tiene permisos

```
{
"code" : "ERROR 401",
"result" : null,
"message" : "Pregunta no autorizada, por favor revise su plan"
}
```
