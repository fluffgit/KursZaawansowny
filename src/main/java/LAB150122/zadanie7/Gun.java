package LAB150122.zadanie7;

import java.util.ArrayDeque;
import java.util.Deque;

public class Gun {

    private int capacity;
    private int currCapacity;

    private Bullet bullet;
    private Deque<Bullet> clip = new ArrayDeque<Bullet>();

    public Gun(int capacity) {
        this.capacity = capacity;
    }

    public void loadBullet(Bullet bullet) {
        this.bullet = bullet;
            for (int i = 0; i < capacity; i++) {
                clip.push(bullet);
            }
            System.out.println("Gun Loaded!!");
    }

    public boolean isloaded() {
        return !clip.isEmpty();
    }

    public void shot() {
        if (isloaded()) {
            clip.pop();
            System.out.println("bang!! " + bullet);
        } else {
            System.err.println("click!");
        }


    }


}
