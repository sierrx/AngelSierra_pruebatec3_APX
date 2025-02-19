# EntornoAPX

## Descripción

Este proyecto contiene la implementación y pruebas de un servicio en Java, usando una base de datos para almacenar la información de un cliente mediante una inserción.

## Código para ejecutar en DBear

```sql
CREATE TABLE WIKJ."T_WIKJ_HAB_PRUEBAFINAL"(
    dni NUMBER(5) NOT NULL PRIMARY KEY,
    nuip NUMBER(10),
    full_name VARCHAR(50),
    phone VARCHAR(15),
    address VARCHAR(30)
);

SELECT dni, nuip, full_name, phone, address FROM WIKJ.T_WIKJ_HAB_PRUEBAFINAL WHERE dni=:dni;

INSERT INTO WIKJ.T_WIKJ_HAB_PRUEBAFINAL (dni, nuip, full_name, phone, address) 
VALUES(:dni, :nuip, :full_name, :phone, :address);
```

## WIKJ

Se utilizó el código `777` para `cpn` y `778` para el `parent`.

## Pruebas de ejecución

Se utilizó el siguiente JSON:

```json
{
  "dtoIn": {
    "dni": 5,
    "nuip": 333,
    "full_name": "Angel Cruz",
    "phone": "55491234",
    "address": "calle allende"
  }
}
```

### Ejecución 1

![Ejecución 1 con el JSON](Captura%20de%20pantalla%20(20).png)

Se puede observar cómo se hizo la inserción en la base de datos y cómo se registró correctamente en Postman.

### Ejecución 2

![Ejecución 2 con el JSON](Captura%20de%20pantalla%20(20).png)

Aquí se observa una segunda prueba.

## Tecnologías Utilizadas

- **Java 1.8**
- **Docker**
- **IntelliJ IDEA**
- **Postman**
- **Git y GitHub**
- **DBear**
- **Maven 3.5.3**

## Autor

**Angel Sierra**

