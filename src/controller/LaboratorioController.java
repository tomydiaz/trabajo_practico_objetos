package controller;

import modelo.Paciente;

import java.util.ArrayList;

public final class LaboratorioController {
    private static LaboratorioController instance;
    public String value;
    public ArrayList<Paciente> listaPacientes = new ArrayList<Paciente>();

    public static LaboratorioController getInstance() {
        if (instance == null) {
            instance = new LaboratorioController();
        }
        return instance;
    }
    public Paciente cargarPaciente(String _id, String DNI, String nombre, String domicilio, String email, String sexo, String edad) {
        Paciente paciente = new Paciente(_id, DNI, nombre, domicilio, email, sexo, edad);
        listaPacientes.add(paciente);
        System.out.println(listaPacientes.size());
        return null;
    }


    public Paciente borrarPaciente(String DNI) {
        for (Paciente paciente: listaPacientes) {
            System.out.println(paciente.getDNI());
        }
        System.out.println(listaPacientes.size());
        return null;
    }
}