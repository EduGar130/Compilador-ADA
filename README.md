# Compilador AdaUNED - PLII 2024/2025

Este proyecto implementa un compilador para el lenguaje **AdaUNED**, desarrollado como parte de la práctica de la asignatura **Procesadores del Lenguaje II (PLII)** de la UNED (curso 2024/2025).

## 📚 Descripción

El objetivo de esta práctica es implementar un compilador completo del lenguaje AdaUNED, en varias fases:

-  Análisis léxico *(scanner.flex con JFlex)*
-  Análisis sintáctico *(parser.cup con CUP)*
-  Análisis semántico *(tablas de símbolos y tipos, verificación de tipos, gestión de ámbitos, etc.)*
-  Generación de código intermedio *(mediante cuádruplas)*
-  Generación de código final *(para la arquitectura ENS2001)*

> Se proporciona una arquitectura base que debe seguirse estrictamente. La práctica se entrega comprimida en formato `.zip` con la estructura requerida.

## 🗂 Estructura del proyecto

```
.
├── src/ # Código fuente del compilador
│ └── compiler/
│ ├── lexical/ # Scanner (JFlex)
│ ├── syntax/ # Parser (CUP)
│ ├── syntax/nonTerminal/ # Clases de no terminales
│ ├── semantic/ # Análisis semántico
│ ├── intermediate/ # Código intermedio
│ ├── code/ # Código final
│ └── test/ # Clases de test automáticas
├── classes/ # Clases compiladas
├── lib/ # Librerías necesarias (JFlex, CUP, compiler-api)
├── doc/
│ ├── specs/ # scanner.flex y parser.cup
│ ├── config/ # build.xml para Ant
│ ├── test/ # Casos de prueba
│ └── memoria/ # Memoria en PDF
```

## 🔧 Requisitos

- Java 11 o superior
- Ant
- ENS2001 (emulador proporcionado por la UNED)
- Visual Studio Code, IntelliJ o cualquier IDE compatible

## ⚙️ Uso

### Compilación del compilador

```bash
ant build
```

## Test del analizador léxico
```bash
ant flexTest -Dtest-file-name=ejemplo.ha
```

## Test del analizador sintáctico
```bash
ant cupTest -Dtest-file-name=ejemplo.ha
```

## Generación de código final
```bash
ant finalTest -Dtest-file-name=ejemplo.ha
```
El fichero ensamblador se generará en el mismo directorio que el fichero fuente, con extensión .ens.

## 🧠 Autor
Eduardo Garcia Romera

UNED - Ingeniería Informática (Curso 2024/2025)

Correo: egarcia3266@alumno.uned.es

## 📝 Licencia
Este proyecto está destinado exclusivamente al desarrollo académico de la práctica de PLII. No compartir ni redistribuir sin autorización.
