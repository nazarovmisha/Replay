package Worker;

import java.util.Deque;

public class Worker {
    private Deque toDoQueue;

    public Worker(Deque toDoQueue) {
        this.toDoQueue = toDoQueue;
    }

    public void takeTask() {
        Object task = toDoQueue.pollLast();
        if (task != null) {
            System.out.println("Выполняю задание:" + task);
        } else {
            System.out.println("Нет работы, можно идти домой!");
        }
    }
}
