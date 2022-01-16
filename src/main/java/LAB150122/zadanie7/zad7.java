package LAB150122.zadanie7;

import java.util.ArrayDeque;
import java.util.Deque;

public class zad7 {
    public static void main(String[] args) {

       Gun gun = new Gun(4);

       gun.loadBullet(Bullet.BULLET_TYPE_1);
       gun.shot();
       gun.shot();
       gun.shot();
       gun.shot();
       gun.shot();

       gun.loadBullet(Bullet.BULLET_TYPE_2);
       gun.shot();
       gun.shot();
       gun.shot();
       gun.shot();
       gun.shot();




    }
}
