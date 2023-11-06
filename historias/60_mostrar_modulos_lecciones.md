# Historia: Mostrar modulos y lecciones

- Yo como: Usuario vendedor
- Quiero: Ver los modulos y lecciones de un curso
- Para: Poder ingresar a las lecciones

## Pendientes de definición.

1. ¿Donde sera la bienvenida de cada curso?
   R. Sera al inicio de cada curso

## Especificación de requerimientos.

1. La cantidad minima por modulo será una leccion

## Analisis

### Pantalla de modulos y lecciones con una leccion de ejemplo

A continuación se presenta la pantalla de modulos y lecciones.

1. El usuario hizo clic al curso que quiere ver.
2. El usuario deberá obtener la lista de modulos y lecciones dentro del curso...

![Alt text](image-4.png)

### Pantalla de subida de imagen

## Criterios de aceptacion

Gherkin

### cantidad minima por modulo

- Dado: Que el usuario quiera entrar a ver un curso
- Cuando: Este por guardar la subasta
- Entonces: El sistema debe validar que subio al menos 2 y máximo 4.

## Disenio

### Pantalla de creacion de nueva subasta

1. Para obtener modulos y lecciones:

Request:

```
GET http://localhost:8080/api/v1/subjects/{id}/modules-lessons
Accept: Application/json
Authorization: Bearer JWT
```

Response: Exitoso statusCode: 200

```
[
    {
    "subject": {
        "id_subject": 1,
        "title_subject": "Programación en Java"
    },
    "modules": [
        {
            "id_module": 1,
            "module_name": "Introducción a Java",
            "lessons": [
                {
                    "id_lesson": 101,
                    "lesson_name": "¿Qué es Java?"
                },
                {
                    "id_lesson": 102,
                    "lesson_name": "Configuración del entorno"
                }
            ]
        },
        {
            "id_module": 2,
            "module_name": "Fundamentos de Java",
            "lessons": [
                {
                    "id_lesson": 201,
                    "lesson_name": "Variables y tipos de datos"
                },
                {
                    "id_lesson": 202,
                    "lesson_name": "Estructuras de control"
                },
            ]
        },
    ]
}
]
```

Response: No encontrado statusCode: 404

```
[
{
    "code" : "ERROR 404",
    "result" : null,
    "message" : "No existen modulos ni lecciones en estes curso"
}

]
```
