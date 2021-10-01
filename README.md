# TALLER DE DE MODULARIZACIÓN CON VIRTUALIZACIÓN E INTRODUCCIÓN A DOCKER Y A AWS




El taller consiste en crear una aplicación web pequeña usando el micro-framework de Spark java (http://sparkjava.com/). Una vez tengamos esta aplicación procederemos a construir un container para docker para la aplicación y los desplegaremos y configuraremos en nuestra máquina local. Luego, cerremos un repositorio en DockerHub y subiremos la imagen al repositorio. Finalmente, crearemos una máquina virtual de en AWS, instalaremos Docker , y desplegaremos el contenedor que acabamos de crear.



## Autor ✒️


* **Jose María Castro Ortega** - *Autor*  - *Estudiante de ingeniería de sistemas*
* **01/10/2021** - *Fecha*


## Tabla de contenido

- [Circleci](#circleci).
- [Requisitos](#requisitos-).
- [Enunciado](#enunciado).
- [Comenzando](#comenzando-).
- [Ejecutando las pruebas](#ejecutando-las-pruebas)
- [Productividad](#productividad).
- [Javadoc](#javaDoc-).
- [Licencia](#licencia-)

## Circleci

[![CircleCI](https://circleci.com/gh/circleci/circleci-docs.svg?style=svg)](https://app.circleci.com/pipelines/github/Jose1102/PicasYFamasGame)

## Requisitos 📋
* [Maven](https://maven.apache.org/) - Manejador de dependencias
* [Git](https://git-scm.com/) - Software de control de versiones
* [Java](https://www.oracle.com/java/) - Lenguaje de programación

## Enunciado


El taller consiste en crear una aplicación web pequeña usando el micro-framework de Spark java (http://sparkjava.com/). Una vez tengamos esta aplicación procederemos a construir un container para docker para la aplicación y los desplegaremos y configuraremos en nuestra máquina local. Luego, cerremos un repositorio en DockerHub y subiremos la imagen al repositorio. Finalmente, crearemos una máquina virtual de en AWS, instalaremos Docker , y desplegaremos el contenedor que acabamos de crear.
## Comenzando 🚀
1. Clonar el repositorio
```
https://github.com/Jose1102/AREP-VIRTUALIZACI-N-E-INTRODUCCI-N-A-DOCKER-Y-A-AWS
```

2. Compilar el proyecto

```
mvn package
```

3. Ejecutar el proyecto
```
java -cp "target/classes;target/dependency/*" co.edu.escuelaing.virtualization.SparkWebServer
```

## Ejecutando las pruebas

1. Compilar pruebas

```
mvn test
```

![Test](https://github.com/Jose1102/PicasYFamasGame/blob/master/images/tests.PNG)

## Diagrama de clases 📖

Se tiene un controlador llamado DamasYFijasController que realiza el llamado de los métodos get y post y son consumidos por dos páginas html. A demás por medio del atributo service se inyecta y realiza el llamado a la clase IServiceTablero donde está implementa una interface que calcula la cantidad de picas, famas y si es ganador o no.

![WebServer](https://github.com/Jose1102/PicasYFamasGame/blob/master/images/service.PNG)


Por otro lado, aparte de inyectar service la clase DamasYFijasController tambien hace la inyección de repo que es una interface que extiende de JpaRepository.

![Datagram](https://github.com/Jose1102/PicasYFamasGame/blob/master/images/controller.PNG)


La interface ITableroRepo extiende de JpaRepository  en la que se le envía una entidad tipo Tablero y el id de está entidad que para este caso es de tipo Integer

![Datagram](https://github.com/Jose1102/PicasYFamasGame/blob/master/images/jparepository.PNG)


La clase Tablero es una entidad que tiene como atributos un id,picas,famas y el número que ingresa el usuario

![Datagram](https://github.com/Jose1102/PicasYFamasGame/blob/master/images/tablero.PNG)


La clase DamasYFijasController que es el controllador, hace el uso de la entidad Tablero por medio de la inyección repo donde esta hace uso de la interface ITableroRepo que extiende de JpaRepository

![Datagram2](https://github.com/Jose1102/PicasYFamasGame/blob/master/images/tablerorepo.PNG)





## Productividad
La productividad de este proyecto fue:
* 356 loc / 29 hours

## JavaDoc 📖

Para consultar la carpeta de [JAVADOC](https://github.com/Jose1102/PicasYFamasGame/tree/master/javadoc) .

## Licencia 📌

Este proyecto está bajo la Licencia Pública General GNU - consulte el archivo de [LICENCIA](https://github.com/Jose1102/PicasYFamasGame/blob/master/LICENSE.txt) para obtener más detalles.