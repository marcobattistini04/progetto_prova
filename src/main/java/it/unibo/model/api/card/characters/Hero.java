package it.unibo.model.api.card.characters;

import java.util.Optional;

/**
 * the Hero representing the player.
 */
public interface Hero extends Character {
    /**
     * @return if it's present, this Hero's passive effect 
     */
    Optional<PassiveEffect> getPassiveEffect();

    /**
     * @return total number of melee cards the player's deck can have
     */
    int getMeleeCards();

    /**
     * @return total number of ranged cards the player's deck can have
     */
    int getRangedCards();

    /**
     * @return total number of spell cards the player's deck can have
     */
    int getSpellCards();

    /**
     * @return attack value of the defensive wall associated with this hero
     */
    int getWallAttack();

    /**
     * @return health value of the defensive wall associated with this hero
     */
    int getWallHealth();
}
