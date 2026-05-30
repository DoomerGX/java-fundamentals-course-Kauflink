# Fundamentos de Java para Principiantes

## Resumen del Curso

Este curso de 1 hora introduce a estudiantes de secundaria a los fundamentos de la programación con Java, incluyendo programación orientada a objetos. **¡No requiere descargas!** Solo abre tu navegador web.

**Duración total**: ~60 minutos  
**Público objetivo**: Estudiantes de 12 a 17 años sin experiencia en programación  
**Prerrequisitos**: Ninguno  
**Herramientas necesarias**: **¡Solo tu navegador web!** (Chrome, Firefox, Safari, Edge)  
**📦 Repositorio de código fuente**: [https://github.com/yourusername/java-fundamentals-course-teamname](https://github.com/yourusername/java-fundamentals-course-teamname)

---

## Secuencia de la Lección

---

### Lección 1: ¿Qué es Java y la Programación? 🚀 (5 minutos)

**Dificultad**: ⭐☆☆☆☆ Principiante absoluto

- **Descripción**: Aprende qué es la programación y por qué Java es un excelente lenguaje para empezar. Escribirás tu primer programa: ¡Hola, Mundo!
- **Enlace**: [Ver la lección](https://www.youtube.com/watch?v=REEMPLAZAR-LINK1)

#### 🎯 Objetivos

Al finalizar esta lección podrás:
- Explicar qué es la programación y para qué sirve Java.
- Identificar la estructura mínima de un programa Java.
- Escribir y ejecutar tu primer programa: **¡Hola, Mundo!**

#### 📖 Contenido

**¿Qué es programar?**  
Programar es escribir instrucciones que una computadora puede entender y ejecutar. Igual que una receta de cocina le dice al cocinero qué hacer paso a paso, un programa le dice a la computadora exactamente qué hacer.

**¿Qué es Java?**  
Java es un lenguaje de programación muy popular que se usa para crear:
- Aplicaciones de Android 📱
- Videojuegos 🎮
- Sistemas bancarios 🏦
- Páginas web del lado del servidor 🌐

**Estructura básica de un programa Java**

```java
public class MiPrograma {
    public static void main(String[] args) {
        System.out.println("¡Hola, Mundo!");
    }
}
```

| Parte | ¿Qué hace? |
|-------|-----------|
| `public class MiPrograma` | Define el nombre del programa |
| `public static void main` | Punto de inicio — aquí empieza todo |
| `System.out.println(...)` | Imprime texto en la consola |

#### 💻 Práctica

👉 **Empieza a programar**: [Abrir Replit – Hola Mundo](https://replit.com/@yourusername/lesson1-hola-mundo)

**Ejercicio**: Cambia el texto `"¡Hola, Mundo!"` por `"¡Hola, me llamo [tu nombre]!"` y ejecuta el programa.

#### 🔑 Conclusiones clave

- Java es uno de los lenguajes más usados del mundo.
- Todo programa Java necesita una clase y un método `main`.
- `System.out.println()` muestra texto en pantalla.

---

### Lección 2: Variables y Tipos de Datos 📦 (8 minutos)

**Dificultad**: ⭐⭐☆☆☆ Básico

- **Descripción**: Aprende a almacenar información en Java usando variables. Crearás un perfil de estudiante con nombre, edad y promedio.
- **Enlace**: [Ver la lección](https://www.youtube.com/watch?v=REEMPLAZAR-LINK2)

#### 🎯 Objetivos

Al finalizar esta lección podrás:
- Declarar variables de distintos tipos en Java.
- Distinguir entre `int`, `String`, `double` y `boolean`.
- Crear un perfil de estudiante usando variables.

#### 📖 Contenido

**¿Qué es una variable?**  
Una variable es como una caja con nombre donde guardas información. Puedes cambiar lo que hay dentro en cualquier momento.

**Tipos de datos principales**

| Tipo | ¿Para qué sirve? | Ejemplo |
|------|-----------------|---------|
| `int` | Números enteros | `int edad = 15;` |
| `double` | Números con decimales | `double promedio = 14.5;` |
| `String` | Texto | `String nombre = "Ana";` |
| `boolean` | Verdadero o falso | `boolean aprobado = true;` |

**Declarar e imprimir variables**

```java
public class PerfilEstudiante {
    public static void main(String[] args) {
        String nombre = "Carlos";
        int edad = 16;
        double promedio = 15.8;
        boolean aprobado = true;

        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Promedio: " + promedio);
        System.out.println("¿Aprobado?: " + aprobado);
    }
}
```

**⚠️ Errores comunes**
- Olvidar el punto y coma `;` al final de cada línea.
- Confundir `int` con `double` al guardar decimales.
- Escribir texto sin comillas: ~~`String nombre = Ana;`~~ ❌

#### 💻 Práctica

👉 **Práctica**: [Clic para programar](https://replit.com/@yourusername/lesson2-variables) ⚡ **¡No es necesario registrarse!**

**Ejercicio**: Crea variables con tu propio nombre, edad y promedio escolar, luego imprímelas en consola.

#### 🔑 Conclusiones clave

- Las variables almacenan datos que tu programa puede usar.
- Cada variable tiene un **tipo** que define qué clase de dato guarda.
- El operador `+` une texto y variables al imprimir.

---

### Lección 3: Estructuras de Control – Decisiones y Bucles 🔀 (10 minutos)

**Dificultad**: ⭐⭐⭐☆☆ Intermedio básico

- **Descripción**: Toma decisiones con `if-else` y repite tareas automáticamente con bucles `for` y `while`. Crearás un verificador de notas aprobatorias.
- **Enlace**: [Ver la lección](https://www.youtube.com/watch?v=REEMPLAZAR-LINK3)

#### 🎯 Objetivos

Al finalizar esta lección podrás:
- Usar `if-else` para que tu programa tome decisiones.
- Repetir acciones automáticamente con bucles `for` y `while`.
- Crear un verificador de notas aprobatorias.

#### 📖 Contenido

**Sentencias if-else — Tomar decisiones**

```java
int nota = 14;

if (nota >= 11) {
    System.out.println("¡Aprobado! 🎉");
} else {
    System.out.println("Desaprobado 😔");
}
```

**Operadores de comparación**

| Operador | Significado |
|----------|-------------|
| `==` | igual a |
| `!=` | diferente de |
| `>` | mayor que |
| `<` | menor que |
| `>=` | mayor o igual que |
| `<=` | menor o igual que |

**Bucle for — Repetir un número fijo de veces**

```java
for (int i = 1; i <= 5; i++) {
    System.out.println("Vuelta número: " + i);
}
```

**Bucle while — Repetir mientras se cumpla una condición**

```java
int intentos = 0;

while (intentos < 3) {
    System.out.println("Intento: " + (intentos + 1));
    intentos++;
}
```

**Ejemplo completo: Verificador de notas**

```java
public class VerificadorNotas {
    public static void main(String[] args) {
        int[] notas = {8, 15, 11, 6, 18};

        for (int i = 0; i < notas.length; i++) {
            if (notas[i] >= 11) {
                System.out.println("Nota " + notas[i] + " → Aprobado ✅");
            } else {
                System.out.println("Nota " + notas[i] + " → Desaprobado ❌");
            }
        }
    }
}
```

#### 💻 Práctica

👉 **Práctica**: [Clic para programar](https://jdoodle.com/execute-java-online/REEMPLAZAR-ID3) ⚡ **¡Inicio inmediato!**

**Ejercicio**: Modifica el ejemplo para que también imprima cuántas notas aprobatorias hay en total.

#### 🔑 Conclusiones clave

- `if-else` permite que el programa tome caminos distintos según una condición.
- `for` es ideal cuando sabes cuántas veces repetir algo.
- `while` repite mientras una condición siga siendo verdadera.

---

### Lección 4: Métodos, Entrada/Salida e Introducción a la POO 🧩 (12 minutos)

**Dificultad**: ⭐⭐⭐☆☆ Intermedio básico

- **Descripción**: Crea bloques de código reutilizables llamados métodos, recibe datos del usuario con `Scanner`, y da tus primeros pasos en la programación orientada a objetos con clases y objetos.
- **Enlace**: [Ver la lección](https://www.youtube.com/watch?v=REEMPLAZAR-LINK4)

#### 🎯 Objetivos

Al finalizar esta lección podrás:
- Crear métodos para reutilizar bloques de código.
- Leer datos del usuario con `Scanner`.
- Crear tu primera clase Java con atributos y un método.

#### 📖 Contenido

**¿Qué es un método?**  
Un método es un bloque de código con nombre que puedes usar cuantas veces quieras. Evita repetir el mismo código.

```java
// Definir el método
public static void saludar(String nombre) {
    System.out.println("¡Hola, " + nombre + "! Bienvenido al curso.");
}

// Llamar al método
public static void main(String[] args) {
    saludar("Ana");
    saludar("Carlos");
    saludar("Lucía");
}
```

**Métodos con retorno**

```java
public static int sumar(int a, int b) {
    return a + b;
}

// En main:
int resultado = sumar(8, 5);
System.out.println("La suma es: " + resultado); // → 13
```

**Entrada del usuario con Scanner**

```java
import java.util.Scanner;

public class EntradaUsuario {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("¿Cuál es tu nombre? ");
        String nombre = teclado.nextLine();

        System.out.print("¿Cuántos años tienes? ");
        int edad = teclado.nextInt();

        System.out.println("Hola " + nombre + ", tienes " + edad + " años.");
    }
}
```

**Primera clase Java**

```java
class Mascota {
    String nombre;
    String especie;

    void presentarse() {
        System.out.println("Soy " + nombre + " y soy un/a " + especie);
    }
}

public class Main {
    public static void main(String[] args) {
        Mascota miMascota = new Mascota();
        miMascota.nombre = "Firulais";
        miMascota.especie = "perro";
        miMascota.presentarse();
    }
}
```

#### 💻 Práctica

👉 **Práctica**: [Haz clic para practicar](https://onlinegdb.com/REEMPLAZAR-ID4) ⚡ **¡No necesitas registrarte!**

**Ejercicio**: Crea una clase `Libro` con atributos `titulo` y `autor`, y un método `mostrarInfo()`. Luego crea dos objetos de tipo `Libro` en `main`.

#### 🔑 Conclusiones clave

- Los métodos hacen el código reutilizable y más organizado.
- `Scanner` permite que el usuario ingrese datos mientras el programa corre.
- Una clase define la estructura de un objeto; `new` crea el objeto real.

---

### Lección 5: Fundamentos de POO y Programa Sencillo 🏗️ (15 minutos)

**Dificultad**: ⭐⭐⭐⭐☆ Intermedio

- **Descripción**: Construye clases completas con atributos privados, constructores y métodos. Al final crearás un pequeño sistema de registro de estudiantes usando POO.
- **Enlace**: [Ver la lección](https://www.youtube.com/watch?v=REEMPLAZAR-LINK5)

#### 🎯 Objetivos

Al finalizar esta lección podrás:
- Crear clases con atributos privados usando encapsulación.
- Escribir constructores, getters y setters.
- Construir un pequeño sistema de registro de estudiantes con POO.

#### 📖 Contenido

**¿Qué es la Programación Orientada a Objetos?**  
La POO organiza el código en torno a **objetos** que tienen:
- **Atributos** → características (nombre, edad, promedio)
- **Métodos** → acciones (estudiar, mostrarInfo)

**Encapsulación — Proteger los datos**

```java
public class Estudiante {

    // Atributos privados
    private String nombre;
    private int edad;
    private double promedio;

    // Constructor
    public Estudiante(String nombre, int edad, double promedio) {
        this.nombre = nombre;
        this.edad = edad;
        this.promedio = promedio;
    }

    // Getters
    public String getNombre()    { return nombre; }
    public int getEdad()         { return edad; }
    public double getPromedio()  { return promedio; }

    // Setter
    public void setPromedio(double promedio) {
        this.promedio = promedio;
    }

    // Método de comportamiento
    public void mostrarInfo() {
        System.out.println("──────────────────────");
        System.out.println("Nombre  : " + nombre);
        System.out.println("Edad    : " + edad + " años");
        System.out.println("Promedio: " + promedio);
        if (promedio >= 11) {
            System.out.println("Estado  : Aprobado ✅");
        } else {
            System.out.println("Estado  : Desaprobado ❌");
        }
    }
}
```

**Instanciación — Crear objetos**

```java
public class Main {
    public static void main(String[] args) {
        Estudiante e1 = new Estudiante("Sofía", 15, 16.5);
        Estudiante e2 = new Estudiante("Diego", 14, 9.0);
        Estudiante e3 = new Estudiante("Valeria", 16, 13.8);

        e1.mostrarInfo();
        e2.mostrarInfo();
        e3.mostrarInfo();

        e2.setPromedio(12.0);
        System.out.println("\nDiego actualizó su promedio a: " + e2.getPromedio());
    }
}
```

**Resumen visual de POO**

```
        ┌─────────────────────────────┐
        │        Clase: Estudiante    │
        ├─────────────────────────────┤
        │ - nombre  : String          │  ← atributos (private)
        │ - edad    : int             │
        │ - promedio: double          │
        ├─────────────────────────────┤
        │ + Estudiante(...)           │  ← constructor
        │ + getNombre()               │  ← getters
        │ + setPromedio(double)       │  ← setter
        │ + mostrarInfo()             │  ← comportamiento
        └─────────────────────────────┘
                      │
          ┌───────────┴───────────┐
          ▼                       ▼
   Objeto: e1                Objeto: e2
   nombre = "Sofía"          nombre = "Diego"
   edad   = 15               edad   = 14
```

#### 💻 Práctica

👉 **Proyecto final**: [Crea tu aplicación POO](https://replit.com/@yourusername/lesson5-poo-estudiante) ⚡ **¡Guarda y comparte!**

**Ejercicio**: Agrega un atributo `grado` (ejemplo: `"5to de secundaria"`) a la clase `Estudiante`. Actualiza el constructor, agrega su getter y muéstralo en `mostrarInfo()`.

#### 🔑 Conclusiones clave

- La **encapsulación** protege los datos usando `private` + getters/setters.
- El **constructor** inicializa los atributos al crear un objeto.
- `new` crea una instancia (objeto real) a partir de la clase (plantilla).

---

### Lección 6: Mejores Prácticas y Próximos Pasos 🎓 (10 minutos)

**Dificultad**: ⭐⭐☆☆☆ Básico

- **Descripción**: Aprende a depurar errores comunes, escribe código limpio y descubre qué aprender después de este curso.
- **Enlace**: [Ver la lección](https://www.youtube.com/watch?v=REEMPLAZAR-LINK6)

#### 🎯 Objetivos

Al finalizar esta lección podrás:
- Identificar y corregir los errores más comunes en Java.
- Escribir código limpio y fácil de leer.
- Saber qué aprender después de este curso.

#### 📖 Contenido

**Errores comunes y cómo evitarlos**

| ❌ Error | ✅ Solución |
|---------|-----------|
| Olvidar el `;` al final | Revisa cada línea — todas terminan en `;` |
| Usar `=` en vez de `==` | `=` asigna, `==` compara: `if (nota == 20)` |
| Confundir mayúsculas | Java distingue `Nombre` de `nombre` |
| Índice fuera de rango | Verifica que el índice no supere `array.length - 1` |
| Dividir entre cero | Valida el divisor antes de dividir |

**Ejemplo: depurar un error clásico**

```java
// ❌ Código con error
public class EjemploError {
    public static void main(String[] args) {
        int nota = 15
        if (nota = 11) {
            System.out.println("Aprobado")
        }
    }
}

// ✅ Código corregido
public class EjemploCorregido {
    public static void main(String[] args) {
        int nota = 15;
        if (nota >= 11) {
            System.out.println("Aprobado");
        }
    }
}
```

**Buenas prácticas de escritura**
- Usa nombres descriptivos: `promedio` en vez de `x`.
- Un bloque de código = una responsabilidad.
- Comenta las partes que no son obvias.
- Usa indentación consistente (4 espacios o 1 tab).

**¿Qué aprender después?**
- 🔷 **Herencia y Polimorfismo** — extender clases para reutilizar código.
- 🔷 **Colecciones** — `ArrayList` y `HashMap` para manejar listas de objetos.
- 🔷 **Manejo de errores** — `try-catch` para que tu programa no se rompa.
- 🔷 **Proyectos reales** — crea una agenda de contactos o un juego de adivinanzas.

**Recursos gratuitos para seguir aprendiendo:**
- [Oracle Java Tutorial (oficial)](https://docs.oracle.com/javase/tutorial/)
- [W3Schools Java](https://www.w3schools.com/java/)
- [CS50 de Harvard (gratis en edX)](https://cs50.harvard.edu/)

#### 💻 Práctica

👉 **Práctica final**: [Abrir Replit](https://replit.com/@yourusername/lesson6-practica-final)

**Reto**: Crea una clase `Aula` con un array de 5 objetos `Estudiante`. Recorre el array e imprime cuántos aprobaron y cuántos desaprobaron.

**Comparte tu trabajo**: [Enviar creación](https://forms.gle/REEMPLAZAR-FORM) 🎉

#### 🔑 Conclusiones clave

- Leer los mensajes de error con calma te ayuda a encontrar el problema rápido.
- El código limpio es tan importante como el código que funciona.
- Este curso es solo el comienzo — ¡sigue practicando!

---

## Recursos Adicionales

**Código fuente completo**: [Repositorio de GitHub](https://github.com/yourusername/java-fundamentals-course-teamname)

### Todas las actividades prácticas

| N° de lección | Actividad | Empezar a programar |
|---------------|-----------|---------------------|
| 1 | Hola Mundo | [Replit](https://replit.com/@yourusername/lesson1-hola-mundo) |
| 2 | Variables | [Replit](https://replit.com/@yourusername/lesson2-variables) |
| 3 | Bucles y condiciones | [JDoodle](https://jdoodle.com/execute-java-online/REEMPLAZAR-ID3) |
| 4 | Métodos y clases | [OnlineGDB](https://onlinegdb.com/REEMPLAZAR-ID4) |
| 5 | Programa POO | [Replit](https://replit.com/@yourusername/lesson5-poo-estudiante) |
| 6 | Práctica final | [Replit](https://replit.com/@yourusername/lesson6-practica-final) |

- **Cuestionario de conocimientos**: [Prueba aquí](https://forms.gle/REEMPLAZAR-QUIZ)
- **Comparte tu progreso**: #JavaParaPrincipiantes

**¡Gracias por completar el curso! 🎉**

---

## 🏫 Elaboración

Universidad Peruana de Ciencias Aplicadas  


Carrera de Ingeniería de Software  


Período 202610  


1ASI0729 Desarrollo de Aplicaciones Open Source 11990

**Nombre del equipo**: Kauflink 


**Líder del equipo**: Joseph Julius Camargo Briceño

**Integrantes del equipo**: 
- Lionel Abraham Chavez Carrasco
- Jose Fernando Flores Pinchi
- Elynor Mikela Palma De Los Santos
- Jose Antonio Peirano Brun
- Joseph Julius Camargo Briceño
**Fecha de entrega**: [Fecha]
