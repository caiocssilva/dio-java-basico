package Equipamentos.multifuncional;

import Equipamentos.copiadora.Copiadora;
import Equipamentos.digitalizadora.Digitalizadora;
import Equipamentos.impressora.Impressora;

public class EquipamentoMultifuncional implements Copiadora, Digitalizadora, Impressora{
    public void copiar() {
        System.out.println("Copiando via equipamento multifuncional");
    }

    public void Digitalizar() {
        System.out.println("Digitalizando via equipamento multifuncional");
    }

    public void Imprimir() {
        System.out.println("Imprimindo via equipamento multifuncional");
    }
    
}
