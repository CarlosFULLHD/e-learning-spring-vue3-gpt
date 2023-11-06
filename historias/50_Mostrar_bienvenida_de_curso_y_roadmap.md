# Historia: Mostrar bienvenida de curso y roadmap

- Yo como: Usuario 
- Quiero: Ver la informacion y roadmap del curso seleccionado
- Para: Aprender sobre dicho curso.

## Especificación de requerimientos.

1. Mostrar la informacion del curso. 
2. Mostrar el roadmap del curso.
3. Acceder a los modulos y lecciones

## Analisis

### Pantalla de Bienvenida al curso y roadmap

A continuación se presenta la pantalla de bienvenida al curso, cuyo funcionamiento es.

1. El usuario ingreso previamente a los cursos.
2. El usuario observa la informacion del curso.
3. El usuario observa el roadmap del curso.


![Alt text](image-(2).png)

## Criterios de aceptacion

### Mostrar informacion del curso y roadmap

- Dado: Que el usuario desee ver la informacion de un curso.
- Cuando: Ingrese a la pagina del curso.
- Entonces: Se muestra la informacion del curso y su roadmap.

## Disenio

### Generar respuesta con Chat GPT

1. Para obtener la informacion del curso:

Request:
```
GET http://localhost:8080/api/v1/subjects/{id}/
Accept: Application/json
Authorization: Bearer JWT
```

Response: Exitoso statusCode: 200
```
{
    "id_subject": 2,
    "img_link": "https://example.com/path/to/image2.jpg",
    "title_subject": "Diseño Web Responsive",
    "description_subject": "Descubre cómo crear sitios web adaptables a cualquier dispositivo.",
    "welcome_text": "¡Bienvenido al curso de diseño web responsive!",
    "importance": "El diseño adaptable es esencial en la era actual de dispositivos móviles.",
    "intended_for": "Diseñadores y desarrolladores web que buscan mejorar sus habilidades.",
    "learnings_fromthis_subject": "Flexbox, Grid, media queries y prácticas modernas.",
    "roadmap_img": "https://example.com/path/to/roadmap2.jpg"
},

```

Response: No encontrado statusCode: 404
```

```





