package src.com.dky.contgabiy;

public class Bullet extends  FlyingObject {
    private int speed = 3;

    public Bullet(int x, int y) {
        this.x = x;
        this.y = y;
        this.image = ShootGame.bullet;
    }

    public void step() {
        this.y -= this.speed;
    }

    public boolean outOfBounds() {
        return this.y < -this.height;
    }
}
