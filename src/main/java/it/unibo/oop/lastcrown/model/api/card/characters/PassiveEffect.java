package it.unibo.oop.lastcrown.model.api.card.characters;

/**
 * the passive effect the hero can have. It influences the player's characters statistics.
 * @param category the category it is aimed at (ex health, attack, speed..)
 * @param percentage the percentage of boost (extra 20% health, extra 10% attack..)
 */
public record PassiveEffect(String category, int percentage) {

}
