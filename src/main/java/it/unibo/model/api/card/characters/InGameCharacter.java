package it.unibo.model.api.card.characters;

/**
 * A generic character (hero, enemy, playable) that is currently involved in the match.
 */
public interface InGameCharacter {
     /**
     * @return this in game character type(hero, melee, ranged, enemy).
     */
    //public String getType();

    /**
     * @param variation amount of health changing (<0 if is a damage, >0 if is a cure).
     */
    void changeHealth(int variation);

    /**
     * @param variation amount of maximum health change.
     */
    void changeMaximumHealth(int variation);
    /**
     * @return the approximation of the current health percentage (0, 20, 40, 60, 80, 100).
     */
    int getHealthPercentage();

    /** 
     * @return this in game character attack value.
     */
    int getAttack();

    /**
     * @return this in game character attack recovery time (time lap between attacks)
     */
    double getAtckRecoveryTime();

    /**
     * @param variation amount of attack changing (<0 if is a malus, >0 if is a bonus).
     */
    void changeAttack(int variation);

    /**
     * @return this in game character speed multiplier.
     */
    double getSpeedMultiplier();

    /**
     * @param variation amount of speedMultiplier changing (<0 if is a malus, >0 if is a bonus).
     */
    void changeSpeedMultiplier(double variation);

    /**
     * @param inCombat true to consider this character in combat, false otherwise.
     */
    void setInCombat(boolean inCombat);

    /**
     * @return true if this character isActually in combat, false otherwise.
     */
    boolean isInCombat();

    /**
     * @param deltax horizontal variation to the previous position
     * @param deltay vertical variation to the previous position
     */
    void changePosition(int deltax, int deltay);

    /**
     * @return the actual character position in the map
     */
    CharacterPosition getPosition();

    /**
     * @return true if this character is dead, false otherwise.
     */
    boolean isDead();
}
