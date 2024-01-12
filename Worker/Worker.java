package Worker;

import java.util.Queue;

public class Worker {
    private Queue toDoQueue;

    public Worker(Queue toDoQueue) {
        this.toDoQueue = toDoQueue;
    }

    public void takeTask() {
        Object task = toDoQueue.poll();
        if (task != null) {
            System.out.println("Выполняю задание:" + task);
        } else {
            System.out.println("Нет работы, можно идти домой!");
        }
    }
}
