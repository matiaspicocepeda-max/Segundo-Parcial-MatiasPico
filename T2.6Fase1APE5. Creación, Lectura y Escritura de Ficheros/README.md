# APE 5: Creación, Lectura y Escritura de Ficheros en Java

**Universidad Técnica de Ambato (UTA)**  
**Facultad de Ingeniería en Sistemas, Electrónica e Industrial (FISEI)**  
**Carrera de Software** - Primer Semestre (Paralelo B)  
**Asignatura:** Algoritmos y Lógica de Programación  
**Docente:** Ing. José Rubén Caiza Caizabuano  
**Estudiante:** Matías Pico  
**Fecha de entrega:** 05/11/2026 / 06/11/2026  
---

## 📌 Descripción de la Práctica (APE 5)

Este repositorio contiene la resolución del **Trabajo Práctico Experimental (APE) 5**, centrado en el estudio y aplicación del paquete `java.io` para la persistencia de datos en Java. El taller aborda dos fases clave:
1. **Primera Parte:** Creación básica de ficheros (`curso.txt`), escritura interactiva mediante `Scanner` y `FileWriter` con modo adición (`true`), y borrado seguro de archivos (`estudiantes.txt`).
2. **Segunda Parte:** Gestión avanzada de metadatos con la clase `File`, estructuración de flujos de salida con `BufferedWriter` y `newLine()`, control estricto del modo `append` frente a la sobrescritura, y flujos completos de ciclo de vida de ficheros temporales.

---

## 🛠️ Ejercicios Desarrollados

### 🔹 Primera Parte (05/11/2026)

1. **`CrearCurso.java`**: Programa que genera un archivo de texto denominado `curso.txt`, utilizando la clase `File` y el método `createNewFile()` controlando las excepciones con bloques `try-catch`.
2. **`EscribirArchivo.java`**: Solicita un mensaje por teclado al usuario utilizando un objeto `Scanner` y lo almacena al final del archivo existente `estudiantes.txt` empleando `FileWriter` con el parámetro `true` (modo *append*).
3. **`EliminarArchivo.java`**: Emplea el método `delete()` de la clase `File` para eliminar de forma segura el archivo `estudiantes.txt`, validando el resultado de la operación mediante estructuras condicionales.

### 🔹 Segunda Parte (06/11/2026)

1. **`GestionMetadatos.java`**: Interactúa con la ruta `datos/prueba.txt`, comprobando su existencia previa en disco (`exists()`), creándola de manera controlada e extrayendo metadatos como el nombre (`getName()`) y la ruta relativa (`getPath()`).
2. **`EscritorMaterias.java`**: Configura un flujo de salida estructurado (`BufferedWriter` enlazado con `FileWriter`) para registrar cinco asignaturas de forma independiente utilizando saltos de línea portables (`newLine()`).
3. **`AdicionMaterias.java`**: Demuestra el uso del segundo parámetro booleano (`append = true`) en el constructor de `FileWriter` para añadir dos nuevas asignaturas al final de `materias.txt` sin sobrescribir el contenido previo.
4. **`CicloVidaArchivo.java`**: Simula el ciclo completo de gestión de un archivo temporal (`datos/temporal.txt`), incluyendo la validación mediante una variable de control booleana (`confirmarBorrado`) antes de ejecutar el borrado seguro con `delete()`.

---

## 🚀 Compilación y Ejecución

Para compilar y ejecutar cualquiera de los programas desde la terminal de comandos:

```bash
# Compilar el archivo fuente deseado
javac NombreDeLaClase.java

# Ejecutar el programa
java NombreDeLaClase
```

---

## 📖 Bibliografía de Referencia

1. **Barquilla Galeano, M. I. (2025).** *Java programación: teoría y ejemplos.* RA-MA Editorial.
2. **Blasco, F. (2019).** *Programación orientada a objetos en Java.* Ediciones de la U.
