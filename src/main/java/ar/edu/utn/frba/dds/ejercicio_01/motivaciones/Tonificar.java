package ar.edu.utn.frba.dds.ejercicio_01.motivaciones;

import ar.edu.utn.frba.dds.ejercicio_01.Deportista;
import ar.edu.utn.frba.dds.ejercicio_01.Rutina;
import jakarta.persistence.CollectionTable;
import jakarta.persistence.Column;
import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.Lob;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

public class Tonificar implements  Motivacion{
    @Override
    public Rutina generarRutinaPara(Deportista deportista) {
        //todo..
        return null;
    }
}
