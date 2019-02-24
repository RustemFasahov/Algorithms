public class Main {
    public static void main(String[] args) {
        Array arr = new Array(10000);


        arr.setArr();
        System.out.println(arr.getLength());
        float lastTime = System.nanoTime();
        arr.sortBubble();
        float realTime = System.nanoTime();
        float deltaTime = (realTime - lastTime) / 100000000;
        System.out.println(deltaTime);

        arr.setArr();
        float lastTime2 = System.nanoTime();
        arr.sortSelect();
        float realTime2 = System.nanoTime();
        float deltaTime2 = (realTime2 - lastTime2) / 100000000;
        System.out.println(deltaTime2);

        arr.setArr();
        float lastTime3 = System.nanoTime();
        arr.sortInsert();
        float realTime3 = System.nanoTime();
        float deltaTime3 = (realTime3 - lastTime3) / 100000000;
        System.out.println(deltaTime3);
        
    }
}
