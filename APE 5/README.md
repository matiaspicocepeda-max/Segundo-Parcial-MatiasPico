# Práctica de Aprendizaje Práctico Experimental (APE 5)
## Gestión de Ficheros en Java

**Universidad Técnica de Ambato (UTA)**  
**Facultad de Ingeniería en Sistemas, Electrónica e Industrial (FISEI)**  
**Carrera:** Software  
**Asignatura:** Algoritmos y Lógica de Programación  
**Estudiante:** Matias Pico  
**Semestre:** Primer Nivel  
**Fecha:** 04 Noviembre 2026  

---

## 📌 Descripción de la Práctica

Esta práctica corresponde al **APE 5 (Primera Parte)** de la Unidad 3 sobre **Programación Orientada a Objetos y Manejo de Archivos**. El objetivo fundamental es implementar aplicaciones en Java utilizando la biblioteca `java.io` para realizar operaciones esenciales de Entrada y Salida (E/S) sobre el sistema de archivos local, aplicando un correcto tratamiento de excepciones con `try-catch`.

---

## 🎯 Objetivos de la Práctica

1. Comprender la diferencia entre el almacenamiento temporal en memoria (variables) y la persistencia en discos de almacenamiento (ficheros).
2. Crear, comprobar y manipular archivos de texto mediante la clase `java.io.File`.
3. Escribir y anexar información en archivos de texto mediante `java.io.FileWriter`.
4. Manejar excepciones del tipo `IOException` para asegurar la tolerancia a fallos del programa.

---

## 📂 Contenido del Repositorio

La práctica está estructurada en tres ejercicios independientes:

### 1. `Ejercicio1.java`
* **Descripción:** Crea un archivo de texto llamado `curso.txt`.
* **Clases/Métodos:** `File`, `createNewFile()`, `getName()`, `IOException`.
* **Funcionalidad:** Verifica si el archivo se creó correctamente o si ya existía previamente en el directorio del proyecto.

### 2. `Ejercicio2.java`
* **Descripción:** Solicita un mensaje por consola al usuario e ingresa la información en `estudiantes.txt`.
* **Clases/Métodos:** `Scanner`, `FileWriter`, `write()`, `close()`.
* **Funcionalidad:** Utiliza el parámetro `true` en la apertura de `FileWriter` para preservar los datos anteriores (*modo append*) y agregar el nuevo mensaje al final.

### 3. `Ejercicio3.java`
* **Descripción:** Intenta eliminar el archivo de texto `estudiantes.txt`.
* **Clases/Métodos:** `File`, `delete()`, condicional `if-else`.
* **Funcionalidad:** Informa por consola si el archivo fue eliminado de forma exitosa o si ocurrió un inconveniente.

---

## 💻 Requisitos para Ejecución

* **JDK:** Java Development Kit 17 o superior.
* **IDE:** Apache NetBeans, IntelliJ IDEA, Eclipse o VS Code.
* **Sistema Operativo:** Windows, macOS o Linux.

---

## 🚀 Cómo Ejecutar

1. Clonar este repositorio o descargar las clases `.java`.
2. Abrir el proyecto en tu IDE preferido.
3. Compilar y ejecutar cada archivo por separado empezando por `Ejercicio1_CrearFichero.java`.