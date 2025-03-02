# 🎯 Desafío 5: Configuración de Juegos por Plataforma 🎮

## 📌 Descripción

Diseñar un sistema que permita cambiar la configuración del juego dependiendo de la plataforma:

- **PC**
- **PlayStation**
- **Xbox**

Cada plataforma debe tener:

1. **Control de entrada** (`configureInput()`)
2. **Ajustes gráficos** (`configureGraphics()`)

---

## 🛠️ Tareas

1. **Usa Abstract Factory** para manejar diferentes configuraciones según la plataforma.
2. **Cada consola debe tener su propia fábrica concreta**.
3. **Permite que el código cliente** configure el juego automáticamente según la plataforma detectada.

---

## 🚀 Estructura del Proyecto

### 📂 Clases Principales

1. **Interfaces:**
   - `PlatformFactory`: Define los métodos para configurar el juego en una plataforma.
   - `InputConfig`: Define los métodos comunes para configurar el control de entrada.
   - `GraphicsConfig`: Define los métodos comunes para configurar los ajustes gráficos.

2. **Fábricas Concretas:**
   - `PCPlatformFactory`: Implementa `PlatformFactory` para configurar el juego en PC.
   - `PlayStationPlatformFactory`: Implementa `PlatformFactory` para configurar el juego en PlayStation.
   - `XboxPlatformFactory`: Implementa `PlatformFactory` para configurar el juego en Xbox.

3. **Configuraciones Concretas:**
   - `PCInputConfig`: Implementa `InputConfig` para configurar el control de entrada en PC.
   - `PCGraphicsConfig`: Implementa `GraphicsConfig` para configurar los ajustes gráficos en PC.
   - `PlayStationInputConfig`: Implementa `InputConfig` para configurar el control de entrada en PlayStation.
   - `PlayStationGraphicsConfig`: Implementa `GraphicsConfig` para configurar los ajustes gráficos en PlayStation.
   - `XboxInputConfig`: Implementa `InputConfig` para configurar el control de entrada en Xbox.
   - `XboxGraphicsConfig`: Implementa `GraphicsConfig` para configurar los ajustes gráficos en Xbox.

4. **Cliente:**
   - `Client`: Detecta la plataforma y utiliza la fábrica correspondiente para configurar el juego.

---

## 🚀 Instalación y Configuración

### 📋 Requisitos Previos

- **Java Development Kit (JDK) 17 o superior**
- **Git instalado en tu sistema**

### 📥 Clonar Repositorio

```bash

git clone https://github.com/Jhormancastella/DesafIo-5-Configuracion-de-Juegos-por-Plataforma.git

```

### 🛠️ Compilar y Ejecutar

1. Abre una terminal en la carpeta del proyecto.
2. Compila los archivos Java:

```bash
javac -d . *.java
```

3. Ejecuta el programa:

```bash
java Client
```

---

## 🛠️ Uso

1. **Detección de Plataforma:**
   - El programa detectará automáticamente la plataforma (PC, PlayStation, Xbox).

2. **Configuración del Juego:**
   - Una vez detectada la plataforma, se configurarán los controles de entrada y los ajustes gráficos.

---

## 📋 Ejemplo de Ejecución predeterminado

```plaintext
Seleccione una plataforma:
1. PC (Predeterminada)
2. PlayStation
3. Xbox
Ingrese el número de la plataforma (o presione Enter para usar la predeterminada): Enter

Detectando plataforma...
Plataforma seleccionada: PC

 Configurando gráficos de PC

 Configurando el input de PC

¡Configuración completada! El juego está listo para jugar en PC.
```

---

## 📋 Ejemplo de Ejecución seleccionado por el usuario

```plaintext
Seleccione una plataforma:
1. PC (Predeterminada)
2. PlayStation
3. Xbox
Ingrese el número de la plataforma (o presione Enter para usar la predeterminada): Xbox
Opción no válida. Usando plataforma predeterminada (PC).

Detectando plataforma...
Plataforma seleccionada: PC

 Configurando gráficos de PC

 Configurando el input de PC

¡Configuración completada! El juego está listo para jugar en PC. 
```

---

## 📋 Características

- **Soporte para múltiples plataformas** (PC, PlayStation, Xbox).
- **Uso del patrón Abstract Factory** para garantizar flexibilidad y escalabilidad.
- **Interfaz común** para todas las configuraciones, permitiendo operaciones como configurar controles y ajustes gráficos.

---

## 🚨 Estado del Ejercicio

- **Culminado.**

---

## 👤 Autor

- **Jhorman Jesús Castellanos Morales**