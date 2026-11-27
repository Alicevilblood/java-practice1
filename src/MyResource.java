public class MyResource implements AutoCloseable {
    public MyResource() {
        System.out.println("Ресурс открыт");
    }

    @Override
    public void close() {
        System.out.println("Ресурс закрыт");
    }
}
