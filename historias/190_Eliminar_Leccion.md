# Historia: Eliminacion de Leccion

- Yo como: Instructor.
- Quiero: Realizar la eliminación de una lección.
- Para: Quitarla de un módulo seleccionado.

## Especificación de requerimientos.

1. Seleccionar el curso y modulo de la leccion a eliminar.
2. Confirmar la eliminación de la lección.
3. Eliminacion de lección con permisos adecuados

## Analisis

### Pantalla de la leccion

Se describe la interfaz a través de la cual el instructor puede eliminar una lección:

1. El instructor ingresa al módulo que contiene la lección que desea eliminar.
2. Presiona el botón para eliminar la lección y se le solicita confirmación.

![Alt text](<image-(6).png>)

## Criterios de aceptacion

# Escenario: Confirmación y mensaje de eliminación de lección

- Dado: Que el instructor desea eliminar una lección.
- Cuando: Presiona el botón para eliminar y confirma la acción.
- Entonces: La lección se elimina y se muestra un mensaje de confirmación de la eliminación.

# Escenario: Eliminacion de lección con permisos adecuados

- Dado que el usuario intenta eliminar una lección
- Cuando no tiene permisos de administrador
- Entonces el sistema debe mostrar un mensaje de error de "Permiso denegado" y no debe permitir la eliminacion de la lección

## Diseño

### Mostrar formulario de eliminacion de una leccion

1. Para realizar la eliminacion de una leccion:

Request:

```
DELETE /api/v1/subjects/{subjectId}/modules/{moduleId}/lessons/{lessonId}
Accept: application/json
Authorization: Bearer JWT

```

Response: Exitoso statusCode: 200

```
{
    "code": "SUCCESS 200",
    "result": null,
    "message": "La lección ha sido eliminada con éxito"
}

```

Response: No encontrado statusCode: 404

```
{
    "code": "ERROR 404",
    "result": null,
    "message": "La lección no ha sido encontrada"
}

```
