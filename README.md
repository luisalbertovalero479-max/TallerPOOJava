# Taller POO Java

Proyecto realizado en Java para practicar conceptos de Programación Orientada a Objetos (POO).

## Objetivo

Aplicar conceptos básicos y fundamentales de POO mediante diferentes ejercicios desarrollados en Java.

## Temas utilizados

- Clases y objetos
- Atributos y métodos
- Constructores
- Encapsulamiento
- Getters y Setters
- Herencia
- Clases abstractas
- Polimorfismo
- Sobrescritura de métodos
- ArrayList
- Números aleatorios
- Validaciones

## Ejercicio 1 - Persona

Se creó la clase `Persona` con los atributos:

- nombre
- edad
- documento

Incluye métodos para mostrar la información y determinar si una persona es mayor de edad.

También se generan varias personas con edades aleatorias y se verifica si son mayores de edad.

## Ejercicio 2 - Empleados

Se creó una clase abstracta llamada `Empleado`.

De ella heredan:

- `EmpleadoTiempoCompleto`
- `EmpleadoPorHoras`

Cada tipo de empleado calcula su salario de forma diferente.

### Empleado de tiempo completo

El salario se calcula mediante:

```text
salario + bonificación
