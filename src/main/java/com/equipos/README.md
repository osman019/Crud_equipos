# Almacenar Equipos de Fútbol

Este proyecto tiene como objetivo almacenar información sobre equipos de fútbol, incluyendo detalles como el nombre, la ciudad que representan, la fecha de fundación, el presidente del equipo y la lista de jugadores con sus respectivas características.

## 🗂️ Estructura de Datos

La información se almacena siguiendo la siguiente estructura:

### 🏟️ Equipo

- **Nombre:** Nombre del equipo.  
- **Ciudad que representa:** Ciudad a la que pertenece el equipo.  
- **Fecha de fundación:** Fecha en que se fundó el equipo.  
- **Presidente del equipo:** Nombre del presidente actual del equipo.  
- **Jugadores:** Lista de jugadores que forman parte del equipo.

### 👥 Jugadores

Cada jugador tiene la siguiente información:

- **Número de dorsal:** Número que usa el jugador en el equipo.  
- **Nombre del jugador:** Nombre completo del jugador.  
- **Ciudad:** Ciudad de origen del jugador.  
- **Edad:** Edad actual del jugador.  
- **Dorsal:** Número de camiseta que utiliza (redundante si ya se tiene el número de dorsal).  

---

## 🛠️ Ejemplo de Almacenamiento

```json
{
  "nombre": "FC Ejemplo",
  "ciudad que representa": "Ciudad Ejemplo",
  "fecha de fundación": "01/01/1900",
  "Presidente del equipo": "Juan Pérez",
  "Jugadores": [
    {
      "número de dorsal": 10,
      "nombre del jugador": "Carlos López",
      "Ciudad": "Ciudad Ejemplo",
      "edad": 28,
      "dorsal": 10
    },
    {
      "número de dorsal": 7,
      "nombre del jugador": "Luis García",
      "Ciudad": "Ciudad Ejemplo",
      "edad": 24,
      "dorsal": 7
    }
  ]
}
