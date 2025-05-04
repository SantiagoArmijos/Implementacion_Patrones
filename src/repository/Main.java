package repository;

public class Main {
    public static void main(String[] args) {
        RepositoryMemoria repo = new RepositoryMemoria();

        repo.agregarLugar(new LugarInteres(1, "Catedral de la Inmaculada",
                "Catedral histórica del siglo XIX", "Centro Histórico", "8:00 - 15:00"));
        repo.agregarLugar(new LugarInteres(2, "Museo Pumapungo",
                "Museo arqueológico y etnográfico", "Calle Larga", "12:00 - 15:00"));

        System.out.println("Todos los lugares:");
        repo.obtenerTodos().forEach(System.out::println);

        System.out.println("\nBuscar:");
        repo.buscarPorTipo("Catedral de la Inmaculada").forEach(System.out::println);
    }
}
