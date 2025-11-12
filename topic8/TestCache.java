public class TestCache {
    public static void main(String[] args) {
        System.out.println("Тестирование класса Cache");

        Cache<Integer> cache = new Cache<>(3);

        cache.add(1);
        cache.add(2);
        cache.add(3);
        System.out.println("После добавления 1,2,3:");
        System.out.println("Первый элемент: " + cache.getFirst());
        System.out.println("Последний элемент: " + cache.getLast());

        cache.add(4);
        System.out.println("После добавления 4:");
        System.out.println("Первый элемент: " + cache.getFirst());
        System.out.println("Последний элемент: " + cache.getLast());

        System.out.println("Элемент по индексу 0: " + cache.getItemByIndex(0));
        System.out.println("Элемент по индексу 1: " + cache.getItemByIndex(1));
        System.out.println("Элемент по индексу 2: " + cache.getItemByIndex(2));

        System.out.println("Элемент 2 существует: " + cache.exists(2));
        System.out.println("Элемент 5 существует: " + cache.exists(5));

        System.out.println("Удаление элемента 2: " + cache.remove(2));
        System.out.println("Удаление элемента 5: " + cache.remove(5));
        System.out.println("После удаления:");
        System.out.println("Первый элемент: " + cache.getFirst());
        System.out.println("Последний элемент: " + cache.getLast());
    }
}
