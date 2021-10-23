/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Agenda_electronica;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author Zonia Roldan
 */
public class Persona {
protected String Nombre;
    String Apellido;
    String Pais;
    String municipio;
    String departamento;
    String comunidad;
    long DPI;
    int [] telefono = new int [4];
    List<Persona> persona = new ArrayList();
    List<Persona> persona1 = new ArrayList();
    List<Persona> persona2 = new ArrayList();
    String [] Direccion = new String[3];

    public void Datos_persona(){
        Persona datos_registrados = new Persona();
        datos_registrados.setNombre("Odalis");
        datos_registrados.setApellido("Erazo");
        datos_registrados.setPais("Guatemala");
        datos_registrados.setDepartamento("Escuintla");
        datos_registrados.setMunicipio("La Democracia");
        datos_registrados.setComunidad("Escuintla");
        datos_registrados.setDPI(292910293);
        
        persona.add(datos_registrados);
        
        Persona datos_registrados1 = new Persona();
        datos_registrados1.setNombre("Daniel");
        datos_registrados1.setApellido("Arana");
        datos_registrados1.setPais("Guatemala");
        datos_registrados1.setDepartamento("Escuintla");
        datos_registrados1.setMunicipio("Escuintla");
        datos_registrados1.setDPI(493290101);
        datos_registrados1.setComunidad("Escuintla");
        
        persona1.add(datos_registrados1);
        
        Persona datos_registrados2 = new Persona();
        datos_registrados2.setNombre("Juliana");
        datos_registrados2.setApellido("Piox");
        datos_registrados2.setPais("Guatemala");
        datos_registrados2.setDepartamento("Escuintla");
        datos_registrados2.setMunicipio("Escuintla");
        datos_registrados2.setDPI(202403211);
        datos_registrados2.setComunidad("Escuintla");
        
        persona2.add(datos_registrados2);
    }
     public void Mostrar_Datos(){
        Direccion [0] = "7ma calle, lote 8 , colonia el refugio";
        Direccion [1] = "3ra calle, lote 2, colonia la reforma";
        telefono [0] = 79621096; 
        telefono [1] = 46448201; 
        telefono [2] = 50349854; 
        System.out.println(this.Nombre + "\t" + this.Apellido + "\t" + this.DPI + "\t" + this.departamento + "\t" + this.municipio + "\t" + this.Pais + "\t" + this.comunidad + "\n\n");
        
        for (int c=0; c <1;c++){
            System.out.println( Direccion[c] + "\t" + Direccion [c+1]
                + "\n\n" + telefono[c] + "\t" + telefono[c+1] + "\t" + telefono[c+2] + "\t" + "\n\n");
        }
    }
     public void Mostrar_Datos1(){
        Direccion [0] = "3ra calle, lote 5, colonia la cascada";
        Direccion [1] = "8ma calle, lote 21, colonia el paraiso";
        telefono [0] = 48286092; 
        telefono [1] = 59341801; 
        telefono [2] = 20319106; 
         System.out.println(this.Nombre + "\t" + this.Apellido + "\t" + this.DPI + "\t" + this.departamento + "\t" + this.municipio + "\t" + this.Pais + "\t" + this.comunidad + "\n\n");
        
        for (int c=0; c <1;c++){
            System.out.println( Direccion[c] + "\t" + Direccion [c+1]
                + "\n\n" + telefono[c] + "\t" + telefono[c+1] + "\t" + telefono[c+2] + "\t" + "\n\n");
        }
    }
     public void Mostrar_Datos2(){
        Direccion [0] = "3ra calle, zona 3, colonia jacarandas";
        Direccion [1] = "7ma calle, zona 5, colonia el vesubio";
        telefono [0] = 48298306; 
        telefono [1] = 61909105; 
        telefono [2] = 69138501; 
         System.out.println(this.Nombre + "\t" + this.Apellido + "\t" + this.DPI + "\t" + this.departamento + "\t" + this.municipio + "\t" + this.Pais + "\t" + this.comunidad + "\n\n");
        
        for (int c=0; c <1;c++){
            System.out.println( Direccion[c] + "\t" + Direccion [c+1]
                + "\n\n" + telefono[c] + "\t" + telefono[c+1] + "\t" + telefono[c+2] + "\t" + "\n\n");
        }
    }
    public void Datos_en_pantalla(){
        Iterator <Persona> Iterador = persona.iterator();
        while (Iterador.hasNext()){
            Iterador.next().Mostrar_Datos();
        }
        Iterator <Persona> Iterador1 = persona1.iterator();
        while (Iterador1.hasNext()){
            Iterador1.next().Mostrar_Datos1();
        }
        Iterator <Persona> Iterador2 = persona2.iterator();
        while (Iterador2.hasNext()){
            Iterador2.next().Mostrar_Datos2();
        }
    }

    public Persona(String Nombre, String Apellido, String Pais, String municipio, String departamento, String comunidad, long DPI) {
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.Pais = Pais;
        this.municipio = municipio;
        this.departamento = departamento;
        this.comunidad = comunidad;
        this.DPI = DPI;
    }

    public Persona() {
    }
    
    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public String getPais() {
        return Pais;
    }

    public void setPais(String Pais) {
        this.Pais = Pais;
    }

    public String getMunicipio() {
        return municipio;
    }

    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getComunidad() {
        return comunidad;
    }

    public void setComunidad(String comunidad) {
        this.comunidad = comunidad;
    }

    public long getDPI() {
        return DPI;
    }

    public void setDPI(long DPI) {
        this.DPI = DPI;
    }

    public int[] getTelefono() {
        return telefono;
    }

    public void setTelefono(int[] telefono) {
        this.telefono = telefono;
    }

    public List<Persona> getPersona() {
        return persona;
    }

    public void setPersona(List<Persona> persona) {
        this.persona = persona;
    }

    public List<Persona> getPersona1() {
        return persona1;
    }

    public void setPersona1(List<Persona> persona1) {
        this.persona1 = persona1;
    }

    public List<Persona> getPersona2() {
        return persona2;
    }

    public void setPersona2(List<Persona> persona2) {
        this.persona2 = persona2;
    }

    public String[] getDireccion() {
        return Direccion;
    }

    public void setDireccion(String[] Direccion) {
        this.Direccion = Direccion;
    }

    
}