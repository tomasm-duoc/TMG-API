# TMG-API

API desarrollada con Spring Boot para funcionar como mocab/mockup de la aplicacion TMG O'Higgins. El proyecto expone endpoints base para gestionar cursos, notas y anotaciones, usando una base de datos MySQL local.

## Tecnologias

- Java 21
- Spring Boot
- Maven
- Spring Data JPA
- MySQL
- Swagger/OpenAPI

## Requisitos

Antes de ejecutar el proyecto, instala y configura:

- Java 21
- MySQL Server
- MySQL Workbench
    - [Link instalador MySQL](https://dev.mysql.com/downloads/windows/installer/8.0.html)
- Maven, o usa el Maven Wrapper incluido en el proyecto

Se recomienda usar MySQL Workbench junto con MySQL Server para administrar la base de datos local, revisar tablas, ejecutar consultas y validar que la conexion este funcionando correctamente.

## Configuracion de base de datos

La API esta configurada para conectarse a MySQL con estos datos:

```properties
spring.datasource.url=jdbc:mysql://127.0.0.1:3306/ohiggins?createDatabaseIfNotExist=true&useSSL=false&serverTimezone=UTC
spring.datasource.username=root
spring.datasource.password=root
```

Por defecto, la base de datos se llama `ohiggins`. Si tu usuario o contrasena de MySQL son diferentes, actualiza el archivo:

```text
api/src/main/resources/application.properties
```

## Como ejecutar

Desde la raiz del repositorio, entra a la carpeta de la API:

```bash
cd api
```

En Windows:

```bash
.\mvnw.cmd spring-boot:run
```

En Linux/macOS:

```bash
./mvnw spring-boot:run
```

Cuando la aplicacion este levantada, quedara disponible por defecto en:

```text
http://localhost:8080
```

## Documentacion de endpoints

La documentacion Swagger/OpenAPI se puede revisar en:

```text
http://localhost:8080/swagger-ui/index.html
```

Endpoints principales:

- `GET /Cursos`
- `GET /notas`
- `GET /anotaciones`

Cada recurso incluye operaciones basicas para listar, buscar por id, crear, actualizar y eliminar.

## Cargar datos de ejemplo

Puedes cargar datos de ejemplo desde Swagger, Postman o Insomnia usando los endpoints `POST`.

### Crear un curso

Endpoint:

```text
POST http://localhost:8080/Cursos
```

Body:

```json
{
  "codigoCurso": "MAT-001",
  "nombreCurso": "Matematicas",
  "descripcion": "Curso de matematicas para pruebas del mocab"
}
```

### Crear una nota

Endpoint:

```text
POST http://localhost:8080/notas
```

Body:

```json
{
  "rol": {
    "idRol": 1
  },
  "curso": {
    "idCurso": 1
  },
  "nota": 6.5,
  "observaciones": "Buen rendimiento en la evaluacion"
}
```

### Crear una anotacion

Endpoint:

```text
POST http://localhost:8080/anotaciones
```

Body:

```json
{
  "rol": {
    "idRol": 1
  },
  "tipoRegistro": "Positiva",
  "fecha": "2026-07-06",
  "hora": "10:30:00",
  "descripcion": "Participa activamente durante la clase"
}
```

Para los ejemplos de `notas` y `anotaciones`, el `idRol` debe existir previamente en la tabla `Roles`, y el `idCurso` debe existir previamente en la tabla `cursos`.
