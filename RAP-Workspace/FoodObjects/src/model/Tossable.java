package model;

import game.Player;

public interface Tossable {
	//CTL SHIFT O <-- auto import
	public abstract void toss(); 
	public abstract void toss(Player target); 
}
