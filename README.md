# Unidad 7 (RMI) - helloWorldRMI
##Programa Basico en RMI - UCAB (Sistemas Distribuidos)

El siguiente programa es un ejemplo de como implementar RMI, es importante tener instalado JAVA 11  para 
el correcto funcionamiento. Si no tienes JAVA 11 te dejo un pequeño tutorial para que puedas instalarlo.
De lo contrario puedes empezar a compilar y probar el codigo.

Wilmer J. Perez D


###Clonar el repositorio
```
$ git clone https://github.com/wjoseperez20/helloWorldRMI.git
$ cd helloWorldRMI
```

###Compilar el codigo
```
$ helloWorldRMI > cd src/
$ helloWorldRMI/src > javac -d ./build *.java
```

###Ejecutar el codigo server
```
$ helloWorldRMI/src > cd build
$ helloWorldRMI/src/build > java RmiServer
  Servidor Hola Preparado
```

###Ejecutar el codigo cliente
Es necesario correr el client en una nueva pestaña de CLI
```
$ helloWorldRMI/src > cd build
$ helloWorldRMI/src/build > java RmiClient
  Hola a todos
```

# Instalacion Java 11 - Linux

###Para instalar esta versión, primero actualice el índice de paquetes:
```
 # sudo apt update
 ```
###A continuación, compruebe si Java ya está instalado:
```
 # java -version
 ```
###Si Java no está instalado, verá el siguiente resultado:
```
# Output
Command 'java' not found, but can be installed with:

# apt install default-jre
# apt install openjdk-11-jre-headless
# apt install openjdk-8-jre-headless
# apt install openjdk-9-jre-headless
 ```
###Ejecute el siguiente comando para instalar OpenJDK:
```
 # sudo apt install default-jre
 ```
###Verifique la instalación con lo siguiente:
```
 # java -version
 ```
###Verifique la instalación con lo siguiente:
```
# Output
# openjdk version "11.0.1" 2018-04-17
# OpenJDK Runtime Environment (build 11.0.1+10-Ubuntu-3ubuntu1)
# OpenJDK 64-Bit Server VM (build 11.0.1+10-Ubuntu-3ubuntu1, mixed mode)
 ```
###Ejecute el siguiente comando para instalar default-jdk:
```
 # sudo apt install default-jdk
 ```
###Verifique que el JDK se haya instalado revisando la versión de javac, el compilador de Java:
```
 # javac -version
 ```
###Verá el siguiente resultado:
```
# Output
# javac 10.0.1
 ```
