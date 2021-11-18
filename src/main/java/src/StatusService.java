package src;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Collectors;

public class StatusService {
	
	private List<Status> lista = new ArrayList<Status>();
	
	public Optional<Status> get(int id) {
        return Optional.ofNullable(lista.get(id));
    }

    public List<Status> getAll() {
        return lista.stream()
          .filter(Objects::nonNull)
          .collect(Collectors.collectingAndThen(Collectors.toList(), Collections::unmodifiableList));
    }

    public int save(Status s) {
        lista.add(s);
        int index = lista.size() - 1;
        s.setId(index);
        return index;
    }

    public void delete(Integer id) {
        lista.set(id, null);
    }

}
