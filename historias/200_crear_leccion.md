# Historia: Crear leccion

- Yo como: Administrador
- Quiero: poder crear una leccion
- Para: añadir contenido a mi leccion

## Pendientes de definición.

Ninguno

## Especificación de requerimientos.

1. Se deben guardar todos los cambios hechos en la leccion

## Analisis

### Pantalla de lecciones

A continuación se presenta la pantalla de lecciones donde se puede crear la leccion

1. El administrador ingresa al curso y clickea en crear leccion
2. El administrador deberá añadir informacion en la leccion y guardarla.

![Alt text](image-13.png)

### Pantalla de modificacion de lecciones

## Criterios de aceptacion

Gherkin

### Se deben guardar todos los cambios hechos en la leccion

- Dado: Que el administrador decida crear una leccion
- Cuando: Este cree la leccion
- Entonces: El sistema debe crear las informacion realizada en la leccion.

## Diseño

### Pantalla de lecciones

1. Para crear leccion:

Request:

```
POST http://localhost:8080/api/v1/subjects/modules/lesson/{id}
Accept: Application/json
Authorization: Bearer JWT

[
{
        "id_lesson": 101,
        "lesson_name": "¿Qué es Java?",
        "link_ytvideo": "https://www.youtube.com/watch?v=example1",
        "description_lesson": "Introducción al lenguaje de programación Java y su historia."
    }


]

```

Response: Exitoso statusCode: 200

```

```

[
{
"code" : "SUCCES 200",
"result" : null,
"message" : "La leccion ha sido creada con exito"
}

]

```


```

Response: No encontrado statusCode: 404

```
[
{
    "code" : "ERROR 404",
    "result" : null,
    "message" : "La leccion no puso ser creada"
}

]
```
