# 🧮 Calculadora Android

Una aplicación de calculadora moderna para Android construida con **Jetpack Compose** y arquitectura **MVVM**.

---

## 📋 Descripción

Esta aplicación implementa una calculadora funcional con interfaz elegante y soporte para operaciones matemáticas complejas. Utiliza el motor de JavaScript de **Rhino (Mozilla)** para evaluar expresiones matemáticas en tiempo real.

---

## 🚀 Funcionalidades

- Operaciones básicas: suma (`+`), resta (`-`), multiplicación (`*`) y división (`/`)
- Soporte para paréntesis `(` `)` en expresiones complejas
- Evaluación de resultados **en tiempo real** mientras se escribe
- Botón **C** para borrar el último carácter
- Botón **AC** para limpiar toda la expresión
- Botón **=** para confirmar el resultado en el campo de entrada
- Soporte para números decimales (`.`)

---

## 🏗️ Arquitectura

El proyecto sigue el patrón **MVVM (Model-View-ViewModel)**:

```
com/
├── Calculator.kt          # Composable principal de la UI
├── CalculatorViewModel.kt # Lógica de negocio y estado
com.example.calculator/
├── MainActivity.kt        # Punto de entrada de la Activity
└── ui/theme/
    ├── Color.kt           # Paleta de colores
    ├── Theme.kt           # Configuración del tema Material 3
    └── Type.kt            # Tipografía
```

---

## 🛠️ Tecnologías utilizadas

| Tecnología | Uso |
|---|---|
| Kotlin | Lenguaje principal |
| Jetpack Compose | UI declarativa |
| Material 3 | Sistema de diseño |
| ViewModel + LiveData | Gestión del estado |
| Rhino (Mozilla JS) | Evaluación de expresiones matemáticas |

---

## 🎨 Diseño de botones

Los botones están codificados por color según su función:

- 🔴 **Rojo** (`#BE2419`) — `C` y `AC` (borrar)
- 🟠 **Naranja** (`#FF9800`) — Operadores (`/`, `*`, `+`, `-`, `=`)
- ⚫ **Gris** — Paréntesis (`(`, `)`)
- 🩵 **Turquesa** (`#00C8C9`) — Números y decimal

---

## ⚙️ Requisitos

- Android Studio Hedgehog o superior
- SDK mínimo: según configuración del proyecto
- Kotlin 1.9+
- Dependencia: `org.mozilla:rhino` (para evaluación de expresiones)

---

## 📦 Instalación

1. Clona el repositorio:
   ```bash
   git clone https://github.com/tu-usuario/calculadora-android.git
   ```
2. Abre el proyecto en **Android Studio**.
3. Sincroniza las dependencias con Gradle.
4. Ejecuta la app en un emulador o dispositivo físico.

---

## 📝 Notas de implementación

- La evaluación de expresiones se realiza mediante `Context.evaluateString()` de Rhino, lo que permite soportar expresiones complejas con paréntesis y precedencia de operadores.
- El resultado se muestra en tiempo real a medida que el usuario introduce la expresión.
- Los errores de evaluación (por ejemplo, expresión incompleta) se capturan silenciosamente para no interrumpir la experiencia del usuario.

---

## 📄 Licencia

Este proyecto es de uso educativo. Siéntete libre de usarlo y modificarlo.
