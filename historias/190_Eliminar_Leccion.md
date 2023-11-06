# Historia: Eliminacion de Leccion

- Yo como: Administrador.
- Quiero: Realizar la eliminacion de una leccion.
- Para: Quitarlo de un modulo seleccionado.

## Especificación de requerimientos.

1. Seleccionar el curso y modulo de la leccion a eliminar. 
2. Mostrar los campos de creacion de modulo. 

## Analisis

### Pantalla del creacion de modulo

A continuación se presenta la pantalla de curso, cuyo funcionamiento es.

1. El administrador ingreso a la pagina de un curso.
2. El administrador observa los modulos y lecciones que puede eliminar o editar.

![Alt text](image-(6).png)

## Criterios de aceptacion

### Mostrar formulario de creacion del modulo

- Dado: Que el administrador desea eliminar un nuevo modulo.
- Cuando: Presione el boton para eliminar.
- Entonces: Se muestra una ventana de confirmacion para eliminar la leccion.

## Disenio

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

```

Response: No encontrado statusCode: 404
```

```





