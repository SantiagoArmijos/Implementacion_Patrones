package repository;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class RepositoryMemoria implements LugarInteresRepository{
    private List<LugarInteres> lugares = new ArrayList<>();

    @Override
    public void agregarLugar(LugarInteres lugar) {
        lugares.add(lugar);
    }

    @Override
    public LugarInteres obtenerPorId(int id) {
        return lugares.stream()
                .filter(l -> l.getId() == id)
                .findFirst()
                .orElse(null);
    }

    @Override
    public List<LugarInteres> obtenerTodos() {
        return new ArrayList<>(lugares);
    }

    @Override
    public List<LugarInteres> buscarPorTipo(String nombre) {
        return lugares.stream()
                .filter(l -> l.getNombre().equalsIgnoreCase(nombre))
                .collect(Collectors.toList());
    }
}
