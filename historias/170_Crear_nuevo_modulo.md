# Historia: Crear nuevo modulo

- Yo como: Administrador.
- Quiero: Realizar la creacion de un nuevo modulo.
- Para: Agregarlo a un curso disponible.

## Especificación de requerimientos.

1. Seleccionar el curso al que se aginará el modulo. 
2. Mostrar los campos de creacion de modulo. 

## Analisis

### Pantalla del creacion de modulo

A continuación se presenta la pantalla de bienvenida al curso, cuyo funcionamiento es.

1. El administrador ingreso a la pagina de creacion de modulos.
2. El administrador observa los campos para la creacion del modulo.

![Alt text](image-(5).png)

## Criterios de aceptacion

### Mostrar formulario de creacion del modulo

- Dado: Que el administrador desea crear un nuevo modulo.
- Cuando: Llene los campos del modulo y presione el boton de crear curso.
- Entonces: Se crea el nuevo modulo y es agregado al curso seleccionado.

## Disenio

### Mostrar formulario de creacion del modulo

1. Para realizar la creacion del modulo:

Request:
```
POST http://localhost:8080/api/v1/subjects/{id}/modules/
Accept: Application/json
Authorization: Bearer JWT

{
    "id_subject": 1,
    "module_name": "Nuevas Técnicas en Java"
}

```
Response: Exitoso statusCode: 200
```
[
{
    "code" : "CODE-1000",
    "result" : null,
    "message" : "El modulo ha sido creado con éxito"
}

]



```

Response: No encontrado statusCode: 404
```
[
{
    "code" : "ERROR 404",
    "result" : null,
    "message" : "El modulo no ha sido crrado"
}

]
```





