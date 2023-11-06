# Historia: Mostrar video y descripcion de la leccion

- Yo como: Usuario.
- Quiero: Ver el contenido de la leccion de un modulo.
- Para: Aprender sobre esa leccion.

## Especificación de requerimientos.

1. Mostrar contenido de las lecciones. 
2. Mostrar video de las lecciones.

## Analisis

### Pantalla del curso

A continuación se presenta la pantalla de bienvenida al curso, cuyo funcionamiento es.

1. El usuario ingreso previamente al curso.
2. El usuario ingreso a uno de los modulos del curso.
2. El usuario ingreso a una de las lecciones de los modulos.
2. El usuario observa el contenido de la leccion.
3. El usuario observa el video de la leccion.


![Alt text](image-(3).png)

## Criterios de aceptacion

### Mostrar contenido del curso

- Dado: Que el usuario desee ver el contenido de una leccion.
- Cuando: Ingrese a un modulo y leccion.
- Entonces: Se muestra el contenido de la leccion y video.

## Disenio

### Mostrar contenido del curso y video

1. Para obtener el contenido del curso y video:

Request:
```
GET http://localhost:8080/api/v1/subjects/{id}/modules/{id}/lessons/{id}
Accept: Application/json
Authorization: Bearer JWT
```

Response: Exitoso statusCode: 200
```
{
    "subject": {
        "id_subject": 1,
        "title_subject": "Programación en Java"
    },
    "module": {
        "id_module": 1,
        "module_name": "Introducción a Java"
    },
    "lesson": {
        "id_lesson": 101,
        "lesson_name": "¿Qué es Java?",
        "link_ytvideo": "https://www.youtube.com/watch?v=example1",
        "description_lesson": "Introducción al lenguaje de programación Java y su historia."
    }
}

```

Response: No encontrado statusCode: 404
```

```





