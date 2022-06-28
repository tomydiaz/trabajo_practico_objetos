package controller;

import modelo.Paciente;
import modelo.PacienteDAO;
import modelo.Practica;
import modelo.PracticaDAO;
import java.util.ArrayList;

public final class LaboratorioController {
    private static LaboratorioController instance;
    public String value;
    public ArrayList<Paciente> listaPacientes = new ArrayList<Paciente>();
    public ArrayList<Practica> listaPracticas = new ArrayList<Practica>();
/*    public PacienteDAO daoPaciente;
    public PracticaDAO daoPractica;
    {
        try {
            daoPaciente = new PacienteDAO();
            daoPractica = new PracticaDAO();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }*/

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
/*        try {
            daoPaciente.save(paciente);
        } catch (Exception e) {
            e.printStackTrace();
        }*/
    }

    public void borrarPaciente(String DNI) {
        int index = -1;
        /*try {
            listaPacientes = (ArrayList<Paciente>) daoPaciente.getAll(Paciente.class);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }*/
        for (Paciente paciente: listaPacientes) {
            //System.out.println(paciente.getDNI());
            if (paciente.getDNI().equals(DNI)) {
                index = listaPacientes.indexOf(paciente);
                /*String dniString = paciente.getDNI();
                int dniInt = Integer.parseInt(dniString);
                try {
                    daoPaciente.delete(dniInt);
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }*/
            }
        }
        if (index != -1) {
            listaPacientes.remove(index);
            try {
                System.out.println("Paciente eliminado, cantidad de pacientes: " + listaPacientes.size());
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
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
            System.out.println("Paciente modificado con éxito");
            listaPacientes.get(index).setNombre(name);
            listaPacientes.get(index).setDomicilio(domicilio);
            listaPacientes.get(index).setEmail(email);
            listaPacientes.get(index).setSexo(sexo);
            listaPacientes.get(index).setEdad(edad);
        }
    }
}