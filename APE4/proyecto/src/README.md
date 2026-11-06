# APE 4 · Clases, Objetos y Métodos (Java)

Resolución de la **Guía APE 4: Integración de clases, objetos y métodos**, de la asignatura *Algoritmos y Lógica de Programación* (código SW-AyLP-APE-04).

- **Universidad:** Universidad Técnica de Ambato
- **Facultad:** Ingeniería en Sistemas, Electrónica e Industrial
- **Carrera:** Software · Primer nivel · Paralelo B
- **Autor:** Matías Alejandro Pico Cepeda

## Ejercicios

| # | Ejercicio | Paquete | Clases | Concepto |
|---|-----------|---------|--------|----------|
| 1 | Libro y Autor | `ejercicio1` | `Autor`, `Libro`, `Main` | Objeto como atributo |
| 2 | Rectángulo | `ejercicio2` | `Rectangulo`, `Main` | Firmas de métodos y tipos de retorno |
| 3 | Producto y Venta | `ejercicio3` | `Producto`, `Venta`, `Main` | Objeto como parámetro |
| 4 | Transferencias | `ejercicio4` | `Cuenta`, `Main` | Objeto como parámetro |
| 5 | Biblioteca | `ejercicio5` | `Usuario`, `Libro`, `Prestamo`, `Main` | Colaboración entre clases |

## Estructura del proyecto

```
.
├── README.md
└── src
    ├── ejercicio1
    │   ├── Autor.java
    │   ├── Libro.java
    │   └── Main.java
    ├── ejercicio2
    │   ├── Rectangulo.java
    │   └── Main.java
    ├── ejercicio3
    │   ├── Producto.java
    │   ├── Venta.java
    │   └── Main.java
    ├── ejercicio4
    │   ├── Cuenta.java
    │   └── Main.java
    └── ejercicio5
        ├── Usuario.java
        ├── Libro.java
        ├── Prestamo.java
        └── Main.java
```

Cada ejercicio está en su propio paquete porque algunas clases se repiten en nombre (por ejemplo, `Libro` en los ejercicios 1 y 5).

## Requisitos

- JDK 11 o superior (probado con JDK 21).
- Una terminal o un IDE (IntelliJ IDEA, NetBeans, Eclipse, VS Code).

## Cómo compilar y ejecutar

Desde la carpeta raíz del repositorio:

```bash
# Compilar todos los ejercicios
javac -encoding UTF-8 -d out src/*/*.java

# Ejecutar un ejercicio (cambiar el número del paquete)
java -cp out ejercicio1.Main
java -cp out ejercicio2.Main
java -cp out ejercicio3.Main
java -cp out ejercicio4.Main
java -cp out ejercicio5.Main
```

Si usas Windows y el comando de compilación no reconoce `src/*/*.java`, compila cada ejercicio por separado (por ejemplo, `javac -encoding UTF-8 -d out src/ejercicio1/*.java`) o ábrelo directamente en un IDE.

---

## Ejercicio 1: Libro y Autor

**Enunciado:** crear la clase `Autor` (nombre, nacionalidad) y la clase `Libro` (titulo, anio, autor). `Libro` debe tener un atributo de tipo `Autor` y un método `mostrarInformacion()` que imprima el título, el año y el nombre del autor. En `main`, crear 2 libros.

**Solución:** `Libro` guarda un objeto `Autor` como atributo, de modo que `mostrarInformacion()` puede acceder al nombre del autor a través de ese objeto.

**Salida:**

```
Título: Cien años de soledad
Año: 1967
Autor: Gabriel García Márquez

Título: Huasipungo
Año: 1934
Autor: Jorge Icaza
```

## Ejercicio 2: Rectángulo

**Enunciado:** crear la clase `Rectangulo` (base, altura) con los métodos `calcularArea()`, `calcularPerimetro()`, `esCuadrado()`, `obtenerDescripcion()` y `mostrar()`, usando el tipo de retorno correcto en cada firma.

**Solución:**

| Método | Retorno | Qué hace |
|--------|---------|----------|
| `calcularArea()` | `double` | Devuelve base por altura |
| `calcularPerimetro()` | `double` | Devuelve 2 · (base + altura) |
| `esCuadrado()` | `boolean` | Devuelve `true` si base y altura son iguales |
| `obtenerDescripcion()` | `String` | Devuelve, por ejemplo, "Rectángulo de 4.0 x 6.0" |
| `mostrar()` | `void` | Imprime todos los resultados |

**Salida:**

```
Rectángulo de 4.0 x 6.0
Área: 24.0
Perímetro: 20.0
¿Es cuadrado? false

Rectángulo de 5.0 x 5.0
Área: 25.0
Perímetro: 20.0
¿Es cuadrado? true
```

## Ejercicio 3: Producto y Venta

**Enunciado:** crear la clase `Producto` (nombre, precio, stock) con `reducirStock(int cantidad)`, que solo actúa si hay stock suficiente (si no, imprime "Stock insuficiente."), y `mostrarProducto()`. Crear la clase `Venta` (cantidad) con `aplicar(Producto producto)`, que reduzca el stock y muestre el total a pagar.

**Solución:** `reducirStock` devuelve `boolean` (`true` si se pudo reducir el stock). Así, `Venta.aplicar` recibe el `Producto` como parámetro y solo muestra el total a pagar cuando la venta se realizó.

**Salida:**

```
Producto: Laptop | Precio: $800.0 | Stock: 5
Venta realizada: 2 x Laptop
Total a pagar: $1600.0
Producto: Laptop | Precio: $800.0 | Stock: 3
Stock insuficiente.
Producto: Laptop | Precio: $800.0 | Stock: 3
```

## Ejercicio 4: Transferencias

**Enunciado:** usar la clase `Cuenta` (titular, saldo) y agregar el método `transferir(Cuenta destino, double monto)`, que retire el monto de la cuenta actual y lo deposite en la cuenta destino solo si hay fondos. En `main`, crear 2 cuentas, hacer una transferencia válida y otra que falle.

**Solución:** `transferir` recibe la cuenta destino como parámetro. Si el monto es positivo y el saldo alcanza, resta el monto de la cuenta actual y lo suma a la cuenta destino; en caso contrario, muestra un mensaje de error y no modifica los saldos.

**Salida:**

```
--- Saldos iniciales ---
Ana : $500.0
Luis : $200.0
--- Transferencia válida ---
Transferencia exitosa de $150.0 de Ana a Luis
Ana : $350.0
Luis : $350.0
--- Transferencia que falla ---
Transferencia fallida: fondos insuficientes en la cuenta de Luis
Ana : $350.0
Luis : $350.0
```

## Ejercicio 5: Biblioteca

**Enunciado:** crear tres clases que colaboren entre sí: `Usuario` (nombre, cedula), `Libro` (titulo, disponible) y `Prestamo` (usuario, libro). `Prestamo` tiene su método `registrar()`, que intenta prestar el libro y muestra un mensaje según el resultado. En `main`, hacer que dos usuarios intenten pedir el mismo libro.

**Solución:** `Libro.prestar()` devuelve `true` y marca el libro como no disponible solo si estaba disponible; `Libro.devolver()` lo deja disponible otra vez. `Prestamo.registrar()` llama a `prestar()` y muestra un mensaje distinto según el resultado. En el `main` se agregó una devolución y un nuevo intento para comprobar que el libro vuelve a estar disponible.

**Salida:**

```
Ana Pérez (CI 1800000001) prestó el libro "Cien años de soledad".
El libro "Cien años de soledad" no está disponible para Luis Mora.
El libro fue devuelto.
Luis Mora (CI 1800000002) prestó el libro "Cien años de soledad".
```

---

## Conceptos aplicados

- Clases, atributos y constructores.
- Creación de objetos con `new` y uso de métodos con y sin retorno (`void`, `double`, `boolean`, `String`).
- Objetos como atributos y como parámetros de métodos.
- Colaboración entre clases.
- Estructuras condicionales (`if / else`) para validar stock, fondos y disponibilidad.
