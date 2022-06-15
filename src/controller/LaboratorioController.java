package controller;

import com.google.gson.Gson;
import modelo.Paciente;
import modelo.PacienteDAO;
import utils.GenericDAO;

import java.lang.reflect.Array;
import java.util.ArrayList;

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
<<<<<<< HEAD

    public ArrayList<Paciente> getPacientes() {
        return listaPacientes;
    }


    public Paciente cargarPaciente(String _id, String DNI, String nombre, String apellido, String domicilio, String email, String sexo, String edad) {
        Paciente paciente = new Paciente(_id, DNI, nombre, apellido, domicilio, email, sexo, edad);
        listaPacientes.add(paciente);
        System.out.println("Paciente creado, cantidad de pacientes:" + listaPacientes.size());
        return null;
=======
    public void cargarPaciente(String _id, String DNI, String nombre, String domicilio, String email, String sexo, String edad) {
        Paciente paciente = new Paciente(_id, DNI, nombre, domicilio, email, sexo, edad);
        listaPacientes.add(paciente);
        try {
            dao.save(paciente);
        } catch (Exception e) {
            e.printStackTrace();
        }
>>>>>>> f8e2306535a560fc58c8b9c941fd08cfc55e1f9d
    }


    public Paciente borrarPaciente(String DNI) {
        int index = -1;
        for (Paciente paciente: listaPacientes) {
            if (paciente.getDNI().equals(DNI)) {
                index = listaPacientes.indexOf(paciente);
            }
        }
        if (index != -1) {
            listaPacientes.remove(index);
            System.out.println("Paciente eliminado, cantidad de pacientes:" + listaPacientes.size());
        }
        return null;
    }


    public Paciente buscarPaciente(String DNI) {
        Paciente pacienteABuscar;
        int index = -1;
        for (Paciente paciente: listaPacientes) {
            if (paciente.getDNI().equals(DNI)) {
                index = listaPacientes.indexOf(paciente);
            }
        }
        if (index != -1) {
            pacienteABuscar = listaPacientes.get(index);
            return pacienteABuscar;
        } else {
            return null;
        }
    }

    public void modificarPaciente(String DNI, String name, String apellido, String domicilio, String email, String sexo, String edad) {

        int index = -1;
        for (Paciente paciente: listaPacientes) {
            if (paciente.getDNI().equals(DNI)) {
                index = listaPacientes.indexOf(paciente);
            }
        }
        if (index != -1) {
            System.out.println("asdasd");
            listaPacientes.get(index).setNombre(name);
            listaPacientes.get(index).setApellido(apellido);
            listaPacientes.get(index).setDomicilio(domicilio);
            listaPacientes.get(index).setEmail(email);
            listaPacientes.get(index).setSexo(sexo);
            listaPacientes.get(index).setEdad(edad);
        }
    }
}