package ar.edu.utn.frba.dds.ejercicio_01.converter;

import ar.edu.utn.frba.dds.ejercicio_01.Ejercicio;
import ar.edu.utn.frba.dds.ejercicio_01.motivaciones.BajarDePeso;
import ar.edu.utn.frba.dds.ejercicio_01.motivaciones.Mantener;
import ar.edu.utn.frba.dds.ejercicio_01.motivaciones.Motivacion;
import ar.edu.utn.frba.dds.ejercicio_01.motivaciones.Tonificar;
import jakarta.persistence.AttributeConverter;
import jakarta.persistence.Converter;

@Converter(autoApply=true)
public class MotivacionConverter implements AttributeConverter<Motivacion, String> {

  @Override
  public String convertToDatabaseColumn(Motivacion mot) {
    if (mot == null) {
      return null;
    }

    String motivacion = null;
    if (mot instanceof BajarDePeso) {
      motivacion = "bajar_de_peso";
    } else if (mot instanceof Mantener) {
      motivacion = "mantener";
    } else if (mot instanceof Tonificar) {
      motivacion = "tonificar";
    }
    return motivacion;
  }

  @Override
  public Motivacion convertToEntityAttribute(String motivacion) {
    if (motivacion == null) {
      return null;
    }
    Motivacion mot;
    switch (motivacion) {
      case "bajar_de_peso":
        mot = new BajarDePeso();
        break;
      case "mantener":
        mot = new Mantener();
        break;
      case "tonificar":
        mot = new Tonificar();
        break;
      default:
        mot = null;
    }
    return mot;
  }
}
