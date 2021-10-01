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
- [Documento](#documento)
- [Productividad](#productividad).
- [Javadoc](#javaDoc-).
- [Licencia](#licencia-)

## Circleci

[![CircleCI](https://circleci.com/gh/circleci/circleci-docs.svg?style=svg)](https://app.circleci.com/pipelines/github/Jose1102/AREP-VIRTUALIZACI-N-E-INTRODUCCI-N-A-DOCKER-Y-A-AWS)

## Requisitos 📋
* [Maven](https://maven.apache.org/) - Manejador de dependencias
* [Git](https://git-scm.com/) - Software de control de versiones
* [Java](https://www.oracle.com/java/) - Lenguaje de programación
* [Docker](https://www.docker.com/) - Administrador de contenedores
* [Spark](http://sparkjava.com/) - Micro framework para crear aplicaciones web en Java 8

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

3. Ejecutar el proyecto local
```
java -cp "target/classes;target/dependency/*" co.edu.escuelaing.virtualization.SparkWebServer
```


Para ver la lista de mensajes se oprime el botón Retornar

![retornar](https://github.com/Jose1102/AREP-VIRTUALIZACI-N-E-INTRODUCCI-N-A-DOCKER-Y-A-AWS/blob/main/images/local/retornar.PNG)


Para agregar un nuevo mensaje se debe colocar en el input el mensaje y darle click en Añadir


![AGREGAR](https://github.com/Jose1102/AREP-VIRTUALIZACI-N-E-INTRODUCCI-N-A-DOCKER-Y-A-AWS/blob/main/images/local/a%C3%B1adir.PNG)


Para ver el mensaje que se agregó se da nuevamente en Retornar, podremos ver el mensaje al final

![MENSAJE](https://github.com/Jose1102/AREP-VIRTUALIZACI-N-E-INTRODUCCI-N-A-DOCKER-Y-A-AWS/blob/main/images/local/retornardespuesdeagregar.PNG)


Por último para ver la lista de Jsons se puede de la siguiente forma

![GET](https://github.com/Jose1102/AREP-VIRTUALIZACI-N-E-INTRODUCCI-N-A-DOCKER-Y-A-AWS/blob/main/images/local/getJson.PNG)

4. AWS

Se realiza despligue en AWS 

![AWS](https://github.com/Jose1102/AREP-VIRTUALIZACI-N-E-INTRODUCCI-N-A-DOCKER-Y-A-AWS/blob/main/images/aws.PNG)


Se creó contenedor y imagen en docker en el EC2
![DOCKER](https://github.com/Jose1102/AREP-VIRTUALIZACI-N-E-INTRODUCCI-N-A-DOCKER-Y-A-AWS/blob/main/images/ec2.PNG)



## Ejecutando las pruebas

1. Compilar pruebas

```
mvn test
```

![Test](https://github.com/Jose1102/AREP-VIRTUALIZACI-N-E-INTRODUCCI-N-A-DOCKER-Y-A-AWS/blob/main/images/test.PNG)


## Documento

Se explica como se hizo crea imagen y contenedor en docker y además como crear EC2 y relizar push a imagen de docker en el sguiente [DOCUMENTO PDF](https://github.com/Jose1102/AREP-VIRTUALIZACI-N-E-INTRODUCCI-N-A-DOCKER-Y-A-AWS/blob/main/documentacion.pdf)


## Diagrama de clases 📖


Se puede observar como se realiza la conexión por medio de un MongoCLientURI y un MongoCLient en la clase Connection,Todo este proceso se inicializa desde la clase principal que es SparkWebServer
![Datagram2](https://github.com/Jose1102/AREP-VIRTUALIZACI-N-E-INTRODUCCI-N-A-DOCKER-Y-A-AWS/blob/main/images/image.png)





## Productividad
La productividad de este proyecto fue:
* 356 loc / 29 hours

## JavaDoc 📖

Para consultar la carpeta de [JAVADOC](https://github.com/Jose1102/AREP-VIRTUALIZACI-N-E-INTRODUCCI-N-A-DOCKER-Y-A-AWS/tree/main/doc) .

## Licencia 📌

Este proyecto está bajo la Licencia Pública General GNU - consulte el archivo de [LICENCIA](https://github.com/Jose1102/AREP-VIRTUALIZACI-N-E-INTRODUCCI-N-A-DOCKER-Y-A-AWS/blob/main/LICENSE.txt) para obtener más detalles.