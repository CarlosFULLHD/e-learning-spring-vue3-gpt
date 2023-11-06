# Historia: Añadir Chat GPT con descripcion necesaria para responder y crear prueba(BDD)

- Yo como: Administrador.
- Quiero: Añadir la descripcion para el comportamiento del Chat GPT.
- Para: Responder y crear prueba en la leccion.

## Especificación de requerimientos.

1. Seleccionar el curso y modulo de la leccion a crear. 
2. Mostrar los campos de creacion de leccion. 

## Analisis

### Pantalla del creacion de leccion

A continuación se presenta la pantalla para crear leccion, cuyo funcionamiento es.

1. El administrador ingreso a la pagina para crear leccion.
2. El administrador observa los modulos y lecciones que puede eliminar o editar.

![Alt text](image-(7).png)

## Criterios de aceptacion

### Mostrar formulario de creacion de leccion

- Dado: Que el administrador desea crear una nueva leccion.
- Cuando: Presione el boton para guardar.
- Entonces: Se guarda el formulario para crear la leccion.

## Disenio

### Mostrar formulario de creacion de leccion

1. Para realizar la creacion de una leccion:

Request:
```
POST http://localhost:8080/api/v1/subjects/{id}modules/{id}/lessons/
Accept: Application/json
Authorization: Bearer JWT
```
Response: Exitoso statusCode: 200
```
{
    "id_lesson": 101,
    "lesson_name": "¿Qué es Java?",
    "link_ytvideo": "https://www.youtube.com/watch?v=example1",
    "chat"
    "description_lesson": "Introducción al lenguaje de programación Java y su historia."
}


```

Response: No encontrado statusCode: 404
```

```





