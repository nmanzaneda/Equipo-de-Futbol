package com.ap.equipodefutbol.model;

public enum EquipoPrimeraDivision {
    BOCA_JUNIORS("Boca Juniors", "Miguel Ángel Russo"),
    RIVER_PLATE("River Plate", "Marcelo Gallardo"),
    SAN_LORENZO("San Lorenzo", "Diego Dabove"),
    RACING_CLUB("Racing Club", "Juan Antonio Pizzi"),
    INDEPENDIENTE("Independiente", "Julio Falcioni"),
    ESTUDIANTES_LP("Estudiantes LP", "Ricardo Zielinski"),
    GIMNASIA_LP("Gimnasia LP", "Diego Maradona"),
    ARGENTINOS_JUNIORS("Argentinos Juniors", "Gabriel Milito"),
    HURACAN("Huracán", "Néstor Apuzzo"),
    NEWELLS_OLD_BOYS("Newell's Old Boys", "Fernando Gamboa"),
    ROSARIO_CENTRAL("Rosario Central", "Cristian González"),
    UNION("Unión", "Juan Manuel Azconzábal"),
    COLON("Colón", "Eduardo Domínguez"),
    LANUS("Lanús", "Luis Zubeldía"),
    BANFIELD("Banfield", "Javier Sanguinetti"),
    DEFENSA_Y_JUSTICIA("Defensa y Justicia", "Sebastián Beccacece"),
    ARSENAL("Arsenal", "Israel Damonte"),
    CENTRAL_CORDOBA_SDE("Central Córdoba SDE", "Gustavo Coleoni"),
    TALLERES_CBA("Talleres Cba", "Alexander Medina"),
    VELLEZ_SARSFIELD("Vélez Sarsfield", "Mauricio Pellegrino"),
    PLATENSE("Platense", "Juan Manuel Llop"),
    ALDOSIVI("Aldosivi", "Federico Gómez"),
    SARMIENTO("Sarmiento", "Mario Sciacqua");
    
    private final String nombreEquipo;
    private final String nombreDT;
    
    private EquipoPrimeraDivision(String nombreEquipo, String nombreDT) {
        this.nombreEquipo = nombreEquipo;
        this.nombreDT = nombreDT;
    }
    
    public String getNombreEquipo() {
        return this.nombreEquipo;
    }
    
    public String getNombreDT() {
        return this.nombreDT;
    }
}
