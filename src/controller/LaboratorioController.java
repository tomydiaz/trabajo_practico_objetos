package controller;

import modelo.Paciente;
import modelo.Peticion;
import modelo.Practica;
import utils.DAOcsv;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

public final class LaboratorioController {
    private static LaboratorioController instance;
    public String value;
    public ArrayList<Paciente> listaPacientes = new ArrayList<Paciente>();
    public ArrayList<Practica> listaPracticas = new ArrayList<Practica>();
    public ArrayList<Peticion> listaPeticiones = new ArrayList<Peticion>();
    public DAOcsv daoPaciente;

        public static LaboratorioController getInstance() {
        if (instance == null) {
            instance = new LaboratorioController();
        }
        return instance;
    }

    public ArrayList<Paciente> getPacientes() {
        return listaPacientes;
    }

    public void cargarPaciente(String DNI, String nombre, String domicilio, String email, String sexo, String edad) {
        Paciente paciente = new Paciente(DNI, nombre, domicilio, email, sexo, edad);
        listaPacientes.add(paciente);
        try {
            DAOcsv.save(listaPacientes);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public void borrarPaciente(String DNI) {
        int index = -1;
        for (Paciente paciente: listaPacientes) {
            if (paciente.getDNI().equals(DNI)) {
                index = listaPacientes.indexOf(paciente);
            }
        }
        if (index != -1) {
            listaPacientes.remove(index);
                System.out.println("Paciente eliminado, cantidad de pacientes: " + listaPacientes.size());
        }
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

    public void modificarPaciente(String DNI, String name, String domicilio, String email, String sexo, String edad) {
        int index = -1;
        for (Paciente paciente: listaPacientes) {
            if (paciente.getDNI().equals(DNI)) {
                index = listaPacientes.indexOf(paciente);
            }
        }
        if (index != -1) {
            listaPacientes.get(index).setNombre(name);
            listaPacientes.get(index).setDomicilio(domicilio);
            listaPacientes.get(index).setEmail(email);
            listaPacientes.get(index).setSexo(sexo);
            listaPacientes.get(index).setEdad(edad);
        }
    }


    public void cargarPractica(String codigo, String nombre, String horasResultado) {
        Practica practica = new Practica(codigo,nombre,horasResultado, true, false );
        listaPracticas.add(practica);
    }

    public void borrarPractica(String codigo) {
        int index = -1;
        for (Practica practica: listaPracticas) {
            if (practica.getCodigo().equals(codigo)) {
                index = listaPracticas.indexOf(practica);
            }
        }
        if (index != -1) {
            listaPracticas.remove(index);
            System.out.println("Practica eliminada, cantidad de practicas: " + listaPracticas.size());
        }
    }

    public Practica buscarPractica(String codigo) {
        Practica practicaABuscar;
        int index = -1;
        for (Practica practica: listaPracticas) {
            if (practica.getCodigo().equals(codigo)) {
                index = listaPracticas.indexOf(practica);
            }
        }
        if (index != -1) {
            practicaABuscar = listaPracticas.get(index);
            return practicaABuscar;
        } else {
            return null;
        }
    }

    public void modificarPractica(String codigo, String nombre, String horasResultado) {
        int index = -1;
        for (Practica practica: listaPracticas) {
            if (practica.getCodigo().equals(codigo)) {
                index = listaPracticas.indexOf(practica);
            }
        }
        if (index != -1) {
            listaPracticas.get(index).setNombre(nombre);
            listaPracticas.get(index).setHorasResultado(horasResultado);
        }
    }


    public Date getDate() {
        return Calendar.getInstance().getTime();
    }

    public void cargarPeticion(String codigo, String obraSocial) {
        Peticion peticion = new Peticion(codigo, obraSocial, getDate(), "Activa");
        listaPeticiones.add(peticion);
    }

    public void borrarPeticion(String codigo) {
        int index = -1;
        for (Peticion peticion: listaPeticiones) {
            if (peticion.getCodigo().equals(codigo)) {
                index = listaPeticiones.indexOf(peticion);
            }
        }
        if (index != -1) {
            listaPeticiones.remove(index);
            System.out.println("Peticion eliminada, cantidad de peticiones: " + listaPeticiones.size());
        }
    }

    public Peticion buscarPeticion(String codigo) {
        Peticion peticionABuscar;
        int index = -1;
        for (Peticion peticion : listaPeticiones) {
            if (peticion.getCodigo().equals(codigo)) {
                index = listaPeticiones.indexOf(peticion);
            }
        }
        if (index != -1) {
            peticionABuscar = listaPeticiones.get(index);
            return peticionABuscar;
        } else {
            return null;
        }
    }

    public void modificarPeticion(String codigo, String obraSocial, String estado) {
        int index = -1;
        for (Peticion peticion: listaPeticiones) {
            if (peticion.getCodigo().equals(codigo)) {
                index = listaPeticiones.indexOf(peticion);
            }
        }
        if (index != -1) {
            listaPeticiones.get(index).setObraSocial(obraSocial);
            listaPeticiones.get(index).setEstado(estado);
        }
    }
}