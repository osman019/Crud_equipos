package com.equiposfutbol;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;

public class EquipoService {
    private final String archivo = "src/main/resources/equipos.json";
    private ArrayList<Equipo> equipos;
    private Gson gson = new Gson();

    public EquipoService() {
        equipos = cargarEquipos();
    }

    // Crear
    public void agregarEquipo(Equipo equipo) {
        equipos.add(equipo);
        guardarEquipos();
    }

    // Leer
    public ArrayList<Equipo> obtenerEquipos() {
        return equipos;
    }

    // Actualizar
    public void actualizarEquipo(String nombre, Equipo equipoActualizado) {
        for (int i = 0; i < equipos.size(); i++) {
            if (equipos.get(i).getNombre().equals(nombre)) {
                equipos.set(i, equipoActualizado);
                guardarEquipos();
                break;
            }
        }
    }

    // Eliminar
    public void eliminarEquipo(String nombre) {
        equipos.removeIf(e -> e.getNombre().equals(nombre));
        guardarEquipos();
    }

    // Guardar en JSON
    private void guardarEquipos() {
        try (FileWriter writer = new FileWriter(archivo)) {
            gson.toJson(equipos, writer);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Cargar desde JSON
    private ArrayList<Equipo> cargarEquipos() {
        try (FileReader reader = new FileReader(archivo)) {
            Type listType = new TypeToken<ArrayList<Equipo>>() {}.getType();
            return gson.fromJson(reader, listType);
        } catch (IOException e) {
            return new ArrayList<>();
        }
    }
}
