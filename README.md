# encuestas3itBackend


# Encuestas Musicales

Proyecto creado para registrar encuestas de estilos musicales

## Tabla de Contenidos

1. [Requisitos](#requisitos)
2. [Instalación](#instalación)
3. [Ejecución](#ejecución)
4. [Uso](#uso)
5. [Estructura del Proyecto](#estructura-del-proyecto)


## Requisitos

1.- Java instalado
2.- Maven instalado

## Instalación

1.- Importe el proyecto en su IDE como un proyecto Maven
2.- Con Maven instale todas las dependencias


## Ejecución

Solo debe dar ejectar en su IDE

## Uso

Para el consumo de las API debe llamar
/estiloMusical/estilosMusicales  obtiene todos los estilos musicales
/estiloMusical/guardar           guarda estilos musicales

/rest/registrarEncuesta          registra encuesta
/rest/encuestas                  obtiene todas las encuestas    

## Estructura del Proyecto

proyecto/
├── src/
│ ├── main/
│ │ ├── java/
│ │ │ ├── com/
| | | | ├── it
│ │ │ │ | ├── demo/
│ │ │ │ │ | ├── advice/
│ │ │ │ │ | ├── controller/
│ │ │ │ │ | ├── converter/
│ │ │ │ │ | ├── entity/
│ │ │ │ │ | ├── exception/
│ │ │ │ │ | ├── initializer/
│ │ │ │ │ | ├── model/
│ │ │ │ │ | ├── repository/
│ │ │ │ │ | ├── services/
│ │ │ │ │ | ├── ...
│ │ ├── resources/
│ │ │ ├── application.properties
│ ├── test/
│ ├── ...
├── pom.xml
