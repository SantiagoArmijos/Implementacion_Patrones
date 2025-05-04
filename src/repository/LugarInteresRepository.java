package repository;

import java.util.List;

public interface LugarInteresRepository {
    void agregarLugar(LugarInteres lugar);
    LugarInteres obtenerPorId(int id);
    List<LugarInteres> obtenerTodos();
    List<LugarInteres> buscarPorTipo(String tipo);
}
