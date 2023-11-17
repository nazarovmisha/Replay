package Plane;

public class Plane {
    private int x;
    private int y;
    private int z;
    private int bombs;
    private int fuel;
    private static int reverse;

    public Plane(int x, int y, int z, int fuel, int bombs) {
        this.x = x;
        this.y = y;
        this.z = z;
        this.fuel = fuel;
        this.bombs = bombs;
    }

    public void flyStraight(int n) {
        if (fuel < n) {
            n = fuel;
            fuel = 0;
        }
        if (fuel > n) {
            fuel -= n;
        }
        if (reverse == 0) {
            y += n;
        } else if (reverse == 1) {
            x += n;
        } else if (reverse == 2) {
            y -= n;
        } else
            x -= n;

        System.out.println("Вы пролетели прямо и сейчас находитесь на координатах: x=" + y + ", y=" + x + ", z=" + z + ". Топлива осталось=" + fuel);
    }


    public void turnRight() {
        reverse++;
        if (reverse == 4) {
            reverse = 0;
        }
    }

    public void turnLeft() {
        reverse--;
        if (reverse == -1) {
            reverse = 3;
        }
    }

    public void flyUp(int up, int distance) {
        if (fuel > distance) {
            fuel -= distance;
        }
        if (fuel < distance) {
            distance = fuel;
            fuel = 0;
        }
        if (reverse == 0) {
            y += distance;
            z += up;
        } else if (reverse == 1) {
            x += distance;
            z += up;

        } else if (reverse == 2) {
            y -= distance;
            z += up;

        } else x -= distance;
        z += up;
    }

    public void dropBombs() {
        bombs--;
        System.out.println("Самолет сбросил бомбы по координатам x=" + x + ", y=" + y + "Кол-во бомб=" + bombs);
    }

    public void flyDown(int up, int distance) {
        if (fuel > distance) {
            fuel -= distance;
        }
        if (fuel < distance) {
            distance = fuel;
            fuel = 0;
        }
        if (reverse == 0) {
            y += distance;
            z -= up;
        } else if (reverse == 1) {
            x += distance;
            z -= up;

        } else if (reverse == 2) {
            y -= distance;
            z -= up;

        } else x -= distance;
        z -= up;
        if (up <= 0) {
            System.out.println("Вы приземлились");
        }
    }

    public void fillFuel() {
        if (z >= 0) {
            System.out.println("Нельзя заправляться в воздухе");
        } else fuel = 100;
    }

}
