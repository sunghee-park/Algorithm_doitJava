package 자료구조;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class N013_P2164_카드게임 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Queue<Integer> queue = new LinkedList<>();
        int N = sc.nextInt();
        for (int i = 1; i <= N; i++) { // 카드를 큐에 저장
            queue.add(i);
        }
        while (queue.size() > 1) { // 카드가 1장 남을 때까지
            queue.poll(); // 맨 위의 카드를 버림
            queue.add(queue.poll()); // 맨 위의 카드를 가장 아래 카드 밑으로 이동
        }
        System.out.println(queue.poll()); // 마지막으로 남은 카드 출력
    }
}

