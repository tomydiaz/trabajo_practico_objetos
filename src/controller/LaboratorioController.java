package controller;

import modelo.Paciente;
import modelo.PacienteDAO;
import modelo.Peticion;
import java.util.ArrayList;
import java.util.Date;

public final class LaboratorioController {
    private static LaboratorioController instance;
    public String value;
    public ArrayList<Paciente> listaPacientes = new ArrayList<Paciente>();
    public PacienteDAO dao; {
        try {
            dao = new PacienteDAO();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static LaboratorioController getInstance() {
        if (instance == null) {
            instance = new LaboratorioController();
        }
        return instance;
    }
    public void cargarPaciente(String _id, String DNI, String nombre, String domicilio, String email, String sexo, String edad) {
        Paciente paciente = new Paciente(_id, DNI, nombre, domicilio, email, sexo, edad);
        listaPacientes.add(paciente);
        try {
            dao.save(paciente);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public Paciente borrarPaciente(String DNI) {
        for (Paciente paciente: listaPacientes) {
            System.out.println(paciente.getDNI());
        }
        System.out.println(listaPacientes.size());
        return null;
    }

    public void cargarPeticion(String obraSocial, Date fechaCarga, String estado) {

    }
}