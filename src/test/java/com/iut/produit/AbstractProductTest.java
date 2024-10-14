package com.iut.produit;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.assertj.core.api.Assertions.*;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AbstractProductTest {

    /*
        TEST DE LA CLASSE ABSTRACTPRODUCT
     */
    @Test
    void get_cost_devrait_renvoyer_le_prix_de_l_article() {
        // GIVEN
        AbstractProduct unProduit = new ElectronicProduct("Test Product", 50.0, "HP");
        // WHEN
        double resultat = unProduit.getCost();
        // THEN
        assertThat(resultat).isEqualTo(50.0);
    }

    @Test
    void get_prName_devrait_renvoyer_le_nom_de_l_article() {
        // GIVEN
        AbstractProduct unProduit = new ElectronicProduct("Ordinateur", 50.0, "HP");
        // WHEN
        String resultat = unProduit.getPrName();
        // THEN
        assertThat(resultat).isEqualTo("Ordinateur");
    }
}
