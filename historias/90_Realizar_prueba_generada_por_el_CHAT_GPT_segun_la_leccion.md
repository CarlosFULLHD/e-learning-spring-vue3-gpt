# Historia: Realizar prueba generada por el CHAT GPT segun la leccion

- Yo como: Usuario.
- Quiero: Hacer la prueba de la leccion.
- Para: Pasar la leccion.

## Especificación de requerimientos.

1. Mostrar las preguntas del quiz. 
2. Validar las respuestas.

## Analisis

### Pantalla del curso

A continuación se presenta la pantalla de bienvenida al curso, cuyo funcionamiento es.

1. El usuario ingreso previamente al curso.
2. El usuario ingreso a uno de los modulos del curso.
3. El usuario ingreso a una de las lecciones de los modulos.
4. El usuario observa el contenido de la leccion.
5. El usuario observa el video de la leccion.
6. El usuario observa el boton para ingresar a la prueba.

![Alt text](image-(3).png)

## Criterios de aceptacion

### Mostrar contenido del curso

- Dado: Que el usuario desee realizar la prueba de la leccion.
- Cuando: Presione el boton de realizar la prueba.
- Entonces: Se genera una prueba segun la leccion.

## Disenio

### Mostrar contenido del curso y video

1. Para obtener la prueba de la leccion:

Request:
```
GET http://localhost:8080/api/v1/subjects/{id}/modules/{id}/lessons/{id}/
Accept: Application/json
Authorization: Bearer JWT
```

Response: Exitoso statusCode: 200
```
{
  "quiz": [
    {
      "question": "¿Cuál de las siguientes palabras clave se utiliza para definir una clase en Java?",
      "options": ["definir", "class", "function", "void"],
      "correct_option": 1
    },
    {
      "question": "En Java, ¿qué tipo de variable se utiliza para almacenar números enteros?",
      "options": ["int", "float", "String", "boolean"],
      "correct_option": 0
    },
    {
      "question": "¿Qué operador se utiliza para comparar dos valores en Java?",
      "options": ["=", "==", "<>", "!="],
      "correct_option": 1
    },
    {
      "question": "En Java, ¿qué ciclo se utiliza para repetir una instrucción mientras una condición sea verdadera?",
      "options": ["for", "while", "do-while", "if"],
      "correct_option": 1
    },
    {
      "question": "¿Cuál de las siguientes bibliotecas se utiliza para entrada y salida en Java?",
      "options": ["stdio.h", "java.io", "math.h", "string.h"],
      "correct_option": 1
    }
  ]
}


```

Response: No encontrado statusCode: 404
```

```





