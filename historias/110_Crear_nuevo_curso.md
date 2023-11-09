# Historia: Crear nuevo curso

- Yo como: instructor.
- Quiero: Realizar la creacion de un nuevo curso.
- Para: Agregarlo a los cursos disponibles.

## Especificación de requerimientos.

1. Mostrar los campos de creacion de curso.

## Analisis

### Pantalla del creacion de curso

A continuación se presenta la pantalla de bienvenida al curso, cuyo funcionamiento es.

1. El instructor ingreso a la pagina de creacion de cursos.
2. El instructor observa los campos para la creacion del curso.

![Alt text](<image-(4).png>)

## Criterios de aceptacion

### Mostrar formulario de creacion del curso

- Dado: Que el administrador desea crear un nuevo curso.
- Cuando: Llene los campos del curso y presione el boton de crear curso.
- Entonces: Se crea el nuevo curso y es agregado a los demás cursos.

## Disenio

### Mostrar formulario de creacion del curso.

1. Para realizar la creacion del curso:

Request:

```
POST http://localhost:8080/api/v1/subjects
Accept: Application/json
Authorization: Bearer JWT
```

Response: Exitoso statusCode: 200

```
{
    "id_subject": 1,
    "img_link": "https://example.com/path/to/image1.jpg",
    "title_subject": "Programación en Java",
    "description_subject": "Aprende los fundamentos de la programación en Java desde cero."
}
```

Response: No encontrado statusCode: 404

```

```
