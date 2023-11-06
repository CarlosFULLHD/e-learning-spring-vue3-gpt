# Historia: Dar respuesta con CHAT GPT sobre la importancia de habilidades blandas.

- Yo como: Usuario 
- Quiero: Responder a la pagina sobre mi tema de interes.
- Para: Aprender sobre dicho tema.

## Pendientes de definición.

1. ¿Es suficiente el numero de caracteres para responder a la pregunta?
R. Las respuesta enviadas no suelen ser demasiado largas.


## Especificación de requerimientos.

1. La cantidad maxima de caracteres es de 
2. Se debe enviar la respuesta
3. Se debe generar la repsuesta

## Analisis

### Pantalla de Inicio de la pagina

A continuación se presenta la pantalla de Inicio de la pagina, cuyo funcionamiento es.

1. El usuario ingresa a la pagina.
2. El usuario escribe su respuesta a la pregunta de la pagina en el cuadro de texto.
3. El usuario envia su respuesta

![Alt text](image().png)

## Criterios de aceptacion

### Generacion de respuesta

- Dado: Que el usuario ingrese a la pagina y escriba su respuesta.
- Cuando: Envie su respuesta 
- Entonces: El sistema genera una respuesta con Chat GPT para el usuario.

## Disenio

### Generar respuesta con Chat GPT

1. Para obtener la respuesta:

Request:
```
GET 
Accept: Application/json
Authorization: Bearer JWT
```

Response: Exitoso statusCode: 200
```
{


}
```

Response: No encontrado statusCode: 404
```

```




