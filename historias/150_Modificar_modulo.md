# Historia: Modificar curso

- Yo como: Administrador.
- Quiero: Realizar la modificacion de un modulo.
- Para: Actualizarlo entre los demas modulos.

## Especificación de requerimientos.

1. Seleccionar curso del modulo a modificar.
2. Mostrar los campos del modulo a modificar. 
3. Modificar el modulo.

## Analisis

### Pantalla del modificion del modulo 

A continuación se presenta la pantalla de modificacion del modulo, cuyo funcionamiento es.

1. El administrador ingreso a la pagina de modificacion de modulo.
2. El administrador observa los campos para la modificacion del modulo.

![Alt text](image-(5).png)

## Criterios de aceptacion

### Mostrar formulario de modificacion del modulo

- Dado: Que el administrador desea modificar un modulo.
- Cuando: Reemplaze los campos del modulo y presione el boton de guardar.
- Entonces: Se actualizan los campos del modulo.

## Disenio

### Mostrar formulario de modificacion del modulo.

1. Para realizar la modificacion del modulo:

Request:
```
PUT http://localhost:8080/api/v1/subjects/{id}modules/
Accept: Application/json
Authorization: Bearer JWT
```
Response: Exitoso statusCode: 200
```

{
    "id_subject": 1,
    "module_name": "Nuevas Técnicas en C++"
}

```

Response: No encontrado statusCode: 404
```

```





