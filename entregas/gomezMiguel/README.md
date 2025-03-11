<img src="images/icono_error404.png" width="40%" align="right"/>

# Reto 001: Errores de Legibilidad en Códigos pasados

## 1. Nombrado
### Descripción del principio
Los nombres en el código deben ser **claros, descriptivos y consistentes**. Algunas reglas clave:
- Usa nombres que expresen claramente su propósito.
- Mantén un nivel de abstracción adecuado.
- Sigue las convenciones del lenguaje o framework.
- Evita nombres ambiguos o confusos.
- Usa nombres largos para variables con ámbitos grandes.
- Evita codificaciones innecesarias como prefijos o sufijos técnicos.
- Si una función tiene efectos secundarios, su nombre debe reflejarlos.
- Mantén la coherencia en el uso de términos clave.
- Sigue convenciones de nomenclatura según el tipo de entidad (clases, métodos, variables).

### Ejemplos en mis códigos
|Ejemplo de Mal Nombrado|Código|Proyecto|
|-|-|-|
| Los nombres de variables deberían ser sustantivos y concretos | [💾](https://github.com/miguelgomez75/24-25-IdSw2/blob/e1c17652a203cc77eb0c63ff1c27978e51118a05/entregas/gomezMiguel/C%C3%B3digosRescatados/001%20Progra%201/Retos/Microrretos%203/Microrretomoneda.java#L4) | Progra 1 - Microrreto 3 Lanzar una moneda |
| Los Nombres deberían ser claros | [💾](https://github.com/miguelgomez75/24-25-IdSw2/blob/e1c17652a203cc77eb0c63ff1c27978e51118a05/entregas/gomezMiguel/C%C3%B3digosRescatados/001%20Progra%201/Retos/WhacAMole.java#L8) | Progra 1 - Reto WhacAMole |

---

## 2. Comentarios
### Descripción del principio
Los comentarios deben **agregar valor y evitar redundancias**.
- Usa comentarios legales y aclaratorios cuando sea necesario.
- Evita comentarios innecesarios, desactualizados o redundantes.
- No uses comentarios para explicar código confuso; en su lugar, reescríbelo.
- Usa comentarios oportunos para explicar decisiones de diseño.

### Ejemplos en mis códigos
|Ejemplo de Mal Uso de los Comentarios|Código|Proyecto|
|-|-|-|
| Comentario Innecesario en el código que se encuentra | [💾](https://github.com/miguelgomez75/24-25-IdSw2/blob/e1c17652a203cc77eb0c63ff1c27978e51118a05/entregas/gomezMiguel/C%C3%B3digosRescatados/001%20Progra%201/Retos/Cambios.java#L5) | Progra 1 - Reto Cambios |
| Comentario Innecesario en el código | [💾](https://github.com/miguelgomez75/24-25-IdSw2/blob/e1c17652a203cc77eb0c63ff1c27978e51118a05/entregas/gomezMiguel/C%C3%B3digosRescatados/002%20Eda%201/Retos/Reto6Introducci%C3%B3n%C3%81rboles/C%C3%B3digoNuevo/Tree.java#L35C17-L35C65) | Eda 1 - Reto 6 Introducción a Árboles |

---

## 3. Formato
### Descripción del principio
Un buen formato mejora la legibilidad y facilita la navegación del código.
- Usa indentación adecuada.
- Separa bloques de código lógicos con líneas en blanco.
- Mantén las declaraciones organizadas y los métodos relacionados juntos.
- Evita líneas de código excesivamente largas.

### Ejemplos en mis códigos
|Ejemplo de Mal Formato|Código|Proyecto|
|-|-|-|
| Indentación Inadecuada | [💾](https://github.com/miguelgomez75/24-25-IdSw2/blob/98bcc70be1e69a01732c90cbe5555bb3a1335d38/entregas/gomezMiguel/C%C3%B3digosRescatados/001%20Progra%201/Retos/Microrretos%201%20ASCII/Ascii4.java#L19) | Progra 1 - Microrreto Ascii 4 |
| Linea de Código demasiado larga | [💾](https://github.com/miguelgomez75/24-25-IdSw2/blob/98bcc70be1e69a01732c90cbe5555bb3a1335d38/entregas/gomezMiguel/C%C3%B3digosRescatados/001%20Progra%201/Retos/Microrretos%202%20Variables/Notafinal.java#L19) | Progra 1 - Microrreto 2 Promedio |

---

## 4. Estándares
### Descripción del principio
Sigue las **convenciones estándar** del lenguaje y del equipo.
- Define reglas sobre nombres de clases, variables y métodos.
- Establece un formato de llaves y espaciado.
- Mantén un estilo unificado en el equipo.

### Ejemplos en mis códigos
|Ejemplo de Mala Aplicación de Estándares|Código|Proyecto|
|-|-|-|
| Demasiados Ifs que se podrían sustituir usando métodos estáticos | [💾](CódigosRescatados/001 Progra 1/Retos/Caracol.java) | Progra 1 - Caracol |

---

## 5. Consistencia
### Descripción del principio
Si haces algo de cierta manera, **hazlo siempre igual**.
- Mantén un estilo uniforme en todo el código.
- Usa los mismos patrones para funciones similares.
- No mezcles diferentes estilos de programación sin motivo.

### Ejemplos en mis códigos
|Ejemplo de Mala Consistencia|Código|Proyecto|
|-|-|-|
| | | |
---

## 6. Código muerto
### Descripción del principio
Elimina el **código obsoleto o innecesario**.
- Borra clases, funciones y variables no utilizadas.
- Evita tener bloques de código comentado sin explicación.
- Usa el control de versiones en lugar de dejar código comentado.

### Ejemplos en mis códigos
|Ejemplo de Código Muerto|Código|Proyecto|
|-|-|-|
| | | |

---

## 7. DRY (Don’t Repeat Yourself)
### Descripción del principio
Evita la **duplicación de código**.
- Crea funciones reutilizables en lugar de copiar y pegar código.
- Extrae constantes y métodos cuando veas patrones repetidos.

### Ejemplos en mis códigos
|Ejemplo de DRY|Código|Proyecto|
|-|-|-|
| | | |


---

## 8. YAGNI (You Aren’t Going to Need It)
### Descripción del principio
No programes funciones que **aún no necesitas**.
- Implementa solo las funcionalidades requeridas.
- No escribas código por si acaso.
- Agrega funcionalidades cuando sean necesarias, no antes.

### Ejemplos en mis códigos
|Ejemplo de YAGNI|Código|Proyecto|
|-|-|-|
| | | |

---



