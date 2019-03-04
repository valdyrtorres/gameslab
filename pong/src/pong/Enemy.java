package pong;

import java.awt.Color;
import java.awt.Graphics;

public class Enemy {
	
	public double x, y;
	public int width, height;
	public static double fatorVelocidadeEnemy = 0.07;
	
	public Enemy(int x, int y) {
		this.x = x;
		this.y = y;
		this.width = 40;
		this.height = 5;
	}

	public void tick() {
		// Inteligencia artificial do inimigo
		x+= (Game.ball.x - x - 6) * fatorVelocidadeEnemy;
		
	}
	
	public void render(Graphics g) {
		g.setColor(Color.red);
		g.fillRect((int)x, (int)y, width, height);
		
	}

}
