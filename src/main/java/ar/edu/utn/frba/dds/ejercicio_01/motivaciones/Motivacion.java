package ar.edu.utn.frba.dds.ejercicio_01.motivaciones;

import ar.edu.utn.frba.dds.ejercicio_01.Deportista;
import ar.edu.utn.frba.dds.ejercicio_01.Rutina;

public interface Motivacion {
  public MotivacionEnum tipo = null;
  public Rutina generarRutinaPara(Deportista deportista);
}
