package it.unibo.model.api.card.characters;

import it.unibo.model.api.card.Card;

/**
 * A generic Character.
 */
public interface Character extends Card {

    /**
     * @return this character's attack value 
     */
    int getAttackValue();

    /**
     * @return this character's health value
     */
    int getHealthValue();

    /**
     * @return this character's attack recovery time (time lap between attacks)
     */
    double getAtckRecoveryTime();

    /**
     * @return this character speed multiplier (higher value -> higher movement speed)
     */
    double getSpeedMultiplier();

}
