# Historia: Dar respuesta con CHAT GPT sobre la importancia de habilidades blandas.

- Yo como: Instructor
- Quiero: obtener respuestas de Chat GPT sobre la importancia de las habilidades blandas
- Para: asistir a los estudiantes de manera interactiva y personalizada.

## Pendientes de definición.

1. ¿Es suficiente el numero de caracteres para responder a la pregunta?
   R. Las respuesta enviadas no suelen ser demasiado largas.
2. ¿Se hara censura de preguntas y contenido externo?
   R. Si, gpt 4 se puede configurar para que lo censure

## Especificación de requerimientos.

1. La plataforma debe ser capaz de enviar y recibir mensajes a través de la API de Chat GPT.
2. La interfaz de usuario debe permitir la interacción fluida con el chatbot.
3. La integración debe manejar adecuadamente las entradas de los usuarios y las respuestas del sistema.

## Analisis

### Pantalla de Inicio de la pagina

El sistema debe ser capaz de manejar una conversación en un formato de chat, aprovechando las capacidades de la API de Chat GPT para procesar lenguaje natural, código y ahora también imágenes.

La plataforma enviará mensajes que contienen las preguntas o solicitudes de los estudiantes a la API de Chat GPT.
La API procesará estas entradas y devolverá respuestas que la plataforma mostrará a los estudiantes.

![Alt text](<image().png>)

## Criterios de aceptacion

### Generacion de respuesta

- Dado: Que el usuario ingrese a la pagina y escriba su respuesta.
- Cuando: Envie su respuesta
- Entonces: El sistema genera una respuesta con Chat GPT para el usuario.

# Escenario: Enviar pregunta a Chat GPT y recibir respuesta

- Dado que un estudiante ha hecho una pregunta
- Cuando el sistema envía esta pregunta a la API de Chat GPT
- Entonces la API debe procesar la pregunta y devolver una respuesta pertinente que el sistema mostrará al estudiante

# Escenario: Mantener el contexto en una conversación con Chat GPT

- Dado que un estudiante ha iniciado una conversación con Chat GPT
- Cuando el estudiante hace seguimiento con preguntas adicionales
- Entonces el sistema debe incluir el historial de la conversación en la solicitud de la API y la API debe devolver respuestas coherentes que mantengan el contexto de la conversación

# Escenario: Respuesta solo si tiene permisos adecuados

- Dado que el usuario intenta hacer una pregunta
- Cuando no tiene permisos para hacer la pregunta(que no haya pagado membresia o el curso)
- Entonces el sistema debe mostrar un mensaje de error de "Permiso denegado" y no debe permitir que se haga la pregunta a chat GPT

## Disenño

### Generar respuesta con Chat GPT

La plataforma e-learning utilizará el endpoint https://api.openai.com/v1/chat/completions para comunicarse con la API de Chat GPT. La interfaz de usuario permitirá a los estudiantes formular preguntas y ver las respuestas. La integración se diseñará para mantener el contexto de la conversación, manejar preguntas de seguimiento, y soportar la inclusión de imágenes en las solicitudes.

Request:

```
POST https://api.openai.com/v1/chat/completions
Accept: Application/json
Authorization: "Bearer YOUR_OPENAI_API_KEY"

{
  "model": "gpt-3.5-turbo",
  "messages": [
    {
      "role": "system",
      "content": "You are a helpful assistant."
    },
    {
      "role": "user",
      "content": "What's the capital of France?"
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
        "content": "The capital of France is Paris."
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
  "error": {
    "code": "not_found",
    "message": "The requested resource was not found."
  }
}
```
