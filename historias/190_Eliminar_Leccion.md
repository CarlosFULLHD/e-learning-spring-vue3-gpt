# Historia: Eliminacion de Leccion

- Yo como: Administrador.
- Quiero: Realizar la eliminacion de una leccion.
- Para: Quitarlo de un modulo seleccionado.

## Especificación de requerimientos.

1. Seleccionar el curso y modulo de la leccion a eliminar. 
2. Mostrar los campos de creacion de modulo. 

## Analisis

### Pantalla de la leccion

A continuación se presenta la pantalla de la leccion, cuyo funcionamiento es.

1. El administrador ingreso a una leccion.
2. Presiona el boton para eliminar la lección...

![Alt text](image-(6).png)

## Criterios de aceptacion

### Mostrar .ensaje de eliminacion de lección

- Dado: Que el administrador desea eliminar una lección.
- Cuando: Presione el boton para eliminar.
- Entonces: Se muestra una ventana de confirmacion para eliminar la leccion.

## Diseño

### Mostrar formulario de eliminacion de una leccion

1. Para realizar la eliminacion de una leccion:

Request:
```
DELETE http://localhost:8080/api/v1/subjects/{id}modules/{id}/lessons/{id}
Accept: Application/json
Authorization: Bearer JWT
```
Response: Exitoso statusCode: 200
```
[
{
    "code" : "CODE-1000",
    "result" : null,
    "message" : "La leccion ha sido creada con éxito"
}

]
```

Response: No encontrado statusCode: 404
```
[
{
    "code" : "ERROR 404",
    "result" : null,
    "message" : "La leccion no ha sido encontrada"
}

]
```





